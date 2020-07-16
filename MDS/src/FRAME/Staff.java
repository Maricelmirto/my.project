/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRAME;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author crisb
 */
@Entity
@Table(name = "staff")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Staff.findAll", query = "SELECT s FROM Staff s")
    , @NamedQuery(name = "Staff.findByStaffId", query = "SELECT s FROM Staff s WHERE s.staffId = :staffId")
    , @NamedQuery(name = "Staff.findByStaffFname", query = "SELECT s FROM Staff s WHERE s.staffFname = :staffFname")
    , @NamedQuery(name = "Staff.findByStaffLname", query = "SELECT s FROM Staff s WHERE s.staffLname = :staffLname")
    , @NamedQuery(name = "Staff.findByStaffPosition", query = "SELECT s FROM Staff s WHERE s.staffPosition = :staffPosition")})
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STAFF_ID")
    private String staffId;
    @Column(name = "STAFF_FNAME")
    private String staffFname;
    @Column(name = "STAFF_LNAME")
    private String staffLname;
    @Column(name = "STAFF_POSITION")
    private String staffPosition;

    public Staff() {
    }

    public Staff(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffFname() {
        return staffFname;
    }

    public void setStaffFname(String staffFname) {
        this.staffFname = staffFname;
    }

    public String getStaffLname() {
        return staffLname;
    }

    public void setStaffLname(String staffLname) {
        this.staffLname = staffLname;
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffId != null ? staffId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.staffId == null && other.staffId != null) || (this.staffId != null && !this.staffId.equals(other.staffId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FRAME.Staff[ staffId=" + staffId + " ]";
    }
    
}
