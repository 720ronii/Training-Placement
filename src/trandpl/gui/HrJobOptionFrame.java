/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

/**
 *
 * @author __roonit
 */
public class HrJobOptionFrame extends javax.swing.JFrame {

    /**
     * Creates new form HrJobOptionFrame
     */
    public HrJobOptionFrame() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAddNewJob = new javax.swing.JButton();
        btnRemovejob = new javax.swing.JButton();
        btneditjob = new javax.swing.JButton();
        btnsetQuiz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 980, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/istockphoto-1285196602-612x612.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 220, 180));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.new/removeJob.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 220, 190));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.new/editJob.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 240, 190));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.new/setQuiz.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 240, 230, 180));

        btnBack.setBackground(new java.awt.Color(173, 192, 234));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 100, -1));

        btnLogout.setBackground(new java.awt.Color(173, 192, 234));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 530, 100, -1));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblName.setText("Ronit");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 380, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Welcome");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 100, -1));

        btnAddNewJob.setText("ADD New Job");
        btnAddNewJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewJobActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddNewJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 130, 30));

        btnRemovejob.setText("Remove Job");
        btnRemovejob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovejobActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemovejob, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 130, 30));

        btneditjob.setText("Edit Job");
        btneditjob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditjobActionPerformed(evt);
            }
        });
        jPanel1.add(btneditjob, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 130, 30));

        btnsetQuiz.setText("Set Quiz");
        btnsetQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsetQuizActionPerformed(evt);
            }
        });
        jPanel1.add(btnsetQuiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new HrOptionFrame().setVisible(true);        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddNewJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewJobActionPerformed
        new HrAddNewJobFrame().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnAddNewJobActionPerformed

    private void btnRemovejobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovejobActionPerformed
        new AdminRemoveHrFrame().setVisible(true);
        this.dispose();
        // REMOVE HR

    }//GEN-LAST:event_btnRemovejobActionPerformed

    private void btneditjobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditjobActionPerformed
        new  AdminModifyHrFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btneditjobActionPerformed

    private void btnsetQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsetQuizActionPerformed
        // TODO add your handling code here:
        new AdminViewAllHrFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsetQuizActionPerformed

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
            java.util.logging.Logger.getLogger(HrJobOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrJobOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrJobOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrJobOptionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrJobOptionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewJob;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRemovejob;
    private javax.swing.JButton btneditjob;
    private javax.swing.JButton btnsetQuiz;
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