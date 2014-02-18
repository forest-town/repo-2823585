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
package org.apache.camel.component.schematron.contant;

/**
 * Utility class defining all constants needed for the schematron component.
 * <p/>
 * Created by akhettar on 29/12/2013.
 */
public final class Constants {

    public static final String VALIDATION_STATUS = "CamelSchValidationStatus";
    public static final String HTTP_PURL_OCLC_ORG_DSDL_SVRL = "http://purl.oclc.org/dsdl/svrl";
    public static final String FAILED_ASSERT = "failed-assert";
    public static final String FAILED = "FAILED";
    public static final String SUCCESS = "SUCCESS";
    public static final String VALIDATION_REPORT = "CamelSchValidationReport";
    public static final String SCHEMATRON_TEMPLATES_ROOT_DIR = "iso-schematron-xslt2";

    private Constants() {
        throw new IllegalStateException("Utility class should not be instantiated");
    }

}
