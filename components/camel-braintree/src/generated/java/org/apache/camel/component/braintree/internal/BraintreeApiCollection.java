
/*
 * Camel ApiCollection generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree.internal;

import java.util.*;

import org.apache.camel.component.braintree.BraintreeConfiguration;
import org.apache.camel.component.braintree.AddOnGatewayEndpointConfiguration;
import org.apache.camel.component.braintree.AddressGatewayEndpointConfiguration;
import org.apache.camel.component.braintree.ClientTokenGatewayEndpointConfiguration;
import org.apache.camel.component.braintree.CreditCardVerificationGatewayEndpointConfiguration;
import org.apache.camel.component.braintree.CustomerGatewayEndpointConfiguration;
import org.apache.camel.component.braintree.DiscountGatewayEndpointConfiguration;
import org.apache.camel.component.braintree.DisputeGatewayEndpointConfiguration;
import org.apache.camel.component.braintree.DocumentUploadGatewayEndpointConfiguration;
import org.apache.camel.component.braintree.MerchantAccountGatewayEndpointConfiguration;
import org.apache.camel.component.braintree.PaymentMethodGatewayEndpointConfiguration;
import org.apache.camel.component.braintree.PaymentMethodNonceGatewayEndpointConfiguration;
import org.apache.camel.component.braintree.PlanGatewayEndpointConfiguration;
import org.apache.camel.component.braintree.ReportGatewayEndpointConfiguration;
import org.apache.camel.component.braintree.SettlementBatchSummaryGatewayEndpointConfiguration;
import org.apache.camel.component.braintree.SubscriptionGatewayEndpointConfiguration;
import org.apache.camel.component.braintree.TransactionGatewayEndpointConfiguration;
import org.apache.camel.component.braintree.WebhookNotificationGatewayEndpointConfiguration;

import org.apache.camel.support.component.ApiCollection;
import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodHelper;

/**
 * Camel {@link ApiCollection} for Braintree
 */
public final class BraintreeApiCollection extends ApiCollection<BraintreeApiName, BraintreeConfiguration> {

    private static BraintreeApiCollection collection;

    private BraintreeApiCollection() {
        final Map<String, String> aliases = new HashMap<>();
        final Map<BraintreeApiName, ApiMethodHelper<? extends ApiMethod>> apiHelpers = new EnumMap<>(BraintreeApiName.class);
        final Map<Class<? extends ApiMethod>, BraintreeApiName> apiMethods = new HashMap<>();

        List<String> nullableArgs;


        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.ADD_ON, new ApiMethodHelper<AddOnGatewayApiMethod>(AddOnGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(AddOnGatewayApiMethod.class, BraintreeApiName.ADD_ON);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.ADDRESS, new ApiMethodHelper<AddressGatewayApiMethod>(AddressGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(AddressGatewayApiMethod.class, BraintreeApiName.ADDRESS);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.CLIENT_TOKEN, new ApiMethodHelper<ClientTokenGatewayApiMethod>(ClientTokenGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(ClientTokenGatewayApiMethod.class, BraintreeApiName.CLIENT_TOKEN);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.CREDIT_CARD_VERIFICATION, new ApiMethodHelper<CreditCardVerificationGatewayApiMethod>(CreditCardVerificationGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(CreditCardVerificationGatewayApiMethod.class, BraintreeApiName.CREDIT_CARD_VERIFICATION);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.CUSTOMER, new ApiMethodHelper<CustomerGatewayApiMethod>(CustomerGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(CustomerGatewayApiMethod.class, BraintreeApiName.CUSTOMER);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.DISCOUNT, new ApiMethodHelper<DiscountGatewayApiMethod>(DiscountGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(DiscountGatewayApiMethod.class, BraintreeApiName.DISCOUNT);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.DISPUTE, new ApiMethodHelper<DisputeGatewayApiMethod>(DisputeGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(DisputeGatewayApiMethod.class, BraintreeApiName.DISPUTE);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.DOCUMENT_UPLOAD, new ApiMethodHelper<DocumentUploadGatewayApiMethod>(DocumentUploadGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(DocumentUploadGatewayApiMethod.class, BraintreeApiName.DOCUMENT_UPLOAD);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.MERCHANT_ACCOUNT, new ApiMethodHelper<MerchantAccountGatewayApiMethod>(MerchantAccountGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(MerchantAccountGatewayApiMethod.class, BraintreeApiName.MERCHANT_ACCOUNT);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.PAYMENT_METHOD, new ApiMethodHelper<PaymentMethodGatewayApiMethod>(PaymentMethodGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(PaymentMethodGatewayApiMethod.class, BraintreeApiName.PAYMENT_METHOD);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.PAYMENT_METHOD_NONCE, new ApiMethodHelper<PaymentMethodNonceGatewayApiMethod>(PaymentMethodNonceGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(PaymentMethodNonceGatewayApiMethod.class, BraintreeApiName.PAYMENT_METHOD_NONCE);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.PLAN, new ApiMethodHelper<PlanGatewayApiMethod>(PlanGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(PlanGatewayApiMethod.class, BraintreeApiName.PLAN);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.REPORT, new ApiMethodHelper<ReportGatewayApiMethod>(ReportGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(ReportGatewayApiMethod.class, BraintreeApiName.REPORT);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.SETTLEMENT_BATCH_SUMMARY, new ApiMethodHelper<SettlementBatchSummaryGatewayApiMethod>(SettlementBatchSummaryGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(SettlementBatchSummaryGatewayApiMethod.class, BraintreeApiName.SETTLEMENT_BATCH_SUMMARY);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.SUBSCRIPTION, new ApiMethodHelper<SubscriptionGatewayApiMethod>(SubscriptionGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(SubscriptionGatewayApiMethod.class, BraintreeApiName.SUBSCRIPTION);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.TRANSACTION, new ApiMethodHelper<TransactionGatewayApiMethod>(TransactionGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(TransactionGatewayApiMethod.class, BraintreeApiName.TRANSACTION);

        aliases.clear();
        nullableArgs = Arrays.asList();
        apiHelpers.put(BraintreeApiName.WEBHOOK_NOTIFICATION, new ApiMethodHelper<WebhookNotificationGatewayApiMethod>(WebhookNotificationGatewayApiMethod.class, aliases, nullableArgs));
        apiMethods.put(WebhookNotificationGatewayApiMethod.class, BraintreeApiName.WEBHOOK_NOTIFICATION);

        setApiHelpers(apiHelpers);
        setApiMethods(apiMethods);
    }

    public BraintreeConfiguration getEndpointConfiguration(BraintreeApiName apiName) {
        BraintreeConfiguration result = null;
        switch (apiName) {
            case ADD_ON:
                result = new AddOnGatewayEndpointConfiguration();
                break;
            case ADDRESS:
                result = new AddressGatewayEndpointConfiguration();
                break;
            case CLIENT_TOKEN:
                result = new ClientTokenGatewayEndpointConfiguration();
                break;
            case CREDIT_CARD_VERIFICATION:
                result = new CreditCardVerificationGatewayEndpointConfiguration();
                break;
            case CUSTOMER:
                result = new CustomerGatewayEndpointConfiguration();
                break;
            case DISCOUNT:
                result = new DiscountGatewayEndpointConfiguration();
                break;
            case DISPUTE:
                result = new DisputeGatewayEndpointConfiguration();
                break;
            case DOCUMENT_UPLOAD:
                result = new DocumentUploadGatewayEndpointConfiguration();
                break;
            case MERCHANT_ACCOUNT:
                result = new MerchantAccountGatewayEndpointConfiguration();
                break;
            case PAYMENT_METHOD:
                result = new PaymentMethodGatewayEndpointConfiguration();
                break;
            case PAYMENT_METHOD_NONCE:
                result = new PaymentMethodNonceGatewayEndpointConfiguration();
                break;
            case PLAN:
                result = new PlanGatewayEndpointConfiguration();
                break;
            case REPORT:
                result = new ReportGatewayEndpointConfiguration();
                break;
            case SETTLEMENT_BATCH_SUMMARY:
                result = new SettlementBatchSummaryGatewayEndpointConfiguration();
                break;
            case SUBSCRIPTION:
                result = new SubscriptionGatewayEndpointConfiguration();
                break;
            case TRANSACTION:
                result = new TransactionGatewayEndpointConfiguration();
                break;
            case WEBHOOK_NOTIFICATION:
                result = new WebhookNotificationGatewayEndpointConfiguration();
                break;
        }
        return result;
    }

    public static synchronized BraintreeApiCollection getCollection() {
        if (collection == null) {
            collection = new BraintreeApiCollection();
        }
        return collection;
    }
}
