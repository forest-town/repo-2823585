/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.weather;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class WeatherEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WeatherEndpoint target = (WeatherEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "appid": target.getConfiguration().setAppid(property(camelContext, java.lang.String.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cnt": target.getConfiguration().setCnt(property(camelContext, java.lang.Integer.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "geolocationprovider":
        case "geoLocationProvider": target.getConfiguration().setGeoLocationProvider(property(camelContext, org.apache.camel.component.weather.geolocation.GeoLocationProvider.class, value)); return true;
        case "geolocationaccesskey":
        case "geolocationAccessKey": target.getConfiguration().setGeolocationAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "geolocationrequesthostip":
        case "geolocationRequestHostIP": target.getConfiguration().setGeolocationRequestHostIP(property(camelContext, java.lang.String.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "headername":
        case "headerName": target.getConfiguration().setHeaderName(property(camelContext, java.lang.String.class, value)); return true;
        case "httpclient":
        case "httpClient": target.getConfiguration().setHttpClient(property(camelContext, org.apache.hc.client5.http.impl.classic.CloseableHttpClient.class, value)); return true;
        case "ids": target.getConfiguration().setIds(property(camelContext, java.lang.String.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "language": target.getConfiguration().setLanguage(property(camelContext, org.apache.camel.component.weather.WeatherLanguage.class, value)); return true;
        case "lat": target.getConfiguration().setLat(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "location": target.getConfiguration().setLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "lon": target.getConfiguration().setLon(property(camelContext, java.lang.String.class, value)); return true;
        case "mode": target.getConfiguration().setMode(property(camelContext, org.apache.camel.component.weather.WeatherMode.class, value)); return true;
        case "period": target.getConfiguration().setPeriod(property(camelContext, java.lang.String.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "rightlon":
        case "rightLon": target.getConfiguration().setRightLon(property(camelContext, java.lang.String.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "toplat":
        case "topLat": target.getConfiguration().setTopLat(property(camelContext, java.lang.String.class, value)); return true;
        case "units": target.getConfiguration().setUnits(property(camelContext, org.apache.camel.component.weather.WeatherUnits.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "weatherapi":
        case "weatherApi": target.getConfiguration().setWeatherApi(property(camelContext, org.apache.camel.component.weather.WeatherApi.class, value)); return true;
        case "zip": target.getConfiguration().setZip(property(camelContext, java.lang.String.class, value)); return true;
        case "zoom": target.getConfiguration().setZoom(property(camelContext, java.lang.Integer.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "appid": return java.lang.String.class;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return int.class;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return int.class;
        case "backoffmultiplier":
        case "backoffMultiplier": return int.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "cnt": return java.lang.Integer.class;
        case "delay": return long.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "geolocationprovider":
        case "geoLocationProvider": return org.apache.camel.component.weather.geolocation.GeoLocationProvider.class;
        case "geolocationaccesskey":
        case "geolocationAccessKey": return java.lang.String.class;
        case "geolocationrequesthostip":
        case "geolocationRequestHostIP": return java.lang.String.class;
        case "greedy": return boolean.class;
        case "headername":
        case "headerName": return java.lang.String.class;
        case "httpclient":
        case "httpClient": return org.apache.hc.client5.http.impl.classic.CloseableHttpClient.class;
        case "ids": return java.lang.String.class;
        case "initialdelay":
        case "initialDelay": return long.class;
        case "language": return org.apache.camel.component.weather.WeatherLanguage.class;
        case "lat": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "location": return java.lang.String.class;
        case "lon": return java.lang.String.class;
        case "mode": return org.apache.camel.component.weather.WeatherMode.class;
        case "period": return java.lang.String.class;
        case "pollstrategy":
        case "pollStrategy": return org.apache.camel.spi.PollingConsumerPollStrategy.class;
        case "repeatcount":
        case "repeatCount": return long.class;
        case "rightlon":
        case "rightLon": return java.lang.String.class;
        case "runlogginglevel":
        case "runLoggingLevel": return org.apache.camel.LoggingLevel.class;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return java.util.concurrent.ScheduledExecutorService.class;
        case "scheduler": return java.lang.Object.class;
        case "schedulerproperties":
        case "schedulerProperties": return java.util.Map.class;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return boolean.class;
        case "startscheduler":
        case "startScheduler": return boolean.class;
        case "timeunit":
        case "timeUnit": return java.util.concurrent.TimeUnit.class;
        case "toplat":
        case "topLat": return java.lang.String.class;
        case "units": return org.apache.camel.component.weather.WeatherUnits.class;
        case "usefixeddelay":
        case "useFixedDelay": return boolean.class;
        case "weatherapi":
        case "weatherApi": return org.apache.camel.component.weather.WeatherApi.class;
        case "zip": return java.lang.String.class;
        case "zoom": return java.lang.Integer.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        WeatherEndpoint target = (WeatherEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "appid": return target.getConfiguration().getAppid();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "cnt": return target.getConfiguration().getCnt();
        case "delay": return target.getDelay();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "geolocationprovider":
        case "geoLocationProvider": return target.getConfiguration().getGeoLocationProvider();
        case "geolocationaccesskey":
        case "geolocationAccessKey": return target.getConfiguration().getGeolocationAccessKey();
        case "geolocationrequesthostip":
        case "geolocationRequestHostIP": return target.getConfiguration().getGeolocationRequestHostIP();
        case "greedy": return target.isGreedy();
        case "headername":
        case "headerName": return target.getConfiguration().getHeaderName();
        case "httpclient":
        case "httpClient": return target.getConfiguration().getHttpClient();
        case "ids": return target.getConfiguration().getIds();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "language": return target.getConfiguration().getLanguage();
        case "lat": return target.getConfiguration().getLat();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "location": return target.getConfiguration().getLocation();
        case "lon": return target.getConfiguration().getLon();
        case "mode": return target.getConfiguration().getMode();
        case "period": return target.getConfiguration().getPeriod();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "rightlon":
        case "rightLon": return target.getConfiguration().getRightLon();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "toplat":
        case "topLat": return target.getConfiguration().getTopLat();
        case "units": return target.getConfiguration().getUnits();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "weatherapi":
        case "weatherApi": return target.getConfiguration().getWeatherApi();
        case "zip": return target.getConfiguration().getZip();
        case "zoom": return target.getConfiguration().getZoom();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "schedulerproperties":
        case "schedulerProperties": return java.lang.Object.class;
        default: return null;
        }
    }
}

