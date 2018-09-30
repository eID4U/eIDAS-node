package at.gv.egiz.eid4u.impl.attributes.studies;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import at.gv.egiz.eid4u.impl.attributes.xjc.europass.ObjectFactory;
import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.CertificatesType;
import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.LanguageLevelType;
import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.generic.Document;
import at.gv.egiz.eid4u.impl.attributes.xjc.europass.ForeignLanguageSkillType;
import eu.eidas.auth.commons.EidasStringUtil;
import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshaller;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

public class LanguageLevelTypeAttributeValueMarshaller implements AttributeValueMarshaller<ArrayList<ForeignLanguageSkillType>>  {
	@Override
	public String marshal(AttributeValue<ArrayList<ForeignLanguageSkillType>> value) throws AttributeValueMarshallingException {
		try {
			//generate parent element
			at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.ObjectFactory factory = new at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.ObjectFactory();
			LanguageLevelType languageLevels = new LanguageLevelType();
			
			languageLevels.getForeignLanguage().addAll(value.getValue());
			JAXBElement<LanguageLevelType> element = factory.createForeignLanguageList(languageLevels);
			
			JAXBContext context = JAXBContext.newInstance(
					at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.ObjectFactory.class, 
					at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.generic.ObjectFactory.class,
					at.gv.egiz.eid4u.impl.attributes.xjc.europass.ObjectFactory.class);
			Marshaller m = context.createMarshaller();
			StringWriter sw = new StringWriter();
			m.marshal(element, sw);			
			return EidasStringUtil.encodeToBase64(sw.toString());
			
		} catch (JAXBException e) {
			throw new AttributeValueMarshallingException("Can NOT create JAXB marshaller for type 'Document'", e);
			
		}
		
	}

	@Override
	public AttributeValue<ArrayList<ForeignLanguageSkillType>> unmarshal(String value, boolean isNonLatinScriptAlternateVersion)
			throws AttributeValueMarshallingException {
		try {
			Reader reader = new StringReader(EidasStringUtil.decodeStringFromBase64(value));
			
			//initialize XML reader to prevent XXE 
			XMLInputFactory xif = XMLInputFactory.newInstance();
			xif.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, false);
			xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
			XMLStreamReader xmlReader = xif.createXMLStreamReader(reader);

			//unmarshal
			JAXBContext context = JAXBContext.newInstance(
					at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.ObjectFactory.class, 
					at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.generic.ObjectFactory.class,
					at.gv.egiz.eid4u.impl.attributes.xjc.europass.ObjectFactory.class);
			Unmarshaller um = context.createUnmarshaller();
			Object obj = um.unmarshal(xmlReader);
		
			//extract content
			if (!(obj instanceof JAXBElement<?>))
				throw new AttributeValueMarshallingException("Unmarshalled result is NOT of type 'JAXBElement'");			
			
			JAXBElement<?> element = (JAXBElement<?>)obj;
			if (!element.getDeclaredType().isAssignableFrom(LanguageLevelType.class)) 
				throw new AttributeValueMarshallingException("Unmarshalled result is NOT of type 'CertificatesType'");	
			
			LanguageLevelType languageLevels = (LanguageLevelType) element.getValue();
			if (languageLevels.getForeignLanguage() == null || languageLevels.getForeignLanguage().size()==0)
				throw new AttributeValueMarshallingException("'CertificatesType' contains NO documents");	
				
			ArrayList<ForeignLanguageSkillType> list = null;
			if (!(languageLevels.getForeignLanguage() instanceof ArrayList)) {
				list = new ArrayList<ForeignLanguageSkillType>();
				list.addAll(languageLevels.getForeignLanguage());
				
			} else
				list = (ArrayList<ForeignLanguageSkillType>) languageLevels.getForeignLanguage();
			
			return new LanguageLevelAttributeValue(list, false);
		
		} catch (JAXBException | XMLStreamException e) {
			throw new AttributeValueMarshallingException("Can NOT create JAXB unmarshaller for type 'Document'", e);
		
		}
	}
}
