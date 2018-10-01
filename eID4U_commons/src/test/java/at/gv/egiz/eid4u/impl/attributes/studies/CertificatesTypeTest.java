package at.gv.egiz.eid4u.impl.attributes.studies;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;

import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.CertificatesType;
import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.generic.Document;
import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.generic.DocumentTypeType;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.MimeTypeEnumeration;
import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

public class CertificatesTypeTest {

	@Test
    public void dummyTest() {
		
	}
	
	@Test
	public void testMarshallerAndUnmarshaller() {
		CertificatesTypeAttributeValueMarshaller certTypeSerializer = new CertificatesTypeAttributeValueMarshaller();
		
		String serializedValue  = null;
		AttributeValue<CertificatesType > testvalues = generateTestValue();
		
		//serialize attribute
		try {
			serializedValue = certTypeSerializer.marshal(testvalues);
			
		} catch (AttributeValueMarshallingException e) {
			e.printStackTrace();
			
		}
		assertTrue(serializedValue != null);
		
		
		//deserialize attribute
		AttributeValue<CertificatesType > result = null;
		try {
			result = certTypeSerializer.unmarshal(serializedValue, false);
			
		} catch (AttributeValueMarshallingException e) {
			e.printStackTrace();
			
		}
		assertTrue(result != null);
		
		
		//TODO: implement detail validation
		validate(result, testvalues);
		
	}

	private void validate(AttributeValue<CertificatesType> result, AttributeValue<CertificatesType> testvalues) {
		List<Document> testList = testvalues.getValue().getDocument();
		List<Document> resultList = result.getValue().getDocument();
		
		assertTrue(testList.size() == resultList.size());
		
		for (Document el : testList) {
			boolean findDoc = false;
			for (Document resultEl : resultList) {
				if (resultEl.getName().equals(el.getName())) {
					findDoc = true;
					assertTrue("ContentType not match", resultEl.getContentType().equals(el.getContentType()));
					assertTrue("DocumentType not match", resultEl.getType().equals(el.getType()));
					assertArrayEquals(el.getValue(), resultEl.getValue());
					
				}
				
			}
			assertTrue("Result document '" + el.getName() + "' NOT found", findDoc);
			
		}
	}

	private AttributeValue<CertificatesType> generateTestValue() {
		ArrayList<Document> list = new ArrayList<Document>();
		
		//create first test-document
		Document testDocOne = new Document();
		testDocOne.setName(RandomStringUtils.random(10));
		testDocOne.setType(DocumentTypeType.CERTIFICATE);
		testDocOne.setContentType(MimeTypeEnumeration.APPLICATION_PDF);
		testDocOne.setValue(RandomStringUtils.random(99).getBytes());
		list.add(testDocOne);
		
		//create first test-document
		Document testDocTwo = new Document();
		testDocTwo.setName(RandomStringUtils.random(10));
		testDocTwo.setType(DocumentTypeType.CERTIFICATE);
		testDocTwo.setContentType(MimeTypeEnumeration.APPLICATION_PDF);
		testDocTwo.setValue(RandomStringUtils.random(99).getBytes());
		list.add(testDocTwo);
		
		CertificatesType result = new CertificatesType(); 
		result.getDocument().addAll(list);
		
		return new CertificatesTypeAttributeValue(result, false);
	}
}
