/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import consultas.ConsultasProveedores;
import hibernate.AgenciasEntity;
import java.awt.BorderLayout;
import scrollbar.ScrollBarCustom;
import table.TableHeader;

/**
 * @author omega
 */
public class PanelGestionProveedores extends javax.swing.JPanel {
    String[] nombreColumnas = {"ID", "Nombre", "Direccion"};
    JPanel content = null;

    /**
     * Creates new form GestionProveedores
     * @param content panel para cargar los paneles
     */
    public PanelGestionProveedores(JPanel content) {
        initComponents();
        this.content = content;

        table1.setShowHorizontalLines(true);
        table1.setGridColor(new Color(230, 230, 230));
        table1.setRowHeight(30);
        table1.getTableHeader().setReorderingAllowed(true);
        table1.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if (column == nombreColumnas.length) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        fixtable(jScrollPane1);
        cargarDatos();
    }

    public void fixtable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }

    public void cargarDatos() {
        ConsultasProveedores con = new ConsultasProveedores();
        List<AgenciasEntity> agencias = new ArrayList<AgenciasEntity>();
        agencias = con.recuperarProveedores();
        int cantidad = agencias.size();
        String[][] d = new String[cantidad][3];
        for (int i = 0; i < agencias.size(); i++) {
            d[i][0] = String.valueOf(agencias.get(i).getId());
            d[i][1] = String.valueOf(agencias.get(i).getNombre());
            d[i][2] = String.valueOf(agencias.get(i).getDireccion());
        }
        //se carga el modelo de la tabla
        table1.setModel(new DefaultTableModel(d, nombreColumnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
    }

    public void eliminarProveedor(int id) {
        
    }
    
    public void editarProveedor(int id) {        
        PanelEditarProveedor frame = new PanelEditarProveedor(content);
        frame.setSize(830,490);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    public void verProveedor(int id) {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        botonBaja = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonEditar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonVer = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(142, 105, 149));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setGridColor(new java.awt.Color(255, 255, 255));
        table1.setSelectionBackground(new java.awt.Color(198, 177, 201));
        table1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 611, 490));

        botonBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBajaMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dar de baja");

        javax.swing.GroupLayout botonBajaLayout = new javax.swing.GroupLayout(botonBaja);
        botonBaja.setLayout(botonBajaLayout);
        botonBajaLayout.setHorizontalGroup(
            botonBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        botonBajaLayout.setVerticalGroup(
            botonBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(botonBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 155, -1));

        botonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEditarMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Editar");

        javax.swing.GroupLayout botonEditarLayout = new javax.swing.GroupLayout(botonEditar);
        botonEditar.setLayout(botonEditarLayout);
        botonEditarLayout.setHorizontalGroup(
            botonEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        botonEditarLayout.setVerticalGroup(
            botonEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 155, -1));

        botonVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonVerMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ver Proveedor");

        javax.swing.GroupLayout botonVerLayout = new javax.swing.GroupLayout(botonVer);
        botonVer.setLayout(botonVerLayout);
        botonVerLayout.setHorizontalGroup(
            botonVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        botonVerLayout.setVerticalGroup(
            botonVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(botonVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonBajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBajaMousePressed
        if (table1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Para eliminar debes haber seleccionado algun dato en la tabla.");
        } else {
            //Obtencion del id del objeto seleccionaod en la tabla
            int id = Integer.parseInt(table1.getValueAt(table1.getSelectedRow(), 0).toString());
            eliminarProveedor(id);
        }
    }//GEN-LAST:event_botonBajaMousePressed

    private void botonEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarMousePressed
        if (table1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Para editar debes haber seleccionado algun dato en la tabla.");
        } else {
            //Obtencion del id del objeto seleccionaod en la tabla
            int id = Integer.parseInt(table1.getValueAt(table1.getSelectedRow(), 0).toString());
            editarProveedor(id);
        }
    }//GEN-LAST:event_botonEditarMousePressed

    private void botonVerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerMousePressed
        if (table1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Para ver debes haber seleccionado algun dato en la tabla.");
        } else {
            //Obtencion del id del objeto seleccionaod en la tabla
            int id = Integer.parseInt(table1.getValueAt(table1.getSelectedRow(), 0).toString());
            verProveedor(id);
        }
    }//GEN-LAST:event_botonVerMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonBaja;
    private javax.swing.JPanel botonEditar;
    private javax.swing.JPanel botonVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
