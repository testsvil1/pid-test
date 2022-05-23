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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per dettagliointermittenti complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="dettagliointermittenti">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="orariosettimanalecontrattuale">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{2}:\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="orariosettimanalesvolto">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{2}:\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dettagliointermittenti", propOrder = {
    "numero",
    "orariosettimanalecontrattuale",
    "orariosettimanalesvolto"
})
public class Dettagliointermittenti {

    @XmlElement(required = true)
    protected String numero;
    @XmlElement(required = true)
    protected String orariosettimanalecontrattuale;
    @XmlElement(required = true)
    protected String orariosettimanalesvolto;

    /**
     * Recupera il valore della proprietà numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Imposta il valore della proprietà numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Recupera il valore della proprietà orariosettimanalecontrattuale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrariosettimanalecontrattuale() {
        return orariosettimanalecontrattuale;
    }

    /**
     * Imposta il valore della proprietà orariosettimanalecontrattuale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrariosettimanalecontrattuale(String value) {
        this.orariosettimanalecontrattuale = value;
    }

    /**
     * Recupera il valore della proprietà orariosettimanalesvolto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrariosettimanalesvolto() {
        return orariosettimanalesvolto;
    }

    /**
     * Imposta il valore della proprietà orariosettimanalesvolto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrariosettimanalesvolto(String value) {
        this.orariosettimanalesvolto = value;
    }

}
