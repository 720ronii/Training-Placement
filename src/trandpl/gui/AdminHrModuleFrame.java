/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import trandpl.pojo.CurrentUsers;

/**
 *
 * @author __roonit
 */
public class AdminHrModuleFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminHrModuleFrame
     */
    public AdminHrModuleFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblName.setText(CurrentUsers.getName());
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRemoveHr = new javax.swing.JButton();
        btnModifyHr = new javax.swing.JButton();
        btnViewAllHr = new javax.swing.JButton();
        btnAddNewHr = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 980, 140));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblName.setText("Ronit");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 380, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Welcome");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 100, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/viewAllHr.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 190, 180));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modify-emp.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 190, 190));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Remove-Emp.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 190, 190));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addNewEmp.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 190, 190));

        btnRemoveHr.setText("Remove HR");
        btnRemoveHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveHrActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemoveHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 130, 30));

        btnModifyHr.setText("Modify HR");
        btnModifyHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyHrActionPerformed(evt);
            }
        });
        jPanel1.add(btnModifyHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 130, 30));

        btnViewAllHr.setText("View All HR");
        btnViewAllHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllHrActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewAllHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 430, 130, 30));

        btnAddNewHr.setText("Add New HR");
        btnAddNewHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewHrActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddNewHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 130, 30));

        btnBack.setBackground(new java.awt.Color(173, 192, 234));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 100, -1));

        btnLogout.setBackground(new java.awt.Color(173, 192, 234));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 500, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveHrActionPerformed
        new AdminRemoveHrFrame().setVisible(true);
        this.dispose();
        // REMOVE HR
        
    }//GEN-LAST:event_btnRemoveHrActionPerformed

    private void btnModifyHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyHrActionPerformed
                new  AdminModifyHrFrame().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btnModifyHrActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
            new AdminOptionsFrame().setVisible(true);        // TODO add your handling code here:
            this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewAllHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllHrActionPerformed
        // TODO add your handling code here:
        new AdminViewAllHrFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewAllHrActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
            new LoginFrame().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddNewHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewHrActionPerformed
                new AdminAddNewHrFrame().setVisible(true);
                this.dispose();
        
    }//GEN-LAST:event_btnAddNewHrActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHrModuleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHrModuleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHrModuleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHrModuleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHrModuleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewHr;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnModifyHr;
    private javax.swing.JButton btnRemoveHr;
    private javax.swing.JButton btnViewAllHr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
