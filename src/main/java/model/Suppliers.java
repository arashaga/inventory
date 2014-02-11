/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author arash
 */
@Entity
@Table(name = "SUPPLIERS")
@NamedQueries({
    @NamedQuery(name = "Suppliers.findAll", query = "SELECT s FROM Suppliers s"),
    @NamedQuery(name = "Suppliers.findBySupplierid", query = "SELECT s FROM Suppliers s WHERE s.supplierid = :supplierid"),
    @NamedQuery(name = "Suppliers.findBySuppliername", query = "SELECT s FROM Suppliers s WHERE s.suppliername = :suppliername"),
    @NamedQuery(name = "Suppliers.findByContactname", query = "SELECT s FROM Suppliers s WHERE s.contactname = :contactname"),
    @NamedQuery(name = "Suppliers.findByContacttitle", query = "SELECT s FROM Suppliers s WHERE s.contacttitle = :contacttitle"),
    @NamedQuery(name = "Suppliers.findByAddress", query = "SELECT s FROM Suppliers s WHERE s.address = :address"),
    @NamedQuery(name = "Suppliers.findByCity", query = "SELECT s FROM Suppliers s WHERE s.city = :city"),
    @NamedQuery(name = "Suppliers.findByPostalcode", query = "SELECT s FROM Suppliers s WHERE s.postalcode = :postalcode"),
    @NamedQuery(name = "Suppliers.findByStateorprovince", query = "SELECT s FROM Suppliers s WHERE s.stateorprovince = :stateorprovince"),
    @NamedQuery(name = "Suppliers.findByCountry", query = "SELECT s FROM Suppliers s WHERE s.country = :country"),
    @NamedQuery(name = "Suppliers.findByPhonenumber", query = "SELECT s FROM Suppliers s WHERE s.phonenumber = :phonenumber"),
    @NamedQuery(name = "Suppliers.findByFaxnumber", query = "SELECT s FROM Suppliers s WHERE s.faxnumber = :faxnumber"),
    @NamedQuery(name = "Suppliers.findByPaymentterms", query = "SELECT s FROM Suppliers s WHERE s.paymentterms = :paymentterms"),
    @NamedQuery(name = "Suppliers.findByEmailaddress", query = "SELECT s FROM Suppliers s WHERE s.emailaddress = :emailaddress")})
public class Suppliers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUPPLIERID")
    private Integer supplierid;
    @Size(max = 50)
    @Column(name = "SUPPLIERNAME")
    private String suppliername;
    @Size(max = 50)
    @Column(name = "CONTACTNAME")
    private String contactname;
    @Size(max = 50)
    @Column(name = "CONTACTTITLE")
    private String contacttitle;
    @Size(max = 255)
    @Column(name = "ADDRESS")
    private String address;
    @Size(max = 50)
    @Column(name = "CITY")
    private String city;
    @Size(max = 20)
    @Column(name = "POSTALCODE")
    private String postalcode;
    @Size(max = 20)
    @Column(name = "STATEORPROVINCE")
    private String stateorprovince;
    @Size(max = 50)
    @Column(name = "COUNTRY")
    private String country;
    @Size(max = 30)
    @Column(name = "PHONENUMBER")
    private String phonenumber;
    @Size(max = 30)
    @Column(name = "FAXNUMBER")
    private String faxnumber;
    @Size(max = 255)
    @Column(name = "PAYMENTTERMS")
    private String paymentterms;
    @Size(max = 50)
    @Column(name = "EMAILADDRESS")
    private String emailaddress;
    @Lob
    @Size(max = 32700)
    @Column(name = "NOTES")
    private String notes;
    @OneToMany(mappedBy = "supplierid")
    private Collection<PurchaseOrders> purchaseOrdersCollection;

    public Suppliers() {
    }

    public Suppliers(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getContacttitle() {
        return contacttitle;
    }

    public void setContacttitle(String contacttitle) {
        this.contacttitle = contacttitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getStateorprovince() {
        return stateorprovince;
    }

    public void setStateorprovince(String stateorprovince) {
        this.stateorprovince = stateorprovince;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getFaxnumber() {
        return faxnumber;
    }

    public void setFaxnumber(String faxnumber) {
        this.faxnumber = faxnumber;
    }

    public String getPaymentterms() {
        return paymentterms;
    }

    public void setPaymentterms(String paymentterms) {
        this.paymentterms = paymentterms;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Collection<PurchaseOrders> getPurchaseOrdersCollection() {
        return purchaseOrdersCollection;
    }

    public void setPurchaseOrdersCollection(Collection<PurchaseOrders> purchaseOrdersCollection) {
        this.purchaseOrdersCollection = purchaseOrdersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (supplierid != null ? supplierid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Suppliers)) {
            return false;
        }
        Suppliers other = (Suppliers) object;
        if ((this.supplierid == null && other.supplierid != null) || (this.supplierid != null && !this.supplierid.equals(other.supplierid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Suppliers[ supplierid=" + supplierid + " ]";
    }
    
}
