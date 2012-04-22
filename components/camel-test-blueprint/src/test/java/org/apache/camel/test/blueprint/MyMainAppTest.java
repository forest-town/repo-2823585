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
package org.apache.camel.test.blueprint;

import org.junit.Test;

/**
 *
 */
public class MyMainAppTest {

    public static void main(String[] args) throws Exception {
        MyMainAppTest me = new MyMainAppTest();
        me.run();
    }

    @Test
    public void testMyMain() throws Exception {
        run();
    }

    public void run() throws Exception {
        Main main = new Main();
        main.setBundleName("MyMainBundle");
        // as we run this test without packing ourselves as bundle, then include ourselves
        main.setIncludeSelfAsBundle(true);
        // we support *.xml to find any blueprint xml files
        main.setDescriptors("org/apache/camel/test/blueprint/xpath/*.xml");
        main.enableHangupSupport();

        // run for 1 second and then stop automatic
        main.setDuration(1000);
        main.run();
    }
}
