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
public class pnlReportsP extends javax.swing.JPanel {

    private JFrame frame = new JFrame();
    /**
     * Creates new form pnlReportsP
     */
    public pnlReportsP(JFrame frame) {
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

        lblImageReports = new javax.swing.JLabel();
        cmbReports = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnGenerate = new javax.swing.JButton();
        cmbCategories = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImageReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imgtry.png"))); // NOI18N
        add(lblImageReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 770, 500));

        cmbReports.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Árbol AVL de categorías", "Árbol B. Seleccione Categoría...", "Tabla de Usuarios", "Recorrido preorden AVL", "Recorrido inorden AVL", "Recorrido postorden AVL", "Lista enlazada de nodos de la red", "Blockchain de operaciones realizadas" }));
        add(cmbReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 300, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Categorías:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        btnGenerate.setBackground(new java.awt.Color(255, 255, 0));
        btnGenerate.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerate.setText("Generar");
        btnGenerate.setBorderPainted(false);
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });
        add(btnGenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 120, 40));

        cmbCategories.setEnabled(false);
        add(cmbCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 270, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Seleccione Reporte a Mostrar:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        
        if(cmbCategories.isEnabled()){
            int index = this.cmbReports.getSelectedIndex();
            cmbCategories.setEnabled(false);
            switch(index){
                case 0:
                    Project2.avl.GenerateTree();
                    // Put in label                
                    Project2.gGenerator.PutInLabel(lblImageReports);
                    break;
                case 1:
                    cmbCategories.setEnabled(true);
                    
                    Project2.avl.SearchCategory(cmbCategories.getSelectedItem().toString()).getBooks().GenerateTree();

                    Project2.gGenerator.PutInLabel(lblImageReports);
                    
                    break;
                case 2:
                    Project2.hashTable.GenerateTable();                
                    // Put in label
                    Project2.gGenerator.PutInLabel(lblImageReports);
                    break;
                case 3:
                    Project2.avl.PreOrderReport();
                    Project2.gGenerator.PutInLabel(lblImageReports);
                    break;
                case 4:
                    Project2.avl.InOrderReport();
                    Project2.gGenerator.PutInLabel(lblImageReports);
                    break;
                case 5:
                    Project2.avl.PostOrderReport();
                    Project2.gGenerator.PutInLabel(lblImageReports);
                    break;
                case 6:

                    break;
                case 7:

                    break;
                default:
                    System.out.println("Que leches");
                    break;
            }
        }else{            
            int index = this.cmbReports.getSelectedIndex();
            switch(index){
                case 0:
                    Project2.avl.GenerateTree();
                    // Put in label                
                    Project2.gGenerator.PutInLabel(lblImageReports);
                    break;
                case 1:
                    cmbCategories.setEnabled(true);

                    Project2.avl.FillComboBox(cmbCategories);

                    break;
                case 2:
                    Project2.hashTable.GenerateTable();                
                    // Put in label
                    Project2.gGenerator.PutInLabel(lblImageReports);
                    break;
                case 3:
                    Project2.avl.PreOrderReport();
                    Project2.gGenerator.PutInLabel(lblImageReports);
                    break;
                case 4:
                    Project2.avl.InOrderReport();
                    Project2.gGenerator.PutInLabel(lblImageReports);
                    break;
                case 5:
                    Project2.avl.PostOrderReport();
                    Project2.gGenerator.PutInLabel(lblImageReports);
                    break;
                case 6:

                    break;
                case 7:

                    break;
                default:
                    System.out.println("Que leches");
                    break;
            }
        }                
        
    }//GEN-LAST:event_btnGenerateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerate;
    private javax.swing.JComboBox<String> cmbCategories;
    private javax.swing.JComboBox<String> cmbReports;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblImageReports;
    // End of variables declaration//GEN-END:variables
}
