/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import consultas.ConsultasPiezas;
import consultas.ConsultasProyectos;
import hibernate.PiezasEntity;
import hibernate.ProyectosEntity;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author omega
 */
public class PanelEditarPieza extends javax.swing.JPanel {
    JPanel content;
    /**
     * Creates new form PanelEditarPieza
     */
    public PanelEditarPieza(JPanel content, String codigo) {
        initComponents();
        this.content = content;
        ConsultasPiezas con = new ConsultasPiezas();
        PiezasEntity pieza = con.cargarDatoConcreto(codigo);
        codField.setText(pieza.getCodpiezas());
        nombreField.setText(pieza.getNombre());
        precioField.setText(String.valueOf(pieza.getPrecio()));
        descripcionField.setText(pieza.getDescripcion());
        con.cerrarConexion();
        jComboBox1.addItem("Alta");
        jComboBox1.addItem("Baja");
        if (pieza.getEstado().equals("alta")) {
            jComboBox1.setSelectedIndex(0);
        } else {
            jComboBox1.setSelectedIndex(1);
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

        jLabel2 = new javax.swing.JLabel();
        botonAnadir = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        botonCancelar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        precioField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        descripcionField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        codField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(142, 105, 149));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EDITAR PIEZA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 830, -1));

        botonAnadir.setBackground(new java.awt.Color(198, 177, 201));
        botonAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAnadirMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("EDITAR PIEZA");

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

        add(botonAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 160, 50));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 100, 30));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 190, -1));

        botonCancelar.setBackground(new java.awt.Color(198, 177, 201));
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCancelarMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CANCELAR");

        javax.swing.GroupLayout botonCancelarLayout = new javax.swing.GroupLayout(botonCancelar);
        botonCancelar.setLayout(botonCancelarLayout);
        botonCancelarLayout.setHorizontalGroup(
            botonCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        botonCancelarLayout.setVerticalGroup(
            botonCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonCancelarLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 160, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 70, 30));

        nombreField.setBackground(new java.awt.Color(142, 105, 149));
        nombreField.setForeground(new java.awt.Color(204, 204, 204));
        nombreField.setBorder(null);
        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });
        add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 350, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 350, -1));

        precioField.setBackground(new java.awt.Color(142, 105, 149));
        precioField.setForeground(new java.awt.Color(204, 204, 204));
        precioField.setBorder(null);
        precioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioFieldActionPerformed(evt);
            }
        });
        add(precioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 350, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 70, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 350, -1));

        descripcionField.setBackground(new java.awt.Color(142, 105, 149));
        descripcionField.setForeground(new java.awt.Color(204, 204, 204));
        descripcionField.setBorder(null);
        descripcionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionFieldActionPerformed(evt);
            }
        });
        add(descripcionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 320, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripcion:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 100, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 320, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Codigo: ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 70, 30));

        codField.setEditable(false);
        codField.setBackground(new java.awt.Color(142, 105, 149));
        codField.setForeground(new java.awt.Color(204, 204, 204));
        codField.setBorder(null);
        codField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codFieldActionPerformed(evt);
            }
        });
        add(codField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 350, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 350, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonAnadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnadirMousePressed
        try {
            float precio = Float.parseFloat(precioField.getText());
            if (nombreField.getText().isBlank() || descripcionField.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos para poder añadir un proveedor.");
            } else {
                ConsultasPiezas con = new ConsultasPiezas();
                String estado;
                if (jComboBox1.getSelectedIndex() == 0) {
                    estado = "alta";
                } else {
                    estado = "baja";
                }
                if (con.editarPieza(codField.getText(), nombreField.getText(), precio, descripcionField.getText(), estado)) {
                    con.cerrarConexion();
                    PanelGestionPiezas frame = new PanelGestionPiezas(content);
                    frame.setSize(830, 490);
                    frame.setLocation(0, 0);
                    content.removeAll();
                    content.add(frame, BorderLayout.CENTER);
                    content.revalidate();
                    content.repaint();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El precio debe ser en numeros.");
        }
    }//GEN-LAST:event_botonAnadirMousePressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void botonCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMousePressed
        PanelGestionPiezas frame = new PanelGestionPiezas(content);
        frame.setSize(830, 490);
        frame.setLocation(0, 0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonCancelarMousePressed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void precioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioFieldActionPerformed

    private void descripcionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionFieldActionPerformed

    private void codFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonAnadir;
    private javax.swing.JPanel botonCancelar;
    private javax.swing.JTextField codField;
    private javax.swing.JTextField descripcionField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTextField precioField;
    // End of variables declaration//GEN-END:variables
}