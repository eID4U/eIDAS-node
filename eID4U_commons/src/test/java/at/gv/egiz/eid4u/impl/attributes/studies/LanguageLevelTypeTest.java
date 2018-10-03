package at.gv.egiz.eid4u.impl.attributes.studies;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.junit.Test;
import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.LanguageLevelType;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.AbstractExperienceListType;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.CertificateListType;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.CertificateType;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.DateType;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.ExperienceType;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.ForeignLanguageSkillType;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.InternalReferenceType;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.IntraDocumentDocumentationType;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.LinguisticExperienceListType;
import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

public class LanguageLevelTypeTest {

	@Test
	public void testMarshallerAndUnmarshaller() {
		LanguageLevelTypeAttributeValueMarshaller languageLevelTypeSerializer = new LanguageLevelTypeAttributeValueMarshaller();

		String serializedValue = null;
		AttributeValue<LanguageLevelType> testvalues = generateTestValue();

		// serialize attribute
		try {
			serializedValue = languageLevelTypeSerializer.marshal(testvalues);

		} catch (AttributeValueMarshallingException e) {
			e.printStackTrace();

		}
		assertTrue(serializedValue != null);

		// deserialize attribute
		AttributeValue<LanguageLevelType> result = null;
		try {
			result = languageLevelTypeSerializer.unmarshal(serializedValue, false);

		} catch (AttributeValueMarshallingException e) {
			e.printStackTrace();

		}
		assertTrue(result != null);

		// TODO: implement detail validation
		validate(result, testvalues);

	}

	private void validate(AttributeValue<LanguageLevelType> result, AttributeValue<LanguageLevelType> testvalues) {
		List<ForeignLanguageSkillType> testList = testvalues.getValue().getForeignLanguage();
		List<ForeignLanguageSkillType> resultList = result.getValue().getForeignLanguage();

		assertTrue(testList.size() == resultList.size());

		for (ForeignLanguageSkillType skill : testList) {
			boolean findSkill = false;
			for (ForeignLanguageSkillType skill1 : resultList) {
				if (skill.getDescription().equals(skill1.getDescription())) {
					findSkill = true;
					assertTrue(skill.getAcquiredDuring().getExperience().size() == skill1.getAcquiredDuring().getExperience().size());
//					checkIfEqual(skill.getAcquiredDuring().getExperience(),skill1.getAcquiredDuring().getExperience());
					// TODO check array
					assertTrue(skill.getDocumentation().getReferenceTo().size() == skill1.getDocumentation().getReferenceTo().size());
					// TODO check array
					assertTrue(skill.getVerifiedBy().getCertificate().size() == skill1.getVerifiedBy().getCertificate().size());
					// TODO check array

					assertTrue("getProficiencyLevel not match", skill.getProficiencyLevel().equals(skill1.getProficiencyLevel()));
				}
			}
			assertTrue("Result skill '" + skill.getDescription() + "' NOT found", findSkill);
		}
	}

//	private void checkIfEqual(List<Object> list1, List<Object> list2) {
//		for(Object o1 : list1)
//		{
//			ExperienceType experienceType1 = (ExperienceType) o1;
//			boolean foundMatch = false;
//			for(Object o2 : list2)
//			{
//				ExperienceType experienceType2 = (ExperienceType) o2;
//				if(equal(experienceType1, experienceType2))
//					foundMatch = true;
//				
//			}
//			assertTrue("Result'" + o1 + "' NOT found in "+list2, foundMatch);
//		}
//		
//	}
//
//	private boolean equal(ExperienceType experienceType1, ExperienceType experienceType2) {
//		if(experienceType1.getDescription().equals(experienceType2.getDescription()))
//		{
//			if(!experienceType1.getPeriod().getFrom().equals(experienceType2.getPeriod().getFrom()))
//				return false;
//			if(!experienceType1.getPeriod().getTo().equals(experienceType2.getPeriod().getTo()))
//				return false;
//			if(experienceType1.getPeriod().isCurrent() != experienceType2.getPeriod().isCurrent())
//				return false;
//		}
//		return false;
//	}

	private AttributeValue<LanguageLevelType> generateTestValue() {
		ArrayList<ForeignLanguageSkillType> list = new ArrayList<>();

		ForeignLanguageSkillType skillOne = new ForeignLanguageSkillType();
		CertificateListType certificateList = new CertificateListType();
		certificateList.getCertificate().add(getCertificateType());
		skillOne.setVerifiedBy(certificateList);
		AbstractExperienceListType value = new LinguisticExperienceListType();
		ExperienceType experienceType = new ExperienceType();
		experienceType.setDescription("test");
		experienceType.setDocumentation(getIntraDocumentDocumentationType());
		value.getExperience().add(experienceType);

		skillOne.setAcquiredDuring(value);
		skillOne.setDescription("test1");// TODO
		skillOne.setProficiencyLevel("Test2");// TODO
		skillOne.setDocumentation(getIntraDocumentDocumentationType());
		list.add(skillOne);

		ForeignLanguageSkillType skillTwo = new ForeignLanguageSkillType();
		CertificateListType certificateList1 = new CertificateListType();
		certificateList1.getCertificate().add(getCertificateType());
		skillTwo.setVerifiedBy(certificateList1);
		AbstractExperienceListType linguisticExperienceListType = new LinguisticExperienceListType();
		ExperienceType experienceType1 = new ExperienceType();
		linguisticExperienceListType.getExperience().add(experienceType1);

		skillTwo.setAcquiredDuring(linguisticExperienceListType);
		skillTwo.setDescription("test3");// TODO
		skillTwo.setProficiencyLevel("Test4");// TODO
		skillTwo.setDocumentation(getIntraDocumentDocumentationType());
		list.add(skillTwo);

		LanguageLevelType result = new LanguageLevelType();
		result.getForeignLanguage().addAll(list);
		return new LanguageLevelAttributeValue(result, false);
	}

	private IntraDocumentDocumentationType getIntraDocumentDocumentationType() {
		IntraDocumentDocumentationType intraDocumentDocumentationType = new IntraDocumentDocumentationType();
		InternalReferenceType internalReferenceType = new InternalReferenceType();
		// internalReferenceType.setIdref("test");//TODO

		intraDocumentDocumentationType.getReferenceTo().add(internalReferenceType);
		return intraDocumentDocumentationType;
	}

	private CertificateType getCertificateType() {
		CertificateType certificateType = new CertificateType();
		certificateType.setAwardingBody("Test AwardingBody");
		certificateType.setTitle("test title");
		certificateType.setDate(getDate());
		return certificateType;
	}

	private DateType getDate() {
		DateType date = new DateType();
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar date2;
		try {
			date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			date.setDay(date2);// TODO ..should be int!?
			date.setMonth(date2);// TODO ..should be int!?
			date.setYear(date2);// TODO ..should be int!?
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}

}
