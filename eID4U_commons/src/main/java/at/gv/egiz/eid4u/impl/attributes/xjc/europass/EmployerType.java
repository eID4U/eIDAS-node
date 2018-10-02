//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.02 um 03:47:41 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.europass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Defines an organisation providing employment by extending the abstract organisation type to include information about the business sector the company belongs to.
 *             
 * 
 * <p>Java-Klasse für EmployerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EmployerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://europass.cedefop.europa.eu/Europass}OrganisationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sector" type="{http://europass.cedefop.europa.eu/Europass}BusinesSectorType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployerType", propOrder = {
    "sector"
})
public class EmployerType
    extends OrganisationType
{

    @XmlElement(name = "Sector")
    protected BusinesSectorType sector;

    /**
     * Ruft den Wert der sector-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BusinesSectorType }
     *     
     */
    public BusinesSectorType getSector() {
        return sector;
    }

    /**
     * Legt den Wert der sector-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinesSectorType }
     *     
     */
    public void setSector(BusinesSectorType value) {
        this.sector = value;
    }

}
