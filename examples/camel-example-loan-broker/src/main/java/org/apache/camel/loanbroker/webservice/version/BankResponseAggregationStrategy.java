/**
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
package org.apache.camel.loanbroker.webservice.version;

import org.apache.camel.Exchange;
import org.apache.camel.loanbroker.webservice.version.bank.BankQuote;
import org.apache.camel.processor.aggregate.AggregationStrategy;

//START SNIPPET: aggregating
public class BankResponseAggregationStrategy implements AggregationStrategy {

    @Override
    public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
        // the first time we only have the new exchange
        if (oldExchange == null) {
            return newExchange;
        }
        
        BankQuote oldQuote = oldExchange.getIn().getBody(BankQuote.class);
        BankQuote newQuote = newExchange.getIn().getBody(BankQuote.class);
        
        // return the winner with the lowest rate
        if (oldQuote.getRate() <= newQuote.getRate()) {
            return oldExchange;
        } else {
            return newExchange;
        }
    }

}
//END SNIPPET: aggregating
