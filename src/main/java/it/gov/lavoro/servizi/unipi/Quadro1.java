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
 * <p>Classe Java per quadro1 complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="quadro1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datiprospetto" type="{http://servizi.lavoro.gov.it/UNIPI}datiprospetto"/>
 *         &lt;element name="datiaziendali" type="{http://servizi.lavoro.gov.it/UNIPI}datiaziendali"/>
 *         &lt;element name="gradualita" type="{http://servizi.lavoro.gov.it/UNIPI}gradualita" minOccurs="0"/>
 *         &lt;element name="sospensionemobilita" type="{http://servizi.lavoro.gov.it/UNIPI}sospensionemobilita" minOccurs="0"/>
 *         &lt;element name="assunzionipubblicaselezione" type="{http://servizi.lavoro.gov.it/UNIPI}assunzionipubblicaselezione" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quadro1", propOrder = {
    "datiprospetto",
    "datiaziendali",
    "gradualita",
    "sospensionemobilita",
    "assunzionipubblicaselezione"
})
public class Quadro1 {

    @XmlElement(required = true)
    protected Datiprospetto datiprospetto;
    @XmlElement(required = true)
    protected Datiaziendali datiaziendali;
    protected Gradualita gradualita;
    protected Sospensionemobilita sospensionemobilita;
    protected List<Assunzionipubblicaselezione> assunzionipubblicaselezione;

    /**
     * Recupera il valore della proprietà datiprospetto.
     * 
     * @return
     *     possible object is
     *     {@link Datiprospetto }
     *     
     */
    public Datiprospetto getDatiprospetto() {
        return datiprospetto;
    }

    /**
     * Imposta il valore della proprietà datiprospetto.
     * 
     * @param value
     *     allowed object is
     *     {@link Datiprospetto }
     *     
     */
    public void setDatiprospetto(Datiprospetto value) {
        this.datiprospetto = value;
    }

    /**
     * Recupera il valore della proprietà datiaziendali.
     * 
     * @return
     *     possible object is
     *     {@link Datiaziendali }
     *     
     */
    public Datiaziendali getDatiaziendali() {
        return datiaziendali;
    }

    /**
     * Imposta il valore della proprietà datiaziendali.
     * 
     * @param value
     *     allowed object is
     *     {@link Datiaziendali }
     *     
     */
    public void setDatiaziendali(Datiaziendali value) {
        this.datiaziendali = value;
    }

    /**
     * Recupera il valore della proprietà gradualita.
     * 
     * @return
     *     possible object is
     *     {@link Gradualita }
     *     
     */
    public Gradualita getGradualita() {
        return gradualita;
    }

    /**
     * Imposta il valore della proprietà gradualita.
     * 
     * @param value
     *     allowed object is
     *     {@link Gradualita }
     *     
     */
    public void setGradualita(Gradualita value) {
        this.gradualita = value;
    }

    /**
     * Recupera il valore della proprietà sospensionemobilita.
     * 
     * @return
     *     possible object is
     *     {@link Sospensionemobilita }
     *     
     */
    public Sospensionemobilita getSospensionemobilita() {
        return sospensionemobilita;
    }

    /**
     * Imposta il valore della proprietà sospensionemobilita.
     * 
     * @param value
     *     allowed object is
     *     {@link Sospensionemobilita }
     *     
     */
    public void setSospensionemobilita(Sospensionemobilita value) {
        this.sospensionemobilita = value;
    }

    /**
     * Gets the value of the assunzionipubblicaselezione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assunzionipubblicaselezione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssunzionipubblicaselezione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Assunzionipubblicaselezione }
     * 
     * 
     */
    public List<Assunzionipubblicaselezione> getAssunzionipubblicaselezione() {
        if (assunzionipubblicaselezione == null) {
            assunzionipubblicaselezione = new ArrayList<Assunzionipubblicaselezione>();
        }
        return this.assunzionipubblicaselezione;
    }

}
