/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author arash
 */
@Entity
@Table(name = "PURCHASE_ORDERS")
@NamedQueries({
    @NamedQuery(name = "PurchaseOrders.findAll", query = "SELECT p FROM PurchaseOrders p"),
    @NamedQuery(name = "PurchaseOrders.findByPurchaseorderid", query = "SELECT p FROM PurchaseOrders p WHERE p.purchaseorderid = :purchaseorderid"),
    @NamedQuery(name = "PurchaseOrders.findByPurchaseordernumber", query = "SELECT p FROM PurchaseOrders p WHERE p.purchaseordernumber = :purchaseordernumber"),
    @NamedQuery(name = "PurchaseOrders.findByPurchaseorderdescription", query = "SELECT p FROM PurchaseOrders p WHERE p.purchaseorderdescription = :purchaseorderdescription"),
    @NamedQuery(name = "PurchaseOrders.findByEmployeeid", query = "SELECT p FROM PurchaseOrders p WHERE p.employeeid = :employeeid"),
    @NamedQuery(name = "PurchaseOrders.findByOrderdate", query = "SELECT p FROM PurchaseOrders p WHERE p.orderdate = :orderdate"),
    @NamedQuery(name = "PurchaseOrders.findByDaterequired", query = "SELECT p FROM PurchaseOrders p WHERE p.daterequired = :daterequired"),
    @NamedQuery(name = "PurchaseOrders.findByDatepromised", query = "SELECT p FROM PurchaseOrders p WHERE p.datepromised = :datepromised"),
    @NamedQuery(name = "PurchaseOrders.findByShipdate", query = "SELECT p FROM PurchaseOrders p WHERE p.shipdate = :shipdate"),
    @NamedQuery(name = "PurchaseOrders.findByShippingmethodid", query = "SELECT p FROM PurchaseOrders p WHERE p.shippingmethodid = :shippingmethodid"),
    @NamedQuery(name = "PurchaseOrders.findByFreightcharge", query = "SELECT p FROM PurchaseOrders p WHERE p.freightcharge = :freightcharge")})
public class PurchaseOrders implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PURCHASEORDERID")
    private Integer purchaseorderid;
    @Size(max = 30)
    @Column(name = "PURCHASEORDERNUMBER")
    private String purchaseordernumber;
    @Size(max = 255)
    @Column(name = "PURCHASEORDERDESCRIPTION")
    private String purchaseorderdescription;
    @Column(name = "EMPLOYEEID")
    private Integer employeeid;
    @Column(name = "ORDERDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderdate;
    @Column(name = "DATEREQUIRED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date daterequired;
    @Column(name = "DATEPROMISED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datepromised;
    @Column(name = "SHIPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shipdate;
    @Column(name = "SHIPPINGMETHODID")
    private Integer shippingmethodid;
    @Column(name = "FREIGHTCHARGE")
    private Integer freightcharge;
    @OneToMany(mappedBy = "purchaseorderid")
    private Collection<InventoryTransactions> inventoryTransactionsCollection;
    @JoinColumn(name = "SUPPLIERID", referencedColumnName = "SUPPLIERID")
    @ManyToOne
    private Suppliers supplierid;

    public PurchaseOrders() {
    }

    public PurchaseOrders(Integer purchaseorderid) {
        this.purchaseorderid = purchaseorderid;
    }

    public Integer getPurchaseorderid() {
        return purchaseorderid;
    }

    public void setPurchaseorderid(Integer purchaseorderid) {
        this.purchaseorderid = purchaseorderid;
    }

    public String getPurchaseordernumber() {
        return purchaseordernumber;
    }

    public void setPurchaseordernumber(String purchaseordernumber) {
        this.purchaseordernumber = purchaseordernumber;
    }

    public String getPurchaseorderdescription() {
        return purchaseorderdescription;
    }

    public void setPurchaseorderdescription(String purchaseorderdescription) {
        this.purchaseorderdescription = purchaseorderdescription;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Date getDaterequired() {
        return daterequired;
    }

    public void setDaterequired(Date daterequired) {
        this.daterequired = daterequired;
    }

    public Date getDatepromised() {
        return datepromised;
    }

    public void setDatepromised(Date datepromised) {
        this.datepromised = datepromised;
    }

    public Date getShipdate() {
        return shipdate;
    }

    public void setShipdate(Date shipdate) {
        this.shipdate = shipdate;
    }

    public Integer getShippingmethodid() {
        return shippingmethodid;
    }

    public void setShippingmethodid(Integer shippingmethodid) {
        this.shippingmethodid = shippingmethodid;
    }

    public Integer getFreightcharge() {
        return freightcharge;
    }

    public void setFreightcharge(Integer freightcharge) {
        this.freightcharge = freightcharge;
    }

    public Collection<InventoryTransactions> getInventoryTransactionsCollection() {
        return inventoryTransactionsCollection;
    }

    public void setInventoryTransactionsCollection(Collection<InventoryTransactions> inventoryTransactionsCollection) {
        this.inventoryTransactionsCollection = inventoryTransactionsCollection;
    }

    public Suppliers getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Suppliers supplierid) {
        this.supplierid = supplierid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (purchaseorderid != null ? purchaseorderid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseOrders)) {
            return false;
        }
        PurchaseOrders other = (PurchaseOrders) object;
        if ((this.purchaseorderid == null && other.purchaseorderid != null) || (this.purchaseorderid != null && !this.purchaseorderid.equals(other.purchaseorderid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.PurchaseOrders[ purchaseorderid=" + purchaseorderid + " ]";
    }
    
}
