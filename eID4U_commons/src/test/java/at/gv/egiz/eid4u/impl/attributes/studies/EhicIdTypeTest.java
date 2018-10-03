package at.gv.egiz.eid4u.impl.attributes.studies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import at.gv.egiz.eid4u.api.attributes.natural.IdType;
import at.gv.egiz.eid4u.api.attributes.natural.MaritalState;
import at.gv.egiz.eid4u.impl.attributes.natural.EhicIdTypeAttributeValueMarshaller;
import at.gv.egiz.eid4u.impl.attributes.natural.IdTypeAttributeValueMarshaller;
import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

public class EhicIdTypeTest {

	@Test
	public void test() throws AttributeValueMarshallingException {
		// Valid ones
		marshallAndUnmarshal("80010000012345678990");
		marshallAndUnmarshal("80010000015555578990");

		// Invalid ones
		testInvalid("8001000001555557899");
		testInvalid("10010000012345678990");
		testInvalid("20010000015555578990");
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
			if (!e.getMessage().contains("Illegal EhicId value")) {
				e.printStackTrace();
				assertTrue(false);
			}
		}

	}

	public void marshallAndUnmarshal(final String s) throws AttributeValueMarshallingException {

		EhicIdTypeAttributeValueMarshaller serializer = new EhicIdTypeAttributeValueMarshaller();

		AttributeValue<String> attribute = new AttributeValue<String>() {

			@Override
			public String getValue() {
				return s;
			}

			@Override
			public boolean isNonLatinScriptAlternateVersion() {
				return false;
			}

		};

		String value = serializer.marshal(attribute);

		assertEquals(s, value);
		AttributeValue<String> attribute1 = serializer.unmarshal(value, false);

		assertEquals(attribute.getValue(), attribute1.getValue());
	}

}
