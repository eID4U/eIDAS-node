//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 generiert 
// Siehe <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.10.02 um 03:47:41 PM CEST 
//


package at.gv.egiz.eid4u.impl.attributes.xjc.europass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DocumentPreferencesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocumentPreferencesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Field" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="name" use="required" type="{http://europass.cedefop.europa.eu/Europass}FieldNames" /&gt;
 *                 &lt;attribute name="show" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="format" type="{http://europass.cedefop.europa.eu/Europass}SimpleFieldFormats" /&gt;
 *                 &lt;attribute name="order" type="{http://europass.cedefop.europa.eu/Europass}OrderNames" /&gt;
 *                 &lt;attribute name="position" type="{http://europass.cedefop.europa.eu/Europass}PositionNames" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required" type="{http://europass.cedefop.europa.eu/Europass}DocumentTypeEnumeration" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentPreferencesType", propOrder = {
    "field"
})
public class DocumentPreferencesType {

    @XmlElement(name = "Field")
    protected List<DocumentPreferencesType.Field> field;
    @XmlAttribute(name = "type", required = true)
    protected DocumentTypeEnumeration type;

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentPreferencesType.Field }
     * 
     * 
     */
    public List<DocumentPreferencesType.Field> getField() {
        if (field == null) {
            field = new ArrayList<DocumentPreferencesType.Field>();
        }
        return this.field;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeEnumeration }
     *     
     */
    public DocumentTypeEnumeration getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeEnumeration }
     *     
     */
    public void setType(DocumentTypeEnumeration value) {
        this.type = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="name" use="required" type="{http://europass.cedefop.europa.eu/Europass}FieldNames" /&gt;
     *       &lt;attribute name="show" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="format" type="{http://europass.cedefop.europa.eu/Europass}SimpleFieldFormats" /&gt;
     *       &lt;attribute name="order" type="{http://europass.cedefop.europa.eu/Europass}OrderNames" /&gt;
     *       &lt;attribute name="position" type="{http://europass.cedefop.europa.eu/Europass}PositionNames" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Field {

        @XmlAttribute(name = "name", required = true)
        protected String name;
        @XmlAttribute(name = "show")
        protected Boolean show;
        @XmlAttribute(name = "format")
        protected String format;
        @XmlAttribute(name = "order")
        protected OrderNames order;
        @XmlAttribute(name = "position")
        protected PositionNames position;

        /**
         * Ruft den Wert der name-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Legt den Wert der name-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Ruft den Wert der show-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShow() {
            return show;
        }

        /**
         * Legt den Wert der show-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShow(Boolean value) {
            this.show = value;
        }

        /**
         * Ruft den Wert der format-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormat() {
            return format;
        }

        /**
         * Legt den Wert der format-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormat(String value) {
            this.format = value;
        }

        /**
         * Ruft den Wert der order-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link OrderNames }
         *     
         */
        public OrderNames getOrder() {
            return order;
        }

        /**
         * Legt den Wert der order-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderNames }
         *     
         */
        public void setOrder(OrderNames value) {
            this.order = value;
        }

        /**
         * Ruft den Wert der position-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link PositionNames }
         *     
         */
        public PositionNames getPosition() {
            return position;
        }

        /**
         * Legt den Wert der position-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link PositionNames }
         *     
         */
        public void setPosition(PositionNames value) {
            this.position = value;
        }

    }

}
