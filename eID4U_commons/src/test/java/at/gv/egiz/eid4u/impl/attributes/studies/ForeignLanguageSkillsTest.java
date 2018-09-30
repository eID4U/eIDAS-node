package at.gv.egiz.eid4u.impl.attributes.studies;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;

import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.generic.Document;
import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.generic.DocumentTypeType;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.AbstractExperienceListType;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.ForeignLanguageSkillType;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.LinguisticExperienceListType;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.LinguisticExperienceType;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.MimeTypeEnumeration;
import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

public class ForeignLanguageSkillsTest {

	@Test
    public void dummyTest() {
		
	}
	
	@Test
	public void testMarshallerAndUnmarshaller() {
		LanguageLevelTypeAttributeValueMarshaller serializer = new LanguageLevelTypeAttributeValueMarshaller();
		
		String serializedValue  = null;
		AttributeValue<ArrayList<ForeignLanguageSkillType>> testvalues = generateTestValue();
		
		//serialize attribute
		try {
			serializedValue = serializer.marshal(testvalues);
			
		} catch (AttributeValueMarshallingException e) {
			e.printStackTrace();
			
		}
		assertTrue(serializedValue != null);
		
		
		//deserialize attribute
		AttributeValue<ArrayList<ForeignLanguageSkillType>>result = null;
		try {
			result = serializer.unmarshal(serializedValue, false);
			
		} catch (AttributeValueMarshallingException e) {
			e.printStackTrace();
			
		}
		assertTrue(result != null);
		
		
		//TODO: implement detail validation
		validate(result, testvalues);
		
	}

	private void validate(AttributeValue<ArrayList<ForeignLanguageSkillType>> result, AttributeValue<ArrayList<ForeignLanguageSkillType>> testvalues) {
		ArrayList<ForeignLanguageSkillType> testList = testvalues.getValue();
		ArrayList<ForeignLanguageSkillType> resultList = result.getValue();
		
		assertTrue(testList.size() == resultList.size());
		
		for (ForeignLanguageSkillType el : testList) {
			boolean findDoc = false;
			for (ForeignLanguageSkillType resultEl : resultList) {
				
				//TODO add detailed resting
				
					
			
				
			}
			//assertTrue("Result languageSkill '" + "' NOT found", findDoc);
			
		}
	}

	private AttributeValue<ArrayList<ForeignLanguageSkillType>> generateTestValue() {
		ArrayList<ForeignLanguageSkillType> list = new ArrayList<ForeignLanguageSkillType>();
		
		//create first test-document
		ForeignLanguageSkillType testDocOne = new ForeignLanguageSkillType();
		
		LinguisticExperienceListType exp = new LinguisticExperienceListType();
		LinguisticExperienceType expD = new LinguisticExperienceType();
		expD.setDescription(RandomStringUtils.random(10));
		exp.getExperience().add(expD);
		
		//TODO: add more information
		
		testDocOne.setAcquiredDuring(exp );
		
		list.add(testDocOne);
		
		
		return new LanguageLevelAttributeValue(list, false);
	}
}
