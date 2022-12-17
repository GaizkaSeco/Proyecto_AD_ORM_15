/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import consultas.ConsultasPiezas;
import consultas.ConsultasProveedores;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author omega
 */
public class PanelNuevaPieza extends javax.swing.JPanel {
    JPanel content = null;
    /**
     * Creates new form PanelNuevaPieza
     */
    public PanelNuevaPieza(JPanel content) {
        initComponents();
        this.content = content;
    }

    public void anadirPieza() {
        ConsultasPiezas con = new ConsultasPiezas();
        try {
            float precio = Float.parseFloat(precioField.getText());
            if (con.anadirPieza(codigoField.getText(), nombreField.getText(), precio, descripcionField.getText())) {
                PanelGestionPiezas frame = new PanelGestionPiezas(content);
                frame.setSize(830, 490);
                frame.setLocation(0, 0);
                content.removeAll();
                content.add(frame, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
            }
            con.cerrarConexion();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El precio debe ser escrito con con numeros");
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

        jLabel1 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        precioField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        descripcionField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        botonAnadir = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        codigoField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(830, 490));
        setPreferredSize(new java.awt.Dimension(830, 490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 70, 30));

        nombreField.setBackground(new java.awt.Color(204, 204, 204));
        nombreField.setForeground(new java.awt.Color(204, 204, 204));
        nombreField.setBorder(null);
        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });
        add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 350, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NUEVA PIEZA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 830, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 350, -1));

        precioField.setBackground(new java.awt.Color(204, 204, 204));
        precioField.setForeground(new java.awt.Color(204, 204, 204));
        precioField.setBorder(null);
        precioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioFieldActionPerformed(evt);
            }
        });
        add(precioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 350, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Precio: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 70, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 350, -1));

        descripcionField.setBackground(new java.awt.Color(204, 204, 204));
        descripcionField.setForeground(new java.awt.Color(204, 204, 204));
        descripcionField.setBorder(null);
        descripcionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionFieldActionPerformed(evt);
            }
        });
        add(descripcionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 330, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Descripcion: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 100, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 330, -1));

        botonAnadir.setBackground(new java.awt.Color(57, 57, 58));
        botonAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAnadirMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(219, 219, 219));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("AÑADIR PIEZA");

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

        add(botonAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 160, 50));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Codigo: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 70, 30));

        codigoField.setBackground(new java.awt.Color(204, 204, 204));
        codigoField.setForeground(new java.awt.Color(204, 204, 204));
        codigoField.setBorder(null);
        codigoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoFieldActionPerformed(evt);
            }
        });
        add(codigoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 350, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 350, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void precioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioFieldActionPerformed

    private void descripcionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionFieldActionPerformed

    private void codigoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoFieldActionPerformed

    private void botonAnadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnadirMousePressed
        if(codigoField.getText().isBlank() || nombreField.getText().isBlank() || precioField.getText().isBlank() || descripcionField.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos para poder añadir una pieza.");
        } else {
            anadirPieza();
        }
    }//GEN-LAST:event_botonAnadirMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonAnadir;
    private javax.swing.JTextField codigoField;
    private javax.swing.JTextField descripcionField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTextField precioField;
    // End of variables declaration//GEN-END:variables
}
