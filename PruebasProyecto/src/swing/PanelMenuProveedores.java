/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author 9FDAM09
 */
public class PanelMenuProveedores extends javax.swing.JPanel {

    /**
     * Creates new form VentanaPricipal
     */
    public PanelMenuProveedores() {
        initComponents();
        
        PanelGestionProveedores frame = new PanelGestionProveedores(content);
        frame.setSize(830,490);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenuTop = new javax.swing.JPanel();
        botonAltas = new javax.swing.JPanel();
        labelAnadir = new javax.swing.JLabel();
        botonGestionProveedores = new javax.swing.JPanel();
        labelGestion = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(830, 550));
        setPreferredSize(new java.awt.Dimension(1110, 720));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenuTop.setBackground(new java.awt.Color(57, 57, 58));

        botonAltas.setBackground(new java.awt.Color(57, 57, 58));
        botonAltas.setPreferredSize(new java.awt.Dimension(155, 60));
        botonAltas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAltasMousePressed(evt);
            }
        });

        labelAnadir.setForeground(new java.awt.Color(219, 219, 219));
        labelAnadir.setText("Nuevo Proveedor");

        javax.swing.GroupLayout botonAltasLayout = new javax.swing.GroupLayout(botonAltas);
        botonAltas.setLayout(botonAltasLayout);
        botonAltasLayout.setHorizontalGroup(
            botonAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAltasLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelAnadir)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        botonAltasLayout.setVerticalGroup(
            botonAltasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAltasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelAnadir)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        botonGestionProveedores.setBackground(new java.awt.Color(204, 204, 204));
        botonGestionProveedores.setPreferredSize(new java.awt.Dimension(155, 43));
        botonGestionProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonGestionProveedoresMousePressed(evt);
            }
        });

        labelGestion.setForeground(new java.awt.Color(0, 0, 0));
        labelGestion.setText("Gestion de Proveedores");

        javax.swing.GroupLayout botonGestionProveedoresLayout = new javax.swing.GroupLayout(botonGestionProveedores);
        botonGestionProveedores.setLayout(botonGestionProveedoresLayout);
        botonGestionProveedoresLayout.setHorizontalGroup(
            botonGestionProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonGestionProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelGestion)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        botonGestionProveedoresLayout.setVerticalGroup(
            botonGestionProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonGestionProveedoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelGestion)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout panelMenuTopLayout = new javax.swing.GroupLayout(panelMenuTop);
        panelMenuTop.setLayout(panelMenuTopLayout);
        panelMenuTopLayout.setHorizontalGroup(
            panelMenuTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuTopLayout.createSequentialGroup()
                .addComponent(botonGestionProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(514, Short.MAX_VALUE))
        );
        panelMenuTopLayout.setVerticalGroup(
            panelMenuTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonAltas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonGestionProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        add(panelMenuTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 60));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 830, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void botonGestionProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGestionProveedoresMousePressed
        setColor(botonGestionProveedores, labelGestion);
        resetColor(botonAltas, labelAnadir);
        
        PanelGestionProveedores frame = new PanelGestionProveedores(content);
        frame.setSize(830,490);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonGestionProveedoresMousePressed

    private void botonAltasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAltasMousePressed
        setColor(botonAltas, labelAnadir);
        resetColor(botonGestionProveedores, labelGestion);
        
        PanelNuevoProveedor frame = new PanelNuevoProveedor(content);
        frame.setSize(830,490);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonAltasMousePressed

    private void setColor(JPanel pane, JLabel txto) {
        pane.setBackground(new Color(204,204,204));
        txto.setForeground(new Color(0,0,0));
    }

    private void resetColor(JPanel pane, JLabel texto) {
        pane.setBackground(new Color(57,57,58));
        texto.setForeground(new Color(219,219,219));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonAltas;
    private javax.swing.JPanel botonGestionProveedores;
    public javax.swing.JPanel content;
    private javax.swing.JLabel labelAnadir;
    private javax.swing.JLabel labelGestion;
    private javax.swing.JPanel panelMenuTop;
    // End of variables declaration//GEN-END:variables
}
