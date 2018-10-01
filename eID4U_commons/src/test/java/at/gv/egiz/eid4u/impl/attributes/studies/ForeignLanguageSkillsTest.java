package at.gv.egiz.eid4u.impl.attributes.studies;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;

import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.LanguageLevelType;
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
		AttributeValue<LanguageLevelType> testvalues = generateTestValue();
		
		//serialize attribute
		try {
			serializedValue = serializer.marshal(testvalues);
			
		} catch (AttributeValueMarshallingException e) {
			e.printStackTrace();
			
		}
		assertTrue(serializedValue != null);
		
		
		//deserialize attribute
		AttributeValue<LanguageLevelType>result = null;
		try {
			result = serializer.unmarshal(serializedValue, false);
			
		} catch (AttributeValueMarshallingException e) {
			e.printStackTrace();
			
		}
		assertTrue(result != null);
		
		
		//TODO: implement detail validation
		validate(result, testvalues);
		
	}

	private void validate(AttributeValue<LanguageLevelType> result, AttributeValue<LanguageLevelType> testvalues) {
		List<ForeignLanguageSkillType> testList = testvalues.getValue().getForeignLanguage();
		List<ForeignLanguageSkillType> resultList = result.getValue().getForeignLanguage();
		
		assertTrue(testList.size() == resultList.size());
		
		for (ForeignLanguageSkillType el : testList) {
			boolean findDoc = false;
			for (ForeignLanguageSkillType resultEl : resultList) {
				
				//TODO add detailed resting
				
					
			
				
			}
			//assertTrue("Result languageSkill '" + "' NOT found", findDoc);
			
		}
	}

	private AttributeValue<LanguageLevelType> generateTestValue() {
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
		
		LanguageLevelType result = new LanguageLevelType();
		result.getForeignLanguage().addAll(list);
		
		return new LanguageLevelAttributeValue(result, false);
	}
}
