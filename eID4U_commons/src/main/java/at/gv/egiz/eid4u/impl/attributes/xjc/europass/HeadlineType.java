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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains a headline label for the current document. It is optional and may accommodate various cases.
 * 			
 * 
 * <p>Java-Klasse für HeadlineType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="HeadlineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://europass.cedefop.europa.eu/Europass}HeadlineTypeLabelType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://europass.cedefop.europa.eu/Europass}OccupationalFieldType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeadlineType", propOrder = {
    "type",
    "description"
})
@XmlSeeAlso({
    PositionType.class
})
public class HeadlineType {

    @XmlElement(name = "Type")
    protected HeadlineTypeLabelType type;
    @XmlElement(name = "Description")
    protected OccupationalFieldType description;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeadlineTypeLabelType }
     *     
     */
    public HeadlineTypeLabelType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadlineTypeLabelType }
     *     
     */
    public void setType(HeadlineTypeLabelType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OccupationalFieldType }
     *     
     */
    public OccupationalFieldType getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupationalFieldType }
     *     
     */
    public void setDescription(OccupationalFieldType value) {
        this.description = value;
    }

}
