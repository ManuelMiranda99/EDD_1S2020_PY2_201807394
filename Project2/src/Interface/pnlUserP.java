/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package Interface;

import javax.swing.JFrame;
import project2.Project2;

/**
 *
 * @author manuel
 */
public class pnlUserP extends javax.swing.JPanel {
    
    
    JFrame frame = new JFrame();
    /**
     * Creates new form pnlUserP
     */
    public pnlUserP(JFrame frame) {
        initComponents();
        
        this.frame = frame;
        
        this.txtID.setText(String.valueOf(Project2.actualUser.getId()));
        this.txtName.setText(Project2.actualUser.getName());
        this.txtLastName.setText(Project2.actualUser.getLastName());
        this.txtCareer.setText(Project2.actualUser.getCareer());
        this.txtPass.setText(Project2.actualUser.getPassword());
        this.txtPassShow.setText(Project2.actualUser.getPassword());
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
        jLabel8 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCareer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnShow = new javax.swing.JButton();
        txtPassShow = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CARNET:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 140, 20));

        txtID.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtID.setEnabled(false);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 480, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("NOMBRE:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 140, 20));

        txtName.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 230, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("APELLIDO:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 130, 20));

        txtLastName.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 230, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CARRERA:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 140, 20));

        txtCareer.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jPanel1.add(txtCareer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 480, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Contraseña:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 140, 20));

        txtPass.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 410, 40));

        btnShow.setBackground(new java.awt.Color(255, 255, 255));
        btnShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/show (1).png"))); // NOI18N
        btnShow.setBorderPainted(false);
        btnShow.setOpaque(false);
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });
        jPanel1.add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 70, 40));

        txtPassShow.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jPanel1.add(txtPassShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 410, 40));

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("ELIMINAR");
        btnDelete.setBorderPainted(false);
        btnDelete.setFocusPainted(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 280, 50));

        btnEdit.setBackground(new java.awt.Color(55, 224, 76));
        btnEdit.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDITAR");
        btnEdit.setBorderPainted(false);
        btnEdit.setFocusPainted(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 280, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("USUARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 200, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user (3).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));
    }// </editor-fold>//GEN-END:initComponents

    private int count = 0;
    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed

        if(count == 0){
            count++;
            txtPassShow.setText(txtPass.getText());
            txtPass.setVisible(false);
            txtPassShow.setVisible(true);
        }
        else{
            count = 0;
            txtPass.setText(txtPassShow.getText());
            txtPass.setVisible(true);
            txtPassShow.setVisible(false);
        }

    }//GEN-LAST:event_btnShowActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        String name = txtName.getText();
        String last = txtLastName.getText();
        String career = txtCareer.getText();
        String pass = txtPass.getText();                
        if(count != 0)
            pass = txtPassShow.getText();
        
        Project2.hashTable.EditUser(Project2.actualUser.getId(), name, last, career, pass);
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        Project2.hashTable.DeleteNode(Project2.actualUser.getId());        
        Project2.actualUser = null;
        
        frame.dispose();
        
        Login l = new Login();
        l.show();
        
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCareer;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPassShow;
    // End of variables declaration//GEN-END:variables
}
