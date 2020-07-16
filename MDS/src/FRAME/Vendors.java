/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRAME;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author crisb
 */
@Entity
@Table(name = "vendors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendors.findAll", query = "SELECT v FROM Vendors v")
    , @NamedQuery(name = "Vendors.findByVendId", query = "SELECT v FROM Vendors v WHERE v.vendorsPK.vendId = :vendId")
    , @NamedQuery(name = "Vendors.findByVendFname", query = "SELECT v FROM Vendors v WHERE v.vendFname = :vendFname")
    , @NamedQuery(name = "Vendors.findByVendLname", query = "SELECT v FROM Vendors v WHERE v.vendLname = :vendLname")
    , @NamedQuery(name = "Vendors.findByStaffId", query = "SELECT v FROM Vendors v WHERE v.vendorsPK.staffId = :staffId")})
public class Vendors implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VendorsPK vendorsPK;
    @Column(name = "VEND_FNAME")
    private String vendFname;
    @Column(name = "VEND_LNAME")
    private String vendLname;

    public Vendors() {
    }

    public Vendors(VendorsPK vendorsPK) {
        this.vendorsPK = vendorsPK;
    }

    public Vendors(String vendId, String staffId) {
        this.vendorsPK = new VendorsPK(vendId, staffId);
    }

    public VendorsPK getVendorsPK() {
        return vendorsPK;
    }

    public void setVendorsPK(VendorsPK vendorsPK) {
        this.vendorsPK = vendorsPK;
    }

    public String getVendFname() {
        return vendFname;
    }

    public void setVendFname(String vendFname) {
        this.vendFname = vendFname;
    }

    public String getVendLname() {
        return vendLname;
    }

    public void setVendLname(String vendLname) {
        this.vendLname = vendLname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendorsPK != null ? vendorsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendors)) {
            return false;
        }
        Vendors other = (Vendors) object;
        if ((this.vendorsPK == null && other.vendorsPK != null) || (this.vendorsPK != null && !this.vendorsPK.equals(other.vendorsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FRAME.Vendors[ vendorsPK=" + vendorsPK + " ]";
    }
    
}
