package at.gv.egiz.eid4u.impl.attributes.natural;

import at.gv.egiz.eid4u.api.attributes.natural.MaritalState;
import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshaller;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

public final class MaritalStateAttributeValueMarshaller implements AttributeValueMarshaller<MaritalState> {

	@Override
	public String marshal(AttributeValue<MaritalState> value) throws AttributeValueMarshallingException {
		return value.getValue().getValue();
		
	}

	@Override
	public AttributeValue<MaritalState> unmarshal(String value, boolean isNonLatinScriptAlternateVersion)
			throws AttributeValueMarshallingException {
		MaritalState idType = MaritalState.fromString(value);
        if (null == idType) {
            throw new AttributeValueMarshallingException("Illegal MaritalState value \"" + value + "\"");
        }
        return new MaritalStateAttributeValue(idType);
	}

}
