/*
----------------------------JAVA----------------------------

Code made by: Angel Manuel Miranda Asturias
Done on: 2020

This program is free software: you can redistribute it or modify

Use it as you like and have fun reading it ^^

------------------------------------------------------------
 */
package Interface;

import Objects.Category;
import javax.swing.JFrame;
import project2.Project2;

/**
 *
 * @author manuel
 */
public class pnlCategoryP extends javax.swing.JPanel {

    private JFrame frame = new JFrame();
    /**
     * Creates new form pnlCategoryP
     */
    public pnlCategoryP(JFrame frame) {
        initComponents();
        this.frame = frame;
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
        pnlCreate = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        txtCategory = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pnlDelete = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCategoryDelete = new javax.swing.JTextField();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCreate.setOpaque(false);
        pnlCreate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CATEGORÍA");
        pnlCreate.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CATEGORÍA:");
        pnlCreate.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        btnCreate.setBackground(new java.awt.Color(55, 224, 76));
        btnCreate.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("CREAR");
        btnCreate.setBorderPainted(false);
        btnCreate.setFocusPainted(false);
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        pnlCreate.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 310, 50));

        txtCategory.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pnlCreate.add(txtCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 340, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CREAR");
        pnlCreate.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        jPanel1.add(pnlCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 380, 300));

        pnlDelete.setOpaque(false);
        pnlDelete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnlDelete.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 280, 50));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("CATEGORÍA");
        pnlDelete.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 240, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ELIMINAR");
        pnlDelete.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 200, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("CATEGORÍA:");
        pnlDelete.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtCategoryDelete.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        pnlDelete.add(txtCategoryDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 340, 40));

        jPanel1.add(pnlDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 370, 300));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 780, 340));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String category = txtCategoryDelete.getText();
        if(category.equals("")){
            // Not accepted category
        }
        else{
            if(Project2.avl.SearchCategory(category) != null){
                Project2.avl.DeleteCategory(category, Project2.actualUser.getId());
                txtCategoryDelete.setText("");
            }
            else{
                // Not existing category
            }
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        String category = txtCategory.getText();
        if(category.equals("")){
            // Not accepted category
        }
        else{
            if(Project2.avl.SearchCategory(category) != null){
                // Existing category
            }
            else{
                Project2.avl.AddCategory(new Category(category, Project2.actualUser.getId()));
                txtCategory.setText("");
            }
            
        }
        
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlCreate;
    private javax.swing.JPanel pnlDelete;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtCategoryDelete;
    // End of variables declaration//GEN-END:variables
}
