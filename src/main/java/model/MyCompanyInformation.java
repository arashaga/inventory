/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author arash
 */
@Entity
@Table(name = "MY_COMPANY_INFORMATION")
@NamedQueries({
    @NamedQuery(name = "MyCompanyInformation.findAll", query = "SELECT m FROM MyCompanyInformation m"),
    @NamedQuery(name = "MyCompanyInformation.findBySetupid", query = "SELECT m FROM MyCompanyInformation m WHERE m.setupid = :setupid"),
    @NamedQuery(name = "MyCompanyInformation.findByCompanyname", query = "SELECT m FROM MyCompanyInformation m WHERE m.companyname = :companyname"),
    @NamedQuery(name = "MyCompanyInformation.findByAddress", query = "SELECT m FROM MyCompanyInformation m WHERE m.address = :address"),
    @NamedQuery(name = "MyCompanyInformation.findByCity", query = "SELECT m FROM MyCompanyInformation m WHERE m.city = :city"),
    @NamedQuery(name = "MyCompanyInformation.findByStateorprovince", query = "SELECT m FROM MyCompanyInformation m WHERE m.stateorprovince = :stateorprovince"),
    @NamedQuery(name = "MyCompanyInformation.findByPostalcode", query = "SELECT m FROM MyCompanyInformation m WHERE m.postalcode = :postalcode"),
    @NamedQuery(name = "MyCompanyInformation.findByCountry", query = "SELECT m FROM MyCompanyInformation m WHERE m.country = :country"),
    @NamedQuery(name = "MyCompanyInformation.findByPhonenumber", query = "SELECT m FROM MyCompanyInformation m WHERE m.phonenumber = :phonenumber"),
    @NamedQuery(name = "MyCompanyInformation.findByFaxnumber", query = "SELECT m FROM MyCompanyInformation m WHERE m.faxnumber = :faxnumber")})
public class MyCompanyInformation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SETUPID")
    private Integer setupid;
    @Size(max = 50)
    @Column(name = "COMPANYNAME")
    private String companyname;
    @Size(max = 255)
    @Column(name = "ADDRESS")
    private String address;
    @Size(max = 50)
    @Column(name = "CITY")
    private String city;
    @Size(max = 20)
    @Column(name = "STATEORPROVINCE")
    private String stateorprovince;
    @Size(max = 20)
    @Column(name = "POSTALCODE")
    private String postalcode;
    @Size(max = 50)
    @Column(name = "COUNTRY")
    private String country;
    @Size(max = 30)
    @Column(name = "PHONENUMBER")
    private String phonenumber;
    @Size(max = 30)
    @Column(name = "FAXNUMBER")
    private String faxnumber;

    public MyCompanyInformation() {
    }

    public MyCompanyInformation(Integer setupid) {
        this.setupid = setupid;
    }

    public Integer getSetupid() {
        return setupid;
    }

    public void setSetupid(Integer setupid) {
        this.setupid = setupid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
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

    public String getStateorprovince() {
        return stateorprovince;
    }

    public void setStateorprovince(String stateorprovince) {
        this.stateorprovince = stateorprovince;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (setupid != null ? setupid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MyCompanyInformation)) {
            return false;
        }
        MyCompanyInformation other = (MyCompanyInformation) object;
        if ((this.setupid == null && other.setupid != null) || (this.setupid != null && !this.setupid.equals(other.setupid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.MyCompanyInformation[ setupid=" + setupid + " ]";
    }
    
}
