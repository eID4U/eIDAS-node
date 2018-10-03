package at.gv.egiz.eid4u.impl.attributes.studies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import at.gv.egiz.eid4u.api.attributes.natural.IdType;
import at.gv.egiz.eid4u.api.attributes.natural.MaritalState;
import at.gv.egiz.eid4u.impl.attributes.natural.IdTypeAttributeValueMarshaller;
import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

public class DegreeStringTest {

	@Test
	public void test() throws AttributeValueMarshallingException {
		// Valid ones
		marshallAndUnmarshal("6");//PhD??
		marshallAndUnmarshal("4");

		// Invalid ones
		testInvalid("PhD");
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
			if (!e.getMessage().contains("Illegal Degree value")) {
				e.printStackTrace();
				assertTrue(false);
			}
		}

	}

	public void marshallAndUnmarshal(final String s) throws AttributeValueMarshallingException {

		DegreeStringAttributeValueMarshaller degreeSerializer = new DegreeStringAttributeValueMarshaller();

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

		String value = degreeSerializer.marshal(attribute);

		assertEquals(s, value);
		AttributeValue<String> attribute1 = degreeSerializer.unmarshal(value, false);

		assertEquals(attribute.getValue(), attribute1.getValue());
	}

}
