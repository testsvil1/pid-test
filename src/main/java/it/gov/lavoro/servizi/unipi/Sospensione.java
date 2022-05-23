//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.03.07 alle 03:27:17 PM CET 
//


package it.gov.lavoro.servizi.unipi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per sospensione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="sospensione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stato" type="{http://servizi.lavoro.gov.it/UNIPI}statoconcessione"/>
 *         &lt;element name="causale">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="datafinesospensione" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="numerolavoratori" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sospensione", propOrder = {
    "stato",
    "causale",
    "datafinesospensione",
    "numerolavoratori"
})
public class Sospensione {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Statoconcessione stato;
    @XmlElement(required = true)
    protected String causale;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datafinesospensione;
    @XmlElement(required = true)
    protected String numerolavoratori;

    /**
     * Recupera il valore della proprietà stato.
     * 
     * @return
     *     possible object is
     *     {@link Statoconcessione }
     *     
     */
    public Statoconcessione getStato() {
        return stato;
    }

    /**
     * Imposta il valore della proprietà stato.
     * 
     * @param value
     *     allowed object is
     *     {@link Statoconcessione }
     *     
     */
    public void setStato(Statoconcessione value) {
        this.stato = value;
    }

    /**
     * Recupera il valore della proprietà causale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausale() {
        return causale;
    }

    /**
     * Imposta il valore della proprietà causale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausale(String value) {
        this.causale = value;
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

    /**
     * Recupera il valore della proprietà numerolavoratori.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerolavoratori() {
        return numerolavoratori;
    }

    /**
     * Imposta il valore della proprietà numerolavoratori.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerolavoratori(String value) {
        this.numerolavoratori = value;
    }

}
