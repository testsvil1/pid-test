//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.03.07 alle 03:27:17 PM CET 
//


package it.gov.lavoro.servizi.unipi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per parttime complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="parttime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nlavoratoriparttime" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="orariosettimanalecontrattuale">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{2}:\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="orariosettimanaleparttime">
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
@XmlType(name = "parttime", propOrder = {
    "nlavoratoriparttime",
    "orariosettimanalecontrattuale",
    "orariosettimanaleparttime"
})
public class Parttime {

    @XmlElement(required = true)
    protected String nlavoratoriparttime;
    @XmlElement(required = true)
    protected String orariosettimanalecontrattuale;
    @XmlElement(required = true)
    protected String orariosettimanaleparttime;

    /**
     * Recupera il valore della propriet� nlavoratoriparttime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNlavoratoriparttime() {
        return nlavoratoriparttime;
    }

    /**
     * Imposta il valore della propriet� nlavoratoriparttime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNlavoratoriparttime(String value) {
        this.nlavoratoriparttime = value;
    }

    /**
     * Recupera il valore della propriet� orariosettimanalecontrattuale.
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
     * Imposta il valore della propriet� orariosettimanalecontrattuale.
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
     * Recupera il valore della propriet� orariosettimanaleparttime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrariosettimanaleparttime() {
        return orariosettimanaleparttime;
    }

    /**
     * Imposta il valore della propriet� orariosettimanaleparttime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrariosettimanaleparttime(String value) {
        this.orariosettimanaleparttime = value;
    }

}
