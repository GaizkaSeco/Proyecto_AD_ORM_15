/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import consultas.ConsultasGestion;
import consultas.ConsultasPiezas;
import consultas.ConsultasProveedores;
import consultas.ConsultasProyectos;
import hibernate.PiezasEntity;
import hibernate.ProveedoresEntity;
import hibernate.ProyectosEntity;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author omega
 */
public class PanelNuevaRelacion extends javax.swing.JPanel {
    JPanel content;
    boolean anadir;

    /**
     * Creates new form PanelNuevaRelacion
     */
    public PanelNuevaRelacion(JPanel content) {
        initComponents();
        this.content = content;

        ConsultasProyectos consultasProyectos = new ConsultasProyectos();
        List<ProyectosEntity> proyectos = consultasProyectos.cargarAltas();
        consultasProyectos.cerrarConexion();
        ConsultasProveedores consultasProveedores = new ConsultasProveedores();
        List<ProveedoresEntity> proveedores = consultasProveedores.cargarAltas();
        consultasProveedores.cerrarConexion();
        ConsultasPiezas consultasPiezas = new ConsultasPiezas();
        List<PiezasEntity> piezas = consultasPiezas.cargarAltas();
        consultasPiezas.cerrarConexion();
        if (proyectos.size() == 0 || proveedores.size() == 0 || piezas.size() == 0) {
            JOptionPane.showMessageDialog(null, "Es necesario que exista una opcion de cada tipo, operacion de añadir bloqueada.");
            anadir = false;
        }else {
            anadir = true;
            for (ProyectosEntity proyecto : proyectos) {
                comboBoxProyectos.addItem(proyecto.getCodproye());
            }
            for (PiezasEntity pieza : piezas) {
                comboBoxPiezas.addItem(pieza.getCodpiezas());
            }
            for (ProveedoresEntity proveedor : proveedores) {
                comboBoxProveedores.addItem(proveedor.getCodprov());
            }
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

        setBackground(new java.awt.Color(142, 105, 149));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("AÑADIR NUEVA RELACION");
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
        jLabel6.setText("AÑADIR RELACION");

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

        add(botonAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 160, 50));

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

        add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 160, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Cantidad: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 30));

        cantidadField.setBackground(new java.awt.Color(142, 105, 149));
        cantidadField.setForeground(new java.awt.Color(204, 204, 204));
        cantidadField.setBorder(null);
        cantidadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadFieldActionPerformed(evt);
            }
        });
        add(cantidadField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 350, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 350, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Codigo de la pieza:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 260, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Codigo del proyecto:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 260, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Codigo del proveedor:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 260, 30));

        add(comboBoxPiezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 350, -1));

        add(comboBoxProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 350, -1));

        add(comboBoxProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 350, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonAnadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnadirMousePressed
        if (anadir) {
            try {
                int cantidad = Integer.parseInt(cantidadField.getText());
                ConsultasGestion con = new ConsultasGestion();
                if (con.anadirRelacion(comboBoxProveedores.getSelectedItem().toString(), comboBoxPiezas.getSelectedItem().toString(), comboBoxProyectos.getSelectedItem().toString(), cantidad)) {
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
                JOptionPane.showMessageDialog(null, "La cantidad esta mal escrita.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La opcion no esta disponible por que no cumples los requesitos.");
        }
    }//GEN-LAST:event_botonAnadirMousePressed

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
    private javax.swing.JPanel botonAnadir;
    private javax.swing.JPanel botonCancelar;
    private javax.swing.JTextField cantidadField;
    private javax.swing.JComboBox<String> comboBoxPiezas;
    private javax.swing.JComboBox<String> comboBoxProveedores;
    private javax.swing.JComboBox<String> comboBoxProyectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
