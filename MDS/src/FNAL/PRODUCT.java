/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FNAL;

import FRAME.Product;
import FRAME.ProductPK;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.MessageFormat;
import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
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
 * @author Janice Ann Visayas
 */
public class PRODUCT extends javax.swing.JFrame {

    /**
     * Creates new form PRODUCT
     */
    public PRODUCT() {
        initComponents();
        itemTable();
        itemdata();
        jTable_Product.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    if (e.getClickCount() == 1) {
                        int row = jTable_Product.getSelectedRow();
                        if (row == -1) {
                        } else {

                            jText_ProdID.setText((jTable_Product.getValueAt(row, 0).toString()));

                            jText_ProdCODE.setText((jTable_Product.getValueAt(row, 1).toString()));
                            jText_ProdNAME.setText((jTable_Product.getValueAt(row, 2).toString()));
                            jText_Price.setText((jTable_Product.getValueAt(row, 3).toString()));

                        }
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jText_ProdID = new javax.swing.JTextField();
        jText_ProdCODE = new javax.swing.JTextField();
        jText_ProdNAME = new javax.swing.JTextField();
        jText_Price = new javax.swing.JTextField();
        jButton_Add = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Product = new javax.swing.JTable();
        jButton_Generate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton_Search = new javax.swing.JButton();
        jText_Search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROD_ID");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PROD_NAME");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PROD_CODE");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PROD_PRICE");

        jText_ProdNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_ProdNAMEActionPerformed(evt);
            }
        });

        jButton_Add.setText("ADD");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jButton_Update.setText("UPDATE");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Cancel.setText("CANCEL");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        jTable_Product.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_Product);

        jButton_Generate.setText("GENERATE");
        jButton_Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GenerateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("STORAGE DATA");

        jButton_Search.setText("SEARCH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(116, 116, 116))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton_Update)
                                .addGap(58, 58, 58)
                                .addComponent(jButton_Cancel)
                                .addGap(57, 57, 57)
                                .addComponent(jButton_Generate))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jText_ProdID, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(jText_ProdNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(177, 177, 177)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(jText_ProdCODE, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jText_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jText_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton_Search))))
                        .addContainerGap(19, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_ProdCODE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_ProdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_ProdNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Search)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jText_Search)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add)
                    .addComponent(jButton_Cancel)
                    .addComponent(jButton_Update)
                    .addComponent(jButton_Generate))
                .addContainerGap(26, Short.MAX_VALUE))
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

    private void jText_ProdNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_ProdNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_ProdNAMEActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        Add();
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GenerateActionPerformed
        Generate();
    }//GEN-LAST:event_jButton_GenerateActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        Update();
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        Cancel();
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

    public void itemTable() {
        String[] columnNames = {"PRODUCT ID", "PRODUCT CODE", "PRODUCT NAME", "PRODUCT PRICE"};
        jTable_Product = new javax.swing.JTable(tableModel);
        jTable_Product.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable_Product.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable_Product.setShowGrid(true);
        jTable_Product.setFillsViewportHeight(true);
        jTable_Product.getTableHeader().setReorderingAllowed(false);
        jTable_Product.setRowSelectionAllowed(true);
        jTable_Product.setBackground(Color.getHSBColor(180, 244, 217));
        jTable_Product.setFont(new java.awt.Font("Tahoma", 0, 12));
        jScrollPane1.setViewportView(jTable_Product);
        JTableHeader header = jTable_Product.getTableHeader();
        header.setFont(new java.awt.Font("Tahoma", 1, 12));
        header.setBackground(Color.WHITE);
        header.setResizingAllowed(false);
        header.setPreferredSize(new Dimension(header.WIDTH, 30));
        for (int i = 0; i < columnNames.length;) {
            tableModel.addColumn(columnNames[i]);
            i++;
        }
        TableColumn[] column = new TableColumn[7];
        column[0] = jTable_Product.getColumnModel().getColumn(0);
        column[0].setPreferredWidth(40);
        column[1] = jTable_Product.getColumnModel().getColumn(1);
        column[1].setPreferredWidth(40);
        column[2] = jTable_Product.getColumnModel().getColumn(2);
        column[2].setPreferredWidth(50);
        column[3] = jTable_Product.getColumnModel().getColumn(3);
        column[3].setPreferredWidth(50);

    }

    private void itemdata() {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("MDSPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            Vector row = new Vector();

            try {
                Query query = em.createNamedQuery("Product.findAll", Product.class);
                List<Product> memberList = query.getResultList();

                for (Product m : memberList) {

                    Vector column = new Vector();
                    column.add(m.getProductPK().getProdId());
                    column.add(m.getProductPK().getProdCode());
                    column.add(m.getProdName());
                    column.add(m.getProdPrice());

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

    private void Add() {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("MDSPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            Vector row = new Vector();
            if (jText_ProdID != null && jText_ProdCODE != null && jText_ProdNAME != null
                    && jText_Price != null) {

                try {
                    Product author = new Product();
                    author.setProdName(jText_ProdNAME.getText());
                    author.setProdPrice(jText_Price.getText());
                    ProductPK product = new ProductPK(jText_ProdID.getText(), jText_ProdCODE.getText());
                    author.setProductPK(product);
                    em.persist(author);
                    em.getTransaction().commit();
                    JOptionPane.showMessageDialog(null, "Data Successfully added", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                    //Cancel();
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

    private void Update() {

        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("MDSPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            Vector row = new Vector();
            if (jText_ProdID != null && jText_ProdNAME != null && jText_ProdCODE != null && jText_Price != null) {
                try {
                    String update = (jText_ProdID.getText().trim());
                  
                      Product author = new Product();
                        author.setProdName(jText_ProdNAME.getText());
                        author.setProdPrice(jText_Price.getText());
                        ProductPK product = new ProductPK(jText_ProdID.getText().toString(), jText_ProdCODE.getText().toString());
                        author.setProductPK(product);

                        em.merge(author);
                        em.getTransaction().commit();
                        JOptionPane.showMessageDialog(null, "DATA SUCCESSFULLY UPDATED", "INFORMATION",
                                JOptionPane.INFORMATION_MESSAGE);
                        itemdata();
                        Cancel();
                    

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    em.close();
                    emf.close();
                }
            } else {

                JOptionPane.showMessageDialog(null, "Please Fill Up The TextField/s or Combo Box", "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void Generate() {
        MessageFormat header = new MessageFormat("MEDICINE LIST IN STORAGE");
        MessageFormat footer = new MessageFormat("MEDICINE");

        try {
            jTable_Product.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (java.awt.print.PrinterException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void Cancel() {
        jText_ProdID.setText("");
        jText_ProdCODE.setText("");
        jText_ProdNAME.setText("");
        jText_Price.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Generate;
    private javax.swing.JButton jButton_Search;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Product;
    private javax.swing.JTextField jText_Price;
    private javax.swing.JTextField jText_ProdCODE;
    private javax.swing.JTextField jText_ProdID;
    private javax.swing.JTextField jText_ProdNAME;
    private javax.swing.JTextField jText_Search;
    // End of variables declaration//GEN-END:variables
}
