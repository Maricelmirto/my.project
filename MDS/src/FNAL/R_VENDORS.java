/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FNAL;

import FRAME.Staff;
import FRAME.Vendors;
import FRAME.VendorsPK;
import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Janice Ann Visayas
 */
public class R_VENDORS extends javax.swing.JFrame {

    /**
     * Creates new form R_VENDORS
     */
    public R_VENDORS() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jText_VendId = new javax.swing.JTextField();
        jText_Fname = new javax.swing.JTextField();
        jText_Lname = new javax.swing.JTextField();
        jText_StaffId = new javax.swing.JTextField();
        jButton_Save = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_Save.setText("SAVE");
        jButton_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveActionPerformed(evt);
            }
        });

        jButton_Cancel.setText("CANCEL");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        jLabel1.setText("VENDOR ID:");

        jLabel2.setText("FIRSTNAME:");

        jLabel3.setText("LASTNAME:");

        jLabel4.setText("STAFF ID:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setText("REGISTER VENDOR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jText_Lname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jText_VendId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jText_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jText_StaffId, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton_Save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Cancel))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_VendId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_StaffId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Save)
                    .addComponent(jButton_Cancel))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveActionPerformed
       
    }//GEN-LAST:event_jButton_SaveActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CancelActionPerformed
DefaultTableModel tableModel = new DefaultTableModel() {
        public boolean isCellEditable(int row, int col) {
            if (col == 1) {
                return false;
            } else {
                return false;
            }
        }
    };
    private void itemdata() {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("MDSPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            Vector row = new Vector();

            try {
                Query query = em.createNamedQuery("Vendors.findAll", Vendors.class);
                List<Vendors> memberList = query.getResultList();

                for (Vendors m : memberList) {

                    Vector column = new Vector();
                    column.add(m.getVendorsPK().getVendId());
                    column.add(m.getVendFname());
                    column.add(m.getVendLname());
                    column.add(m.getVendorsPK().getStaffId());
                   
                    row.add(column);

                }
                tableModel.setRowCount(0);
                for (int i = 0; i < row.size(); i++) {
                    tableModel.addRow((Vector) row.get(i));
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            } finally {
                em.close();
                emf.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  private void save() {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("MDSPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            Vector row = new Vector();
            if ( jText_VendId!= null && jText_Fname != null && jText_Lname != null
                    && jText_StaffId != null) {

                try {
                    Vendors author = new Vendors();
                    author.setVendFname(jText_Fname.getText());
                    author.setVendLname(jText_Lname.getText());
                    VendorsPK vendorsPK = new VendorsPK(jText_VendId.getText(), jText_StaffId.getText());
                    author.setVendorsPK(vendorsPK);
                    
                    
                    em.persist(author);
                    em.getTransaction().commit();
                    JOptionPane.showMessageDialog(null, "Data Successfully added", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                    Cancel();
                    itemdata();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    em.close();
                    emf.close();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Please Fill Up All !", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  private void Cancel(){
      jText_VendId.setText("");
      jText_Fname.setText("");
      jText_Lname.setText("");
      jText_StaffId.setText("");
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jText_Fname;
    private javax.swing.JTextField jText_Lname;
    private javax.swing.JTextField jText_StaffId;
    private javax.swing.JTextField jText_VendId;
    // End of variables declaration//GEN-END:variables
}
