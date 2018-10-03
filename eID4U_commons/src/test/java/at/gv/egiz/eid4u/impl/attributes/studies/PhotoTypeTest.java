package at.gv.egiz.eid4u.impl.attributes.studies;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;

import com.google.common.io.ByteStreams;

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
		AttributeValue<Document> testvalues = generateTestValue();
		toTest(testvalues);
		
	}

	@Test
	public void testBase64ExemplateFromUPM() throws AttributeValueMarshallingException, UnsupportedEncodingException, IOException {
		InputStream is = this.getClass().getResourceAsStream("/photo_test_1.b64");
		AttributeValue<Document> testvalues = generateTestValueBase64(new String(ByteStreams.toByteArray(is), "UTF-8"));
		toTest(testvalues);

		
	}
	
	private void toTest(AttributeValue<Document> testvalues) {
		PhotoTypeAttributeValueMarshaller serializer = new PhotoTypeAttributeValueMarshaller();
		String serializedValue  = null;
		
		assertTrue("toString() method does not work on complexe attribute", !testvalues.getValue().toString().startsWith("Can NOT marshall"));
		
		
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
		
		validate(result, testvalues);
		
	}
	
	
	private AttributeValue<Document> generateTestValueBase64(String b64Test) throws AttributeValueMarshallingException {
		PhotoTypeAttributeValueMarshaller serializer = new PhotoTypeAttributeValueMarshaller();
		return serializer.unmarshal(b64Test, false);
		
		
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
