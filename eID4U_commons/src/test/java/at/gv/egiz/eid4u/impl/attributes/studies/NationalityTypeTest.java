package at.gv.egiz.eid4u.impl.attributes.studies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import at.gv.egiz.eid4u.impl.attributes.natural.NationalityTypeAttributeValueMarshaller;
import at.gv.egiz.eid4u.impl.attributes.natural.RFC822MailboxTypeAttributeValueMarshaller;
import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

public class NationalityTypeTest {

	@Test
	public void test() throws AttributeValueMarshallingException {
		// Valid ones
		marshallAndUnmarshal("AT");
		marshallAndUnmarshal("DE");
		marshallAndUnmarshal("ES");
		marshallAndUnmarshal("UK");

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
			if (!e.getMessage().contains("Illegal Nationality value")) {
				e.printStackTrace();
				assertTrue(false);
			}
		}

	}

	public void marshallAndUnmarshal(final String s) throws AttributeValueMarshallingException {

		NationalityTypeAttributeValueMarshaller serializer = new NationalityTypeAttributeValueMarshaller();

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
