package at.gv.egiz.eid4u.impl.attributes.studies;

import java.util.ArrayList;

import at.gv.egiz.eid4u.impl.attributes.xjc.europass.ForeignLanguageSkillType;
import eu.eidas.auth.commons.attribute.impl.AbstractAttributeValue;

public class LanguageLevelAttributeValue extends AbstractAttributeValue<ArrayList<ForeignLanguageSkillType>>{

	private static final long serialVersionUID = 1L;

	protected LanguageLevelAttributeValue(ArrayList<ForeignLanguageSkillType> val, boolean nonLatinScriptAlternateVer) {
		super(val, nonLatinScriptAlternateVer);
	}

	
}
