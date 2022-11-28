/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import javax.swing.JOptionPane;

/**
 *
 * @author 9FDAM09
 */
public class PanelNuevoProveedor extends javax.swing.JPanel {

    /**
     * Creates new form NuevoProveedor
     */
    public PanelNuevoProveedor() {
        initComponents();
    }
    
    public void anadirProveedor() {
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        apellidoField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        descripccionField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        botonAnadir = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(142, 105, 149));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 70, 30));

        nombreField.setBackground(new java.awt.Color(142, 105, 149));
        nombreField.setForeground(new java.awt.Color(204, 204, 204));
        nombreField.setBorder(null);
        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });
        add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 350, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NUEVO PROVEEDOR");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 830, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 350, -1));

        apellidoField.setBackground(new java.awt.Color(142, 105, 149));
        apellidoField.setForeground(new java.awt.Color(204, 204, 204));
        apellidoField.setBorder(null);
        apellidoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoFieldActionPerformed(evt);
            }
        });
        add(apellidoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 350, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 70, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 350, -1));

        descripccionField.setBackground(new java.awt.Color(142, 105, 149));
        descripccionField.setForeground(new java.awt.Color(204, 204, 204));
        descripccionField.setBorder(null);
        descripccionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripccionFieldActionPerformed(evt);
            }
        });
        add(descripccionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 330, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Direcccion: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 100, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 330, -1));

        botonAnadir.setBackground(new java.awt.Color(198, 177, 201));
        botonAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAnadirMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("AÑADIR PROVEEDOR");

        javax.swing.GroupLayout botonAnadirLayout = new javax.swing.GroupLayout(botonAnadir);
        botonAnadir.setLayout(botonAnadirLayout);
        botonAnadirLayout.setHorizontalGroup(
            botonAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        botonAnadirLayout.setVerticalGroup(
            botonAnadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAnadirLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        add(botonAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 160, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void apellidoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoFieldActionPerformed

    private void descripccionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripccionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripccionFieldActionPerformed

    private void botonAnadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnadirMousePressed
        if (nombreField.getText().isBlank() || apellidoField.getText().isBlank() || descripccionField.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos para poder añadir un proveedor.");
        } else {
            anadirProveedor();
        }
    }//GEN-LAST:event_botonAnadirMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoField;
    private javax.swing.JPanel botonAnadir;
    private javax.swing.JTextField descripccionField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nombreField;
    // End of variables declaration//GEN-END:variables
}
