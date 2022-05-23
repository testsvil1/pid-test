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
 * <p>Classe Java per lavoratoritempopienoparttime complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="lavoratoritempopienoparttime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nlavoratoritempopieno" type="{http://servizi.lavoro.gov.it/UNIPI}Numerico"/>
 *         &lt;element name="parttime" type="{http://servizi.lavoro.gov.it/UNIPI}parttime" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lavoratoritempopienoparttime", propOrder = {
    "nlavoratoritempopieno",
    "parttime"
})
public class Lavoratoritempopienoparttime {

    @XmlElement(required = true)
    protected String nlavoratoritempopieno;
    protected List<Parttime> parttime;

    /**
     * Recupera il valore della proprietà nlavoratoritempopieno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNlavoratoritempopieno() {
        return nlavoratoritempopieno;
    }

    /**
     * Imposta il valore della proprietà nlavoratoritempopieno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNlavoratoritempopieno(String value) {
        this.nlavoratoritempopieno = value;
    }

    /**
     * Gets the value of the parttime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parttime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParttime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parttime }
     * 
     * 
     */
    public List<Parttime> getParttime() {
        if (parttime == null) {
            parttime = new ArrayList<Parttime>();
        }
        return this.parttime;
    }

}
