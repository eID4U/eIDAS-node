package at.gv.egiz.eid4u.impl.attributes.studies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import at.gv.egiz.eid4u.api.attributes.natural.IdType;
import at.gv.egiz.eid4u.api.attributes.natural.MaritalState;
import at.gv.egiz.eid4u.impl.attributes.natural.IdTypeAttributeValueMarshaller;
import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

public class IdTypeTest {

	@Test
	public void test() throws AttributeValueMarshallingException {
		// Valid ones
		marshallAndUnmarshal("Passport");
		marshallAndUnmarshal("National Identity Card");

		// Invalid ones
		testInvalid("Passport1");
		testInvalid("USA");
		testInvalid("Austria");
		testInvalid("");
		testInvalid("Divorced");
		testInvalid("aT");
	}

	private void testInvalid(String string) {
		try {
			marshallAndUnmarshal(string);
			assertTrue(false);
		} catch (AttributeValueMarshallingException e) {
			if (!e.getMessage().contains("Illegal IdType value")) {
				e.printStackTrace();
				assertTrue(false);
			}
		}

	}

	public void marshallAndUnmarshal(final String s) throws AttributeValueMarshallingException {

		IdTypeAttributeValueMarshaller serializer = new IdTypeAttributeValueMarshaller();

		AttributeValue<IdType> attribute = new AttributeValue<IdType>() {

			@Override
			public IdType getValue() {
				// TODO Auto-generated method stub
				return IdType.fromString(s);
			}

			@Override
			public boolean isNonLatinScriptAlternateVersion() {
				// TODO Auto-generated method stub
				return false;
			}

		};

		String value = serializer.marshal(attribute);

		assertEquals(s, value);
		AttributeValue<IdType> attribute1 = serializer.unmarshal(value, false);

		assertEquals(attribute.getValue(), attribute1.getValue());
	}

}
