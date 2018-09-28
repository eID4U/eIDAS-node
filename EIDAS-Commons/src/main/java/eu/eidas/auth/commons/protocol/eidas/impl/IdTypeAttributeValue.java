package eu.eidas.auth.commons.protocol.eidas.impl;

import javax.annotation.Nonnull;

import eu.eidas.auth.commons.attribute.impl.AbstractAttributeValue;

/**
 * eIDAS IdType AttributeValue
 *
 * @since 1.1
 */
public final class IdTypeAttributeValue extends AbstractAttributeValue<IdType> {
    public IdTypeAttributeValue(@Nonnull IdType value) {
        super(value, true);
    }
}