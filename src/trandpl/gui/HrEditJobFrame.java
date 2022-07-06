/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import trandpl.dao.HrDAO;
import trandpl.dao.jobDAO;
import trandpl.pojo.jobPojo;

/**
 *
 * @author __roonit
 */
public class HrEditJobFrame extends javax.swing.JFrame {

    /**
     * Creates new form HrEditJobFrame
     */
    private jobPojo job;
    public HrEditJobFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    public HrEditJobFrame(jobPojo job){
        this();
        this.job=job;
        showJobDetails();
    }
    private void showJobDetails(){
        String CompanyName="";
        try{
            
            CompanyName =HrDAO.getCompanyNameByHrId(job.getHrId());
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error !","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            return;
        }
        lblJobId.setText(job.getJobId());
        txtJobTitle.setText(job.getTitle());
        txtCompanyName.setText(CompanyName);
        String []allskills=job.getTags().split(",");
        skills1.setText(allskills[0]);
        skills2.setText(allskills[1]);
        skills3.setText(allskills[2]);
        skills4.setText(allskills[3]);
        skills5.setText(allskills[4]);
        skills6.setText(allskills[5]);
        
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblJobId = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtJobTitle = new javax.swing.JTextField();
        txtCompanyName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        skills1 = new javax.swing.JTextField();
        skills3 = new javax.swing.JTextField();
        skills5 = new javax.swing.JTextField();
        skills6 = new javax.swing.JTextField();
        skills4 = new javax.swing.JTextField();
        skills2 = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 980, 140));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Welcome");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 100, -1));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblName.setText("Ronit");
        jPanel2.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 380, -1));

        lblJobId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblJobId.setText("Job-101");
        jPanel2.add(lblJobId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 120, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Job I'd:-");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Job Title:-");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 100, -1));

        txtJobTitle.setBackground(new java.awt.Color(173, 192, 234));
        txtJobTitle.setBorder(null);
        txtJobTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJobTitleActionPerformed(evt);
            }
        });
        jPanel2.add(txtJobTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 364, 310, 34));

        txtCompanyName.setBackground(new java.awt.Color(173, 192, 234));
        txtCompanyName.setBorder(null);
        jPanel2.add(txtCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 366, 312, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Company Name:-");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 180, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Skill's Required");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 140, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 780, 10));

        skills1.setBackground(new java.awt.Color(173, 192, 234));
        skills1.setBorder(null);
        skills1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skills1ActionPerformed(evt);
            }
        });
        jPanel2.add(skills1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 240, 32));

        skills3.setBackground(new java.awt.Color(173, 192, 234));
        skills3.setBorder(null);
        skills3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skills3ActionPerformed(evt);
            }
        });
        jPanel2.add(skills3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 240, 32));

        skills5.setBackground(new java.awt.Color(173, 192, 234));
        skills5.setBorder(null);
        skills5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skills5ActionPerformed(evt);
            }
        });
        jPanel2.add(skills5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 240, 32));

        skills6.setBackground(new java.awt.Color(173, 192, 234));
        skills6.setBorder(null);
        skills6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skills6ActionPerformed(evt);
            }
        });
        jPanel2.add(skills6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 240, 32));

        skills4.setBackground(new java.awt.Color(173, 192, 234));
        skills4.setBorder(null);
        skills4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skills4ActionPerformed(evt);
            }
        });
        jPanel2.add(skills4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 240, 32));

        skills2.setBackground(new java.awt.Color(173, 192, 234));
        skills2.setBorder(null);
        skills2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skills2ActionPerformed(evt);
            }
        });
        jPanel2.add(skills2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 240, 32));

        btnBack.setBackground(new java.awt.Color(173, 192, 234));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 100, -1));

        jButton1.setText("Save Job");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, 190, -1));

        btnLogout.setBackground(new java.awt.Color(173, 192, 234));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 600, 100, -1));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 1060, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJobTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJobTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJobTitleActionPerformed

    private void skills1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skills1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skills1ActionPerformed

    private void skills3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skills3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skills3ActionPerformed

    private void skills5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skills5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skills5ActionPerformed

    private void skills6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skills6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skills6ActionPerformed

    private void skills4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skills4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skills4ActionPerformed

    private void skills2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skills2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skills2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new HrChooseJobForEditingFrame().setVisible(true);        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed
    private boolean validateInputs(){
        if(txtJobTitle.getText().trim().isEmpty() || skills1.getText().trim().isEmpty() || skills2.getText().trim().isEmpty() || skills3.getText().trim().isEmpty() ||
                skills4.getText().trim().isEmpty() || skills5.getText().trim().isEmpty() || skills6.getText().trim().isEmpty() )
            return false;
        return true;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(!validateInputs()){
              JOptionPane.showMessageDialog(null,"All fields required !","Empty data !",JOptionPane.INFORMATION_MESSAGE);
              return ;
         }
         job.setTitle(txtJobTitle.getText().trim());
        job.setTags(skills1.getText().trim()+","+skills2.getText().trim()+","+skills3.getText().trim()
                +","+skills4.getText().trim()+","+skills5.getText().trim()+","+skills6.getText().trim());
        try{
            boolean result=jobDAO.editJobById(job);
                    if(result){
                            JOptionPane.showMessageDialog(null,"Job Successfully edited !","Success !",JOptionPane.INFORMATION_MESSAGE);
                            
                            return ;
                    }else{
                         JOptionPane.showMessageDialog(null,"Job not edited !","Editing failed !",JOptionPane.INFORMATION_MESSAGE);
                            return ;
                        
                    }
                    
        }catch (SQLException ex){
                 JOptionPane.showMessageDialog(null,"DB Error ","Error !",JOptionPane.ERROR_MESSAGE);
                 ex.printStackTrace();
                //return; 
            }
         
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new LoginFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(HrEditJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrEditJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrEditJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrEditJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrEditJobFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblJobId;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField skills1;
    private javax.swing.JTextField skills2;
    private javax.swing.JTextField skills3;
    private javax.swing.JTextField skills4;
    private javax.swing.JTextField skills5;
    private javax.swing.JTextField skills6;
    private javax.swing.JTextField txtCompanyName;
    private javax.swing.JTextField txtJobTitle;
    // End of variables declaration//GEN-END:variables
}