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
package org.apache.camel.util;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.TestSupport;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.impl.DefaultExchange;

/**
 *
 */
public class GroupIteratorTest extends TestSupport {

    private CamelContext context;
    private Exchange exchange;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        context = new DefaultCamelContext();
        context.start();
        exchange = new DefaultExchange(context);

    }

    @Override
    public void tearDown() throws Exception {
        context.stop();
        super.tearDown();
    }

    public void testGroupIterator() throws Exception {
        String s = "ABC\nDEF\nGHI\nJKL\nMNO\nPQR\nSTU\nVW";
        Scanner scanner = new Scanner(s);
        scanner.useDelimiter("\n");

        GroupIterator gi = new GroupIterator(exchange, scanner, "\n", 3);

        assertTrue(gi.hasNext());
        assertEquals("ABC\nDEF\nGHI", gi.next());
        assertEquals("JKL\nMNO\nPQR", gi.next());
        assertEquals("STU\nVW", gi.next());
        assertFalse(gi.hasNext());

        IOHelper.close(gi);
    }

    public void testGroupIteratorWithDifferentEncodingFromDefault() throws Exception {
        if (Charset.defaultCharset() == StandardCharsets.UTF_8) {
            // can't think of test case where having default charset set to UTF-8 is affected
            return;
        }

        byte[] buf = "£1\n£2\n".getBytes(StandardCharsets.UTF_8);

        ByteArrayInputStream in = new ByteArrayInputStream(buf);

        Scanner scanner = new Scanner(in, StandardCharsets.UTF_8.displayName());
        scanner.useDelimiter("\n");

        exchange.setProperty(Exchange.CHARSET_NAME, StandardCharsets.UTF_8.displayName());
        GroupIterator gi = new GroupIterator(exchange, scanner, "\n", 1);

        assertTrue(gi.hasNext());
        assertEquals("£1", gi.next());
        assertEquals("£2", gi.next());
        assertFalse(gi.hasNext());

        IOHelper.close(gi);
    }

}
