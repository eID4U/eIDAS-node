package at.gv.egiz.eid4u.impl.attributes.natural;

import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.generic.Document;
import eu.eidas.auth.commons.attribute.impl.AbstractAttributeValue;

public class DocumentAttributeValue extends AbstractAttributeValue<Document>{

	private static final long serialVersionUID = 1L;

	public DocumentAttributeValue(Document val, boolean nonLatinScriptAlternateVer) {
		super(val, false);
		
	}

}
