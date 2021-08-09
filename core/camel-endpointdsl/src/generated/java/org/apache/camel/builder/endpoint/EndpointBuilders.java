/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//CHECKSTYLE:OFF
package org.apache.camel.builder.endpoint;

import javax.annotation.Generated;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface EndpointBuilders
        extends
            org.apache.camel.builder.endpoint.dsl.AMQPEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.AS2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.AWS2EC2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.AWS2S3EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ActiveMQEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.AhcEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ArangoDbEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.AsteriskEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.Athena2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.AtlasMapEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.AtmosEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.AtmosphereWebsocketEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.AtomEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.AtomixMapEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.AtomixMessagingEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.AtomixMultiMapEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.AtomixQueueEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.AtomixSetEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.AtomixValueEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.AvroEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.BeanEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.BeanValidatorEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.BeanstalkEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.BlobEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.BonitaEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.BoxEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.BraintreeEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.BrowseEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.CMEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.CMISEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.CaffeineCacheEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.CaffeineLoadCacheEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.CassandraEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ChatScriptEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ChunkEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.CinderEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ClassEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ClientEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.CoAPEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.CometdEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ConsulEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ControlBusEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.CordaEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.CosmosDbEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.CouchDbEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.CouchbaseEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.CronEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.Cw2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.CxfEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.CxfRsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DJLEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DataFormatEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DataLakeEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DataSetEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DataSetTestEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.Ddb2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.Ddb2StreamEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DebeziumMongodbEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DebeziumMySqlEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DebeziumPostgresEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DebeziumSqlserverEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DigitalOceanEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DigitalSignatureEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DirectEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DirectVmEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DisruptorEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DisruptorVmEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DnsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DockerEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DozerEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DrillEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.DropboxEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ECS2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.EKS2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.EhcacheEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ElasticsearchEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ElsqlEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.EtcdKeysEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.EtcdStatsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.EtcdWatchEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.EventEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.EventHubsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.EventbridgeEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ExecEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.FacebookEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.FhirEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.FileEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.FileWatchEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.FlatpackEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.FlinkEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.FopEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.FreemarkerEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.FtpEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.FtpsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.FunctionGraphEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GangliaEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GeoCoderEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GitEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GitHubEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GlanceEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GoogleBigQueryEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GoogleBigQuerySQLEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GoogleCalendarEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GoogleCalendarStreamEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GoogleCloudFunctionsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GoogleCloudStorageEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GoogleDriveEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GoogleMailEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GoogleMailStreamEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GooglePubsubEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GoogleSheetsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GoogleSheetsStreamEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GoraEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GrapeEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GraphqlEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GridFsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GrpcEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.GuavaEventBusEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.HBaseEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.HazelcastAtomicnumberEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.HazelcastInstanceEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.HazelcastListEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.HazelcastMapEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.HazelcastMultimapEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.HazelcastQueueEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.HazelcastReplicatedmapEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.HazelcastRingbufferEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.HazelcastSedaEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.HazelcastSetEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.HazelcastTopicEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.HdfsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.HttpEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.IAM2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.IAMEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.IOTAEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.IPFSEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.IgniteCacheEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.IgniteComputeEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.IgniteEventsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.IgniteIdGenEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.IgniteMessagingEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.IgniteQueueEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.IgniteSetEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.InfinispanEmbeddedEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.InfinispanRemoteEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.InfluxDbEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.IrcEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.IronMQEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JBPMEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JCacheEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JGroupsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JGroupsRaftEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JMXEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JSR356WebSocketEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JcloudsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JcrEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JdbcEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JettyHttpEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JingEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JiraEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JmsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JoltEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JooqEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JpaEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JsltEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JsonValidatorEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.JsonataEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.Jt400EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KMS2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KafkaEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KameletEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KameletReifyEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KeystoneEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.Kinesis2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KinesisFirehose2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KubernetesConfigMapsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KubernetesCustomResourcesEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KubernetesDeploymentsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KubernetesHPAEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KubernetesJobEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KubernetesNamespacesEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KubernetesNodesEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KubernetesPersistentVolumesClaimsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KubernetesPersistentVolumesEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KubernetesPodsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KubernetesReplicationControllersEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KubernetesResourcesQuotaEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KubernetesSecretsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KubernetesServiceAccountsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KubernetesServicesEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.KuduEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.Lambda2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.LanguageEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.LdapEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.LdifEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.LogEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.LuceneEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.LumberjackEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MQ2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MSK2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MailEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MasterEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MetricsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MicroProfileMetricsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MicrometerEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MiloClientEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MiloServerEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MinaEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MinioEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MllpEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MockEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MongoDbEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MsvEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MustacheEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MvelEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MyBatisBeanEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.MyBatisEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.NagiosEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.NatsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.NetWeaverEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.NettyEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.NettyHttpEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.NeutronEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.NitriteEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.NovaEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.NsqEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.OAIPMHEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.OBSEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.Olingo2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.Olingo4EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.OpenshiftBuildConfigsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.OpenshiftBuildsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.OptaPlannerEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.PahoEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.PahoMqtt5EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.PdfEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.PgEventEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.PgReplicationSlotEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.PlatformHttpEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.PrinterEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.PubNubEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.PulsarEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.QuartzEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.QueueEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.QuickfixjEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.RabbitMQEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ReactiveStreamsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.RedisEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.RefEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.RestApiEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.RestEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.RestOpenApiEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.RestSwaggerEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ResteasyEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.RobotFrameworkEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.RssEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.STS2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SagaEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SalesforceEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SchedulerEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SchematronEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ScpEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SecretsManagerEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SedaEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ServerEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ServiceBusEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ServiceEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ServiceNowEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ServletEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.Ses2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SftpEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SimpleNotificationEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SipEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.Sjms2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SjmsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SlackEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SmppEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SnmpEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.Sns2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SolrEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SoroushBotEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SparkEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SplunkEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SplunkHECEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SpringBatchEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SpringIntegrationEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SpringJdbcEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SpringLdapEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SpringRabbitMQEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SpringWebserviceEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SqlEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SqlStoredEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.Sqs2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SshEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.StAXEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.StitchEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.StompEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.StreamEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.StringTemplateEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.StubEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.SwiftEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.TelegramEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ThriftEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.TikaEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.TimerEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.Translate2EndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.TwilioEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.TwitterDirectMessageEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.TwitterSearchEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.TwitterTimelineEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.UndertowEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ValidatorEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.VelocityEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.VertxEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.VertxHttpEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.VertxKafkaEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.VertxWebsocketEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.VmEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.WeatherEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.Web3jEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.WebhookEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.WebsocketEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.WekaEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.WordpressEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.WorkdayEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.WsEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.XChangeEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.XJEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.XQueryEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.XmlSignerEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.XmlVerifierEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.XmppEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.XsltEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.XsltSaxonEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.YammerEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ZendeskEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ZooKeeperEndpointBuilderFactory,
            org.apache.camel.builder.endpoint.dsl.ZooKeeperMasterEndpointBuilderFactory {

}
//CHECKSTYLE:ON