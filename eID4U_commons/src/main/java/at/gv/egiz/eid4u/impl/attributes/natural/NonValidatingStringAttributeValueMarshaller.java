package at.gv.egiz.eid4u.impl.attributes.natural;

import at.gv.egiz.eid4u.impl.attributes.AbstractStringAttributeMarshaller;

public class NonValidatingStringAttributeValueMarshaller extends AbstractStringAttributeMarshaller {

	@Override
	protected boolean hasValidForm(String value) {
		return true;
	}

	@Override
	protected String getName() {
		return "GenericStringAttribute";
	}

}
