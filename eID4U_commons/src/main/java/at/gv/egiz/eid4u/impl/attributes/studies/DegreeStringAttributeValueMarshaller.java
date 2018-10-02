package at.gv.egiz.eid4u.impl.attributes.studies;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import at.gv.egiz.eid4u.api.attributes.Definitions;
import at.gv.egiz.eid4u.impl.attributes.AbstractStringAttributeMarshaller;

public class DegreeStringAttributeValueMarshaller extends AbstractStringAttributeMarshaller {

	private static final String PATTERN = "^[1-8]{1}$";	
	private static final Pattern p = Pattern.compile(PATTERN);
	
	@Override
	protected boolean hasValidForm(String value) {
		Matcher matcher = p.matcher(value);
		return matcher.matches();
		
	}

	@Override
	protected String getName() {
		return Definitions.DEGREE_FRIENDLYNAME;
	}

}
