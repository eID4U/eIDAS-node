package at.gv.egiz.eid4u.impl.attributes.studies;

import java.util.ArrayList;

import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.generic.Document;
import eu.eidas.auth.commons.attribute.impl.AbstractAttributeValue;

public class CertificatesTypeAttributeValue extends AbstractAttributeValue<ArrayList<Document>>{

	private static final long serialVersionUID = 1L;

	protected CertificatesTypeAttributeValue(ArrayList<Document> val, boolean nonLatinScriptAlternateVer) {
		super(val, nonLatinScriptAlternateVer);
	}

	
}
