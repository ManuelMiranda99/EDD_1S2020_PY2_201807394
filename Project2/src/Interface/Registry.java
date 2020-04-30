/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package Interface;

import Objects.User;
import static project2.Project2.hashTable;

/**
 *
 * @author manuel
 */
public class Registry extends javax.swing.JFrame {

    /**
     * Creates new form Registry
     */
    public Registry() {
        initComponents();        
        this.setContentPane(this.jPanel1);
        txtPassShow.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        btnClose1 = new javax.swing.JButton();
        btnServer = new javax.swing.JButton();
        pnlLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRegistry = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCareer = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPassShow = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        btnShow = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1116, 634));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 80, 60));

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
        jPanel1.add(btnServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 60));

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("REGISTRO");
        pnlLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        txtLastName.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pnlLogin.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 180, 40));

        txtPass.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pnlLogin.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 290, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("APELLIDO:");
        pnlLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 140, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Contraseña:");
        pnlLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 140, 20));

        txtRegistry.setBackground(new java.awt.Color(55, 224, 76));
        txtRegistry.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtRegistry.setForeground(new java.awt.Color(255, 255, 255));
        txtRegistry.setText("REGISTRAR");
        txtRegistry.setBorderPainted(false);
        txtRegistry.setFocusPainted(false);
        txtRegistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistryActionPerformed(evt);
            }
        });
        pnlLogin.add(txtRegistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 360, 50));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CARRERA:");
        pnlLogin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 140, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("NOMBRE:");
        pnlLogin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, 20));

        txtCareer.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pnlLogin.add(txtCareer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 360, 40));

        txtName.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pnlLogin.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CARNET:");
        pnlLogin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 20));

        txtPassShow.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pnlLogin.add(txtPassShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 290, 40));

        txtID.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pnlLogin.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 360, 40));

        btnShow.setBackground(new java.awt.Color(255, 255, 255));
        btnShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/show (1).png"))); // NOI18N
        btnShow.setBorderPainted(false);
        btnShow.setOpaque(false);
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });
        pnlLogin.add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 70, 40));

        jPanel1.add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 430, 460));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/back (1).png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusPainted(false);
        btnBack.setFocusable(false);
        btnBack.setOpaque(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fondo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 660));

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
    }// </editor-fold>//GEN-END:initComponents

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnClose1ActionPerformed

    private void btnServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnServerActionPerformed

    private void txtRegistryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistryActionPerformed
        try {
            
            int id = Integer.parseInt(txtID.getText());
            String name = txtName.getText(), lastName = txtLastName.getText(), 
                   career = txtCareer.getText(), pass = txtPass.getText();
            if(id == 0 || "".equals(name) || "".equals(lastName) || 
               "".equals(career) || "".equals(pass)){
                System.out.println("Ingrese todos los datos");
                return;
            }
            if(count != 0)
                pass = txtPassShow.getText();
            
            hashTable.InsertNode(new User(id, name, lastName, career, pass));
            
        } catch (Exception e) {
            System.out.println("Carnet invalido");
        }
    }//GEN-LAST:event_txtRegistryActionPerformed

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Login l = new Login();
        this.dispose();
        
        l.show();
        
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(Registry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClose1;
    private javax.swing.JButton btnServer;
    private javax.swing.JButton btnShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtCareer;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPassShow;
    private javax.swing.JButton txtRegistry;
    // End of variables declaration//GEN-END:variables
}
