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
 * <p>Classe Java per personalenondipendente complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="personalenondipendente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lavoratoridisabilisomministrati" type="{http://servizi.lavoro.gov.it/UNIPI}lavoratoritempopienoparttime"/>
 *         &lt;element name="lavoratoridisabiliconv12bis14" type="{http://servizi.lavoro.gov.it/UNIPI}lavoratoritempopienoparttime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personalenondipendente", propOrder = {
    "lavoratoridisabilisomministrati",
    "lavoratoridisabiliconv12Bis14"
})
public class Personalenondipendente {

    @XmlElement(required = true)
    protected Lavoratoritempopienoparttime lavoratoridisabilisomministrati;
    @XmlElement(name = "lavoratoridisabiliconv12bis14", required = true)
    protected Lavoratoritempopienoparttime lavoratoridisabiliconv12Bis14;

    /**
     * Recupera il valore della proprietà lavoratoridisabilisomministrati.
     * 
     * @return
     *     possible object is
     *     {@link Lavoratoritempopienoparttime }
     *     
     */
    public Lavoratoritempopienoparttime getLavoratoridisabilisomministrati() {
        return lavoratoridisabilisomministrati;
    }

    /**
     * Imposta il valore della proprietà lavoratoridisabilisomministrati.
     * 
     * @param value
     *     allowed object is
     *     {@link Lavoratoritempopienoparttime }
     *     
     */
    public void setLavoratoridisabilisomministrati(Lavoratoritempopienoparttime value) {
        this.lavoratoridisabilisomministrati = value;
    }

    /**
     * Recupera il valore della proprietà lavoratoridisabiliconv12Bis14.
     * 
     * @return
     *     possible object is
     *     {@link Lavoratoritempopienoparttime }
     *     
     */
    public Lavoratoritempopienoparttime getLavoratoridisabiliconv12Bis14() {
        return lavoratoridisabiliconv12Bis14;
    }

    /**
     * Imposta il valore della proprietà lavoratoridisabiliconv12Bis14.
     * 
     * @param value
     *     allowed object is
     *     {@link Lavoratoritempopienoparttime }
     *     
     */
    public void setLavoratoridisabiliconv12Bis14(Lavoratoritempopienoparttime value) {
        this.lavoratoridisabiliconv12Bis14 = value;
    }

}
