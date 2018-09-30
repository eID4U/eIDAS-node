package at.gv.egiz.eid4u.impl.attributes;

import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshaller;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;
import eu.eidas.auth.commons.attribute.impl.StringAttributeValue;

public abstract class AbstractStringAttributeMarshaller implements AttributeValueMarshaller<String> {

	@Override
	public String marshal(AttributeValue<String> value) throws AttributeValueMarshallingException {
		String result = value.getValue();
		
		//to validation
		if (!hasValidForm(result))
			throw new AttributeValueMarshallingException(
					"Illegal " + getName() + " value \"" + result + "\"");
		
		return result;
	}

	@Override
	public AttributeValue<String> unmarshal(String value, boolean isNonLatinScriptAlternateVersion)
			throws AttributeValueMarshallingException {
		
		//to validation
				if (!hasValidForm(value))
					throw new AttributeValueMarshallingException(
							"Illegal " + getName() + " value \"" + value + "\"");
		
		return new StringAttributeValue(value);
	}
	
	/**
	 * Validate a String attribute if required
	 * 
	 * @param value String based attribute value
	 * @return true if valid, otherwise false
	 */
	abstract protected boolean hasValidForm(String value);
	
	/**
	 * Get the name of the attribute mashaller
	 * 
	 * @return
	 */
	abstract protected String getName();

}
