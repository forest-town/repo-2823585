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
package org.apache.camel.component.dropbox.producer;

import org.apache.camel.Exchange;
import org.apache.camel.component.dropbox.DropboxConfiguration;
import org.apache.camel.component.dropbox.DropboxEndpoint;
import org.apache.camel.component.dropbox.api.DropboxAPIFacade;
import org.apache.camel.component.dropbox.dto.DropboxCamelResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.apache.camel.component.dropbox.util.DropboxResultOpCode.OK;

/**
 * The CamelDropbox producer.
 */
public class DropboxMoveProducer extends DropboxProducer {
    private static final transient Logger LOG = LoggerFactory.getLogger(DropboxMoveProducer.class);

    public DropboxMoveProducer(DropboxEndpoint endpoint, DropboxConfiguration configuration) {
        super(endpoint,configuration);
    }

    @Override
    public void process(Exchange exchange) throws Exception {
        DropboxCamelResult result = DropboxAPIFacade.getInstance(this.configuration.getClient())
                .move(this.configuration.getRemotePath(),this.configuration.getNewRemotePath());
        result.createResultOpCode(exchange,OK);
        result.populateExchange(exchange);
        log.info("Moved from " + this.configuration.getRemotePath()+" to "+this.configuration.getNewRemotePath());
    }

}
