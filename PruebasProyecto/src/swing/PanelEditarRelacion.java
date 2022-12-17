/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import consultas.ConsultasGestion;
import consultas.ConsultasPiezas;
import consultas.ConsultasProveedores;
import consultas.ConsultasProyectos;
import hibernate.GestionEntity;
import hibernate.PiezasEntity;
import hibernate.ProveedoresEntity;
import hibernate.ProyectosEntity;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * @author omega
 */
public class PanelEditarRelacion extends javax.swing.JPanel {
    JPanel content;
    List<ProveedoresEntity> proveedores;
    List<ProyectosEntity> proyectos;
    List<PiezasEntity> piezas;
    String codigo;

    /**
     * Creates new form PanelEditarRelacion
     */
    public PanelEditarRelacion(JPanel content, String codigo) {
        initComponents();
        this.codigo = codigo;
        this.content = content;
        //recuperamos todos los datos
        ConsultasGestion con = new ConsultasGestion();
        GestionEntity relacion = con.cargarDatoConcreto(codigo);
        cantidadField.setText(String.valueOf(relacion.getCantidad()));
        ConsultasProyectos consultasProyectos = new ConsultasProyectos();
        proyectos = consultasProyectos.cargarAltas();
        consultasProyectos.cerrarConexion();
        ConsultasProveedores consultasProveedores = new ConsultasProveedores();
        proveedores = consultasProveedores.cargarAltas();
        consultasProveedores.cerrarConexion();
        ConsultasPiezas consultasPiezas = new ConsultasPiezas();
        piezas = consultasPiezas.cargarAltas();
        consultasPiezas.cerrarConexion();
        //cargamos todos los datos en los combobox
        int proyectoSele = -1;
        int proveSele = -1;
        int piezaSele = -1;
        for (int i = 0; i < proyectos.size(); i++) {
            comboBoxProyectos.addItem(proyectos.get(i).getCodproye());
            if (proyectos.get(i).getCodproye().equals(relacion.getProyectosByCodproyecto().getCodproye())) {
                proyectoSele = i;
            }
        }
        for (int i = 0; i < proveedores.size(); i++) {
            comboBoxProveedores.addItem(proveedores.get(i).getCodprov());
            if (proveedores.get(i).getCodprov().equals(relacion.getProveedoresByCodproveedor().getCodprov())) {
                proveSele = i;
            }
        }
        for (int i = 0; i < piezas.size(); i++) {
            comboBoxPiezas.addItem(piezas.get(i).getCodpiezas());
            if (piezas.get(i).getCodpiezas().equals(relacion.getPiezasByCodpieza().getCodpiezas())) {
                piezaSele = i;
            }
        }
        comboBoxProveedores.setSelectedIndex(proveSele);
        comboBoxProyectos.setSelectedIndex(proyectoSele);
        comboBoxPiezas.setSelectedIndex(piezaSele);
        jComboBox1.addItem("Alta");
        jComboBox1.addItem("Baja");
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
        botonEditar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cantidadField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboBoxPiezas = new javax.swing.JComboBox<>();
        comboBoxProveedores = new javax.swing.JComboBox<>();
        comboBoxProyectos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EDITAR RELACION");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 830, -1));

        botonEditar.setBackground(new java.awt.Color(57, 57, 58));
        botonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEditarMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(219, 219, 219));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("EDITAR RELACION");

        javax.swing.GroupLayout botonEditarLayout = new javax.swing.GroupLayout(botonEditar);
        botonEditar.setLayout(botonEditarLayout);
        botonEditarLayout.setHorizontalGroup(
                botonEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        botonEditarLayout.setVerticalGroup(
                botonEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(botonEditarLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 1, Short.MAX_VALUE))
        );

        add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 160, 50));

        botonCancelar.setBackground(new java.awt.Color(57, 57, 58));
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCancelarMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(219, 219, 219));
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
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Cantidad: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 260, 30));

        cantidadField.setBackground(new java.awt.Color(204, 204, 204));
        cantidadField.setForeground(new java.awt.Color(0, 0, 0));
        cantidadField.setBorder(null);
        cantidadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadFieldActionPerformed(evt);
            }
        });
        add(cantidadField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 350, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 350, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Codigo de la pieza:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Codigo del proyecto:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 260, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Codigo del proveedor:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 260, 30));

        add(comboBoxPiezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 350, -1));

        add(comboBoxProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 350, -1));

        add(comboBoxProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 350, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Estado:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 250, 30));

        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 350, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarMousePressed

        if (cantidadField.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos para poder editar la relacion.");
        } else {
            try {
                int cantidad = Integer.parseInt(cantidadField.getText());
                ConsultasGestion con = new ConsultasGestion();
                String estado;
                if (jComboBox1.getSelectedIndex() == 0) {
                    estado = "alta";
                } else {
                    estado = "baja";
                }
                if (con.editarRelacion(codigo, comboBoxProveedores.getSelectedItem().toString(), comboBoxPiezas.getSelectedItem().toString(), comboBoxProyectos.getSelectedItem().toString(), cantidad, estado, piezas, proyectos,proveedores)) {
                    con.cerrarConexion();
                    PanelGestionGlobal frame = new PanelGestionGlobal(content);
                    frame.setSize(830, 490);
                    frame.setLocation(0, 0);
                    content.removeAll();
                    content.add(frame, BorderLayout.CENTER);
                    content.revalidate();
                    content.repaint();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "La cantidad debe ser un valor numericos.");
            }
        }
    }//GEN-LAST:event_botonEditarMousePressed

    private void botonCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMousePressed
        PanelGestionGlobal frame = new PanelGestionGlobal(content);
        frame.setSize(830, 490);
        frame.setLocation(0, 0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonCancelarMousePressed

    private void cantidadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonCancelar;
    private javax.swing.JPanel botonEditar;
    private javax.swing.JTextField cantidadField;
    private javax.swing.JComboBox<String> comboBoxPiezas;
    private javax.swing.JComboBox<String> comboBoxProveedores;
    private javax.swing.JComboBox<String> comboBoxProyectos;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
