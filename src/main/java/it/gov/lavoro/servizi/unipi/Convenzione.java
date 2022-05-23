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
 * <p>Classe Java per convenzione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="convenzione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stato" type="{http://servizi.lavoro.gov.it/UNIPI}statoconcessione"/>
 *         &lt;element name="dataatto" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="estremiatto" type="{http://servizi.lavoro.gov.it/UNIPI}Stringa50" minOccurs="0"/>
 *         &lt;element name="tipoconvenzione">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numLavoratoriPrevisti">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="datastipula" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dataconcessione" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convenzione", propOrder = {
    "stato",
    "dataatto",
    "estremiatto",
    "tipoconvenzione",
    "numLavoratoriPrevisti",
    "datastipula",
    "dataconcessione"
})
public class Convenzione {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Statoconcessione stato;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataatto;
    protected String estremiatto;
    @XmlElement(required = true)
    protected String tipoconvenzione;
    @XmlElement(required = true)
    protected String numLavoratoriPrevisti;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datastipula;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataconcessione;

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
     * Recupera il valore della proprietà dataatto.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataatto() {
        return dataatto;
    }

    /**
     * Imposta il valore della proprietà dataatto.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataatto(XMLGregorianCalendar value) {
        this.dataatto = value;
    }

    /**
     * Recupera il valore della proprietà estremiatto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstremiatto() {
        return estremiatto;
    }

    /**
     * Imposta il valore della proprietà estremiatto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstremiatto(String value) {
        this.estremiatto = value;
    }

    /**
     * Recupera il valore della proprietà tipoconvenzione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoconvenzione() {
        return tipoconvenzione;
    }

    /**
     * Imposta il valore della proprietà tipoconvenzione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoconvenzione(String value) {
        this.tipoconvenzione = value;
    }

    /**
     * Recupera il valore della proprietà numLavoratoriPrevisti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumLavoratoriPrevisti() {
        return numLavoratoriPrevisti;
    }

    /**
     * Imposta il valore della proprietà numLavoratoriPrevisti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumLavoratoriPrevisti(String value) {
        this.numLavoratoriPrevisti = value;
    }

    /**
     * Recupera il valore della proprietà datastipula.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatastipula() {
        return datastipula;
    }

    /**
     * Imposta il valore della proprietà datastipula.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatastipula(XMLGregorianCalendar value) {
        this.datastipula = value;
    }

    /**
     * Recupera il valore della proprietà dataconcessione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataconcessione() {
        return dataconcessione;
    }

    /**
     * Imposta il valore della proprietà dataconcessione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataconcessione(XMLGregorianCalendar value) {
        this.dataconcessione = value;
    }

}
