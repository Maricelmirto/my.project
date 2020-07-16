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
public class ProductPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PROD_ID")
    private String prodId;
    @Basic(optional = false)
    @Column(name = "PROD_CODE")
    private String prodCode;

    public ProductPK() {
    }

    public ProductPK(String prodId, String prodCode) {
        this.prodId = prodId;
        this.prodCode = prodCode;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodId != null ? prodId.hashCode() : 0);
        hash += (prodCode != null ? prodCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPK)) {
            return false;
        }
        ProductPK other = (ProductPK) object;
        if ((this.prodId == null && other.prodId != null) || (this.prodId != null && !this.prodId.equals(other.prodId))) {
            return false;
        }
        if ((this.prodCode == null && other.prodCode != null) || (this.prodCode != null && !this.prodCode.equals(other.prodCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FRAME.ProductPK[ prodId=" + prodId + ", prodCode=" + prodCode + " ]";
    }
    
}
