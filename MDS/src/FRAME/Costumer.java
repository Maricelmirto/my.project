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
@Table(name = "costumer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Costumer.findAll", query = "SELECT c FROM Costumer c")
    , @NamedQuery(name = "Costumer.findByCosId", query = "SELECT c FROM Costumer c WHERE c.costumerPK.cosId = :cosId")
    , @NamedQuery(name = "Costumer.findByCosFname", query = "SELECT c FROM Costumer c WHERE c.cosFname = :cosFname")
    , @NamedQuery(name = "Costumer.findByCosLname", query = "SELECT c FROM Costumer c WHERE c.cosLname = :cosLname")
    , @NamedQuery(name = "Costumer.findByProdCode", query = "SELECT c FROM Costumer c WHERE c.costumerPK.prodCode = :prodCode")
    , @NamedQuery(name = "Costumer.findByVendId", query = "SELECT c FROM Costumer c WHERE c.costumerPK.vendId = :vendId")})
public class Costumer implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CostumerPK costumerPK;
    @Column(name = "COS_FNAME")
    private String cosFname;
    @Column(name = "COS_LNAME")
    private String cosLname;

    public Costumer() {
    }

    public Costumer(CostumerPK costumerPK) {
        this.costumerPK = costumerPK;
    }

    public Costumer(String cosId, String prodCode, String vendId) {
        this.costumerPK = new CostumerPK(cosId, prodCode, vendId);
    }

    public CostumerPK getCostumerPK() {
        return costumerPK;
    }

    public void setCostumerPK(CostumerPK costumerPK) {
        this.costumerPK = costumerPK;
    }

    public String getCosFname() {
        return cosFname;
    }

    public void setCosFname(String cosFname) {
        this.cosFname = cosFname;
    }

    public String getCosLname() {
        return cosLname;
    }

    public void setCosLname(String cosLname) {
        this.cosLname = cosLname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (costumerPK != null ? costumerPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Costumer)) {
            return false;
        }
        Costumer other = (Costumer) object;
        if ((this.costumerPK == null && other.costumerPK != null) || (this.costumerPK != null && !this.costumerPK.equals(other.costumerPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FRAME.Costumer[ costumerPK=" + costumerPK + " ]";
    }
    
}
