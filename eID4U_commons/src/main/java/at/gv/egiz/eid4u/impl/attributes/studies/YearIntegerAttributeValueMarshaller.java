package at.gv.egiz.eid4u.impl.attributes.studies;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Nonnull;

import at.gv.egiz.eid4u.api.attributes.Definitions;
import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshaller;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;
import eu.eidas.auth.commons.attribute.impl.IntegerAttributeValue;

public class YearIntegerAttributeValueMarshaller implements AttributeValueMarshaller<Integer> {

	private static final String PATTERN = "^[0-9]{4}$";	
	private static final Pattern p = Pattern.compile(PATTERN);
	
    @Nonnull
    @Override
    public String marshal(@Nonnull AttributeValue<Integer> value) throws AttributeValueMarshallingException {
    	
    	if (value.getValue() < 1800 || value.getValue() > 9999)
    		throw new AttributeValueMarshallingException(Definitions.GRADUATIONYEAR_FRIENDLYNAME + " has a not valid value" + value.getValue().toString());
    	
        return value.getValue().toString();
        
    }

    @Nonnull
    @Override
    public AttributeValue<Integer> unmarshal(@Nonnull String value, boolean isNonLatinScriptAlternateVersion)
            throws AttributeValueMarshallingException {
        try {
        	Matcher matcher = p.matcher(value);
    		if (!matcher.matches())
    			throw new AttributeValueMarshallingException(Definitions.GRADUATIONYEAR_FRIENDLYNAME + " has a not valid value" + value);
        	
            return new IntegerAttributeValue(Integer.valueOf(value));
            
            
        } catch (NumberFormatException nfe) {
            throw new AttributeValueMarshallingException(nfe);
        }
    }

}
