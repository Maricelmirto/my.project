/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FNAL;

import FRAME.Costumer;
import FRAME.CostumerPK;
import java.awt.Color;
import java.awt.Dimension;
import java.text.MessageFormat;
import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author crisb
 */
public class C_TABLE extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public C_TABLE() {
        initComponents();
        itemTable();
        itemdata();
    }
    DefaultTableModel tableModel = new DefaultTableModel() {
        public boolean isCellEditable(int row, int col) {
            if (col == 1) {
                return false;
            } else {
                return false;
            }
        }
    };

    public void itemTable() {
        String[] columnNames = {"COSTUMER ID", "FIRSTNAME", "LASTNAME", "PRODUCT CODE", "VENDOR ID"};
        Cus_Table = new javax.swing.JTable(tableModel);
        Cus_Table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        Cus_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Cus_Table.setShowGrid(true);
        Cus_Table.setFillsViewportHeight(true);
        Cus_Table.getTableHeader().setReorderingAllowed(false);
        Cus_Table.setRowSelectionAllowed(true);
        Cus_Table.setBackground(Color.getHSBColor(180, 244, 217));
        Cus_Table.setFont(new java.awt.Font("Tahoma", 0, 12));
        jScrollPane1.setViewportView(Cus_Table);
        JTableHeader header = Cus_Table.getTableHeader();
        header.setFont(new java.awt.Font("Tahoma", 1, 12));
        header.setBackground(Color.WHITE);
        header.setResizingAllowed(false);
        header.setPreferredSize(new Dimension(header.WIDTH, 30));
        for (int i = 0; i < columnNames.length;) {
            tableModel.addColumn(columnNames[i]);
            i++;
        }
        TableColumn[] column = new TableColumn[7];
        column[0] = Cus_Table.getColumnModel().getColumn(0);
        column[0].setPreferredWidth(40);
        column[1] = Cus_Table.getColumnModel().getColumn(1);
        column[1].setPreferredWidth(40);
        column[2] = Cus_Table.getColumnModel().getColumn(2);
        column[2].setPreferredWidth(50);
        column[3] = Cus_Table.getColumnModel().getColumn(3);
        column[3].setPreferredWidth(50);
        column[4] = Cus_Table.getColumnModel().getColumn(4);
        column[4].setPreferredWidth(60);

    }
     private void itemdata() {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("MDSPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            Vector row = new Vector();

            try {
                Query query = em.createNamedQuery("Costumer.findAll", Costumer.class);

                List<Costumer> customerList = query.getResultList();

                for (Costumer c : customerList) {

                    Vector column = new Vector();
                    column.add(c.getCostumerPK().getCosId());
                    column.add(c.getCostumerPK().getProdCode());
                    column.add(c.getCosFname());
                    column.add(c.getCosLname());
                    column.add(c.getCostumerPK().getVendId());
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

   private void Generate() {
        MessageFormat header = new MessageFormat("MEDICINE LIST IN STORAGE");
        MessageFormat footer = new MessageFormat("MEDICINE");

        try {
            Cus_Table.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (java.awt.print.PrinterException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE);

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Cus_Table = new javax.swing.JTable();
        back = new javax.swing.JButton();
        generate = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COSTUMER TABLE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 24))); // NOI18N
        jPanel1.setToolTipText("");

        Cus_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Cus_Table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        generate.setText("GENERATE");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(generate))
                .addGap(0, 29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
       Generate();
    }//GEN-LAST:event_generateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
     MDS_SELL MS = new MDS_SELL();
     MS.setVisible(true);
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Cus_Table;
    private javax.swing.JButton back;
    private javax.swing.JButton generate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
