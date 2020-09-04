
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.braintreegateway.SettlementBatchSummaryGateway
 */
@ApiParams(apiName = "settlementBatchSummary", apiMethods = "generate")
@UriParams
@Configurer
public final class SettlementBatchSummaryGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    private String groupByCustomField;
    @UriParam
    private java.util.Calendar settlementDate;

    public String getGroupByCustomField() {
        return groupByCustomField;
    }

    public void setGroupByCustomField(String groupByCustomField) {
        this.groupByCustomField = groupByCustomField;
    }

    public java.util.Calendar getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(java.util.Calendar settlementDate) {
        this.settlementDate = settlementDate;
    }
}
