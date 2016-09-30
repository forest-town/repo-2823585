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
package org.apache.camel.component.xmlsecurity.springboot;

import java.util.List;
import java.util.Map;
import javax.xml.crypto.AlgorithmMethod;
import javax.xml.crypto.KeySelector;
import javax.xml.crypto.URIDereferencer;
import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;
import org.apache.camel.CamelContext;
import org.apache.camel.component.xmlsecurity.api.KeyAccessor;
import org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler;
import org.apache.camel.component.xmlsecurity.api.XmlSignature2Message;
import org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker;
import org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Used to sign and verify exchanges using the XML signature specification.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.xmlsecurity")
public class XmlSignatureComponentConfiguration {

    /**
     * To use a shared XmlSignerConfiguration configuration to use as base for
     * configuring endpoints.
     */
    private XmlSignerConfigurationNestedConfiguration signerConfiguration;
    /**
     * To use a shared XmlVerifierConfiguration configuration to use as base for
     * configuring endpoints.
     */
    private XmlVerifierConfigurationNestedConfiguration verifierConfiguration;

    public XmlSignerConfigurationNestedConfiguration getSignerConfiguration() {
        return signerConfiguration;
    }

    public void setSignerConfiguration(
            XmlSignerConfigurationNestedConfiguration signerConfiguration) {
        this.signerConfiguration = signerConfiguration;
    }

    public XmlVerifierConfigurationNestedConfiguration getVerifierConfiguration() {
        return verifierConfiguration;
    }

    public void setVerifierConfiguration(
            XmlVerifierConfigurationNestedConfiguration verifierConfiguration) {
        this.verifierConfiguration = verifierConfiguration;
    }

    public static class XmlSignerConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration.class;
        private CamelContext camelContext;
        /**
         * For the signing process, a private key is necessary. You specify a
         * key accessor bean which provides this private key. The key accessor
         * bean must implement the KeyAccessor interface. The package
         * org.apache.camel.component.xmlsecurity.api contains the default
         * implementation class DefaultKeyAccessor which reads the private key
         * from a Java keystore.
         */
        private KeyAccessor keyAccessor;
        /**
         * Canonicalization method used to canonicalize the SignedInfo element
         * before the digest is calculated. You can use the helper methods
         * XmlSignatureHelper.getCanonicalizationMethod(String algorithm) or
         * getCanonicalizationMethod(String algorithm, List<String>
         * inclusiveNamespacePrefixes) to create a canonicalization method.
         */
        private AlgorithmMethod canonicalizationMethod;
        /**
         * Transforms which are executed on the message body before the digest
         * is calculated. By default, C14n is added and in the case of enveloped
         * signature (see option parentLocalName) also
         * http://www.w3.org/2000/09/xmldsig#enveloped-signature is added at
         * position 0 of the list. Use methods in XmlSignatureHelper to create
         * the transform methods.
         */
        private List transformMethods;
        /**
         * Signature algorithm. Default value is
         * "http://www.w3.org/2000/09/xmldsig#rsa-sha1".
         */
        private String signatureAlgorithm = "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
        /**
         * Digest algorithm URI. Optional parameter. This digest algorithm is
         * used for calculating the digest of the input message. If this digest
         * algorithm is not specified then the digest algorithm is calculated
         * from the signature algorithm. Example:
         * "http://www.w3.org/2001/04/xmlenc#sha256"
         */
        private String digestAlgorithm;
        /**
         * In order to protect the KeyInfo element from tampering you can add a
         * reference to the signed info element so that it is protected via the
         * signature value. The default value is <tt>true</tt>.
         * <p>
         * Only relevant when a KeyInfo is returned by {@link KeyAccessor} . and
         * {@link KeyInfo#getId()} is not <code>null</code>.
         */
        private Boolean addKeyInfoReference;
        /**
         * Namespace prefix for the XML signature namespace
         * "http://www.w3.org/2000/09/xmldsig#". Default value is "ds". If
         * <code>null</code> or an empty value is set then no prefix is used for
         * the XML signature namespace.
         * <p>
         * See best practice
         * http://www.w3.org/TR/xmldsig-bestpractices/#signing-xml-
         * without-namespaces
         * 
         * @param prefixForXmlSignatureNamespaceprefix
         */
        private String prefixForXmlSignatureNamespace = "ds";
        /**
         * Local name of the parent element to which the XML signature element
         * will be added. Only relevant for enveloped XML signature.
         * Alternatively you can also use
         * {@link #setParentXpath(XPathFilterParameterSpec)} .
         * <p>
         * Default value is <code>null</code>. The value must be
         * <code>null</code> for enveloping and detached XML signature.
         * <p>
         * This parameter or the parameter
         * {@link #setParentXpath(XPathFilterParameterSpec)} for enveloped
         * signature and the parameter {@link #setXpathsToIdAttributes(List)}
         * for detached signature must not be set in the same configuration.
         * <p>
         * If the parameters <tt>parentXpath</tt> and <tt>parentLocalName</tt>
         * are specified in the same configuration then an exception is thrown.
         * 
         * @param parentLocalNamelocal
         *            name
         */
        private String parentLocalName;
        /**
         * Namespace of the parent element to which the XML signature element
         * will be added.
         */
        private String parentNamespace;
        /**
         * Sets the content object Id attribute value. By default a UUID is
         * generated. If you set the <code>null</code> value, then a new UUID
         * will be generated. Only used in the enveloping case.
         */
        private String contentObjectId;
        /**
         * Sets the signature Id. If this parameter is not set (null value) then
         * a unique ID is generated for the signature ID (default). If this
         * parameter is set to "" (empty string) then no Id attribute is created
         * in the signature element.
         */
        private String signatureId;
        /**
         * Reference URI for the content to be signed. Only used in the
         * enveloped case. If the reference URI contains an ID attribute value,
         * then the resource schema URI ( {@link #setSchemaResourceUri(String)}
         * ) must also be set because the schema validator will then find out
         * which attributes are ID attributes. Will be ignored in the enveloping
         * or detached case.
         */
        private String contentReferenceUri;
        /**
         * Type of the content reference. The default value is <code>null</code>
         * . This value can be overwritten by the header
         * {@link XmlSignatureConstants#HEADER_CONTENT_REFERENCE_TYPE} .
         */
        private String contentReferenceType;
        /**
         * Indicator whether the message body contains plain text. The default
         * value is <code>false</code>, indicating that the message body
         * contains XML. The value can be overwritten by the header
         * {@link XmlSignatureConstants#HEADER_MESSAGE_IS_PLAIN_TEXT} .
         */
        private Boolean plainText;
        /**
         * Encoding of the plain text. Only relevant if the message body is
         * plain text (see parameter {@link #plainText} . Default value is
         * "UTF-8".
         */
        private String plainTextEncoding = "UTF-8";
        /**
         * For adding additional References and Objects to the XML signature
         * which contain additional properties, you can provide a bean which
         * implements the XmlSignatureProperties interface.
         */
        private XmlSignatureProperties properties;
        private String keyAccessorName;
        private String canonicalizationMethodName;
        private String transformMethodsName;
        private String propertiesName;
        /**
         * Define the elements which are signed in the detached case via XPATH
         * expressions to ID attributes (attributes of type ID). For each
         * element found via the XPATH expression a detached signature is
         * created whose reference URI contains the corresponding attribute
         * value (preceded by '#'). The signature becomes the last sibling of
         * the signed element. Elements with deeper hierarchy level are signed
         * first.
         * <p>
         * You can also set the XPATH list dynamically via the header
         * {@link XmlSignatureConstants#HEADER_XPATHS_TO_ID_ATTRIBUTES} .
         * <p>
         * The parameter {@link #setParentLocalName(String)} or
         * {@link #setParentXpath(XPathFilterParameterSpec)} for enveloped
         * signature and this parameter for detached signature must not be set
         * in the same configuration.
         */
        private List xpathsToIdAttributes;
        /**
         * Sets the XPath to find the parent node in the enveloped case. Either
         * you specify the parent node via this method or the local name and
         * namespace of the parent with the methods
         * {@link #setParentLocalName(String)} and
         * {@link #setParentNamespace(String)} .
         * <p>
         * Default value is <code>null</code>. The value must be
         * <code>null</code> for enveloping and detached XML signature.
         * <p>
         * If the parameters <tt>parentXpath</tt> and <tt>parentLocalName</tt>
         * are specified in the same configuration then an exception is thrown.
         * 
         * @param parentXpath
         *            xpath to the parent node, if the xpath returns several
         *            values then the first Element node is used
         */
        private XPathFilterParameterSpec parentXpath;
        /**
         * If you want to restrict the remote access via reference URIs, you can
         * set an own dereferencer. Optional parameter. If not set the provider
         * default dereferencer is used which can resolve URI fragments, HTTP,
         * file and XPpointer URIs.
         * <p>
         * Attention: The implementation is provider dependent!
         * 
         * @seeXMLCryptoContext#setURIDereferencer(URIDereferencer)
         */
        private URIDereferencer uriDereferencer;
        /**
         * You can set a base URI which is used in the URI dereferencing.
         * Relative URIs are then concatenated with the base URI.
         * 
         * @seeXMLCryptoContext#setBaseURI(String)
         */
        private String baseUri;
        /**
         * Sets the crypto context properties. See
         * {@link XMLCryptoContext#setProperty(String,Object)} . Possible
         * properties are defined in {@link XMLSignContext} an
         * {@link XMLValidateContext} (see Supported Properties).
         * <p>
         * The following properties are set by default to the value
         * {@link Boolean#TRUE} for the XML validation. If you want to switch
         * these features off you must set the property value to
         * {@link Boolean#FALSE} .
         * <ul>
         * <li><code>"org.jcp.xml.dsig.validateManifests"</code></li>
         * <li><code>"javax.xml.crypto.dsig.cacheReference"</code></li>
         * </ul>
         */
        private Map cryptoContextProperties;
        /**
         * Disallows that the incoming XML document contains DTD DOCTYPE
         * declaration. The default value is {@link Boolean#TRUE} .
         * 
         * @param disallowDoctypeDecl
         *            if set to {@link Boolean#FALSE} then DOCTYPE declaration
         *            is allowed, otherwise not
         */
        private Boolean disallowDoctypeDecl;
        /**
         * Indicator whether the XML declaration in the outgoing message body
         * should be omitted. Default value is <code>false</code>. Can be
         * overwritten by the header
         * {@link XmlSignatureConstants#HEADER_OMIT_XML_DECLARATION} .
         */
        private Boolean omitXmlDeclaration;
        /**
         * Determines if the XML signature specific headers be cleared after
         * signing and verification. Defaults to true.
         */
        private Boolean clearHeaders;
        /**
         * Classpath to the XML Schema. Must be specified in the detached XML
         * Signature case for determining the ID attributes, might be set in the
         * enveloped and enveloping case. If set, then the XML document is
         * validated with the specified XML schema. The schema resource URI can
         * be overwritten by the header
         * {@link XmlSignatureConstants#HEADER_SCHEMA_RESOURCE_URI} .
         */
        private String schemaResourceUri;
        /**
         * The character encoding of the resulting signed XML document. If
         * <code>null</code> then the encoding of the original XML document is
         * used.
         */
        private String outputXmlEncoding;

        public CamelContext getCamelContext() {
            return camelContext;
        }

        public void setCamelContext(CamelContext camelContext) {
            this.camelContext = camelContext;
        }

        public KeyAccessor getKeyAccessor() {
            return keyAccessor;
        }

        public void setKeyAccessor(KeyAccessor keyAccessor) {
            this.keyAccessor = keyAccessor;
        }

        public AlgorithmMethod getCanonicalizationMethod() {
            return canonicalizationMethod;
        }

        public void setCanonicalizationMethod(
                AlgorithmMethod canonicalizationMethod) {
            this.canonicalizationMethod = canonicalizationMethod;
        }

        public List getTransformMethods() {
            return transformMethods;
        }

        public void setTransformMethods(List transformMethods) {
            this.transformMethods = transformMethods;
        }

        public String getSignatureAlgorithm() {
            return signatureAlgorithm;
        }

        public void setSignatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
        }

        public String getDigestAlgorithm() {
            return digestAlgorithm;
        }

        public void setDigestAlgorithm(String digestAlgorithm) {
            this.digestAlgorithm = digestAlgorithm;
        }

        public Boolean getAddKeyInfoReference() {
            return addKeyInfoReference;
        }

        public void setAddKeyInfoReference(Boolean addKeyInfoReference) {
            this.addKeyInfoReference = addKeyInfoReference;
        }

        public String getPrefixForXmlSignatureNamespace() {
            return prefixForXmlSignatureNamespace;
        }

        public void setPrefixForXmlSignatureNamespace(
                String prefixForXmlSignatureNamespace) {
            this.prefixForXmlSignatureNamespace = prefixForXmlSignatureNamespace;
        }

        public String getParentLocalName() {
            return parentLocalName;
        }

        public void setParentLocalName(String parentLocalName) {
            this.parentLocalName = parentLocalName;
        }

        public String getParentNamespace() {
            return parentNamespace;
        }

        public void setParentNamespace(String parentNamespace) {
            this.parentNamespace = parentNamespace;
        }

        public String getContentObjectId() {
            return contentObjectId;
        }

        public void setContentObjectId(String contentObjectId) {
            this.contentObjectId = contentObjectId;
        }

        public String getSignatureId() {
            return signatureId;
        }

        public void setSignatureId(String signatureId) {
            this.signatureId = signatureId;
        }

        public String getContentReferenceUri() {
            return contentReferenceUri;
        }

        public void setContentReferenceUri(String contentReferenceUri) {
            this.contentReferenceUri = contentReferenceUri;
        }

        public String getContentReferenceType() {
            return contentReferenceType;
        }

        public void setContentReferenceType(String contentReferenceType) {
            this.contentReferenceType = contentReferenceType;
        }

        public Boolean getPlainText() {
            return plainText;
        }

        public void setPlainText(Boolean plainText) {
            this.plainText = plainText;
        }

        public String getPlainTextEncoding() {
            return plainTextEncoding;
        }

        public void setPlainTextEncoding(String plainTextEncoding) {
            this.plainTextEncoding = plainTextEncoding;
        }

        public XmlSignatureProperties getProperties() {
            return properties;
        }

        public void setProperties(XmlSignatureProperties properties) {
            this.properties = properties;
        }

        public String getKeyAccessorName() {
            return keyAccessorName;
        }

        public void setKeyAccessorName(String keyAccessorName) {
            this.keyAccessorName = keyAccessorName;
        }

        public String getCanonicalizationMethodName() {
            return canonicalizationMethodName;
        }

        public void setCanonicalizationMethodName(
                String canonicalizationMethodName) {
            this.canonicalizationMethodName = canonicalizationMethodName;
        }

        public String getTransformMethodsName() {
            return transformMethodsName;
        }

        public void setTransformMethodsName(String transformMethodsName) {
            this.transformMethodsName = transformMethodsName;
        }

        public String getPropertiesName() {
            return propertiesName;
        }

        public void setPropertiesName(String propertiesName) {
            this.propertiesName = propertiesName;
        }

        public List getXpathsToIdAttributes() {
            return xpathsToIdAttributes;
        }

        public void setXpathsToIdAttributes(List xpathsToIdAttributes) {
            this.xpathsToIdAttributes = xpathsToIdAttributes;
        }

        public XPathFilterParameterSpec getParentXpath() {
            return parentXpath;
        }

        public void setParentXpath(XPathFilterParameterSpec parentXpath) {
            this.parentXpath = parentXpath;
        }

        public URIDereferencer getUriDereferencer() {
            return uriDereferencer;
        }

        public void setUriDereferencer(URIDereferencer uriDereferencer) {
            this.uriDereferencer = uriDereferencer;
        }

        public String getBaseUri() {
            return baseUri;
        }

        public void setBaseUri(String baseUri) {
            this.baseUri = baseUri;
        }

        public Map getCryptoContextProperties() {
            return cryptoContextProperties;
        }

        public void setCryptoContextProperties(Map cryptoContextProperties) {
            this.cryptoContextProperties = cryptoContextProperties;
        }

        public Boolean getDisallowDoctypeDecl() {
            return disallowDoctypeDecl;
        }

        public void setDisallowDoctypeDecl(Boolean disallowDoctypeDecl) {
            this.disallowDoctypeDecl = disallowDoctypeDecl;
        }

        public Boolean getOmitXmlDeclaration() {
            return omitXmlDeclaration;
        }

        public void setOmitXmlDeclaration(Boolean omitXmlDeclaration) {
            this.omitXmlDeclaration = omitXmlDeclaration;
        }

        public Boolean getClearHeaders() {
            return clearHeaders;
        }

        public void setClearHeaders(Boolean clearHeaders) {
            this.clearHeaders = clearHeaders;
        }

        public String getSchemaResourceUri() {
            return schemaResourceUri;
        }

        public void setSchemaResourceUri(String schemaResourceUri) {
            this.schemaResourceUri = schemaResourceUri;
        }

        public String getOutputXmlEncoding() {
            return outputXmlEncoding;
        }

        public void setOutputXmlEncoding(String outputXmlEncoding) {
            this.outputXmlEncoding = outputXmlEncoding;
        }
    }

    public static class XmlVerifierConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.xmlsecurity.processor.XmlVerifierConfiguration.class;
        private CamelContext camelContext;
        /**
         * Provides the key for validating the XML signature.
         */
        private KeySelector keySelector;
        /**
         * This interface allows the application to check the XML signature
         * before the validation is executed. This step is recommended in
         * http://www.w3.org/TR/xmldsig-bestpractices/#check-what-is-signed
         */
        private XmlSignatureChecker xmlSignatureChecker;
        /**
         * Bean which maps the XML signature to the output-message after the
         * validation. How this mapping should be done can be configured by the
         * options outputNodeSearchType, outputNodeSearch, and
         * removeSignatureElements. The default implementation offers three
         * possibilities which are related to the three output node search types
         * "Default", "ElementName", and "XPath". The default implementation
         * determines a node which is then serialized and set to the body of the
         * output message If the search type is "ElementName" then the output
         * node (which must be in this case an element) is determined by the
         * local name and namespace defined in the search value (see option
         * outputNodeSearch). If the search type is "XPath" then the output node
         * is determined by the XPath specified in the search value (in this
         * case the output node can be of type "Element", "TextNode" or
         * "Document"). If the output node search type is "Default" then the
         * following rules apply: In the enveloped XML signature case (there is
         * a reference with URI="" and transform
         * "http://www.w3.org/2000/09/xmldsig#enveloped-signature"), the
         * incoming XML document without the Signature element is set to the
         * output message body. In the non-enveloped XML signature case, the
         * message body is determined from a referenced Object; this is
         * explained in more detail in chapter
         * "Output Node Determination in Enveloping XML Signature Case".
         */
        private XmlSignature2Message xmlSignature2Message;
        /**
         * Handles the different validation failed situations. The default
         * implementation throws specific exceptions for the different
         * situations (All exceptions have the package name
         * org.apache.camel.component.xmlsecurity.api and are a sub-class of
         * XmlSignatureInvalidException. If the signature value validation
         * fails, a XmlSignatureInvalidValueException is thrown. If a reference
         * validation fails, a XmlSignatureInvalidContentHashException is
         * thrown. For more detailed information, see the JavaDoc.
         */
        private ValidationFailedHandler validationFailedHandler;
        /**
         * Sets the output node search value for determining the node from the
         * XML signature document which shall be set to the output message body.
         * The class of the value depends on the type of the output node search.
         * The output node search is forwarded to {@link XmlSignature2Message} .
         */
        private Object outputNodeSearch;
        /**
         * Determines the search type for determining the output node which is
         * serialized into the output message bodyF. See
         * {@link #setOutputNodeSearch(Object)} . The supported default search
         * types you can find in {@link DefaultXmlSignature2Message} .
         */
        private String outputNodeSearchType = "DefaultXmlSignature2Message.OUTPUT_NODE_SEARCH_TYPE_DEFAULT";
        /**
         * Indicator whether the XML signature elements (elements with local
         * name "Signature" and namesapce
         * ""http://www.w3.org/2000/09/xmldsig#"") shall be removed from the
         * document set to the output message. Normally, this is only necessary,
         * if the XML signature is enveloped. The default value is
         * {@link Boolean#FALSE} . This parameter is forwarded to
         * {@link XmlSignature2Message} .
         * <p>
         * This indicator has no effect if the output node search is of type
         * {@link DefaultXmlSignature2Message#OUTPUT_NODE_SEARCH_TYPE_DEFAULT}
         * .F
         */
        private Boolean removeSignatureElements;
        /**
         * Enables secure validation. If true then secure validation is enabled.
         */
        private Boolean secureValidation;
        /**
         * Name of handler to
         * 
         * @param validationFailedHandlerName
         */
        private String validationFailedHandlerName;
        /**
         * If you want to restrict the remote access via reference URIs, you can
         * set an own dereferencer. Optional parameter. If not set the provider
         * default dereferencer is used which can resolve URI fragments, HTTP,
         * file and XPpointer URIs.
         * <p>
         * Attention: The implementation is provider dependent!
         * 
         * @seeXMLCryptoContext#setURIDereferencer(URIDereferencer)
         */
        private URIDereferencer uriDereferencer;
        /**
         * You can set a base URI which is used in the URI dereferencing.
         * Relative URIs are then concatenated with the base URI.
         * 
         * @seeXMLCryptoContext#setBaseURI(String)
         */
        private String baseUri;
        /**
         * Sets the crypto context properties. See
         * {@link XMLCryptoContext#setProperty(String,Object)} . Possible
         * properties are defined in {@link XMLSignContext} an
         * {@link XMLValidateContext} (see Supported Properties).
         * <p>
         * The following properties are set by default to the value
         * {@link Boolean#TRUE} for the XML validation. If you want to switch
         * these features off you must set the property value to
         * {@link Boolean#FALSE} .
         * <ul>
         * <li><code>"org.jcp.xml.dsig.validateManifests"</code></li>
         * <li><code>"javax.xml.crypto.dsig.cacheReference"</code></li>
         * </ul>
         */
        private Map cryptoContextProperties;
        /**
         * Disallows that the incoming XML document contains DTD DOCTYPE
         * declaration. The default value is {@link Boolean#TRUE} .
         * 
         * @param disallowDoctypeDecl
         *            if set to {@link Boolean#FALSE} then DOCTYPE declaration
         *            is allowed, otherwise not
         */
        private Boolean disallowDoctypeDecl;
        /**
         * Indicator whether the XML declaration in the outgoing message body
         * should be omitted. Default value is <code>false</code>. Can be
         * overwritten by the header
         * {@link XmlSignatureConstants#HEADER_OMIT_XML_DECLARATION} .
         */
        private Boolean omitXmlDeclaration;
        /**
         * Determines if the XML signature specific headers be cleared after
         * signing and verification. Defaults to true.
         */
        private Boolean clearHeaders;
        /**
         * Classpath to the XML Schema. Must be specified in the detached XML
         * Signature case for determining the ID attributes, might be set in the
         * enveloped and enveloping case. If set, then the XML document is
         * validated with the specified XML schema. The schema resource URI can
         * be overwritten by the header
         * {@link XmlSignatureConstants#HEADER_SCHEMA_RESOURCE_URI} .
         */
        private String schemaResourceUri;
        /**
         * The character encoding of the resulting signed XML document. If
         * <code>null</code> then the encoding of the original XML document is
         * used.
         */
        private String outputXmlEncoding;

        public CamelContext getCamelContext() {
            return camelContext;
        }

        public void setCamelContext(CamelContext camelContext) {
            this.camelContext = camelContext;
        }

        public KeySelector getKeySelector() {
            return keySelector;
        }

        public void setKeySelector(KeySelector keySelector) {
            this.keySelector = keySelector;
        }

        public XmlSignatureChecker getXmlSignatureChecker() {
            return xmlSignatureChecker;
        }

        public void setXmlSignatureChecker(
                XmlSignatureChecker xmlSignatureChecker) {
            this.xmlSignatureChecker = xmlSignatureChecker;
        }

        public XmlSignature2Message getXmlSignature2Message() {
            return xmlSignature2Message;
        }

        public void setXmlSignature2Message(
                XmlSignature2Message xmlSignature2Message) {
            this.xmlSignature2Message = xmlSignature2Message;
        }

        public ValidationFailedHandler getValidationFailedHandler() {
            return validationFailedHandler;
        }

        public void setValidationFailedHandler(
                ValidationFailedHandler validationFailedHandler) {
            this.validationFailedHandler = validationFailedHandler;
        }

        public Object getOutputNodeSearch() {
            return outputNodeSearch;
        }

        public void setOutputNodeSearch(Object outputNodeSearch) {
            this.outputNodeSearch = outputNodeSearch;
        }

        public String getOutputNodeSearchType() {
            return outputNodeSearchType;
        }

        public void setOutputNodeSearchType(String outputNodeSearchType) {
            this.outputNodeSearchType = outputNodeSearchType;
        }

        public Boolean getRemoveSignatureElements() {
            return removeSignatureElements;
        }

        public void setRemoveSignatureElements(Boolean removeSignatureElements) {
            this.removeSignatureElements = removeSignatureElements;
        }

        public Boolean getSecureValidation() {
            return secureValidation;
        }

        public void setSecureValidation(Boolean secureValidation) {
            this.secureValidation = secureValidation;
        }

        public String getValidationFailedHandlerName() {
            return validationFailedHandlerName;
        }

        public void setValidationFailedHandlerName(
                String validationFailedHandlerName) {
            this.validationFailedHandlerName = validationFailedHandlerName;
        }

        public URIDereferencer getUriDereferencer() {
            return uriDereferencer;
        }

        public void setUriDereferencer(URIDereferencer uriDereferencer) {
            this.uriDereferencer = uriDereferencer;
        }

        public String getBaseUri() {
            return baseUri;
        }

        public void setBaseUri(String baseUri) {
            this.baseUri = baseUri;
        }

        public Map getCryptoContextProperties() {
            return cryptoContextProperties;
        }

        public void setCryptoContextProperties(Map cryptoContextProperties) {
            this.cryptoContextProperties = cryptoContextProperties;
        }

        public Boolean getDisallowDoctypeDecl() {
            return disallowDoctypeDecl;
        }

        public void setDisallowDoctypeDecl(Boolean disallowDoctypeDecl) {
            this.disallowDoctypeDecl = disallowDoctypeDecl;
        }

        public Boolean getOmitXmlDeclaration() {
            return omitXmlDeclaration;
        }

        public void setOmitXmlDeclaration(Boolean omitXmlDeclaration) {
            this.omitXmlDeclaration = omitXmlDeclaration;
        }

        public Boolean getClearHeaders() {
            return clearHeaders;
        }

        public void setClearHeaders(Boolean clearHeaders) {
            this.clearHeaders = clearHeaders;
        }

        public String getSchemaResourceUri() {
            return schemaResourceUri;
        }

        public void setSchemaResourceUri(String schemaResourceUri) {
            this.schemaResourceUri = schemaResourceUri;
        }

        public String getOutputXmlEncoding() {
            return outputXmlEncoding;
        }

        public void setOutputXmlEncoding(String outputXmlEncoding) {
            this.outputXmlEncoding = outputXmlEncoding;
        }
    }
}