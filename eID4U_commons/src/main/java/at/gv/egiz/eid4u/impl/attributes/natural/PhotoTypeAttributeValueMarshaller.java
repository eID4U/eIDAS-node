package at.gv.egiz.eid4u.impl.attributes.natural;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.generic.Document;
import eu.eidas.auth.commons.EidasStringUtil;
import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshaller;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

public class PhotoTypeAttributeValueMarshaller implements AttributeValueMarshaller<Document>{
	
	@Override
	public String marshal(AttributeValue<Document> value) throws AttributeValueMarshallingException {
		try {
			JAXBContext context = JAXBContext.newInstance(Document.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			StringWriter sw = new StringWriter();
			m.marshal(value.getValue(), sw);			
			return EidasStringUtil.encodeToBase64(sw.toString());
			
		} catch (JAXBException e) {
			throw new AttributeValueMarshallingException("Can NOT create JAXB marshaller for type 'Document'", e);
			
		}
		
	}

	@Override
	public AttributeValue<Document> unmarshal(String value, boolean isNonLatinScriptAlternateVersion)
			throws AttributeValueMarshallingException {
		try {
			Reader reader = new StringReader(EidasStringUtil.decodeStringFromBase64(value));
			
			//initialize XML reader to prevent XXE 
			XMLInputFactory xif = XMLInputFactory.newInstance();
			xif.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, false);
			xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
			XMLStreamReader xmlReader = xif.createXMLStreamReader(reader);

			//unmarshal
			JAXBContext context = JAXBContext.newInstance(Document.class);
			Unmarshaller um = context.createUnmarshaller();
			Object obj = um.unmarshal(xmlReader);
		
			if (!(obj instanceof Document)) 
				throw new AttributeValueMarshallingException("Unmarshalled result is NOT of type 'Document'");			

			return new DocumentAttributeValue((Document)obj, isNonLatinScriptAlternateVersion);
		
		} catch (JAXBException | XMLStreamException e) {
			throw new AttributeValueMarshallingException("Can NOT create JAXB unmarshaller for type 'Document'", e);
		
		}
		
	}
}
