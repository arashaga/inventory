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
@Table(name = "PRODUCTS")
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p"),
    @NamedQuery(name = "Products.findByProductid", query = "SELECT p FROM Products p WHERE p.productid = :productid"),
    @NamedQuery(name = "Products.findByProductname", query = "SELECT p FROM Products p WHERE p.productname = :productname"),
    @NamedQuery(name = "Products.findByProductdescription", query = "SELECT p FROM Products p WHERE p.productdescription = :productdescription"),
    @NamedQuery(name = "Products.findByCategoryid", query = "SELECT p FROM Products p WHERE p.categoryid = :categoryid"),
    @NamedQuery(name = "Products.findBySerialnumber", query = "SELECT p FROM Products p WHERE p.serialnumber = :serialnumber"),
    @NamedQuery(name = "Products.findByUnitprice", query = "SELECT p FROM Products p WHERE p.unitprice = :unitprice"),
    @NamedQuery(name = "Products.findByReorderlevel", query = "SELECT p FROM Products p WHERE p.reorderlevel = :reorderlevel"),
    @NamedQuery(name = "Products.findByDiscontinued", query = "SELECT p FROM Products p WHERE p.discontinued = :discontinued"),
    @NamedQuery(name = "Products.findByLeadtime", query = "SELECT p FROM Products p WHERE p.leadtime = :leadtime")})
public class Products implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRODUCTID")
    private Integer productid;
    @Size(max = 50)
    @Column(name = "PRODUCTNAME")
    private String productname;
    @Size(max = 255)
    @Column(name = "PRODUCTDESCRIPTION")
    private String productdescription;
    @Column(name = "CATEGORYID")
    private Integer categoryid;
    @Size(max = 50)
    @Column(name = "SERIALNUMBER")
    private String serialnumber;
    @Column(name = "UNITPRICE")
    private Integer unitprice;
    @Column(name = "REORDERLEVEL")
    private Integer reorderlevel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DISCONTINUED")
    private Serializable discontinued;
    @Size(max = 30)
    @Column(name = "LEADTIME")
    private String leadtime;
    @OneToMany(mappedBy = "productid")
    private Collection<InventoryTransactions> inventoryTransactionsCollection;

    public Products() {
    }

    public Products(Integer productid) {
        this.productid = productid;
    }

    public Products(Integer productid, Serializable discontinued) {
        this.productid = productid;
        this.discontinued = discontinued;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public Integer getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Integer unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getReorderlevel() {
        return reorderlevel;
    }

    public void setReorderlevel(Integer reorderlevel) {
        this.reorderlevel = reorderlevel;
    }

    public Serializable getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Serializable discontinued) {
        this.discontinued = discontinued;
    }

    public String getLeadtime() {
        return leadtime;
    }

    public void setLeadtime(String leadtime) {
        this.leadtime = leadtime;
    }

    public Collection<InventoryTransactions> getInventoryTransactionsCollection() {
        return inventoryTransactionsCollection;
    }

    public void setInventoryTransactionsCollection(Collection<InventoryTransactions> inventoryTransactionsCollection) {
        this.inventoryTransactionsCollection = inventoryTransactionsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productid != null ? productid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.productid == null && other.productid != null) || (this.productid != null && !this.productid.equals(other.productid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Products[ productid=" + productid + " ]";
    }
    
}
