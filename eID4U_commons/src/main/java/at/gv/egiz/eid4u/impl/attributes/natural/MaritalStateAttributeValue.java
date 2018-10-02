package at.gv.egiz.eid4u.impl.attributes.natural;

import at.gv.egiz.eid4u.api.attributes.natural.MaritalState;
import eu.eidas.auth.commons.attribute.impl.AbstractAttributeValue;

public final class MaritalStateAttributeValue extends AbstractAttributeValue<MaritalState>{

	private static final long serialVersionUID = -4215108790225070526L;

	protected MaritalStateAttributeValue(MaritalState val) {
		super(val, true);
	}

}
