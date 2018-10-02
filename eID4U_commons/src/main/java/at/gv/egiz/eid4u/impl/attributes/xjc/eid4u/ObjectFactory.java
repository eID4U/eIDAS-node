//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.09.30 um 08:08:27 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.eid4u;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the at.gv.egiz.eid4u.impl.attributes.xjc.eid4u package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Certificates_QNAME = new QName("http://eidas.europa.eu/attributes/sectorspecific/eID4U/studies", "certificates");
    private final static QName _ForeignLanguageList_QNAME = new QName("http://eidas.europa.eu/attributes/sectorspecific/eID4U/studies", "ForeignLanguageList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: at.gv.egiz.eid4u.impl.attributes.xjc.eid4u
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CertificatesType }
     * 
     */
    public CertificatesType createCertificatesType() {
        return new CertificatesType();
    }

    /**
     * Create an instance of {@link TranscriptType }
     * 
     */
    public TranscriptType createTranscriptType() {
        return new TranscriptType();
    }

    /**
     * Create an instance of {@link LanguageLevelType }
     * 
     */
    public LanguageLevelType createLanguageLevelType() {
        return new LanguageLevelType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificatesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CertificatesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://eidas.europa.eu/attributes/sectorspecific/eID4U/studies", name = "certificates")
    public JAXBElement<CertificatesType> createCertificates(CertificatesType value) {
        return new JAXBElement<CertificatesType>(_Certificates_QNAME, CertificatesType.class, null, value);
    }

    @XmlElementDecl(namespace = "http://eidas.europa.eu/attributes/sectorspecific/eID4U/studies", name = "ForeignLanguageList")
    public JAXBElement<LanguageLevelType> createForeignLanguageList(LanguageLevelType value) {
        return new JAXBElement<LanguageLevelType>(_ForeignLanguageList_QNAME, LanguageLevelType.class, null, value);
    }
}
