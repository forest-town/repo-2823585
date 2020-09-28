/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ganglia;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GangliaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("host", java.lang.String.class);
        map.put("port", int.class);
        map.put("dmax", int.class);
        map.put("groupName", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("metricName", java.lang.String.class);
        map.put("mode", info.ganglia.gmetric4j.gmetric.GMetric.UDPAddressingMode.class);
        map.put("prefix", java.lang.String.class);
        map.put("slope", info.ganglia.gmetric4j.gmetric.GMetricSlope.class);
        map.put("spoofHostname", java.lang.String.class);
        map.put("tmax", int.class);
        map.put("ttl", int.class);
        map.put("type", info.ganglia.gmetric4j.gmetric.GMetricType.class);
        map.put("units", java.lang.String.class);
        map.put("wireFormat31x", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GangliaEndpoint target = (GangliaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "dmax": target.getConfiguration().setDmax(property(camelContext, int.class, value)); return true;
        case "groupname":
        case "groupName": target.getConfiguration().setGroupName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "metricname":
        case "metricName": target.getConfiguration().setMetricName(property(camelContext, java.lang.String.class, value)); return true;
        case "mode": target.getConfiguration().setMode(property(camelContext, info.ganglia.gmetric4j.gmetric.GMetric.UDPAddressingMode.class, value)); return true;
        case "prefix": target.getConfiguration().setPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "slope": target.getConfiguration().setSlope(property(camelContext, info.ganglia.gmetric4j.gmetric.GMetricSlope.class, value)); return true;
        case "spoofhostname":
        case "spoofHostname": target.getConfiguration().setSpoofHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tmax": target.getConfiguration().setTmax(property(camelContext, int.class, value)); return true;
        case "ttl": target.getConfiguration().setTtl(property(camelContext, int.class, value)); return true;
        case "type": target.getConfiguration().setType(property(camelContext, info.ganglia.gmetric4j.gmetric.GMetricType.class, value)); return true;
        case "units": target.getConfiguration().setUnits(property(camelContext, java.lang.String.class, value)); return true;
        case "wireformat31x":
        case "wireFormat31x": target.getConfiguration().setWireFormat31x(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GangliaEndpoint target = (GangliaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "dmax": return target.getConfiguration().getDmax();
        case "groupname":
        case "groupName": return target.getConfiguration().getGroupName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "metricname":
        case "metricName": return target.getConfiguration().getMetricName();
        case "mode": return target.getConfiguration().getMode();
        case "prefix": return target.getConfiguration().getPrefix();
        case "slope": return target.getConfiguration().getSlope();
        case "spoofhostname":
        case "spoofHostname": return target.getConfiguration().getSpoofHostname();
        case "synchronous": return target.isSynchronous();
        case "tmax": return target.getConfiguration().getTmax();
        case "ttl": return target.getConfiguration().getTtl();
        case "type": return target.getConfiguration().getType();
        case "units": return target.getConfiguration().getUnits();
        case "wireformat31x":
        case "wireFormat31x": return target.getConfiguration().isWireFormat31x();
        default: return null;
        }
    }
}

