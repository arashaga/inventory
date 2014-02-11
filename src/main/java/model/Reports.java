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
@Table(name = "REPORTS")
@NamedQueries({
    @NamedQuery(name = "Reports.findAll", query = "SELECT r FROM Reports r"),
    @NamedQuery(name = "Reports.findByReportid", query = "SELECT r FROM Reports r WHERE r.reportid = :reportid"),
    @NamedQuery(name = "Reports.findByReportname", query = "SELECT r FROM Reports r WHERE r.reportname = :reportname"),
    @NamedQuery(name = "Reports.findByReportdesc", query = "SELECT r FROM Reports r WHERE r.reportdesc = :reportdesc")})
public class Reports implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "REPORTID")
    private Integer reportid;
    @Size(max = 50)
    @Column(name = "REPORTNAME")
    private String reportname;
    @Size(max = 255)
    @Column(name = "REPORTDESC")
    private String reportdesc;

    public Reports() {
    }

    public Reports(Integer reportid) {
        this.reportid = reportid;
    }

    public Integer getReportid() {
        return reportid;
    }

    public void setReportid(Integer reportid) {
        this.reportid = reportid;
    }

    public String getReportname() {
        return reportname;
    }

    public void setReportname(String reportname) {
        this.reportname = reportname;
    }

    public String getReportdesc() {
        return reportdesc;
    }

    public void setReportdesc(String reportdesc) {
        this.reportdesc = reportdesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reportid != null ? reportid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reports)) {
            return false;
        }
        Reports other = (Reports) object;
        if ((this.reportid == null && other.reportid != null) || (this.reportid != null && !this.reportid.equals(other.reportid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Reports[ reportid=" + reportid + " ]";
    }
    
}
