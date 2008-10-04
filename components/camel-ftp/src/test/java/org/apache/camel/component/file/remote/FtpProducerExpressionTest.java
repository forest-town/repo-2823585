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
package org.apache.camel.component.file.remote;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.camel.component.file.FileComponent;
import org.apache.camel.impl.JndiRegistry;

/**
 * Unit test for FTP using expression (file language)
 */
public class FtpProducerExpressionTest extends FtpServerTestSupport {

    private int port = 20062;

    private String ftpUrl = "ftp://admin@localhost:" + port + "/filelanguage?password=admin";

    public int getPort() {
        return port;
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        deleteDirectory("res/home/filelanguage");
        deleteDirectory("target/filelanguage");
    }

    @Override
    protected JndiRegistry createRegistry() throws Exception {
        JndiRegistry jndi = super.createRegistry();
        jndi.bind("myguidgenerator", new MyGuidGenerator());
        return jndi;
    }

    public void testProduceBeanByExpression() throws Exception {
        template.sendBody(ftpUrl + "&expression=${bean:myguidgenerator}.bak", "Hello World");

        Thread.sleep(500);
        assertFileExists("res/home/filelanguage/123.bak");
    }

    public void testProduceBeanByHeader() throws Exception {
        template.sendBodyAndHeader(ftpUrl, "Hello World", FileComponent.HEADER_FILE_NAME, "${bean:myguidgenerator}.bak");

        Thread.sleep(500);
        assertFileExists("res/home/filelanguage/123.bak");
    }

    public void testProducerDateByHeader() throws Exception {
        template.sendBodyAndHeader(ftpUrl, "Hello World", FileComponent.HEADER_FILE_NAME, "myfile-${date:now:yyyyMMdd}.txt");

        Thread.sleep(500);
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        assertFileExists("res/home/filelanguage/myfile-" + date + ".txt");
    }

    public void testProducerDateByExpression() throws Exception {
        template.sendBody(ftpUrl + "&expression=myfile-${date:now:yyyyMMdd}.txt", "Hello World");

        Thread.sleep(500);
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        assertFileExists("res/home/filelanguage/myfile-" + date + ".txt");
    }

    public void testProducerComplexByExpression() throws Exception {
        String expression = "../filelanguageinbox/myfile-${bean:myguidgenerator.guid}-${date:now:yyyyMMdd}.txt";
        template.sendBody(ftpUrl + "&expression=" + expression, "Hello World");

        Thread.sleep(500);
        String date = new SimpleDateFormat("yyyyMMdd").format(new Date());
        assertFileExists("res/home/filelanguageinbox/myfile-123-" + date + ".txt");
    }

    public void testProducerSimpleWithHeaderByExpression() throws Exception {
        template.sendBodyAndHeader(ftpUrl + "&expression=myfile-${in.header.foo}.txt",
                "Hello World", "foo", "abc");

        Thread.sleep(500);
        assertFileExists("res/home/filelanguage/myfile-abc.txt");
    }

    public void testProducerWithDateHeader() throws Exception {
        Calendar cal = GregorianCalendar.getInstance();
        cal.set(1974, Calendar.APRIL, 20);
        Date date = cal.getTime();

        template.sendBodyAndHeader(ftpUrl + "&expression=mybirthday-${date:in.header.birthday:yyyyMMdd}.txt",
                "Hello World", "birthday", date);

        Thread.sleep(500);
        assertFileExists("res/home/filelanguage/mybirthday-19740420.txt");
    }

    private static void assertFileExists(String filename) {
        File file = new File(filename);
        file = file.getAbsoluteFile();
        assertTrue("File " + filename + " should exists", file.exists());
    }

    public class MyGuidGenerator {
        public String guid() {
            return "123";
        }
    }

}