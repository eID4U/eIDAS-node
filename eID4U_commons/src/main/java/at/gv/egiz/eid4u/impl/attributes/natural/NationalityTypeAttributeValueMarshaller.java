package at.gv.egiz.eid4u.impl.attributes.natural;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import at.gv.egiz.eid4u.api.attributes.Definitions;
import at.gv.egiz.eid4u.impl.attributes.AbstractStringAttributeMarshaller;

public class NationalityTypeAttributeValueMarshaller extends AbstractStringAttributeMarshaller {

	private static final String PATTERN = "^[A-Z]{2}$";	
	private static final Pattern p = Pattern.compile(PATTERN);
	
	@Override
	protected boolean hasValidForm(String value) {
		Matcher matcher = p.matcher(value);
		return matcher.matches();
		
	}

	@Override
	protected String getName() {
		return Definitions.NATIONALITY_FRIENDLYNAME;
	}

}
