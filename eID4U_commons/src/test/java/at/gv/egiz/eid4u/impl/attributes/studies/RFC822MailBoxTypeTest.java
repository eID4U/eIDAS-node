package at.gv.egiz.eid4u.impl.attributes.studies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import at.gv.egiz.eid4u.impl.attributes.natural.RFC822MailboxTypeAttributeValueMarshaller;
import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

public class RFC822MailBoxTypeTest {

	@Test
	public void test() throws AttributeValueMarshallingException {
		// Valid ones
		marshallAndUnmarshal("nsajbsjas@a.at");
		marshallAndUnmarshal("nsajbsjas@test.website");
		marshallAndUnmarshal("tes+t@tgjhgjhgjhgjhgest.webvhjhvjhvjhvjhvjsite");
		marshallAndUnmarshal("very.(),:;<>[]\\\".VERY.\\\"very@\\ \\\"very\\\".unusual\"@strange.example.com");
//		marshallAndUnmarshal("admin@mailserver2");
		marshallAndUnmarshal("()<>[]:,;@\\\\\"!#$%&'-/=?^_`{}| ~.a\"@example.org");
//		marshallAndUnmarshal("user@[IPv6:2001:db8::1]");//should be valid?//TODO
		marshallAndUnmarshal("user@[192.168.2.1]");
		marshallAndUnmarshal("\" \"@example.org");
		marshallAndUnmarshal("x@example.com");
		marshallAndUnmarshal("user.name+tag+sorting@example.com");

		// Invalid ones
		testInvalid("Abc.example.com");
//		testInvalid("A@b@c@example.com");
//		testInvalid("a\"b(c)d,e:f;gi[j\\k]l@example.com");
//		testInvalid("just\"not\"right@example.com");
//		testInvalid("this is\"not\\allowed@example.com");
//		testInvalid("this\\ still\\\"not\\allowed@example.com");
//		testInvalid("john..doe@example.com");
//		testInvalid("john.doe@example..com");
//		testInvalid(" x@example.com");
//		testInvalid("x@example.com ");
	}

	private void testInvalid(String string) {
		try {
			marshallAndUnmarshal(string);
			assertTrue(string+ " should be invalid",false);
		} catch (AttributeValueMarshallingException e) {
			if (!e.getMessage().contains(
					"Illegal http://eidas.europa.eu/attributes/sectorspecific/eid4u/naturalperson/Email value")) {
				e.printStackTrace();
				assertTrue(false);
			}
		}

	}

	public void marshallAndUnmarshal(final String s) throws AttributeValueMarshallingException {

		RFC822MailboxTypeAttributeValueMarshaller serializer = new RFC822MailboxTypeAttributeValueMarshaller();

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
