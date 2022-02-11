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
package org.apache.camel.model.errorhandler;

import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public class ErrorHandlerRefConfiguration implements ErrorHandlerRefProperties {

    private String ref;
    private boolean supportTransacted;
    private boolean forceSynchronousExecution;

    @Override
    public String getRef() {
        return ref;
    }

    @Override
    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public boolean isSupportTransacted() {
        return supportTransacted;
    }

    @Override
    public void setSupportTransacted(boolean supportTransacted) {
        this.supportTransacted = supportTransacted;
    }

    public boolean isForceSynchronousExecution() {
        return forceSynchronousExecution;
    }

    public void setForceSynchronousExecution(boolean forceSynchronousExecution) {
        this.forceSynchronousExecution = forceSynchronousExecution;
    }
}
