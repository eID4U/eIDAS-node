package at.gv.egiz.eid4u.api.attributes.natural;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import eu.eidas.auth.commons.lang.Canonicalizers;
import eu.eidas.auth.commons.lang.EnumMapper;
import eu.eidas.auth.commons.lang.KeyAccessor;

public enum MaritalState {
	SINGLE("Single"),
    MARRIED("Married"),
    DIVORCED("Divorced"),
    WIDOWED("Widowed"),
    CIVILUNION("Civil Union");

    private static final EnumMapper<String, MaritalState> MAPPER =
            new EnumMapper<String, MaritalState>(new KeyAccessor<String, MaritalState>() {

                @Nonnull
                @Override
                public String getKey(@Nonnull MaritalState mstate) {
                    return mstate.getValue();
                }
            }, Canonicalizers.trimLowerCase(), values());

    @Nullable
    public static MaritalState fromString(@Nonnull String val) {
        return MAPPER.fromKey(val);
    }

    public static EnumMapper<String, MaritalState> mapper() {
        return MAPPER;
    }

    @Nonnull
    private final transient String value;

    MaritalState(@Nonnull String value) {
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
