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
 * <p>Classe Java per esoneri complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="esoneri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stato" type="{http://servizi.lavoro.gov.it/UNIPI}statoconcessione"/>
 *         &lt;element name="dataatto" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="estremiatto" type="{http://servizi.lavoro.gov.it/UNIPI}Stringa50" minOccurs="0"/>
 *         &lt;element name="finoal" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="percentuale" type="{http://servizi.lavoro.gov.it/UNIPI}Percentuale" minOccurs="0"/>
 *         &lt;element name="numerolavoratori" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esoneri", propOrder = {
    "stato",
    "dataatto",
    "estremiatto",
    "finoal",
    "percentuale",
    "numerolavoratori"
})
public class Esoneri {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Statoconcessione stato;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataatto;
    protected String estremiatto;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar finoal;
    protected String percentuale;
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
     * Recupera il valore della proprietà finoal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinoal() {
        return finoal;
    }

    /**
     * Imposta il valore della proprietà finoal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinoal(XMLGregorianCalendar value) {
        this.finoal = value;
    }

    /**
     * Recupera il valore della proprietà percentuale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentuale() {
        return percentuale;
    }

    /**
     * Imposta il valore della proprietà percentuale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentuale(String value) {
        this.percentuale = value;
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
