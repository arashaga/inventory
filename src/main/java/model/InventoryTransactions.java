/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "INVENTORY_TRANSACTIONS")
@NamedQueries({
    @NamedQuery(name = "InventoryTransactions.findAll", query = "SELECT i FROM InventoryTransactions i"),
    @NamedQuery(name = "InventoryTransactions.findByTransactionid", query = "SELECT i FROM InventoryTransactions i WHERE i.transactionid = :transactionid"),
    @NamedQuery(name = "InventoryTransactions.findByTransactiondate", query = "SELECT i FROM InventoryTransactions i WHERE i.transactiondate = :transactiondate"),
    @NamedQuery(name = "InventoryTransactions.findByTransactiondescription", query = "SELECT i FROM InventoryTransactions i WHERE i.transactiondescription = :transactiondescription"),
    @NamedQuery(name = "InventoryTransactions.findByUnitprice", query = "SELECT i FROM InventoryTransactions i WHERE i.unitprice = :unitprice"),
    @NamedQuery(name = "InventoryTransactions.findByUnitsordered", query = "SELECT i FROM InventoryTransactions i WHERE i.unitsordered = :unitsordered"),
    @NamedQuery(name = "InventoryTransactions.findByUnitsreceived", query = "SELECT i FROM InventoryTransactions i WHERE i.unitsreceived = :unitsreceived"),
    @NamedQuery(name = "InventoryTransactions.findByUnitssold", query = "SELECT i FROM InventoryTransactions i WHERE i.unitssold = :unitssold"),
    @NamedQuery(name = "InventoryTransactions.findByUnitsshrinkage", query = "SELECT i FROM InventoryTransactions i WHERE i.unitsshrinkage = :unitsshrinkage")})
public class InventoryTransactions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRANSACTIONID")
    private Integer transactionid;
    @Column(name = "TRANSACTIONDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactiondate;
    @Size(max = 255)
    @Column(name = "TRANSACTIONDESCRIPTION")
    private String transactiondescription;
    @Column(name = "UNITPRICE")
    private Integer unitprice;
    @Column(name = "UNITSORDERED")
    private Integer unitsordered;
    @Column(name = "UNITSRECEIVED")
    private Integer unitsreceived;
    @Column(name = "UNITSSOLD")
    private Integer unitssold;
    @Column(name = "UNITSSHRINKAGE")
    private Integer unitsshrinkage;
    @JoinColumn(name = "PURCHASEORDERID", referencedColumnName = "PURCHASEORDERID")
    @ManyToOne
    private PurchaseOrders purchaseorderid;
    @JoinColumn(name = "PRODUCTID", referencedColumnName = "PRODUCTID")
    @ManyToOne
    private Products productid;

    public InventoryTransactions() {
    }

    public InventoryTransactions(Integer transactionid) {
        this.transactionid = transactionid;
    }

    public Integer getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(Integer transactionid) {
        this.transactionid = transactionid;
    }

    public Date getTransactiondate() {
        return transactiondate;
    }

    public void setTransactiondate(Date transactiondate) {
        this.transactiondate = transactiondate;
    }

    public String getTransactiondescription() {
        return transactiondescription;
    }

    public void setTransactiondescription(String transactiondescription) {
        this.transactiondescription = transactiondescription;
    }

    public Integer getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Integer unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getUnitsordered() {
        return unitsordered;
    }

    public void setUnitsordered(Integer unitsordered) {
        this.unitsordered = unitsordered;
    }

    public Integer getUnitsreceived() {
        return unitsreceived;
    }

    public void setUnitsreceived(Integer unitsreceived) {
        this.unitsreceived = unitsreceived;
    }

    public Integer getUnitssold() {
        return unitssold;
    }

    public void setUnitssold(Integer unitssold) {
        this.unitssold = unitssold;
    }

    public Integer getUnitsshrinkage() {
        return unitsshrinkage;
    }

    public void setUnitsshrinkage(Integer unitsshrinkage) {
        this.unitsshrinkage = unitsshrinkage;
    }

    public PurchaseOrders getPurchaseorderid() {
        return purchaseorderid;
    }

    public void setPurchaseorderid(PurchaseOrders purchaseorderid) {
        this.purchaseorderid = purchaseorderid;
    }

    public Products getProductid() {
        return productid;
    }

    public void setProductid(Products productid) {
        this.productid = productid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionid != null ? transactionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryTransactions)) {
            return false;
        }
        InventoryTransactions other = (InventoryTransactions) object;
        if ((this.transactionid == null && other.transactionid != null) || (this.transactionid != null && !this.transactionid.equals(other.transactionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.InventoryTransactions[ transactionid=" + transactionid + " ]";
    }
    
}
