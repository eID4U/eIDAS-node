package eu.eidas.auth.commons.protocol.eidas.impl;

import javax.annotation.Nonnull;

import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshaller;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

/**
 * AttributeValueMarshaller for idType values.
 *
 * @since 1.1
 */
public final class IdTypeAttributeValueMarshaller implements AttributeValueMarshaller<IdType> {

    @Nonnull
    @Override
    public String marshal(@Nonnull AttributeValue<IdType> value) {
        return value.getValue().getValue();
    }

    @Nonnull
    @Override
    public AttributeValue<IdType> unmarshal(@Nonnull String value, boolean isNonLatinScriptAlternateVersion)
            throws AttributeValueMarshallingException {
        IdType idType = IdType.fromString(value);
        if (null == idType) {
            throw new AttributeValueMarshallingException("Illegal idType value \"" + value + "\"");
        }
        return new IdTypeAttributeValue(idType);
    }
}