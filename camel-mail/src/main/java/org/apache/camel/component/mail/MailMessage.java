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
package org.apache.camel.component.mail;

import org.apache.camel.impl.DefaultMessage;

import javax.mail.Message;
import javax.mail.MessagingException;
import java.util.Enumeration;
import java.util.Map;

/**
 * Represents a {@link org.apache.camel.Message} for working with Mail
 *
 * @version $Revision:520964 $
 */
public class MailMessage extends DefaultMessage {
    private Message mailMessage;

    public MailMessage() {
    }

    public MailMessage(Message message) {
        this.mailMessage = message;
    }

    @Override
    public String toString() {
        if (mailMessage != null) {
            return "MailMessage: " + mailMessage;
        }
        else {
            return "MailMessage: " + getBody();}
    }

    @Override
    public MailExchange getExchange() {
        return (MailExchange) super.getExchange();
    }

    /**
     * Returns the underlying Mail message
     *
     * @return the underlying Mail message
     */
    public Message getMessage() {
        return mailMessage;
    }

    public void setMessage(Message mailMessage) {
        this.mailMessage = mailMessage;
    }

    public Object getHeader(String name) {
        Object answer = null;
        if (mailMessage != null) {
            try {
                answer = mailMessage.getHeader(name);
            }
            catch (MessagingException e) {
                throw new MessageHeaderAccessException(name, e);
            }
        }
        if (answer == null) {
            answer = super.getHeader(name);
        }
        return answer;
    }

    @Override
    public MailMessage newInstance() {
        return new MailMessage();
    }

    @Override
    protected Object createBody() {
        if (mailMessage != null) {
            return getExchange().getBinding().extractBodyFromMail(getExchange(), mailMessage);
        }
        return null;
    }

    @Override
    protected void populateInitialHeaders(Map<String, Object> map) {
        if (mailMessage != null) {
            Enumeration names;
            try {
                names = mailMessage.getAllHeaders();
            }
            catch (MessagingException e) {
                throw new MessageHeaderNamesAccessException(e);
            }
            while (names.hasMoreElements()) {
                String name = names.nextElement().toString();
                try {
                    Object value = mailMessage.getHeader(name);
                    map.put(name, value);
                }
                catch (MessagingException e) {
                    throw new MessageHeaderAccessException(name, e);
                }
            }
        }
    }
}
