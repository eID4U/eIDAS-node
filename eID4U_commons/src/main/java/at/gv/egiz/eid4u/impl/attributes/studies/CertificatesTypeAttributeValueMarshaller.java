package at.gv.egiz.eid4u.impl.attributes.studies;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.CertificatesType;
import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.ObjectFactory;
import at.gv.egiz.eid4u.impl.attributes.xjc.eid4u.generic.Document;
import eu.eidas.auth.commons.EidasStringUtil;
import eu.eidas.auth.commons.attribute.AttributeValue;
import eu.eidas.auth.commons.attribute.AttributeValueMarshaller;
import eu.eidas.auth.commons.attribute.AttributeValueMarshallingException;

public class CertificatesTypeAttributeValueMarshaller implements AttributeValueMarshaller<ArrayList<Document>> {

	@Override
	public String marshal(AttributeValue<ArrayList<Document>> value) throws AttributeValueMarshallingException {
		try {
			//generate parent element
			ObjectFactory factory = new ObjectFactory();
			CertificatesType certificats = new CertificatesType();
			certificats.getDocument().addAll(value.getValue());
			JAXBElement<CertificatesType> element = factory.createCertificates(certificats);
			
			//marshal parent element
			JAXBContext context = JAXBContext.newInstance(ObjectFactory.class);
			Marshaller m = context.createMarshaller();
			StringWriter sw = new StringWriter();
			m.marshal(element, sw);			
			return EidasStringUtil.encodeToBase64(sw.toString());
			
		} catch (JAXBException e) {
			throw new AttributeValueMarshallingException("Can NOT create JAXB marshaller for type 'Document'", e);
			
		}
		
	}

	@Override
	public AttributeValue<ArrayList<Document>> unmarshal(String value, boolean isNonLatinScriptAlternateVersion)
			throws AttributeValueMarshallingException {
		try {
			Reader reader = new StringReader(EidasStringUtil.decodeStringFromBase64(value));
			
			//initialize XML reader to prevent XXE 
			XMLInputFactory xif = XMLInputFactory.newInstance();
			xif.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, false);
			xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
			XMLStreamReader xmlReader = xif.createXMLStreamReader(reader);

			//unmarshal
			JAXBContext context = JAXBContext.newInstance(ObjectFactory.class);
			Unmarshaller um = context.createUnmarshaller();
			Object obj = um.unmarshal(xmlReader);
		
			//extract content
			if (!(obj instanceof JAXBElement<?>))
				throw new AttributeValueMarshallingException("Unmarshalled result is NOT of type 'JAXBElement'");			
			
			JAXBElement<?> element = (JAXBElement<?>)obj;
			if (!element.getDeclaredType().isAssignableFrom(CertificatesType.class)) 
				throw new AttributeValueMarshallingException("Unmarshalled result is NOT of type 'CertificatesType'");	
			
			CertificatesType certificates = (CertificatesType) element.getValue();
			if (certificates.getDocument() == null || certificates.getDocument().size()==0)
				throw new AttributeValueMarshallingException("'CertificatesType' contains NO documents");	
				
			ArrayList<Document> list = null;
			if (!(certificates.getDocument() instanceof ArrayList)) {
				list = new ArrayList<Document>();
				list.addAll(certificates.getDocument());
				
			} else
				list = (ArrayList<Document>) certificates.getDocument();
			
			return new CertificatesTypeAttributeValue(list, false);
		
		} catch (JAXBException | XMLStreamException e) {
			throw new AttributeValueMarshallingException("Can NOT create JAXB unmarshaller for type 'Document'", e);
		
		}
	}
	
}
