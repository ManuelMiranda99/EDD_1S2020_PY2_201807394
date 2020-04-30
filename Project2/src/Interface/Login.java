/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package Interface;

import Objects.JSONReader;
import static project2.Project2.hashTable;

/**
 *
 * @author manuel
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {        
        initComponents();        
        this.setContentPane(this.jPanel3);
        setLocationRelativeTo(null);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnServer = new javax.swing.JButton();
        btnClose1 = new javax.swing.JButton();
        pnlLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRegistry = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        btnLoadUsers = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 153));
        setUndecorated(true);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnServer.setBackground(new java.awt.Color(255, 255, 255));
        btnServer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/wifi (1).png"))); // NOI18N
        btnServer.setBorderPainted(false);
        btnServer.setContentAreaFilled(false);
        btnServer.setFocusPainted(false);
        btnServer.setRequestFocusEnabled(false);
        btnServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServerActionPerformed(evt);
            }
        });
        jPanel3.add(btnServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 60));

        btnClose1.setFont(new java.awt.Font("Laksaman", 1, 48)); // NOI18N
        btnClose1.setForeground(new java.awt.Color(255, 0, 0));
        btnClose1.setText("X");
        btnClose1.setBorder(null);
        btnClose1.setBorderPainted(false);
        btnClose1.setContentAreaFilled(false);
        btnClose1.setFocusPainted(false);
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 80, 60));

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LOGIN");
        pnlLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        txtPass.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pnlLogin.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 360, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CARNET:");
        pnlLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña:");
        pnlLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 140, 20));

        btnLogin.setBackground(new java.awt.Color(55, 224, 76));
        btnLogin.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("INGRESAR");
        btnLogin.setBorderPainted(false);
        btnLogin.setFocusPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 360, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("¿No cuentas con una cuenta? Créala");
        pnlLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        btnRegistry.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegistry.setForeground(new java.awt.Color(0, 102, 204));
        btnRegistry.setText("AQUÍ");
        btnRegistry.setBorderPainted(false);
        btnRegistry.setContentAreaFilled(false);
        btnRegistry.setFocusPainted(false);
        btnRegistry.setFocusable(false);
        btnRegistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistryActionPerformed(evt);
            }
        });
        pnlLogin.add(btnRegistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        txtID.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pnlLogin.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 360, 40));

        jPanel3.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 430, 460));

        btnLoadUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/download (1).png"))); // NOI18N
        btnLoadUsers.setBorderPainted(false);
        btnLoadUsers.setContentAreaFilled(false);
        btnLoadUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadUsersActionPerformed(evt);
            }
        });
        jPanel3.add(btnLoadUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 570, 80, 60));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fondo.jpg"))); // NOI18N
        jPanel3.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnClose1ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try{
            int id = Integer.parseInt(txtID.getText());
            String pass = txtPass.getText();

            if(hashTable.Login(id, pass)){
                // Succesful Login
                System.out.println("Succesful Login");
            }
            else{
                // Non existing user
                System.out.println("Login Error");
            }
        }
        catch(Exception e){
            System.out.println("Carnet invalido");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistryActionPerformed
        
        Registry re = new Registry();
        this.dispose();
        re.show();
        
    }//GEN-LAST:event_btnRegistryActionPerformed

    private void btnLoadUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadUsersActionPerformed
        
        JSONReader jr = new JSONReader();
        
        jr.ReadUserJSON();
        
    }//GEN-LAST:event_btnLoadUsersActionPerformed

    private void btnServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServerActionPerformed
        
    }//GEN-LAST:event_btnServerActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose1;
    private javax.swing.JButton btnLoadUsers;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistry;
    private javax.swing.JButton btnServer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
