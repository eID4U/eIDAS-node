package at.gv.egiz.eid4u.impl.attributes.natural;

import at.gv.egiz.eid4u.api.attributes.natural.IdType;
import eu.eidas.auth.commons.attribute.impl.AbstractAttributeValue;

public final class IdTypeAttributeValue extends AbstractAttributeValue<IdType>{

	private static final long serialVersionUID = -4215108790225070526L;

	protected IdTypeAttributeValue(IdType val) {
		super(val, true);
	}

}
