package org.apache.camel.component.kafka.integration;

import org.apache.camel.Endpoint;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.kafka.MockConsumerInterceptor;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.util.CamelKafkaUtil;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


/**
 * this will test breakOnFirstError functionality
 * and the issue that was surfaced in CAMEL-19894
 * regarding failure to correctly commit the offset
 * in a batch using the Synch Commit Manager
 * 
 *  mimics the reproduction of the problem in 
 *  https://github.com/Krivda/camel-bug-reproduction
 */
class KafkaBreakOnFirstErrorSeekIssueIT extends BaseEmbeddedKafkaTestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(KafkaBreakOnFirstErrorSeekIssueIT.class);

    public static final String ROUTE_ID = "breakOnFirstError-19894";
    public static final String TOPIC = "test-foobar";
    
    @EndpointInject("kafka:" + TOPIC
            + "?groupId=KafkaBreakOnFirstErrorIT"
            + "&autoOffsetReset=earliest"
            + "&autoCommitEnable=false"
            + "&allowManualCommit=true"
            + "&breakOnFirstError=true"
            + "&maxPollRecords=8"
            + "&pollTimeoutMs=1000"
            + "&keyDeserializer=org.apache.kafka.common.serialization.StringDeserializer"
            + "&valueDeserializer=org.apache.kafka.common.serialization.StringDeserializer"
            + "&kafkaManualCommitFactory=#class:org.apache.camel.component.kafka.consumer.DefaultKafkaManualCommitFactory"
            + "&interceptorClasses=org.apache.camel.component.kafka.MockConsumerInterceptor")
    private Endpoint from;

    @EndpointInject("mock:result")
    private MockEndpoint to;
    
    private org.apache.kafka.clients.producer.KafkaProducer<String, String> producer;
    
    @BeforeEach
    public void init() {
        // create the topic w/ 2 partitions
        final NewTopic mytopic = new NewTopic(TOPIC, 2, (short) 1);
        kafkaAdminClient.createTopics(Collections.singleton(mytopic));

        // setup the producer
        Properties props = getDefaultProperties();
        producer = new org.apache.kafka.clients.producer.KafkaProducer<>(props);
        MockConsumerInterceptor.recordsCaptured.clear();
    }

     @AfterEach
     public void after() {
         if (producer != null) {
             producer.close();
         }
         // clean all test topics
         kafkaAdminClient.deleteTopics(Collections.singletonList(TOPIC)).all();
     }
    
    @Test
    void test_camel_19894_test_fix() throws Exception {
        to.reset();
        // will consume the payloads from partition 0
        // and will continually retry the payload with "5"
        to.expectedMessageCount(4);
        to.expectedBodiesReceived("1", "2", "3", "4");

        context.getRouteController().stopRoute(ROUTE_ID);
        
        this.publishMessagesToKafka();
        
        context.getRouteController().startRoute(ROUTE_ID);
        
        Awaitility.await()
            .timeout(30, TimeUnit.SECONDS)
            .pollDelay(20, TimeUnit.SECONDS)
            .until(() -> to.getExchanges().size() == 4);

        
        to.assertIsSatisfied();
    }
    
    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {

            @Override
            public void configure() {
                from(from)
                    .routeId(ROUTE_ID)
                    .autoStartup(false)
                    .process(exchange -> {
                        LOG.debug(CamelKafkaUtil.buildKafkaLogMessage("Consuming", exchange, true));
                    })
                    .process(exchange -> {
                        ifIsFifthRecordThrowException(exchange);
                    })
                    .to(to)
                    .end();
            }
        };
    }
    
    private void ifIsFifthRecordThrowException(Exchange e) {
        if (e.getMessage().getBody().equals("5")) {
            throw new RuntimeException("ERROR_TRIGGERED_BY_TEST");
        }
    }
    
    private void publishMessagesToKafka() {
        final List<String> producedRecordsPartition0 = List.of("5", "6", "7", "8"); //, "9", "10", "11");
        final List<String> producedRecordsPartition1 = List.of("1", "2", "3", "4");

        producedRecordsPartition0.forEach(v -> {
            ProducerRecord<String, String> data = new ProducerRecord<>(TOPIC, "0", v);
            producer.send(data);
        });
        
        producedRecordsPartition1.forEach(v -> {
            ProducerRecord<String, String> data = new ProducerRecord<>(TOPIC, "1", v);
            producer.send(data);
        });
    }

}
