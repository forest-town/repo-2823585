/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.processor.interceptor;

import java.util.List;
import java.util.Objects;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.MessageHistory;
import org.apache.camel.NamedNode;
import org.apache.camel.StaticService;
import org.apache.camel.spi.ExchangeFormatter;
import org.apache.camel.support.CamelContextHelper;
import org.apache.camel.support.MessageHelper;
import org.apache.camel.support.PatternHelper;
import org.apache.camel.support.builder.ExpressionBuilder;
import org.apache.camel.support.processor.DefaultExchangeFormatter;
import org.apache.camel.support.service.ServiceSupport;
import org.apache.camel.util.ObjectHelper;
import org.apache.camel.util.StringHelper;
import org.apache.camel.util.URISupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultTracer extends ServiceSupport implements StaticService {

    // TODO: Output the result when the exchange is done <<<<
    // TODO: Register this in JMX so it can be managed and turned on|off there
    // TODO: Have operations to turn on|off routes on route mbean etc
    // TODO: SPI to implement custom tracer
    // TODO: Custom exchange formatter
    // TODO: Custom trace formatter

    private static final String TRACING_OUTPUT = "%-6.6s [%-18.18s] [%-18.18s] [%-38.38s]";

    // use a fixed logger name so its easy to spot
    private static final Logger LOG = LoggerFactory.getLogger("org.apache.camel.Tracing");
    private final CamelContext camelContext;
    private boolean enabled = true;
    private boolean history = false;

    private ExchangeFormatter exchangeFormatter;
    // a pattern to filter tracing nodes
    private String tracePattern;
    private transient String[] patterns;

    public DefaultTracer(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    /**
     * Creates a new tracer.
     *
     * @param context Camel context
     * @return a new tracer
     */
    public static DefaultTracer createTracer(CamelContext context) {
        return new DefaultTracer(context);
    }

    /**
     * A helper method to return the BacklogTracer instance if one is enabled
     *
     * @return the backlog tracer or null if none can be found
     */
    public static DefaultTracer getDefaultTracer(CamelContext context) {
        return context.getExtension(DefaultTracer.class);
    }

    @SuppressWarnings("unchecked")
    public void trace(NamedNode node, Exchange exchange) {
        if (shouldTrace(node)) {
            if (history) {
                String out = MessageHelper.dumpTracing(exchange, exchangeFormatter);
                LOG.info(out);
            } else {
                String routeId = ExpressionBuilder.routeIdExpression().evaluate(exchange, String.class);
                String id = node.getId();

                // are we going to a new route, then we would like to log an entry with the route input too
                boolean newRoute;
                String prevLabel = "";
                List<MessageHistory> list = exchange.getProperty(Exchange.MESSAGE_HISTORY, List.class);
                if (list == null || list.size() <= 1) {
                    newRoute = true;
                    if (exchange.getFromEndpoint() != null) {
                        // we need to avoid leak the sensible information here
                        // the sanitizeUri takes a very long time for very long string and the format cuts this to
                        // 38 characters, anyway. Cut this to 60 characters. This will give enough space for removing
                        // characters in the sanitizeUri method and will be reasonably fast
                        prevLabel = "from[" + URISupport.sanitizeUri(StringHelper.limitLength(exchange.getFromEndpoint().getEndpointUri(), 60) + "]");
                    }
                } else {
                    // whats the last route id from message history
                    MessageHistory prev = list.get(list.size() - 2);
                    newRoute = !ObjectHelper.equal(routeId, prev.getRouteId());
                    if (newRoute) {
                        // we need to avoid leak the sensible information here
                        // the sanitizeUri takes a very long time for very long string and the format cuts this to
                        // 38 characters, anyway. Cut this to 60 characters. This will give enough space for removing
                        // characters in the sanitizeUri method and will be reasonably fast
                        prevLabel = "from[" + URISupport.sanitizeUri(StringHelper.limitLength(prev.getNode().getLabel(), 60) + "]");
                    }
                }
                if (newRoute) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.format(TRACING_OUTPUT, "      ", routeId, routeId, prevLabel));
                    sb.append(" ");
                    String data = exchangeFormatter.format(exchange);
                    sb.append(data);
                    String out = sb.toString();
                    LOG.info(out);
                }

                // we need to avoid leak the sensible information here
                // the sanitizeUri takes a very long time for very long string and the format cuts this to
                // 38 characters, anyway. Cut this to 60 characters. This will give enough space for removing
                // characters in the sanitizeUri method and will be reasonably fast
                String label = URISupport.sanitizeUri(StringHelper.limitLength(node.getLabel(), 60));

                StringBuilder sb = new StringBuilder();
                sb.append(String.format(TRACING_OUTPUT, " >>>> ", routeId, id, label));
                sb.append(" ");
                String data = exchangeFormatter.format(exchange);
                sb.append(data);
                String out = sb.toString();
                LOG.info(out);
            }
        }
    }

    /**
     * Whether or not to trace the given processor definition.
     *
     * @param definition the processor definition
     * @return <tt>true</tt> to trace, <tt>false</tt> to skip tracing
     */
    public boolean shouldTrace(NamedNode definition) {
        if (!enabled) {
            return false;
        }

        boolean pattern = true;

        if (patterns != null) {
            pattern = shouldTracePattern(definition);
        }

        if (LOG.isTraceEnabled()) {
            LOG.trace("Should trace evaluated {} -> pattern: {}", definition.getId(), pattern);
        }
        return pattern;
    }

    private boolean shouldTracePattern(NamedNode definition) {
        for (String pattern : patterns) {
            // match either route id, or node id
            String id = definition.getId();
            // use matchPattern method from endpoint helper that has a good matcher we use in Camel
            if (PatternHelper.matchPattern(id, pattern)) {
                return true;
            }
            String routeId = CamelContextHelper.getRouteId(definition);
            if (routeId != null && !Objects.equals(routeId, id)) {
                if (PatternHelper.matchPattern(routeId, pattern)) {
                    return true;
                }
            }
        }
        // not matched the pattern
        return false;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isHistory() {
        return history;
    }

    public void setHistory(boolean history) {
        this.history = history;
    }

    public String getTracePattern() {
        return tracePattern;
    }

    public void setTracePattern(String tracePattern) {
        this.tracePattern = tracePattern;
        if (tracePattern != null) {
            // the pattern can have multiple nodes separated by comma
            this.patterns = tracePattern.split(",");
        } else {
            this.patterns = null;
        }
    }

    @Override
    protected void doStart() throws Exception {
        if (exchangeFormatter == null) {
            DefaultExchangeFormatter formatter = new DefaultExchangeFormatter();
            formatter.setShowExchangeId(true);
            // use multi line if using history
            formatter.setMultiline(isHistory());
            formatter.setShowHeaders(true);
            formatter.setStyle(DefaultExchangeFormatter.OutputStyle.Default);
            exchangeFormatter = formatter;
        }
    }

    @Override
    protected void doStop() throws Exception {
        // noop
    }
}
