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
 * @author omega
 */
public class PanelMenuGestionGlobal extends javax.swing.JPanel {

    /**
     * Creates new form PanelMenuGestionGlobal
     */
    public PanelMenuGestionGlobal() {
        initComponents();
        
        PanelGestionGlobal frame = new PanelGestionGlobal(content);
        frame.setSize(830,550);
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
        botonRelacionar = new javax.swing.JPanel();
        labelPpp = new javax.swing.JLabel();
        botonSumiProveedores = new javax.swing.JPanel();
        labelProveedor = new javax.swing.JLabel();
        botonSumiPiezas = new javax.swing.JPanel();
        labelPieza = new javax.swing.JLabel();
        botonEstadisticas = new javax.swing.JPanel();
        labelEstadisticas = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenuTop.setBackground(new java.awt.Color(57, 57, 58));

        botonRelacionar.setBackground(new java.awt.Color(204, 204, 204));
        botonRelacionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonRelacionarMousePressed(evt);
            }
        });

        labelPpp.setForeground(new java.awt.Color(0, 0, 0));
        labelPpp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPpp.setText("<html><center>Piezas, Proveedores y Proyectos</center></html>");

        javax.swing.GroupLayout botonRelacionarLayout = new javax.swing.GroupLayout(botonRelacionar);
        botonRelacionar.setLayout(botonRelacionarLayout);
        botonRelacionarLayout.setHorizontalGroup(
            botonRelacionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPpp, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        botonRelacionarLayout.setVerticalGroup(
            botonRelacionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPpp, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        botonSumiProveedores.setBackground(new java.awt.Color(57, 57, 58));
        botonSumiProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonSumiProveedoresMousePressed(evt);
            }
        });

        labelProveedor.setForeground(new java.awt.Color(219, 219, 219));
        labelProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelProveedor.setText("<html><center>Suministros por proveedores</center><html>");

        javax.swing.GroupLayout botonSumiProveedoresLayout = new javax.swing.GroupLayout(botonSumiProveedores);
        botonSumiProveedores.setLayout(botonSumiProveedoresLayout);
        botonSumiProveedoresLayout.setHorizontalGroup(
            botonSumiProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        botonSumiProveedoresLayout.setVerticalGroup(
            botonSumiProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        botonSumiPiezas.setBackground(new java.awt.Color(57, 57, 58));
        botonSumiPiezas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonSumiPiezasMousePressed(evt);
            }
        });

        labelPieza.setForeground(new java.awt.Color(219, 219, 219));
        labelPieza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPieza.setText("<html><center>Suministros por piezas</center><html>");

        javax.swing.GroupLayout botonSumiPiezasLayout = new javax.swing.GroupLayout(botonSumiPiezas);
        botonSumiPiezas.setLayout(botonSumiPiezasLayout);
        botonSumiPiezasLayout.setHorizontalGroup(
            botonSumiPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPieza, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        botonSumiPiezasLayout.setVerticalGroup(
            botonSumiPiezasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPieza, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        botonEstadisticas.setBackground(new java.awt.Color(57, 57, 58));
        botonEstadisticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEstadisticasMousePressed(evt);
            }
        });

        labelEstadisticas.setForeground(new java.awt.Color(219, 219, 219));
        labelEstadisticas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEstadisticas.setText("<html><center>Estadisticas</center><html>");

        javax.swing.GroupLayout botonEstadisticasLayout = new javax.swing.GroupLayout(botonEstadisticas);
        botonEstadisticas.setLayout(botonEstadisticasLayout);
        botonEstadisticasLayout.setHorizontalGroup(
            botonEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        botonEstadisticasLayout.setVerticalGroup(
            botonEstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMenuTopLayout = new javax.swing.GroupLayout(panelMenuTop);
        panelMenuTop.setLayout(panelMenuTopLayout);
        panelMenuTopLayout.setHorizontalGroup(
            panelMenuTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuTopLayout.createSequentialGroup()
                .addComponent(botonRelacionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonSumiProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonSumiPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 192, Short.MAX_VALUE))
        );
        panelMenuTopLayout.setVerticalGroup(
            panelMenuTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuTopLayout.createSequentialGroup()
                .addGroup(panelMenuTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRelacionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSumiProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSumiPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void botonRelacionarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRelacionarMousePressed
        setColor(botonRelacionar, labelPpp);
        resetColor(botonSumiProveedores, labelProveedor);
        resetColor(botonSumiPiezas, labelPieza);
        resetColor(botonEstadisticas, labelEstadisticas);
        
        PanelGestionGlobal frame = new PanelGestionGlobal(content);
        frame.setSize(830,490);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonRelacionarMousePressed

    private void botonSumiProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSumiProveedoresMousePressed
        setColor(botonSumiProveedores, labelProveedor);
        resetColor(botonRelacionar, labelPpp);
        resetColor(botonSumiPiezas, labelPieza);
        resetColor(botonEstadisticas, labelEstadisticas);
        
        PanelGestionGlobalProveedores frame = new PanelGestionGlobalProveedores(content);
        frame.setSize(830,490);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonSumiProveedoresMousePressed

    private void botonSumiPiezasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSumiPiezasMousePressed
        setColor(botonSumiPiezas, labelPieza);
        resetColor(botonSumiProveedores, labelProveedor);
        resetColor(botonRelacionar, labelPpp);
        resetColor(botonEstadisticas, labelEstadisticas);
        
        PanelGestionGlobalPiezas frame = new PanelGestionGlobalPiezas(content);
        frame.setSize(830,490);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonSumiPiezasMousePressed

    private void botonEstadisticasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEstadisticasMousePressed
        setColor(botonEstadisticas, labelEstadisticas);
        resetColor(botonSumiProveedores, labelProveedor);
        resetColor(botonSumiPiezas, labelPieza);
        resetColor(botonRelacionar, labelPpp);
        
        PanelGestionProveedores frame = new PanelGestionProveedores(content);
        frame.setSize(830,490);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonEstadisticasMousePressed

    private void setColor(JPanel pane, JLabel texto) {
        pane.setBackground(new Color(204,204,204));
        texto.setForeground(new Color(0,0,0));
    }

    private void resetColor(JPanel pane, JLabel texto) {
        pane.setBackground(new Color(57,57,58));
        texto.setForeground(new Color(219,219,219));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonEstadisticas;
    private javax.swing.JPanel botonRelacionar;
    private javax.swing.JPanel botonSumiPiezas;
    private javax.swing.JPanel botonSumiProveedores;
    private javax.swing.JPanel content;
    private javax.swing.JLabel labelEstadisticas;
    private javax.swing.JLabel labelPieza;
    private javax.swing.JLabel labelPpp;
    private javax.swing.JLabel labelProveedor;
    private javax.swing.JPanel panelMenuTop;
    // End of variables declaration//GEN-END:variables
}
