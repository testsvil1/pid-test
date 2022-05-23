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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per quadro2 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="quadro2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datiprovinciali" type="{http://servizi.lavoro.gov.it/UNIPI}datiprovinciali"/>
 *         &lt;element name="personaledipendente" type="{http://servizi.lavoro.gov.it/UNIPI}personale"/>
 *         &lt;element name="personalenondipendente" type="{http://servizi.lavoro.gov.it/UNIPI}personalenondipendente"/>
 *         &lt;element name="lavoratoricomputabili" type="{http://servizi.lavoro.gov.it/UNIPI}lavoratoricomputabili" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="postilavoro" type="{http://servizi.lavoro.gov.it/UNIPI}postilavoro" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="compensazioni" type="{http://servizi.lavoro.gov.it/UNIPI}compensazioni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sospensioni" type="{http://servizi.lavoro.gov.it/UNIPI}sospensione" minOccurs="0"/>
 *         &lt;element name="gradualita" type="{http://servizi.lavoro.gov.it/UNIPI}gradualitaprov" minOccurs="0"/>
 *         &lt;element name="esoneri" type="{http://servizi.lavoro.gov.it/UNIPI}esoneri" minOccurs="0"/>
 *         &lt;element name="esoneri60permille" type="{http://servizi.lavoro.gov.it/UNIPI}esoneri60permille" minOccurs="0"/>
 *         &lt;element name="convenzione" type="{http://servizi.lavoro.gov.it/UNIPI}convenzione" minOccurs="0"/>
 *         &lt;element name="note" type="{http://servizi.lavoro.gov.it/UNIPI}note" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quadro2", propOrder = {
    "datiprovinciali",
    "personaledipendente",
    "personalenondipendente",
    "lavoratoricomputabili",
    "postilavoro",
    "compensazioni",
    "sospensioni",
    "gradualita",
    "esoneri",
    "esoneri60Permille",
    "convenzione",
    "note"
})
public class Quadro2 {

    @XmlElement(required = true)
    protected Datiprovinciali datiprovinciali;
    @XmlElement(required = true)
    protected Personale personaledipendente;
    @XmlElement(required = true)
    protected Personalenondipendente personalenondipendente;
    protected List<Lavoratoricomputabili> lavoratoricomputabili;
    protected List<Postilavoro> postilavoro;
    protected List<Compensazioni> compensazioni;
    protected Sospensione sospensioni;
    protected Gradualitaprov gradualita;
    protected Esoneri esoneri;
    @XmlElement(name = "esoneri60permille")
    protected Esoneri60Permille esoneri60Permille;
    protected Convenzione convenzione;
    protected String note;

    /**
     * Recupera il valore della proprietà datiprovinciali.
     * 
     * @return
     *     possible object is
     *     {@link Datiprovinciali }
     *     
     */
    public Datiprovinciali getDatiprovinciali() {
        return datiprovinciali;
    }

    /**
     * Imposta il valore della proprietà datiprovinciali.
     * 
     * @param value
     *     allowed object is
     *     {@link Datiprovinciali }
     *     
     */
    public void setDatiprovinciali(Datiprovinciali value) {
        this.datiprovinciali = value;
    }

    /**
     * Recupera il valore della proprietà personaledipendente.
     * 
     * @return
     *     possible object is
     *     {@link Personale }
     *     
     */
    public Personale getPersonaledipendente() {
        return personaledipendente;
    }

    /**
     * Imposta il valore della proprietà personaledipendente.
     * 
     * @param value
     *     allowed object is
     *     {@link Personale }
     *     
     */
    public void setPersonaledipendente(Personale value) {
        this.personaledipendente = value;
    }

    /**
     * Recupera il valore della proprietà personalenondipendente.
     * 
     * @return
     *     possible object is
     *     {@link Personalenondipendente }
     *     
     */
    public Personalenondipendente getPersonalenondipendente() {
        return personalenondipendente;
    }

    /**
     * Imposta il valore della proprietà personalenondipendente.
     * 
     * @param value
     *     allowed object is
     *     {@link Personalenondipendente }
     *     
     */
    public void setPersonalenondipendente(Personalenondipendente value) {
        this.personalenondipendente = value;
    }

    /**
     * Gets the value of the lavoratoricomputabili property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lavoratoricomputabili property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLavoratoricomputabili().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lavoratoricomputabili }
     * 
     * 
     */
    public List<Lavoratoricomputabili> getLavoratoricomputabili() {
        if (lavoratoricomputabili == null) {
            lavoratoricomputabili = new ArrayList<Lavoratoricomputabili>();
        }
        return this.lavoratoricomputabili;
    }

    /**
     * Gets the value of the postilavoro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postilavoro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostilavoro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Postilavoro }
     * 
     * 
     */
    public List<Postilavoro> getPostilavoro() {
        if (postilavoro == null) {
            postilavoro = new ArrayList<Postilavoro>();
        }
        return this.postilavoro;
    }

    /**
     * Gets the value of the compensazioni property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compensazioni property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompensazioni().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Compensazioni }
     * 
     * 
     */
    public List<Compensazioni> getCompensazioni() {
        if (compensazioni == null) {
            compensazioni = new ArrayList<Compensazioni>();
        }
        return this.compensazioni;
    }

    /**
     * Recupera il valore della proprietà sospensioni.
     * 
     * @return
     *     possible object is
     *     {@link Sospensione }
     *     
     */
    public Sospensione getSospensioni() {
        return sospensioni;
    }

    /**
     * Imposta il valore della proprietà sospensioni.
     * 
     * @param value
     *     allowed object is
     *     {@link Sospensione }
     *     
     */
    public void setSospensioni(Sospensione value) {
        this.sospensioni = value;
    }

    /**
     * Recupera il valore della proprietà gradualita.
     * 
     * @return
     *     possible object is
     *     {@link Gradualitaprov }
     *     
     */
    public Gradualitaprov getGradualita() {
        return gradualita;
    }

    /**
     * Imposta il valore della proprietà gradualita.
     * 
     * @param value
     *     allowed object is
     *     {@link Gradualitaprov }
     *     
     */
    public void setGradualita(Gradualitaprov value) {
        this.gradualita = value;
    }

    /**
     * Recupera il valore della proprietà esoneri.
     * 
     * @return
     *     possible object is
     *     {@link Esoneri }
     *     
     */
    public Esoneri getEsoneri() {
        return esoneri;
    }

    /**
     * Imposta il valore della proprietà esoneri.
     * 
     * @param value
     *     allowed object is
     *     {@link Esoneri }
     *     
     */
    public void setEsoneri(Esoneri value) {
        this.esoneri = value;
    }

    /**
     * Recupera il valore della proprietà esoneri60Permille.
     * 
     * @return
     *     possible object is
     *     {@link Esoneri60Permille }
     *     
     */
    public Esoneri60Permille getEsoneri60Permille() {
        return esoneri60Permille;
    }

    /**
     * Imposta il valore della proprietà esoneri60Permille.
     * 
     * @param value
     *     allowed object is
     *     {@link Esoneri60Permille }
     *     
     */
    public void setEsoneri60Permille(Esoneri60Permille value) {
        this.esoneri60Permille = value;
    }

    /**
     * Recupera il valore della proprietà convenzione.
     * 
     * @return
     *     possible object is
     *     {@link Convenzione }
     *     
     */
    public Convenzione getConvenzione() {
        return convenzione;
    }

    /**
     * Imposta il valore della proprietà convenzione.
     * 
     * @param value
     *     allowed object is
     *     {@link Convenzione }
     *     
     */
    public void setConvenzione(Convenzione value) {
        this.convenzione = value;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Imposta il valore della proprietà note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
