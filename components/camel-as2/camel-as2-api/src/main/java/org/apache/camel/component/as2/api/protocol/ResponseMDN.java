package org.apache.camel.component.as2.api.protocol;

import java.io.IOException;

import org.apache.camel.component.as2.api.AS2CharSet;
import org.apache.camel.component.as2.api.AS2Constants;
import org.apache.camel.component.as2.api.AS2Header;
import org.apache.camel.component.as2.api.AS2MimeType;
import org.apache.camel.component.as2.api.AS2ReportType;
import org.apache.camel.component.as2.api.AS2ServerManager;
import org.apache.camel.component.as2.api.InvalidAS2NameException;
import org.apache.camel.component.as2.api.Util;
import org.apache.camel.component.as2.api.entity.AS2DispositionType;
import org.apache.camel.component.as2.api.entity.DispositionMode;
import org.apache.camel.component.as2.api.entity.DispositionNotificationOptions;
import org.apache.camel.component.as2.api.entity.DispositionNotificationOptionsParser;
import org.apache.camel.component.as2.api.entity.EntityParser;
import org.apache.camel.component.as2.api.util.AS2HeaderUtils;
import org.apache.camel.component.as2.api.util.EntityUtils;
import org.apache.camel.component.as2.api.util.HttpMessageUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpCoreContext;

public class ResponseMDN implements HttpResponseInterceptor {
    
    public static final String BOUNDARY_PARAM_NAME = "boundary";
    
    private final String as2Version;
    private final String serverFQDN;

    public ResponseMDN(String as2Version, String serverFQDN) {
        this.as2Version = as2Version;
        this.serverFQDN = serverFQDN;
    }

    @Override
    public void process(HttpResponse response, HttpContext context) throws HttpException, IOException {

        HttpCoreContext coreContext = HttpCoreContext.adapt(context);
        
        HttpEntityEnclosingRequest request = coreContext.getAttribute(HttpCoreContext.HTTP_REQUEST, HttpEntityEnclosingRequest.class);

        /* MIME header */
        response.addHeader(AS2Header.MIME_VERSION, AS2Constants.MIME_VERSION);

        /* AS2-Version header */
        response.addHeader(AS2Header.AS2_VERSION, as2Version);

        /* MIME header */
        response.addHeader(AS2Header.MIME_VERSION, AS2Constants.MIME_VERSION);
        
        /* Subject header */
        String subject = coreContext.getAttribute(AS2ServerManager.SUBJECT, String.class);
        response.addHeader(AS2Header.SUBJECT, subject);
        
        /* From header */
        String from = coreContext.getAttribute(AS2ServerManager.FROM, String.class);
        response.addHeader(AS2Header.FROM, from);

        /* AS2-From header */
        String as2From = coreContext.getAttribute(AS2ServerManager.AS2_FROM, String.class);
        try {
            Util.validateAS2Name(as2From);
        } catch (InvalidAS2NameException e) {
            throw new HttpException("Invalid AS-From name", e);
        }
        response.addHeader(AS2Header.AS2_FROM, as2From);

        /* AS2-To header */
        String as2To = coreContext.getAttribute(AS2ServerManager.AS2_TO, String.class);
        try {
            Util.validateAS2Name(as2To);
        } catch (InvalidAS2NameException e) {
            throw new HttpException("Invalid AS-To name", e);
        }
        response.addHeader(AS2Header.AS2_TO, as2To);

        /* Message-Id header*/
        // SHOULD be set to aid in message reconciliation
        response.addHeader(AS2Header.MESSAGE_ID, Util.createMessageId(serverFQDN));
        
        if (HttpMessageUtils.getHeaderValue(request, AS2Header.DISPOSITION_NOTIFICATION_TO) != null) {
            // Return a Message Disposition Notification Receipt in response body 
            String boundary = EntityUtils.createBoundaryValue();
            DispositionNotificationMultipartReportEntity multipartReportEntity = new DispositionNotificationMultipartReportEntity(request, response, DispositionMode.AUTOMATIC_ACTION_MDN_SENT_AUTOMATICALLY, AS2DispositionType.PROCESSED, null, null, null, null, null, AS2CharSet.US_ASCII, boundary, true);

            DispositionNotificationOptions dispositionNotificationOptions = DispositionNotificationOptionsParser.parseDispositionNotificationOptions(coreContext.getAttribute(AS2ServerManager.MESSAGE_DISPOSITION_OPTIONS, String.class), null);
            
            String receiptAddress = coreContext.getAttribute(AS2ServerManager.RECEIPT_ADDRESS, String.class);
            if (receiptAddress != null) { 
                // Asynchronous Delivery
                // TODO Implement
            } else { 
                // Synchronous Delivery
                
                if (dispositionNotificationOptions.getSignedReceiptProtocol() != null) {
                    // Create signed receipt
                    // TODO Implenent
                } else {
                    // Create unsigned receipt
                    
                    Header reportTypeHeader = AS2HeaderUtils.createHeader(AS2Header.REPORT_TYPE, new String[][] { {AS2ReportType.DISPOSITION_NOTIFICATION }, {BOUNDARY_PARAM_NAME, boundary } });
                    response.addHeader(reportTypeHeader);
                    response.setHeader(AS2Header.CONTENT_TYPE, AS2MimeType.MULTIPART_REPORT);
                    EntityParser.setMessageEntity(response, multipartReportEntity);
                }
            }
            
        }

    }

}
