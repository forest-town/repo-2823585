
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.calendar;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.calendar.Calendar.Channels}.
 */
@ApiParams(apiName = "channels", 
           description = "The channels collection of methods",
           apiMethods = {@ApiMethod(methodName = "stop", description="Stop watching resources through this channel", signatures={"com.google.api.services.calendar.Calendar$Channels$Stop stop(com.google.api.services.calendar.model.Channel content)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class CalendarChannelsEndpointConfiguration extends GoogleCalendarConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "stop", description="The com.google.api.services.calendar.model.Channel")})
    private com.google.api.services.calendar.model.Channel contentChannel;

    public com.google.api.services.calendar.model.Channel getContentChannel() {
        return contentChannel;
    }

    public void setContentChannel(com.google.api.services.calendar.model.Channel contentChannel) {
        this.contentChannel = contentChannel;
    }
}
