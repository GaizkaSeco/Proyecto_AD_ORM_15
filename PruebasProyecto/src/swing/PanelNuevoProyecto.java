/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import consultas.ConsultasPiezas;
import consultas.ConsultasProyectos;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author omega
 */
public class PanelNuevoProyecto extends javax.swing.JPanel {
    JPanel content;
    
    /**
     * Creates new form PanelNuevoProyecto
     */
    public PanelNuevoProyecto(JPanel content) {
        initComponents();
        this.content = content;
    }

    public void anadirProyecto() {
        ConsultasProyectos con = new ConsultasProyectos();
        try {
            if (con.anadirProyecto(codigoField.getText(), nombreField.getText(), ciudadField.getText())) {
                PanelGestionProyectos frame = new PanelGestionProyectos(content);
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
        ciudadField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        botonAnadir = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codigoField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(142, 105, 149));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 70, 30));

        nombreField.setBackground(new java.awt.Color(142, 105, 149));
        nombreField.setForeground(new java.awt.Color(204, 204, 204));
        nombreField.setBorder(null);
        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });
        add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 350, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NUEVO PROYECTO");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 830, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 350, -1));

        ciudadField.setBackground(new java.awt.Color(142, 105, 149));
        ciudadField.setForeground(new java.awt.Color(204, 204, 204));
        ciudadField.setBorder(null);
        ciudadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadFieldActionPerformed(evt);
            }
        });
        add(ciudadField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 360, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ciudad:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 70, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 360, -1));

        botonAnadir.setBackground(new java.awt.Color(198, 177, 201));
        botonAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAnadirMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("AÑADIR PROYECTO");

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

        add(botonAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 160, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 70, 30));

        codigoField.setBackground(new java.awt.Color(142, 105, 149));
        codigoField.setForeground(new java.awt.Color(204, 204, 204));
        codigoField.setBorder(null);
        codigoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoFieldActionPerformed(evt);
            }
        });
        add(codigoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 350, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 350, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void ciudadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadFieldActionPerformed

    private void codigoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoFieldActionPerformed

    private void botonAnadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAnadirMousePressed
        if(codigoField.getText().isBlank() || nombreField.getText().isBlank() || ciudadField.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos para poder añadir un nuevo proyecto.");
        } else {
            anadirProyecto();
        }
    }//GEN-LAST:event_botonAnadirMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonAnadir;
    private javax.swing.JTextField ciudadField;
    private javax.swing.JTextField codigoField;
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
