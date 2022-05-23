//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.03.07 alle 03:27:17 PM CET 
//


package it.gov.lavoro.servizi.unipi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per prospettoGenerale complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="prospettoGenerale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quadro1" type="{http://servizi.lavoro.gov.it/UNIPI}quadro1"/>
 *         &lt;element name="quadro2" type="{http://servizi.lavoro.gov.it/UNIPI}quadro2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quadro3" type="{http://servizi.lavoro.gov.it/UNIPI}quadro3" minOccurs="0"/>
 *         &lt;element name="tipocomunicazione" type="{http://servizi.lavoro.gov.it/UNIPI}TipoComunicazione"/>
 *       &lt;/sequence>
 *       &lt;attribute name="codicecomunicazione" use="required" type="{http://servizi.lavoro.gov.it/UNIPI}TipoCodiceComunicazione" />
 *       &lt;attribute name="codicecomunicazioneprecedente" type="{http://servizi.lavoro.gov.it/UNIPI}TipoCodiceComunicazione" />
 *       &lt;attribute name="dataInvio" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="delegato" type="{http://servizi.lavoro.gov.it/UNIPI}CodiceFiscale" />
 *       &lt;attribute name="tipoDelegato">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9]{3}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="e-mailDelegato" use="required" type="{http://servizi.lavoro.gov.it/UNIPI}EMail" />
 *       &lt;attribute name="protocollo" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="8"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="versione" use="required" type="{http://servizi.lavoro.gov.it/UNIPI}Stringa" fixed="PIDISABILI001600" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prospettoGenerale", propOrder = {
    "quadro1",
    "quadro2",
    "quadro3",
    "tipocomunicazione"
})
public class ProspettoGenerale {

    @XmlElement(required = true)
    protected Quadro1 quadro1;
    protected List<Quadro2> quadro2;
    protected Quadro3 quadro3;
    @XmlElement(required = true)
    protected String tipocomunicazione;
    @XmlAttribute(name = "codicecomunicazione", required = true)
    protected String codicecomunicazione;
    @XmlAttribute(name = "codicecomunicazioneprecedente")
    protected String codicecomunicazioneprecedente;
    @XmlAttribute(name = "dataInvio", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInvio;
    @XmlAttribute(name = "delegato")
    protected String delegato;
    @XmlAttribute(name = "tipoDelegato")
    protected String tipoDelegato;
    @XmlAttribute(name = "e-mailDelegato", required = true)
    protected String eMailDelegato;
    @XmlAttribute(name = "protocollo", required = true)
    protected String protocollo;
    @XmlAttribute(name = "versione", required = true)
    protected String versione;

    /**
     * Recupera il valore della proprietà quadro1.
     * 
     * @return
     *     possible object is
     *     {@link Quadro1 }
     *     
     */
    public Quadro1 getQuadro1() {
        return quadro1;
    }

    /**
     * Imposta il valore della proprietà quadro1.
     * 
     * @param value
     *     allowed object is
     *     {@link Quadro1 }
     *     
     */
    public void setQuadro1(Quadro1 value) {
        this.quadro1 = value;
    }

    /**
     * Gets the value of the quadro2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quadro2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuadro2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Quadro2 }
     * 
     * 
     */
    public List<Quadro2> getQuadro2() {
        if (quadro2 == null) {
            quadro2 = new ArrayList<Quadro2>();
        }
        return this.quadro2;
    }

    /**
     * Recupera il valore della proprietà quadro3.
     * 
     * @return
     *     possible object is
     *     {@link Quadro3 }
     *     
     */
    public Quadro3 getQuadro3() {
        return quadro3;
    }

    /**
     * Imposta il valore della proprietà quadro3.
     * 
     * @param value
     *     allowed object is
     *     {@link Quadro3 }
     *     
     */
    public void setQuadro3(Quadro3 value) {
        this.quadro3 = value;
    }

    /**
     * Recupera il valore della proprietà tipocomunicazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipocomunicazione() {
        return tipocomunicazione;
    }

    /**
     * Imposta il valore della proprietà tipocomunicazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipocomunicazione(String value) {
        this.tipocomunicazione = value;
    }

    /**
     * Recupera il valore della proprietà codicecomunicazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodicecomunicazione() {
        return codicecomunicazione;
    }

    /**
     * Imposta il valore della proprietà codicecomunicazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodicecomunicazione(String value) {
        this.codicecomunicazione = value;
    }

    /**
     * Recupera il valore della proprietà codicecomunicazioneprecedente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodicecomunicazioneprecedente() {
        return codicecomunicazioneprecedente;
    }

    /**
     * Imposta il valore della proprietà codicecomunicazioneprecedente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodicecomunicazioneprecedente(String value) {
        this.codicecomunicazioneprecedente = value;
    }

    /**
     * Recupera il valore della proprietà dataInvio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInvio() {
        return dataInvio;
    }

    /**
     * Imposta il valore della proprietà dataInvio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInvio(XMLGregorianCalendar value) {
        this.dataInvio = value;
    }

    /**
     * Recupera il valore della proprietà delegato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegato() {
        return delegato;
    }

    /**
     * Imposta il valore della proprietà delegato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegato(String value) {
        this.delegato = value;
    }

    /**
     * Recupera il valore della proprietà tipoDelegato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDelegato() {
        return tipoDelegato;
    }

    /**
     * Imposta il valore della proprietà tipoDelegato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDelegato(String value) {
        this.tipoDelegato = value;
    }

    /**
     * Recupera il valore della proprietà eMailDelegato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMailDelegato() {
        return eMailDelegato;
    }

    /**
     * Imposta il valore della proprietà eMailDelegato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMailDelegato(String value) {
        this.eMailDelegato = value;
    }

    /**
     * Recupera il valore della proprietà protocollo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocollo() {
        return protocollo;
    }

    /**
     * Imposta il valore della proprietà protocollo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocollo(String value) {
        this.protocollo = value;
    }

    /**
     * Recupera il valore della proprietà versione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersione() {
        if (versione == null) {
            return "PIDISABILI001600";
        } else {
            return versione;
        }
    }

    /**
     * Imposta il valore della proprietà versione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersione(String value) {
        this.versione = value;
    }

}
