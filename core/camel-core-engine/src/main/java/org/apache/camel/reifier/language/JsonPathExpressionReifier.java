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
package org.apache.camel.reifier.language;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Expression;
import org.apache.camel.Predicate;
import org.apache.camel.RuntimeCamelException;
import org.apache.camel.model.language.ExpressionDefinition;
import org.apache.camel.model.language.JsonPathExpression;
import org.apache.camel.spi.Language;

public class JsonPathExpressionReifier extends ExpressionReifier<JsonPathExpression> {

    public JsonPathExpressionReifier(CamelContext camelContext, ExpressionDefinition definition) {
        super(camelContext, (JsonPathExpression) definition);
    }

    @Override
    protected void configureLanguage(Language language) {
        if (definition.getResultType() == null && definition.getResultTypeName() != null) {
            try {
                Class<?> clazz = camelContext.getClassResolver().resolveMandatoryClass(definition.getResultTypeName());
                definition.setResultType(clazz);
            } catch (ClassNotFoundException e) {
                throw RuntimeCamelException.wrapRuntimeException(e);
            }
        }
    }

    private Map<String, Object> createProperties(String exp) {
        Map<String, Object> properties = new HashMap<>(8);
        properties.put("expression", exp);
        properties.put("resultType", definition.getResultType());
        properties.put("suppressExceptions", definition.getSuppressExceptions());
        properties.put("allowSimple", definition.getAllowSimple());
        properties.put("allowEasyPredicate", definition.getAllowEasyPredicate());
        properties.put("writeAsString", definition.getWriteAsString());
        properties.put("headerName", definition.getHeaderName());
        properties.put("option", definition.getOption());
        return properties;
    }

    @Override
    protected Expression createExpression(Language language, String exp) {
        return language.createExpression(createProperties(exp));
    }

    @Override
    protected Predicate createPredicate(Language language, String exp) {
        return language.createPredicate(createProperties(exp));
    }

}
