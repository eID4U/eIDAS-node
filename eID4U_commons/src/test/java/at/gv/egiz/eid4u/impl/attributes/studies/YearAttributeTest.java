package at.gv.egiz.eid4u.impl.attributes.studies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

public class YearAttributeTest {

	@Test
	public void test() throws AttributeValueMarshallingException {
		test(2000);
		test(5000);
		try {
			test(-5);
			assertTrue(false);
		} catch (AttributeValueMarshallingException e) {
			if (!e.getMessage().contains("GraduationYear has a not valid value")) {
				assertTrue(false);
			}
		}
	}

	public void test(final Integer i) throws AttributeValueMarshallingException {

		YearIntegerAttributeValueMarshaller integerSerializer = new YearIntegerAttributeValueMarshaller();

		AttributeValue<Integer> attribute = new AttributeValue<Integer>() {

			@Override
			public Integer getValue() {
				return i;
			}

			@Override
			public boolean isNonLatinScriptAlternateVersion() {
				return false;
			}

		};

		String value = integerSerializer.marshal(attribute);

		assertEquals(i.toString(), value);
		AttributeValue<Integer> attribute1 = integerSerializer.unmarshal(value, false);

		assertEquals(attribute.getValue(), attribute1.getValue());
	}

}
