package at.gv.egiz.eid4u.impl.attributes.studies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import at.gv.egiz.eid4u.api.attributes.natural.MaritalState;
import at.gv.egiz.eid4u.impl.attributes.natural.MaritalStateAttributeValueMarshaller;
import at.gv.egiz.eid4u.impl.attributes.natural.NationalityTypeAttributeValueMarshaller;
import at.gv.egiz.eid4u.impl.attributes.natural.RFC822MailboxTypeAttributeValueMarshaller;
import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

public class MaritalStateTest {

	@Test
	public void test() throws AttributeValueMarshallingException {
		// Valid ones
		marshallAndUnmarshal("Single");
		marshallAndUnmarshal("Married");
		marshallAndUnmarshal("Divorced");
		marshallAndUnmarshal("Widowed");
		marshallAndUnmarshal("Civil Union");

		// Invalid ones
		testInvalid("AT1");
		testInvalid("USA");
		testInvalid("Austria");
		testInvalid("");
		testInvalid("t");
		testInvalid("aT");

	}

	private void testInvalid(String string) {
		try {
			marshallAndUnmarshal(string);
			assertTrue(false);
		} catch (AttributeValueMarshallingException e) {
			if (!e.getMessage().contains("Illegal MaritalState value")) {
				e.printStackTrace();
				assertTrue(false);
			}
		}

	}

	public void marshallAndUnmarshal(final String s) throws AttributeValueMarshallingException {

		MaritalStateAttributeValueMarshaller serializer = new MaritalStateAttributeValueMarshaller();

		AttributeValue<MaritalState> attribute = new AttributeValue<MaritalState>() {

			@Override
			public MaritalState getValue() {
				return MaritalState.fromString(s);
			}

			@Override
			public boolean isNonLatinScriptAlternateVersion() {
				return false;
			}

		};

		String value = serializer.marshal(attribute);

		assertEquals(s, value);
		AttributeValue<MaritalState> attribute1 = serializer.unmarshal(value, false);

		assertEquals(attribute.getValue(), attribute1.getValue());
	}

}
