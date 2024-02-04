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
package org.apache.camel.language.tokenizer;

import org.apache.camel.Expression;
import org.apache.camel.support.SingleInputTypedLanguageSupport;
import org.apache.camel.support.builder.ExpressionBuilder;

/**
 * A language for tokenizer expressions.
 * <p/>
 * This tokenizer language can operator in the following modes:
 * <ul>
 * <li>default - using a single tokenizer</li>
 * <li>pair - using both start and end tokens</li>
 * <li>xml - using both start and end tokens in XML mode, support inheriting namespaces</li>
 * </ul>
 * The default mode supports the <tt>headerName</tt> and <tt>regex</tt> options. Where as the pair mode only supports
 * <tt>token</tt> and <tt>endToken</tt>. And the <tt>xml</tt> mode supports the <tt>inheritNamespaceTagName</tt> option.
 */
@org.apache.camel.spi.annotations.Language("tokenize")
public class TokenizeLanguage extends SingleInputTypedLanguageSupport {

    @Override
    public Expression createExpression(Expression source, String expression, Object[] properties) {
        Class<?> type = property(Class.class, properties, 0, null);
        String token = property(String.class, properties, 4, expression);
        String endToken = property(String.class, properties, 5, null);
        String inheritNamespaceTagName = property(String.class, properties, 6, null);
        String groupDelimiter = property(String.class, properties, 7, null);
        boolean regex = property(boolean.class, properties, 8, false);
        boolean xml = property(boolean.class, properties, 9, false);
        boolean includeTokens = property(boolean.class, properties, 10, false);
        String group = property(String.class, properties, 11, null);
        boolean skipFirst = property(boolean.class, properties, 12, false);

        if (endToken != null && inheritNamespaceTagName != null) {
            throw new IllegalArgumentException("Cannot have both xml and pair tokenizer enabled.");
        }
        if (xml && (endToken != null || includeTokens)) {
            throw new IllegalArgumentException("Cannot have both xml and pair tokenizer enabled.");
        }
        if (endToken == null && includeTokens) {
            throw new IllegalArgumentException("The option includeTokens requires endToken to be specified.");
        }

        Expression answer = null;
        if (xml) {
            answer = ExpressionBuilder.tokenizeXMLExpression(source, token, inheritNamespaceTagName);
        } else if (endToken != null) {
            answer = ExpressionBuilder.tokenizePairExpression(token, endToken, includeTokens);
        }

        if (answer == null) {
            // use the regular tokenizer
            if (regex) {
                answer = ExpressionBuilder.regexTokenizeExpression(source, token);
            } else {
                answer = ExpressionBuilder.tokenizeExpression(source, token);
            }
            if (group == null && skipFirst) {
                // wrap in skip first (if group then it has its own skip first logic)
                answer = ExpressionBuilder.skipFirstExpression(answer);
            }
        }

        if (type != null && type != Object.class) {
            answer = ExpressionBuilder.convertToExpression(answer, type);
        }

        // if group then wrap answer in group expression
        if (group != null) {
            if (xml) {
                answer = ExpressionBuilder.groupXmlIteratorExpression(answer, group);
            } else {
                String delim = groupDelimiter != null ? groupDelimiter : token;
                answer = ExpressionBuilder.groupIteratorExpression(answer, delim, group, skipFirst);
            }
        }

        if (getCamelContext() != null) {
            answer.init(getCamelContext());
        }
        return answer;
    }

}
