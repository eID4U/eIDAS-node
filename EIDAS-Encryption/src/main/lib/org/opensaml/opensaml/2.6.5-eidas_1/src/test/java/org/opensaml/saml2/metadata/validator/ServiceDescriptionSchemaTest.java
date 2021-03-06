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

package org.opensaml.saml2.metadata.validator;

import javax.xml.namespace.QName;

import org.opensaml.common.BaseSAMLObjectValidatorTestCase;
import org.opensaml.common.xml.SAMLConstants;
import org.opensaml.saml2.metadata.LocalizedString;
import org.opensaml.saml2.metadata.ServiceDescription;
import org.opensaml.xml.validation.ValidationException;

/**
 * Test case for {@link org.opensaml.saml2.metadata.ServiceDescription}.
 */
public class ServiceDescriptionSchemaTest extends BaseSAMLObjectValidatorTestCase {

    /** Constructor */
    public ServiceDescriptionSchemaTest() {
        targetQName = new QName(SAMLConstants.SAML20MD_NS, ServiceDescription.DEFAULT_ELEMENT_LOCAL_NAME, SAMLConstants.SAML20MD_PREFIX);
        validator = new ServiceDescriptionSchemaValidator();
    }

    /** {@inheritDoc} */
    protected void populateRequiredData() {
        super.populateRequiredData();
        ServiceDescription serviceDescription = (ServiceDescription) target;
        serviceDescription.setDescription(new LocalizedString("description","language"));
    }

    /**
     * Tests for Description failure.
     * 
     * @throws ValidationException
     */
    public void testDescriptionFailure() throws ValidationException {
        ServiceDescription serviceDescription = (ServiceDescription) target;

        serviceDescription.setDescription(null);
        assertValidationFail("Description was null, should raise a Validation Exception.");
    }
}