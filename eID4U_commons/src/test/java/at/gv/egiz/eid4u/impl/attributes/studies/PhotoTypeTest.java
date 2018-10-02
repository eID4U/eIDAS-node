package at.gv.egiz.eid4u.impl.attributes.studies;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;

import at.gv.egiz.eid4u.impl.attributes.natural.DocumentAttributeValue;
import at.gv.egiz.eid4u.impl.attributes.natural.PhotoTypeAttributeValueMarshaller;
import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.generic.Document;
import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.generic.DocumentTypeType;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.MimeTypeEnumeration;
import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

public class PhotoTypeTest {

	@Test
	public void testMarshallerAndUnmarshaller() {
		PhotoTypeAttributeValueMarshaller serializer = new PhotoTypeAttributeValueMarshaller();
		
		String serializedValue  = null;
		AttributeValue<Document> testvalues = generateTestValue();
		
		//serialize attribute
		try {
			serializedValue = serializer.marshal(testvalues);
			
		} catch (AttributeValueMarshallingException e) {
			e.printStackTrace();
			
		}
		assertTrue(serializedValue != null);
		
		
		//deserialize attribute
		AttributeValue<Document> result = null;
		try {
			result = serializer.unmarshal(serializedValue, false);
			
		} catch (AttributeValueMarshallingException e) {
			e.printStackTrace();
			
		}
		assertTrue(result != null);
		
		
		//TODO: implement detail validation
		validate(result, testvalues);
		
	}

	private void validate(AttributeValue<Document> resultvalue, AttributeValue<Document> testvalue) {
		Document test = testvalue.getValue();
		Document result = resultvalue.getValue();
		
		assertTrue("ContentType not match", result.getName().equals(test.getName()));
		assertTrue("ContentType not match", result.getContentType().equals(test.getContentType()));
		assertTrue("DocumentType not match", result.getType().equals(test.getType()));
		assertArrayEquals(test.getValue(), result.getValue());
					

	}

	private AttributeValue<Document> generateTestValue() {
		
		//create first test-document
		Document testDocOne = new Document();
		testDocOne.setName(RandomStringUtils.random(10));
		testDocOne.setType(DocumentTypeType.PHOTO);
		testDocOne.setContentType(MimeTypeEnumeration.IMAGE_JPEG);
		testDocOne.setValue(RandomStringUtils.random(99).getBytes());

		return new DocumentAttributeValue(testDocOne, false);

	}
}
