/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss;

import java.sql.ResultSet;
import javax.swing.JFrame;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author HP
 */
public class editCaseWorker extends javax.swing.JFrame {

    /**
     * Creates new form editCaseWorker
     */
    String a="";
    public editCaseWorker() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cswtable = new javax.swing.JTable();
        backbtn = new javax.swing.JButton();
        benifitcbx = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        housingcbx = new javax.swing.JCheckBox();
        firstnamefld = new javax.swing.JTextField();
        lastnamefld = new javax.swing.JTextField();
        emailfld = new javax.swing.JTextField();
        contactfld = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        employmentcbx = new javax.swing.JCheckBox();
        debtcbx = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("To edit a case worker details,click on a caseworker from the table below and edit the desired details below the table ");

        cswtable.setModel(new javax.swing.table.DefaultTableModel(
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
        cswtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cswtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cswtable);

        backbtn.setText("Main Menue");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        benifitcbx.setText("benifit");
        benifitcbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benifitcbxActionPerformed(evt);
            }
        });

        jLabel2.setText("FirstName");

        jLabel3.setText("Last Name");

        jLabel4.setText("Email");

        jLabel5.setText("Contact");

        jLabel6.setText("Category");

        housingcbx.setText("housing");
        housingcbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                housingcbxActionPerformed(evt);
            }
        });

        firstnamefld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstnamefldMouseClicked(evt);
            }
        });
        firstnamefld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnamefldActionPerformed(evt);
            }
        });

        lastnamefld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastnamefldMouseClicked(evt);
            }
        });

        emailfld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailfldMouseClicked(evt);
            }
        });
        emailfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailfldActionPerformed(evt);
            }
        });

        contactfld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactfldMouseClicked(evt);
            }
        });
        contactfld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactfldActionPerformed(evt);
            }
        });

        jButton1.setText("Save Changes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        employmentcbx.setText("employment");
        employmentcbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employmentcbxActionPerformed(evt);
            }
        });

        debtcbx.setText("debt");
        debtcbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debtcbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addComponent(backbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(benifitcbx))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(employmentcbx)
                                .addGap(9, 9, 9)
                                .addComponent(housingcbx)
                                .addGap(18, 18, 18)
                                .addComponent(debtcbx))))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(firstnamefld, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(emailfld, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(contactfld, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(lastnamefld, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backbtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnamefld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lastnamefld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(contactfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(housingcbx)
                    .addComponent(debtcbx)
                    .addComponent(benifitcbx)
                    .addComponent(employmentcbx))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(88, 88, 88)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
         MainMenue M = new MainMenue();
        this.dispose();
        M.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void benifitcbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benifitcbxActionPerformed
        // TODO add your handling code here:
        if(benifitcbx.isSelected()){a=a+benifitcbx.getText();
            System.out.println("4"+a);}else{a=a.replaceAll("benifit","" );
            System.out.println(a);}
    }//GEN-LAST:event_benifitcbxActionPerformed

    private void housingcbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_housingcbxActionPerformed
        // TODO add your handling code here:
        if(housingcbx.isSelected()){a=a+housingcbx.getText();
            System.out.println("2"+a);}
        else{
            a=a.replaceAll("housing","" );
            System.out.println(a);
        }
    }//GEN-LAST:event_housingcbxActionPerformed

    private void firstnamefldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstnamefldMouseClicked
        // TODO add your handling code here:
        firstnamefld.setText("");
    }//GEN-LAST:event_firstnamefldMouseClicked

    private void firstnamefldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnamefldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnamefldActionPerformed

    private void lastnamefldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastnamefldMouseClicked
        // TODO add your handling code here:
        lastnamefld.setText("");
    }//GEN-LAST:event_lastnamefldMouseClicked

    private void emailfldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailfldMouseClicked
        // TODO add your handling code here:
        emailfld.setText("");
    }//GEN-LAST:event_emailfldMouseClicked

    private void emailfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailfldActionPerformed

    private void contactfldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactfldMouseClicked
        // TODO add your handling code here:
        contactfld.setText("");
    }//GEN-LAST:event_contactfldMouseClicked

    private void contactfldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactfldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactfldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        CaseWorker csw=new CaseWorker();
        rssDatabase rssdb = new rssDatabase();
         Integer row= cswtable.getSelectedRow();
         Integer id=Integer.parseInt(cswtable.getModel().getValueAt(row, 0).toString());
        csw.setId(id);
        csw.setFirstName(firstnamefld.getText());
        csw.setLastName(lastnamefld.getText());
        csw.setEmail(emailfld.getText());
        int contact = Integer.parseInt(contactfld.getText());
        csw.setContact(contact);
        csw.setCategory(a);
        rssdb.updateCaseWorker(csw);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void employmentcbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employmentcbxActionPerformed
        // TODO add your handling code here:
        if(employmentcbx.isSelected()){
            a=a+employmentcbx.getText();
           }
        else{
            a=a.replaceAll("employment","" );
            }
    }//GEN-LAST:event_employmentcbxActionPerformed

    private void debtcbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debtcbxActionPerformed
        // TODO add your handling code here:
        if (debtcbx.isSelected()) {
            a = a + debtcbx.getText();
        } else {
            a = a.replaceAll("debt", "");
        }

    }//GEN-LAST:event_debtcbxActionPerformed

    private void cswtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cswtableMouseClicked
       Integer row= cswtable.getSelectedRow();
       firstnamefld.setText(cswtable.getModel().getValueAt(row, 1).toString());
       lastnamefld.setText(cswtable.getModel().getValueAt(row, 2).toString());
       emailfld.setText(cswtable.getModel().getValueAt(row, 3).toString());
       contactfld.setText(cswtable.getModel().getValueAt(row, 4).toString());
        if (cswtable.getModel().getValueAt(row, 5).toString().contains("housing")) {
            housingcbx.setSelected(true);
        }
        if (cswtable.getModel().getValueAt(row, 5).toString().contains("debt")) {
            debtcbx.setSelected(true);

        }
        if (cswtable.getModel().getValueAt(row, 5).toString().contains("employment")) {
            employmentcbx.setSelected(true);
        }
        if (cswtable.getModel().getValueAt(row, 5).toString().contains("benifit")) {
            benifitcbx.setSelected(true);

        }
       
    }//GEN-LAST:event_cswtableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(editCaseWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editCaseWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editCaseWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editCaseWorker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editCaseWorker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JCheckBox benifitcbx;
    private javax.swing.JTextField contactfld;
    public javax.swing.JTable cswtable;
    private javax.swing.JCheckBox debtcbx;
    private javax.swing.JTextField emailfld;
    private javax.swing.JCheckBox employmentcbx;
    private javax.swing.JTextField firstnamefld;
    private javax.swing.JCheckBox housingcbx;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lastnamefld;
    // End of variables declaration//GEN-END:variables
}
