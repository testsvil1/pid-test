//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.03.07 alle 03:27:17 PM CET 
//


package it.gov.lavoro.servizi.unipi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per sospensionemobilita complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="sospensionemobilita">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sospensionepermobilita" type="{http://servizi.lavoro.gov.it/UNIPI}S-N" minOccurs="0"/>
 *         &lt;element name="datafinesospensione" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sospensionemobilita", propOrder = {
    "sospensionepermobilita",
    "datafinesospensione"
})
public class Sospensionemobilita {

    @XmlSchemaType(name = "string")
    protected SN sospensionepermobilita;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datafinesospensione;

    /**
     * Recupera il valore della proprietà sospensionepermobilita.
     * 
     * @return
     *     possible object is
     *     {@link SN }
     *     
     */
    public SN getSospensionepermobilita() {
        return sospensionepermobilita;
    }

    /**
     * Imposta il valore della proprietà sospensionepermobilita.
     * 
     * @param value
     *     allowed object is
     *     {@link SN }
     *     
     */
    public void setSospensionepermobilita(SN value) {
        this.sospensionepermobilita = value;
    }

    /**
     * Recupera il valore della proprietà datafinesospensione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatafinesospensione() {
        return datafinesospensione;
    }

    /**
     * Imposta il valore della proprietà datafinesospensione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatafinesospensione(XMLGregorianCalendar value) {
        this.datafinesospensione = value;
    }

}
