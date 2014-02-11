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
@Table(name = "SHIPPING_METHODS")
@NamedQueries({
    @NamedQuery(name = "ShippingMethods.findAll", query = "SELECT s FROM ShippingMethods s"),
    @NamedQuery(name = "ShippingMethods.findByShippingmethodid", query = "SELECT s FROM ShippingMethods s WHERE s.shippingmethodid = :shippingmethodid"),
    @NamedQuery(name = "ShippingMethods.findByShippingmethod", query = "SELECT s FROM ShippingMethods s WHERE s.shippingmethod = :shippingmethod")})
public class ShippingMethods implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SHIPPINGMETHODID")
    private Integer shippingmethodid;
    @Size(max = 20)
    @Column(name = "SHIPPINGMETHOD")
    private String shippingmethod;

    public ShippingMethods() {
    }

    public ShippingMethods(Integer shippingmethodid) {
        this.shippingmethodid = shippingmethodid;
    }

    public Integer getShippingmethodid() {
        return shippingmethodid;
    }

    public void setShippingmethodid(Integer shippingmethodid) {
        this.shippingmethodid = shippingmethodid;
    }

    public String getShippingmethod() {
        return shippingmethod;
    }

    public void setShippingmethod(String shippingmethod) {
        this.shippingmethod = shippingmethod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shippingmethodid != null ? shippingmethodid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShippingMethods)) {
            return false;
        }
        ShippingMethods other = (ShippingMethods) object;
        if ((this.shippingmethodid == null && other.shippingmethodid != null) || (this.shippingmethodid != null && !this.shippingmethodid.equals(other.shippingmethodid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ShippingMethods[ shippingmethodid=" + shippingmethodid + " ]";
    }
    
}
