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
 * <p>Classe Java per lavoratore complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="lavoratore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codicefiscale" type="{http://servizi.lavoro.gov.it/UNIPI}CodiceFiscale"/>
 *         &lt;element name="cognome" type="{http://servizi.lavoro.gov.it/UNIPI}Stringa50"/>
 *         &lt;element name="nome" type="{http://servizi.lavoro.gov.it/UNIPI}Stringa50"/>
 *         &lt;element name="sesso" type="{http://servizi.lavoro.gov.it/UNIPI}Sesso"/>
 *         &lt;element name="datanascita" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="comunenascita" type="{http://servizi.lavoro.gov.it/UNIPI}Comune"/>
 *         &lt;element name="percentualedisabilita" type="{http://servizi.lavoro.gov.it/UNIPI}Percentuale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lavoratore", propOrder = {
    "codicefiscale",
    "cognome",
    "nome",
    "sesso",
    "datanascita",
    "comunenascita",
    "percentualedisabilita"
})
public class Lavoratore {

    @XmlElement(required = true)
    protected String codicefiscale;
    @XmlElement(required = true)
    protected String cognome;
    @XmlElement(required = true)
    protected String nome;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Sesso sesso;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datanascita;
    @XmlElement(required = true)
    protected String comunenascita;
    protected String percentualedisabilita;

    /**
     * Recupera il valore della proprietà codicefiscale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodicefiscale() {
        return codicefiscale;
    }

    /**
     * Imposta il valore della proprietà codicefiscale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodicefiscale(String value) {
        this.codicefiscale = value;
    }

    /**
     * Recupera il valore della proprietà cognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il valore della proprietà cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della proprietà nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il valore della proprietà nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della proprietà sesso.
     * 
     * @return
     *     possible object is
     *     {@link Sesso }
     *     
     */
    public Sesso getSesso() {
        return sesso;
    }

    /**
     * Imposta il valore della proprietà sesso.
     * 
     * @param value
     *     allowed object is
     *     {@link Sesso }
     *     
     */
    public void setSesso(Sesso value) {
        this.sesso = value;
    }

    /**
     * Recupera il valore della proprietà datanascita.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatanascita() {
        return datanascita;
    }

    /**
     * Imposta il valore della proprietà datanascita.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatanascita(XMLGregorianCalendar value) {
        this.datanascita = value;
    }

    /**
     * Recupera il valore della proprietà comunenascita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComunenascita() {
        return comunenascita;
    }

    /**
     * Imposta il valore della proprietà comunenascita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComunenascita(String value) {
        this.comunenascita = value;
    }

    /**
     * Recupera il valore della proprietà percentualedisabilita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentualedisabilita() {
        return percentualedisabilita;
    }

    /**
     * Imposta il valore della proprietà percentualedisabilita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentualedisabilita(String value) {
        this.percentualedisabilita = value;
    }

}
