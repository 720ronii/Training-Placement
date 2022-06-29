 
package trandpl.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import trandpl.dao.UsersDAO;
import trandpl.pojo.CurrentUsers;
import trandpl.pojo.UsersPojo;

public class LoginFrame extends javax.swing.JFrame {
    
    
    private String userId;
    private String password;

    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public boolean validateInputs(){
        userId=txtMail.getText().trim();
        char []pwd=txtPwd.getPassword();
        
        if(userId.isEmpty()|| pwd.length==0)    
        {
            txtMail.setText("");
             txtPwd.setText("");
             return false;
        }
        password=String.valueOf(pwd);
        return true;
    }
    public String validateUserType(){ 
        
        if(jrbAdmin.isSelected())
            return "Admin";
        else if(jrbHR.isSelected()){
            System.out.println("Hr selected");
            return "Hr";
        }     
        else if(jrbStudent.isSelected())
            return "Student";
        
    return    null;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jrbStudent = new javax.swing.JRadioButton();
        jrbHR = new javax.swing.JRadioButton();
        btnSignup = new javax.swing.JButton();
        txtMail = new javax.swing.JTextField();
        jrbAdmin = new javax.swing.JRadioButton();
        txtPwd = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrbStudent.setText("Student");
        jrbStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbStudentActionPerformed(evt);
            }
        });
        jPanel1.add(jrbStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 70, 20));

        jrbHR.setText("Company HR");
        jrbHR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbHRActionPerformed(evt);
            }
        });
        jPanel1.add(jrbHR, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        btnSignup.setBackground(new java.awt.Color(173, 192, 234));
        btnSignup.setText("Signup");
        btnSignup.setBorder(null);
        btnSignup.setOpaque(false);
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 150, 30));

        txtMail.setBackground(new java.awt.Color(173, 192, 234));
        txtMail.setBorder(null);
        txtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailActionPerformed(evt);
            }
        });
        jPanel1.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 410, 30));

        jrbAdmin.setText("  Admin");
        jrbAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAdminActionPerformed(evt);
            }
        });
        jPanel1.add(jrbAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        txtPwd.setBackground(new java.awt.Color(173, 192, 234));
        txtPwd.setBorder(null);
        txtPwd.setOpaque(false);
        txtPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPwdActionPerformed(evt);
            }
        });
        jPanel1.add(txtPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 410, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_1147698449.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 440, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tg_image_1147698449.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 440, 30));

        jSeparator1.setBackground(new java.awt.Color(239, 245, 251));
        jSeparator1.setOpaque(true);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 420, 10));

        jSeparator2.setBackground(new java.awt.Color(239, 245, 251));
        jSeparator2.setOpaque(true);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 420, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homePage.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 690, 380));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Email or User Id:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        btnLogin.setBackground(new java.awt.Color(173, 192, 234));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.setOpaque(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 150, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Select User Type:-");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Password:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        
        
        
         
    }//GEN-LAST:event_btnSignupActionPerformed

    private void jrbStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbStudentActionPerformed

    private void jrbHRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbHRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbHRActionPerformed

    private void jrbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbAdminActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
            
        if(validateInputs()==false){
            JOptionPane.showMessageDialog(null,"Please provide all inputs.","Error !",JOptionPane.ERROR_MESSAGE);
            
            return;
        }
        String type=validateUserType();
        if(type==null)
        {
            JOptionPane.showMessageDialog(null,"Please select User type.","Error !",JOptionPane.ERROR_MESSAGE);
             
            return;
        }
        UsersPojo user=new UsersPojo();
             user.setId(userId.toUpperCase());
             user.setPassword(password);
             user.setType(type);
             try{
                 boolean result=UsersDAO.validateUser(user);
                 if(result)
                 {
                        if(CurrentUsers.getType().equals("Admin")){
                            JOptionPane.showMessageDialog(null,"Welcome "+CurrentUsers.getName(),"Success",JOptionPane.INFORMATION_MESSAGE);
                            new AdminOptionsFrame().setVisible(result);
                            this.dispose();
                        } else if(CurrentUsers.getType().equals("Hr")){
                            
                            JOptionPane.showMessageDialog(null,"Welcome HR MODULE"+CurrentUsers.getName(),"Success",JOptionPane.INFORMATION_MESSAGE);
                            new AdminOptionsFrame().setVisible(result);
                            this.dispose();
                        }
                        else{
                            // COde to open student module
                        }
                 }else{
                     JOptionPane.showMessageDialog(null,"Invalid userID-Password or UserType","Error",JOptionPane.ERROR_MESSAGE);
                     return;
                 }
             }catch(SQLException ex){
                 JOptionPane.showMessageDialog(null,"DB Error","Error",JOptionPane.ERROR_MESSAGE);
                 ex.printStackTrace();
                // return;   
             }
        
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPwdActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton jrbAdmin;
    private javax.swing.JRadioButton jrbHR;
    private javax.swing.JRadioButton jrbStudent;
    private javax.swing.JTextField txtMail;
    private javax.swing.JPasswordField txtPwd;
    // End of variables declaration//GEN-END:variables
}
