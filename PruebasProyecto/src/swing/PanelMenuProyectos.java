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
public class PanelMenuProyectos extends javax.swing.JPanel {

    /**
     * Creates new form PanelMenuProyectos
     */
    public PanelMenuProyectos() {
        initComponents();
        
        PanelGestionProyectos frame = new PanelGestionProyectos(content);
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
        botonNuevoProyecto = new javax.swing.JPanel();
        labelAnadir = new javax.swing.JLabel();
        botonGestionProyectos = new javax.swing.JPanel();
        labelGestion = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenuTop.setBackground(new java.awt.Color(57, 57, 58));
        panelMenuTop.setMinimumSize(new java.awt.Dimension(830, 60));

        botonNuevoProyecto.setBackground(new java.awt.Color(57, 57, 58));
        botonNuevoProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonNuevoProyectoMousePressed(evt);
            }
        });

        labelAnadir.setForeground(new java.awt.Color(219, 219, 219));
        labelAnadir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAnadir.setText("Nuevo Proyecto");

        javax.swing.GroupLayout botonNuevoProyectoLayout = new javax.swing.GroupLayout(botonNuevoProyecto);
        botonNuevoProyecto.setLayout(botonNuevoProyectoLayout);
        botonNuevoProyectoLayout.setHorizontalGroup(
            botonNuevoProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonNuevoProyectoLayout.createSequentialGroup()
                .addComponent(labelAnadir, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );
        botonNuevoProyectoLayout.setVerticalGroup(
            botonNuevoProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAnadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        botonGestionProyectos.setBackground(new java.awt.Color(204, 204, 204));
        botonGestionProyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonGestionProyectosMousePressed(evt);
            }
        });

        labelGestion.setForeground(new java.awt.Color(0, 0, 0));
        labelGestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGestion.setText("Gestion de Proyectos");

        javax.swing.GroupLayout botonGestionProyectosLayout = new javax.swing.GroupLayout(botonGestionProyectos);
        botonGestionProyectos.setLayout(botonGestionProyectosLayout);
        botonGestionProyectosLayout.setHorizontalGroup(
            botonGestionProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelGestion, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        botonGestionProyectosLayout.setVerticalGroup(
            botonGestionProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelGestion, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMenuTopLayout = new javax.swing.GroupLayout(panelMenuTop);
        panelMenuTop.setLayout(panelMenuTopLayout);
        panelMenuTopLayout.setHorizontalGroup(
            panelMenuTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuTopLayout.createSequentialGroup()
                .addComponent(botonGestionProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonNuevoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 514, Short.MAX_VALUE))
        );
        panelMenuTopLayout.setVerticalGroup(
            panelMenuTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonGestionProyectos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonNuevoProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(panelMenuTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, -1));

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

        add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonGestionProyectosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGestionProyectosMousePressed
        setColor(botonGestionProyectos, labelGestion);
        resetColor(botonNuevoProyecto, labelAnadir);
        
        PanelGestionProyectos frame = new PanelGestionProyectos(content);
        frame.setSize(830,490);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonGestionProyectosMousePressed

    private void botonNuevoProyectoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNuevoProyectoMousePressed
        setColor(botonNuevoProyecto, labelAnadir);
        resetColor(botonGestionProyectos, labelGestion);
        
        PanelNuevoProyecto frame = new PanelNuevoProyecto(content);
        frame.setSize(830,490);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonNuevoProyectoMousePressed

    private void setColor(JPanel pane, JLabel txto) {
        pane.setBackground(new Color(204,204,204));
        txto.setForeground(new Color(0,0,0));
    }
    
    private void resetColor(JPanel pane, JLabel texto) {
        pane.setBackground(new Color(57,57,58));
        texto.setForeground(new Color(219,219,219));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonGestionProyectos;
    private javax.swing.JPanel botonNuevoProyecto;
    private javax.swing.JPanel content;
    private javax.swing.JLabel labelAnadir;
    private javax.swing.JLabel labelGestion;
    private javax.swing.JPanel panelMenuTop;
    // End of variables declaration//GEN-END:variables
}
