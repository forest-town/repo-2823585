package org.apache.camel.test.tcp;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

@Ignore( value = "Tests validating Java Socket behaviours" )
public class JavaSocketTests {
    Logger log = LoggerFactory.getLogger(this.getClass());

    Socket clientSocket;
    ServerSocket serverSocket;

    int messageCount = 10;

    @Before
    public void setUp() throws Exception {
        serverSocket = new ServerSocket(0);


    }

    @After
    public void tearDown() throws Exception {
        if ( null != clientSocket ) {
            clientSocket.close();
        }

        if ( null != serverSocket ) {
            serverSocket.close();
        }
    }

    @Test
    public void testSocketReadOnClosedConnection() throws Exception {
        Thread acceptThread = new Thread() {
            Logger log = LoggerFactory.getLogger( "acceptThread");
            @Override
            public void run() {
                boolean running = true;
                try {
                    Socket echoSocket = serverSocket.accept();

                    log.info("Accepted connection: {}", echoSocket.getInetAddress());

                    echoSocket.setSoTimeout(2000);

                    while (echoSocket.isConnected() && !echoSocket.isClosed()) {
                        StringBuilder responseBuilder = new StringBuilder(500);
                        InputStream reader = echoSocket.getInputStream();
                        OutputStream writer = echoSocket.getOutputStream();

                        do {
                            int readByte = -1;
                            try {
                                readByte = reader.read();
                                log.info( "Processing byte: {}", readByte);
                                switch (readByte ) {
                                    case -1:
                                        if ( echoSocket.isConnected() && !echoSocket.isClosed() ) {
                                            log.warn( "Socket claims to still be open, but END_OF_STREAM received - closing echoSocket");
                                            try {
                                                echoSocket.close();
                                            } catch (Exception ex ) {
                                                log.warn( "Exception encountered closing echoSocket after END_OF_STREAM received", ex);
                                            }
                                        }
                                        running = false;
                                        break;
                                    case 10:
                                        log.info( "Complete Message - Sending Response");
                                        byte[] response = responseBuilder.toString().getBytes();
                                        writer.write( response, 0, response.length );
                                        writer.write( '\n');
                                        break;
                                    default:
                                        responseBuilder.append( (char) readByte );
                                }
                            } catch (SocketTimeoutException timeoutEx ) {
                                log.info( "Timeout reading data");
                            }
                        } while (echoSocket.isConnected() && !echoSocket.isClosed() );
                    }

                } catch (IOException ioEx ) {
                    log.error( "IOException in run method", ioEx );
                } finally {
                    try {
                        serverSocket.close();
                    } catch (IOException ioEx) {
                        log.error( "Exception encountered closing server socket", ioEx);
                    }
                }


                log.info("Finished processing connection");
            }

        };

        acceptThread.start();

        clientSocket = new Socket();
        clientSocket.setSoTimeout( 1000 );
        clientSocket.connect( serverSocket.getLocalSocketAddress(), 10000);
        log.info( "Begining message send loop ");
        byte[] message = "Hello World".getBytes();
        BufferedReader reader;
        for (int i=1; i<=messageCount; ++i) {
            reader = new BufferedReader( new InputStreamReader(clientSocket.getInputStream()));
            OutputStream writer = clientSocket.getOutputStream();
            writer.write(message, 0, message.length);
            writer.write( '\n' );
            log.info( "Received Response #{}: {}", i, reader.readLine());
            Thread.sleep(1000);
        }

        log.info( "Message send loop complete - closing connection");
        // Javadoc for Socket says closing the InputStream will close the connection
        clientSocket.getInputStream().close();
        if ( ! clientSocket.isClosed() ) {
            log.warn( "Closing input stream didn't close socket");
            clientSocket.close();
        }
        log.info( "Sleeping ...");
        Thread.sleep(60000);

    }
}
