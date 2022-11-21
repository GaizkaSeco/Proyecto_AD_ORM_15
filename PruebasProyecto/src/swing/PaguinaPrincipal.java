/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 9FDAM09
 */
public class PaguinaPrincipal extends javax.swing.JFrame {
    public PaguinaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        botonSalir = new javax.swing.JPanel();
        borde4 = new javax.swing.JPanel();
        labelBoton1 = new javax.swing.JLabel();
        boton2 = new javax.swing.JPanel();
        labelBoton6 = new javax.swing.JLabel();
        borde1 = new javax.swing.JPanel();
        boton3 = new javax.swing.JPanel();
        borde2 = new javax.swing.JPanel();
        labelBoton2 = new javax.swing.JLabel();
        boton4 = new javax.swing.JPanel();
        borde3 = new javax.swing.JPanel();
        labelBoton3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(114, 70, 124));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonSalir.setBackground(new java.awt.Color(114, 70, 124));
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonSalirMousePressed(evt);
            }
        });

        borde4.setBackground(new java.awt.Color(114, 70, 124));
        borde4.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout borde4Layout = new javax.swing.GroupLayout(borde4);
        borde4.setLayout(borde4Layout);
        borde4Layout.setHorizontalGroup(
            borde4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        borde4Layout.setVerticalGroup(
            borde4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelBoton1.setForeground(new java.awt.Color(0, 0, 0));
        labelBoton1.setText("Boton1");

        javax.swing.GroupLayout botonSalirLayout = new javax.swing.GroupLayout(botonSalir);
        botonSalir.setLayout(botonSalirLayout);
        botonSalirLayout.setHorizontalGroup(
            botonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonSalirLayout.createSequentialGroup()
                .addComponent(borde4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(labelBoton1)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        botonSalirLayout.setVerticalGroup(
            botonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonSalirLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelBoton1)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(borde4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelMenu.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 200, -1));

        boton2.setBackground(new java.awt.Color(198, 177, 201));
        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton2MousePressed(evt);
            }
        });

        labelBoton6.setForeground(new java.awt.Color(0, 0, 0));
        labelBoton6.setText("Boton1");

        borde1.setBackground(new java.awt.Color(255, 255, 255));
        borde1.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout borde1Layout = new javax.swing.GroupLayout(borde1);
        borde1.setLayout(borde1Layout);
        borde1Layout.setHorizontalGroup(
            borde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        borde1Layout.setVerticalGroup(
            borde1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout boton2Layout = new javax.swing.GroupLayout(boton2);
        boton2.setLayout(boton2Layout);
        boton2Layout.setHorizontalGroup(
            boton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton2Layout.createSequentialGroup()
                .addComponent(borde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(labelBoton6)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        boton2Layout.setVerticalGroup(
            boton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelBoton6)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(borde1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelMenu.add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, -1));

        boton3.setBackground(new java.awt.Color(114, 70, 124));
        boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton3MousePressed(evt);
            }
        });

        borde2.setBackground(new java.awt.Color(114, 70, 124));
        borde2.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout borde2Layout = new javax.swing.GroupLayout(borde2);
        borde2.setLayout(borde2Layout);
        borde2Layout.setHorizontalGroup(
            borde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        borde2Layout.setVerticalGroup(
            borde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelBoton2.setForeground(new java.awt.Color(0, 0, 0));
        labelBoton2.setText("Boton1");

        javax.swing.GroupLayout boton3Layout = new javax.swing.GroupLayout(boton3);
        boton3.setLayout(boton3Layout);
        boton3Layout.setHorizontalGroup(
            boton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton3Layout.createSequentialGroup()
                .addComponent(borde2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(labelBoton2)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        boton3Layout.setVerticalGroup(
            boton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelBoton2)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(borde2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelMenu.add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, -1));

        boton4.setBackground(new java.awt.Color(114, 70, 124));
        boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton4MousePressed(evt);
            }
        });

        borde3.setBackground(new java.awt.Color(114, 70, 124));
        borde3.setPreferredSize(new java.awt.Dimension(5, 0));

        javax.swing.GroupLayout borde3Layout = new javax.swing.GroupLayout(borde3);
        borde3.setLayout(borde3Layout);
        borde3Layout.setHorizontalGroup(
            borde3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        borde3Layout.setVerticalGroup(
            borde3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        labelBoton3.setForeground(new java.awt.Color(0, 0, 0));
        labelBoton3.setText("Boton1");

        javax.swing.GroupLayout boton4Layout = new javax.swing.GroupLayout(boton4);
        boton4.setLayout(boton4Layout);
        boton4Layout.setHorizontalGroup(
            boton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton4Layout.createSequentialGroup()
                .addComponent(borde3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(labelBoton3)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        boton4Layout.setVerticalGroup(
            boton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelBoton3)
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(borde3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelMenu.add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, -1));

        getContentPane().add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Accion de los botones para cambiar de color ar clickar etc
    private void boton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MousePressed
        setColor(boton2, borde1);
        resetColor(boton3, borde2);
        resetColor(boton4, borde3);
        resetColor(botonSalir, borde4);
    }//GEN-LAST:event_boton2MousePressed

    private void boton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MousePressed
        setColor(boton3, borde2);
        resetColor(boton2, borde1);
        resetColor(boton4, borde3);
        resetColor(botonSalir, borde4);
    }//GEN-LAST:event_boton3MousePressed

    private void boton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MousePressed
        setColor(boton4, borde3);
        resetColor(boton3,borde2);
        resetColor(boton2, borde1);
        resetColor(botonSalir, borde4);
    }//GEN-LAST:event_boton4MousePressed

    private void botonSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMousePressed
        setColor(botonSalir, borde4);
        resetColor(boton3, borde2);
        resetColor(boton4, borde3);
        resetColor(boton2, borde1);
    }//GEN-LAST:event_botonSalirMousePressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaguinaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaguinaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaguinaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaguinaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaguinaPrincipal().setVisible(true);
            }
        });
    }

    public PaguinaPrincipal(JPanel boton1, JPanel boton2, JPanel boton3, JPanel boton4, JPanel boton5, JLabel labelBoton1, JLabel labelBoton2, JLabel labelBoton3, JLabel labelBoton4, JLabel labelBoton5, JPanel panelMenu) throws HeadlessException {
        this.botonSalir = boton1;
        this.boton2 = boton2;
        this.boton3 = boton3;
        this.boton4 = boton4;
        this.labelBoton1 = labelBoton1;
        this.labelBoton2 = labelBoton2;
        this.labelBoton3 = labelBoton3;
        this.panelMenu = panelMenu;
    }
    
    private void setColor(JPanel pane, JPanel borde) {
        pane.setBackground(new Color(198,177,201));
        borde.setBackground(new Color(255,255,255));
    }
    
    private void resetColor(JPanel pane, JPanel borde) {
        pane.setBackground(new Color(114,70,124));
        borde.setBackground(new Color(114,70,124));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel borde1;
    private javax.swing.JPanel borde2;
    private javax.swing.JPanel borde3;
    private javax.swing.JPanel borde4;
    private javax.swing.JPanel boton2;
    private javax.swing.JPanel boton3;
    private javax.swing.JPanel boton4;
    private javax.swing.JPanel botonSalir;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelBoton1;
    private javax.swing.JLabel labelBoton2;
    private javax.swing.JLabel labelBoton3;
    private javax.swing.JLabel labelBoton6;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
