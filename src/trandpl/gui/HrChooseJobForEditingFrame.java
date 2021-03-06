/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.gui;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import trandpl.dao.jobDAO;
import trandpl.pojo.CurrentUsers;
import trandpl.pojo.jobPojo;

/**
 *
 * @author __roonit
 */
public class HrChooseJobForEditingFrame extends javax.swing.JFrame {

    /**
     * Creates new form HrChooseJobForEditingFrame
     */
    DefaultTableModel model;
    public HrChooseJobForEditingFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblName.setText(CurrentUsers.getName());
         model=(DefaultTableModel)tblAllJobs.getModel();
        loadJobDetails();
       
        
    }
    public void loadJobDetails(){
        try{
            List <jobPojo> allJobsList=jobDAO.getAllActiveJobByCurrentHr(CurrentUsers.getId());
            for(jobPojo job:allJobsList){
                Vector<String> row=new Vector<>();
                row.add(job.getJobId());
                row.add(job.getTitle());
                row.add(job.getTags());
                row.add(String.valueOf(job.getStatus()));
                model.addRow(row);
            }
            if(allJobsList.isEmpty()){
                JOptionPane.showMessageDialog(null,"No editable job Present ","Editable job not present ",JOptionPane.ERROR_MESSAGE);
                
            }
                    
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"DB Error !","Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnBack = new javax.swing.JButton();
        btnEditJob = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllJobs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 246, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(243, 246, 254));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblName.setText("Ronit");
        jPanel2.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 380, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Welcome");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 100, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/World-Map.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 980, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transparent logo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Remove Job...");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.new/removeJob.png"))); // NOI18N
        jLabel3.setText("Remove Job...");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 230));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 1060, 10));

        btnBack.setBackground(new java.awt.Color(173, 192, 234));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 100, -1));

        btnEditJob.setText("Edit Job");
        btnEditJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditJobActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditJob, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 190, -1));

        btnLogout.setBackground(new java.awt.Color(173, 192, 234));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 560, 100, -1));

        tblAllJobs.setBackground(new java.awt.Color(173, 192, 234));
        tblAllJobs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job-Id", "Job Title", "Skills", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAllJobs);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 730, 270));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new HrOptionFrame().setVisible(true);        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditJobActionPerformed
            int row=tblAllJobs.getSelectedRow();
            if(row==-1){
                JOptionPane.showMessageDialog(null,"Please select the row first ","Not selected ! ",JOptionPane.ERROR_MESSAGE);
                return;
            }
            jobPojo job=new jobPojo();
            job.setJobId(tblAllJobs.getValueAt(row, 0).toString().trim());
            job.setTitle(tblAllJobs.getValueAt(row, 1).toString().trim());
            job.setTags(tblAllJobs.getValueAt(row, 2).toString().trim());
            job.setHrId(CurrentUsers.getId());
            job.setStatus(0);
            new HrEditJobFrame(job).setVisible(true);
            this.dispose();
            
            
    }//GEN-LAST:event_btnEditJobActionPerformed

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
            java.util.logging.Logger.getLogger(HrChooseJobForEditingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrChooseJobForEditingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrChooseJobForEditingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrChooseJobForEditingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrChooseJobForEditingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditJob;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblAllJobs;
    // End of variables declaration//GEN-END:variables
}
