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
package org.apache.camel.language.bean;

import org.apache.camel.Exchange;
import org.apache.camel.RuntimeExpressionException;

/**
 * @version $Revision: 1.1 $
 */
public class RuntimeBeanExpressionException extends RuntimeExpressionException {
    private Exchange exchange;
    private Object bean;
    private String method;

    public RuntimeBeanExpressionException(Exchange exchange, Object bean, String method, Throwable e) {
        super("Failed to invoke method: " + method + " on " + bean + " due to: " + e, e);
        this.exchange = exchange;
        this.bean = bean;
        this.method = method;
    }

    public Object getBean() {
        return bean;
    }

    public Exchange getExchange() {
        return exchange;
    }

    public String getMethod() {
        return method;
    }
}
