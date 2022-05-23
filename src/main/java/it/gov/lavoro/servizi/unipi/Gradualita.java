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
 * <p>Classe Java per gradualita complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="gradualita">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataatto" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="estremiatto" type="{http://servizi.lavoro.gov.it/UNIPI}Stringa50"/>
 *         &lt;element name="assunzioninondisabiliprimaditrasformazione" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="datatrasformazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="percentuale" type="{http://servizi.lavoro.gov.it/UNIPI}Percentuale"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gradualita", propOrder = {
    "dataatto",
    "estremiatto",
    "assunzioninondisabiliprimaditrasformazione",
    "datatrasformazione",
    "percentuale"
})
public class Gradualita {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataatto;
    @XmlElement(required = true)
    protected String estremiatto;
    @XmlElement(required = true)
    protected String assunzioninondisabiliprimaditrasformazione;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datatrasformazione;
    @XmlElement(required = true)
    protected String percentuale;

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
     * Recupera il valore della proprietà assunzioninondisabiliprimaditrasformazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssunzioninondisabiliprimaditrasformazione() {
        return assunzioninondisabiliprimaditrasformazione;
    }

    /**
     * Imposta il valore della proprietà assunzioninondisabiliprimaditrasformazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssunzioninondisabiliprimaditrasformazione(String value) {
        this.assunzioninondisabiliprimaditrasformazione = value;
    }

    /**
     * Recupera il valore della proprietà datatrasformazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatatrasformazione() {
        return datatrasformazione;
    }

    /**
     * Imposta il valore della proprietà datatrasformazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatatrasformazione(XMLGregorianCalendar value) {
        this.datatrasformazione = value;
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

}
