/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jacksonxml;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JacksonXMLDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        JacksonXMLDataFormat dataformat = (JacksonXMLDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "xmlmapper":
        case "xmlMapper": dataformat.setXmlMapper(property(camelContext, com.fasterxml.jackson.dataformat.xml.XmlMapper.class, value)); return true;
        case "collectiontype":
        case "collectionType": dataformat.setCollectionType(property(camelContext, java.lang.Class.class, value)); return true;
        case "moduleclassnames":
        case "moduleClassNames": dataformat.setModuleClassNames(property(camelContext, java.lang.String.class, value)); return true;
        case "modulerefs":
        case "moduleRefs": dataformat.setModuleRefs(property(camelContext, java.lang.String.class, value)); return true;
        case "unmarshaltypename":
        case "unmarshalTypeName": dataformat.setUnmarshalTypeName(property(camelContext, java.lang.String.class, value)); return true;
        case "jsonview":
        case "jsonView": dataformat.setJsonView(property(camelContext, java.lang.Class.class, value)); return true;
        case "include": dataformat.setInclude(property(camelContext, java.lang.String.class, value)); return true;
        case "prettyprint":
        case "prettyPrint": dataformat.setPrettyPrint(property(camelContext, boolean.class, value)); return true;
        case "allowjmstype":
        case "allowJmsType": dataformat.setAllowJmsType(property(camelContext, boolean.class, value)); return true;
        case "uselist":
        case "useList": dataformat.setUseList(property(camelContext, boolean.class, value)); return true;
        case "enablejaxbannotationmodule":
        case "enableJaxbAnnotationModule": dataformat.setEnableJaxbAnnotationModule(property(camelContext, boolean.class, value)); return true;
        case "enablefeatures":
        case "enableFeatures": dataformat.setEnableFeatures(property(camelContext, java.lang.String.class, value)); return true;
        case "disablefeatures":
        case "disableFeatures": dataformat.setDisableFeatures(property(camelContext, java.lang.String.class, value)); return true;
        case "allowunmarshalltype":
        case "allowUnmarshallType": dataformat.setAllowUnmarshallType(property(camelContext, boolean.class, value)); return true;
        case "contenttypeheader":
        case "contentTypeHeader": dataformat.setContentTypeHeader(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

