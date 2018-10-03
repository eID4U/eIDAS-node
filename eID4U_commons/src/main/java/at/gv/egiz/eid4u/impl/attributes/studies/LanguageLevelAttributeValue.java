package at.gv.egiz.eid4u.impl.attributes.studies;

import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.LanguageLevelType;
import eu.eidas.auth.commons.attribute.impl.AbstractAttributeValue;

public class LanguageLevelAttributeValue extends AbstractAttributeValue<LanguageLevelType>{

	private static final long serialVersionUID = 1L;

	public LanguageLevelAttributeValue(LanguageLevelType val, boolean nonLatinScriptAlternateVer) {
		super(val, nonLatinScriptAlternateVer);
	}

	
}
