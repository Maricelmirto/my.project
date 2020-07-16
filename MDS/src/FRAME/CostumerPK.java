/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRAME;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author crisb
 */
@Embeddable
public class CostumerPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "COS_ID")
    private String cosId;
    @Basic(optional = false)
    @Column(name = "PROD_CODE")
    private String prodCode;
    @Basic(optional = false)
    @Column(name = "VEND_ID")
    private String vendId;

    public CostumerPK() {
    }

    public CostumerPK(String cosId, String prodCode, String vendId) {
        this.cosId = cosId;
        this.prodCode = prodCode;
        this.vendId = vendId;
    }

    public String getCosId() {
        return cosId;
    }

    public void setCosId(String cosId) {
        this.cosId = cosId;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    public String getVendId() {
        return vendId;
    }

    public void setVendId(String vendId) {
        this.vendId = vendId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cosId != null ? cosId.hashCode() : 0);
        hash += (prodCode != null ? prodCode.hashCode() : 0);
        hash += (vendId != null ? vendId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostumerPK)) {
            return false;
        }
        CostumerPK other = (CostumerPK) object;
        if ((this.cosId == null && other.cosId != null) || (this.cosId != null && !this.cosId.equals(other.cosId))) {
            return false;
        }
        if ((this.prodCode == null && other.prodCode != null) || (this.prodCode != null && !this.prodCode.equals(other.prodCode))) {
            return false;
        }
        if ((this.vendId == null && other.vendId != null) || (this.vendId != null && !this.vendId.equals(other.vendId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FRAME.CostumerPK[ cosId=" + cosId + ", prodCode=" + prodCode + ", vendId=" + vendId + " ]";
    }
    
}
