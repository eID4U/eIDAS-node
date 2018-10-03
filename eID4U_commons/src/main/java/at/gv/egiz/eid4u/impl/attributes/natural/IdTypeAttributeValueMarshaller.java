package at.gv.egiz.eid4u.impl.attributes.natural;

import at.gv.egiz.eid4u.api.attributes.natural.IdType;
import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshaller;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

public final class IdTypeAttributeValueMarshaller implements AttributeValueMarshaller<IdType> {

	@Override
	public String marshal(AttributeValue<IdType> value) throws AttributeValueMarshallingException {
		if(value.getValue() == null)
			throw new AttributeValueMarshallingException("Illegal IdType value \"null\"");
		return value.getValue().getValue();
	}

	@Override
	public AttributeValue<IdType> unmarshal(String value, boolean isNonLatinScriptAlternateVersion)
			throws AttributeValueMarshallingException {
		IdType idType = IdType.fromString(value);
        if (null == idType) {
            throw new AttributeValueMarshallingException("Illegal IdType value \"" + value + "\"");
        }
        return new IdTypeAttributeValue(idType);
	}

}
