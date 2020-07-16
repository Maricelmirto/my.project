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
public class VendorsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "VEND_ID")
    private String vendId;
    @Basic(optional = false)
    @Column(name = "STAFF_ID")
    private String staffId;

    public VendorsPK() {
    }

    public VendorsPK(String vendId, String staffId) {
        this.vendId = vendId;
        this.staffId = staffId;
    }

    public String getVendId() {
        return vendId;
    }

    public void setVendId(String vendId) {
        this.vendId = vendId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendId != null ? vendId.hashCode() : 0);
        hash += (staffId != null ? staffId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendorsPK)) {
            return false;
        }
        VendorsPK other = (VendorsPK) object;
        if ((this.vendId == null && other.vendId != null) || (this.vendId != null && !this.vendId.equals(other.vendId))) {
            return false;
        }
        if ((this.staffId == null && other.staffId != null) || (this.staffId != null && !this.staffId.equals(other.staffId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FRAME.VendorsPK[ vendId=" + vendId + ", staffId=" + staffId + " ]";
    }
    
}
