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
 * <p>Classe Java per esoneri60permille complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="esoneri60permille">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataautocertificazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="numerolavoratori60permille" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="numerolavoratoriesonero" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="percentuale" type="{http://servizi.lavoro.gov.it/UNIPI}Percentuale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esoneri60permille", propOrder = {
    "dataautocertificazione",
    "numerolavoratori60Permille",
    "numerolavoratoriesonero",
    "percentuale"
})
public class Esoneri60Permille {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataautocertificazione;
    @XmlElement(name = "numerolavoratori60permille", required = true)
    protected String numerolavoratori60Permille;
    @XmlElement(required = true)
    protected String numerolavoratoriesonero;
    protected String percentuale;

    /**
     * Recupera il valore della proprietà dataautocertificazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataautocertificazione() {
        return dataautocertificazione;
    }

    /**
     * Imposta il valore della proprietà dataautocertificazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataautocertificazione(XMLGregorianCalendar value) {
        this.dataautocertificazione = value;
    }

    /**
     * Recupera il valore della proprietà numerolavoratori60Permille.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerolavoratori60Permille() {
        return numerolavoratori60Permille;
    }

    /**
     * Imposta il valore della proprietà numerolavoratori60Permille.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerolavoratori60Permille(String value) {
        this.numerolavoratori60Permille = value;
    }

    /**
     * Recupera il valore della proprietà numerolavoratoriesonero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerolavoratoriesonero() {
        return numerolavoratoriesonero;
    }

    /**
     * Imposta il valore della proprietà numerolavoratoriesonero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerolavoratoriesonero(String value) {
        this.numerolavoratoriesonero = value;
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
