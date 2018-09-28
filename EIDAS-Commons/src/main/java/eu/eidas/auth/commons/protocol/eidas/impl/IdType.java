package eu.eidas.auth.commons.protocol.eidas.impl;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import eu.eidas.auth.commons.lang.Canonicalizers;
import eu.eidas.auth.commons.lang.EnumMapper;
import eu.eidas.auth.commons.lang.KeyAccessor;

/**
 * IdType as per the eIDAS spec.
 * <p>
 * <pre>
 *      <xs:simpleType name="IdTypeType">
 * 		    <xs:annotation>
 * 			    <xs:documentation>Identification document type</xs:documentation>
 * 		    </xs:annotation>
 * 		    <xs:restriction base="xs:string">
 * 			    <xs:enumeration value="Passport"/>
 * 			    <xs:enumeration value="National Identity Card"/>
 * 		    </xs:restriction>
 * 	    </xs:simpleType>
 * </pre>
 *
 * @since 1.1
 */
public enum IdType {

    PASSPORT("Passport"),

    NATIONAL_IDENTITY_CARD("National Identity Card");

    private static final EnumMapper<String, IdType> MAPPER =
            new EnumMapper<String, IdType>(new KeyAccessor<String,IdType>() {

                @Nonnull
                @Override
                public String getKey(@Nonnull IdType idType) {
                    return idType.getValue();
                }
            }, Canonicalizers.trimLowerCase(), values());

    @Nullable
    public static IdType fromString(@Nonnull String val) {
        return MAPPER.fromKey(val);
    }

    public static EnumMapper<String, IdType> mapper() {
        return MAPPER;
    }

    @Nonnull
    private final transient String value;

    IdType(@Nonnull String value) {
        this.value = value;
    }

    @Nonnull
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
