/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import trandpl.dao.UsersDAO;
import trandpl.pojo.CurrentUsers;
import trandpl.pojo.HrPojo;

/**
 *
 * @author __roonit
 */
public class AdminModifyHrFrame extends javax.swing.JFrame {

        private Map<String, HrPojo> allHr;
        String Password;
        String confirmpass;
    public AdminModifyHrFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblName.setText(CurrentUsers.getName());
        
        allHr=new HashMap<>();
        loadHrDetails();
    }
    public void loadHrDetails(){
        try{
            allHr=UsersDAO.getAllHrList();
            Set<String> key=allHr.keySet();
            for(String userid:key){
                jcAllUserId.addItem(userid);           
            } 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error in DB","DB Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            
        }
        
    }
    public int validatePassword(){
        char []pass=jpass.getPassword();
        char []cfrnpass=jcfrmpass.getPassword();
        Password=String.valueOf(pass);
        confirmpass=String.valueOf(cfrnpass);      
        if(pass.length>4){
            if(Password.equals(cfrnpass)){
                return 1;
            }
            return 0;
        }else{
            return -1;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnmodifyallHr = new javax.swing.JButton();
        jcAllUserId = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtHrId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcfrmpass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jpass = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblHrName = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 980, 140));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Welcome");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 100, -1));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblName.setText("Ronit");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 380, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modify-emp.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 170, 160));

        jButton1.setBackground(new java.awt.Color(173, 192, 234));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 100, -1));

        jButton2.setBackground(new java.awt.Color(173, 192, 234));
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 500, 100, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 1050, 10));

        btnmodifyallHr.setBackground(new java.awt.Color(173, 192, 234));
        btnmodifyallHr.setText("Modify Changes Of HR");
        btnmodifyallHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifyallHrActionPerformed(evt);
            }
        });
        jPanel1.add(btnmodifyallHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 190, -1));

        jcAllUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAllUserIdActionPerformed(evt);
            }
        });
        jPanel1.add(jcAllUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 310, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("User's id:-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        txtHrId.setBackground(new java.awt.Color(173, 192, 234));
        txtHrId.setBorder(null);
        txtHrId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHrIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtHrId, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 265, 310, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 340, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Hr id:-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, -1, -1));

        jcfrmpass.setBackground(new java.awt.Color(173, 192, 234));
        jcfrmpass.setBorder(null);
        jcfrmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcfrmpassActionPerformed(evt);
            }
        });
        jPanel1.add(jcfrmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 425, 310, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, -1, -1));

        jpass.setBackground(new java.awt.Color(173, 192, 234));
        jpass.setBorder(null);
        jpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassActionPerformed(evt);
            }
        });
        jPanel1.add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 425, 310, 32));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/TextFieldPic.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Confirm password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        lblHrName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHrName.setText("HR Name");
        jPanel1.add(lblHrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 300, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("HR Name:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1070, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmodifyallHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifyallHrActionPerformed
        
        int x=validatePassword();
        System.out.println(x);
        if(x==1){
            
            // call methode to update passowrd
        }else if(x==0){
                JOptionPane.showMessageDialog(null,"Password and confirm password should be equals !","Error",JOptionPane.ERROR_MESSAGE);
                
        }else if(x==-1){
            JOptionPane.showMessageDialog(null,"Password length should be greater than 4 char !","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnmodifyallHrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            new AdminHrModuleFrame().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            new LoginFrame().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jcfrmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcfrmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcfrmpassActionPerformed

    private void txtHrIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHrIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHrIdActionPerformed

    private void jcAllUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAllUserIdActionPerformed
        
        String userId=(String)jcAllUserId.getSelectedItem();
        HrPojo hr=allHr.get(userId);
        txtHrId.setText(hr.getHrId());
        lblHrName.setText(hr.getHrName());
        
        
    }//GEN-LAST:event_jcAllUserIdActionPerformed

    private void jpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassActionPerformed

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
            java.util.logging.Logger.getLogger(AdminModifyHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminModifyHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminModifyHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminModifyHrFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminModifyHrFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmodifyallHr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox<String> jcAllUserId;
    private javax.swing.JPasswordField jcfrmpass;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JLabel lblHrName;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtHrId;
    // End of variables declaration//GEN-END:variables
}