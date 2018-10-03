package at.gv.egiz.eid4u.impl.attributes.studies;

import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.CertificatesType;
import eu.eidas.auth.commons.attribute.impl.AbstractAttributeValue;

public class CertificatesTypeAttributeValue extends AbstractAttributeValue<CertificatesType>{

	private static final long serialVersionUID = 1L;

	public CertificatesTypeAttributeValue(CertificatesType val, boolean nonLatinScriptAlternateVer) {
		super(val, nonLatinScriptAlternateVer);
	}

	
}
