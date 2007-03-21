/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * A {@link Processor} which just logs to a {@link Log} object which can be used as an exception
 * handler instead of using a dead letter queue.
 *
 * @version $Revision$
 */
public class Logger<E extends Exchange> implements Processor<E> {
    private Log log;
    private LoggingLevel level;

    public Logger() {
        this(LogFactory.getLog(Logger.class));
    }

    public Logger(Log log) {
        this(log, LoggingLevel.INFO);
    }

    public Logger(Log log, LoggingLevel level) {
        this.log = log;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Logger[" + log + "]";
    }

    public void onExchange(E exchange) {
        switch (level) {
            case DEBUG:
                if (log.isDebugEnabled()) {
                    log.debug(logMessage(exchange));
                }
                break;
            case ERROR:
                if (log.isErrorEnabled()) {
                    log.error(logMessage(exchange));
                }
                break;
            case FATAL:
                if (log.isFatalEnabled()) {
                    log.fatal(logMessage(exchange));
                }
                break;
            case INFO:
                if (log.isInfoEnabled()) {
                    log.debug(logMessage(exchange));
                }
                break;
            case TRACE:
                if (log.isTraceEnabled()) {
                    log.trace(logMessage(exchange));
                }
                break;
            case WARN:
                if (log.isWarnEnabled()) {
                    log.warn(logMessage(exchange));
                }
                break;
            default:
                log.error("Unknown level: " + level + " when trying to log exchange: " + logMessage(exchange));
        }
    }

    protected Object logMessage(E exchange) {
        return exchange;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }
}
