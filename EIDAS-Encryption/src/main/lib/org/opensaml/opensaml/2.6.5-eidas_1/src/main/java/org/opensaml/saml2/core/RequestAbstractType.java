/*
 * Licensed to the University Corporation for Advanced Internet Development, 
 * Inc. (UCAID) under one or more contributor license agreements.  See the 
 * NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The UCAID licenses this file to You under the Apache 
 * License, Version 2.0 (the "License"); you may not use this file except in 
 * compliance with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opensaml.saml2.core;

import javax.xml.namespace.QName;

import org.joda.time.DateTime;
import org.opensaml.common.SAMLVersion;
import org.opensaml.common.SignableSAMLObject;
import org.opensaml.common.xml.SAMLConstants;
import org.opensaml.saml2.common.Extensions;

/**
 * SAML 2.0 Core RequestAbstractType.
 */
public interface RequestAbstractType extends SignableSAMLObject {

    /** Local name of the XSI type. */
    public static final String TYPE_LOCAL_NAME = "RequestAbstractType";

    /** QName of the XSI type. */
    public static final QName TYPE_NAME = new QName(SAMLConstants.SAML20P_NS, TYPE_LOCAL_NAME,
            SAMLConstants.SAML20P_PREFIX);

    /** ID attribute name. */
    public static final String ID_ATTRIB_NAME = "ID";

    /** Version attribute name. */
    public static final String VERSION_ATTRIB_NAME = "Version";

    /** IssueInstant attribute name. */
    public static final String ISSUE_INSTANT_ATTRIB_NAME = "IssueInstant";

    /** Destination attribute name. */
    public static final String DESTINATION_ATTRIB_NAME = "Destination";

    /** Consent attribute name. */
    public static final String CONSENT_ATTRIB_NAME = "Consent";

    /** Unspecified consent URI. */
    public static final String UNSPECIFIED_CONSENT = "urn:oasis:names:tc:SAML:2.0:consent:unspecified";

    /** Obtained consent URI. */
    public static final String OBTAINED_CONSENT = "urn:oasis:names:tc:SAML:2.0:consent:obtained";

    /** Prior consent URI. */
    public static final String PRIOR_CONSENT = "urn:oasis:names:tc:SAML:2.0:consent:prior";

    /** Implicit consent URI. */
    public static final String IMPLICIT_CONSENT = "urn:oasis:names:tc:SAML:2.0:consent:current-implicit";

    /** Explicit consent URI. */
    public static final String EXPLICIT_CONSENT = "urn:oasis:names:tc:SAML:2.0:consent:current-explicit";

    /** Unavailable consent URI. */
    public static final String UNAVAILABLE_CONSENT = "urn:oasis:names:tc:SAML:2.0:consent:unavailable";

    /** Inapplicable consent URI. */
    public static final String INAPPLICABLE_CONSENT = "urn:oasis:names:tc:SAML:2.0:consent:inapplicable";

    /**
     * Gets the SAML Version of this request.
     * 
     * @return the SAML Version of this request.
     */
    public SAMLVersion getVersion();

    /**
     * Sets the SAML Version of this request.
     * 
     * @param newVersion the SAML Version of this request
     */
    public void setVersion(SAMLVersion newVersion);

    /**
     * Gets the unique identifier of the request.
     * 
     * @return the unique identifier of the request
     */
    public String getID();

    /**
     * Sets the unique identifier of the request.
     * 
     * @param newID the unique identifier of the request
     */

    public void setID(String newID);

    /**
     * Gets the date/time the request was issued.
     * 
     * @return the date/time the request was issued
     */

    public DateTime getIssueInstant();

    /**
     * Sets the date/time the request was issued.
     * 
     * @param newIssueInstant the date/time the request was issued
     */
    public void setIssueInstant(DateTime newIssueInstant);

    /**
     * Gets the URI of the destination of the request.
     * 
     * @return the URI of the destination of the request
     */
    public String getDestination();

    /**
     * Sets the URI of the destination of the request.
     * 
     * @param newDestination the URI of the destination of the request
     */
    public void setDestination(String newDestination);

    /**
     * Gets the consent obtained from the principal for sending this request.
     * 
     * @return the consent obtained from the principal for sending this request
     */
    public String getConsent();

    /**
     * Sets the consent obtained from the principal for sending this request.
     * 
     * @param newConsent the new consent obtained from the principal for sending this request
     */
    public void setConsent(String newConsent);

    /**
     * Gets the issuer of this request.
     * 
     * @return the issuer of this request
     */
    public Issuer getIssuer();

    /**
     * Sets the issuer of this request.
     * 
     * @param newIssuer the issuer of this request
     */
    public void setIssuer(Issuer newIssuer);

    /**
     * Gets the Extensions of this request.
     * 
     * @return the Status of this request
     */
    public Extensions getExtensions();

    /**
     * Sets the Extensions of this request.
     * 
     * @param newExtensions the Extensions of this request
     */
    public void setExtensions(Extensions newExtensions);

}