package at.gv.egiz.eid4u.api.attributes.natural;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import eu.eidas.auth.commons.lang.Canonicalizers;
import eu.eidas.auth.commons.lang.EnumMapper;
import eu.eidas.auth.commons.lang.KeyAccessor;

public enum IdType {
	PASSPORT("Passport"),
    NATIONALIDCARD("National Identity Card");

    private static final EnumMapper<String, IdType> MAPPER =
            new EnumMapper<String, IdType>(new KeyAccessor<String, IdType>() {

                @Nonnull
                @Override
                public String getKey(@Nonnull IdType gender) {
                    return gender.getValue();
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
