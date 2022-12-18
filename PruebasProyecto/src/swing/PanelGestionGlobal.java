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

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import hibernate.ProveedoresEntity;
import hibernate.ProyectosEntity;
import scrollbar.ScrollBarCustom;
import table.TableHeader;

/**
 * @author 9FDAM09
 */
public class PanelGestionGlobal extends javax.swing.JPanel {
    String[] nombreColumnas = {"Codigo", "Codigo Pieza", "Codigo Proveedor", "Codigo Proyecto", "Cantidad", "Estado"};
    JPanel content;

    /**
     * Creates new form VentanaGestionGlobal
     */
    public PanelGestionGlobal(JPanel content) {
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
        ConsultasGestion con = new ConsultasGestion();
        List<GestionEntity> gestion = new ArrayList<GestionEntity>();
        gestion = con.recuperarGestionGeneral();
        int cantidad = gestion.size();
        String[][] d = new String[cantidad][6];
        for (int i = 0; i < gestion.size(); i++) {
            d[i][0] = String.valueOf(gestion.get(i).getId());
            d[i][1] = String.valueOf(gestion.get(i).getPiezasByCodpieza().getCodpiezas());
            d[i][2] = String.valueOf(gestion.get(i).getProveedoresByCodproveedor().getCodprov());
            d[i][3] = String.valueOf(gestion.get(i).getProyectosByCodproyecto().getCodproye());
            d[i][4] = String.valueOf(gestion.get(i).getCantidad());
            d[i][5] = String.valueOf(gestion.get(i).getEstado());
        }
        //se carga el modelo de la tabla
        table1.setModel(new DefaultTableModel(d, nombreColumnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        con.cerrarConexion();
    }

    public void editarRelacion(String codigo) {
        if (puedeEditar(codigo)) {
            PanelEditarRelacion frame = new PanelEditarRelacion(content, codigo);
            frame.setSize(830, 490);
            frame.setLocation(0, 0);
            content.removeAll();
            content.add(frame, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
    }

    public boolean puedeEditar(String codigo) {
        ConsultasGestion con = new ConsultasGestion();
        GestionEntity relacion = con.cargarDatoConcreto(codigo);
        ConsultasProyectos consultasProyectos = new ConsultasProyectos();
        List<ProyectosEntity> proyectos = consultasProyectos.cargarAltas();
        ConsultasProveedores consultasProveedores = new ConsultasProveedores();
        List<ProveedoresEntity> proveedores = consultasProveedores.cargarAltas();
        ConsultasPiezas consultasPiezas = new ConsultasPiezas();
        List<PiezasEntity> piezas = consultasPiezas.cargarAltas();
        if (proyectos.size() == 0 || proveedores.size() == 0 || piezas.size() == 0) {
            JOptionPane.showMessageDialog(null, "Es necesario que exista una opcion de cada tipo, operacion de editar denegada.");
            con.cerrarConexion();
            consultasProyectos.cerrarConexion();
            consultasProveedores.cerrarConexion();
            consultasPiezas.cerrarConexion();
            return false;
        }
        int proyectoSele = -1;
        int proveSele = -1;
        int piezaSele = -1;
        for (int i = 0; i < proyectos.size(); i++) {
            if (proyectos.get(i).getCodproye().equals(relacion.getProyectosByCodproyecto().getCodproye())) {
                proyectoSele = i;
            }
        }
        for (int i = 0; i < proveedores.size(); i++) {
            if (proveedores.get(i).getCodprov().equals(relacion.getProveedoresByCodproveedor().getCodprov())) {
                proveSele = i;
            }
        }
        for (int i = 0; i < piezas.size(); i++) {
            if (piezas.get(i).getCodpiezas().equals(relacion.getPiezasByCodpieza().getCodpiezas())) {
                piezaSele = i;
            }
        }
        if (proyectoSele == -1 || proveSele == -1 || piezaSele == -1) {
            JOptionPane.showMessageDialog(null, "Uno de los campos tiene el estado de baja y no se puede editar la relacion, si quiere editarlo da de alta el campo.");
            con.cerrarConexion();
            consultasProyectos.cerrarConexion();
            consultasProveedores.cerrarConexion();
            consultasPiezas.cerrarConexion();
            return false;
        }
        con.cerrarConexion();
        consultasProyectos.cerrarConexion();
        consultasProveedores.cerrarConexion();
        consultasPiezas.cerrarConexion();
        return true;
    }

    public boolean puedeAnadir() {
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
            JOptionPane.showMessageDialog(null, "Es necesario que exista una opcion de cada tipo. Operacion de añadir denegada.");
            return false;
        }
        return true;
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
        botonNuevo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonEditar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 610, 470));

        botonNuevo.setBackground(new java.awt.Color(57, 57, 58));
        botonNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonNuevoMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(219, 219, 219));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nueva Relacion");

        javax.swing.GroupLayout botonNuevoLayout = new javax.swing.GroupLayout(botonNuevo);
        botonNuevo.setLayout(botonNuevoLayout);
        botonNuevoLayout.setHorizontalGroup(
            botonNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        botonNuevoLayout.setVerticalGroup(
            botonNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(botonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 155, -1));

        botonEditar.setBackground(new java.awt.Color(57, 57, 58));
        botonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEditarMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(219, 219, 219));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Editar");

        javax.swing.GroupLayout botonEditarLayout = new javax.swing.GroupLayout(botonEditar);
        botonEditar.setLayout(botonEditarLayout);
        botonEditarLayout.setHorizontalGroup(
            botonEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        botonEditarLayout.setVerticalGroup(
            botonEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 155, -1));

        botonEliminar.setBackground(new java.awt.Color(57, 57, 58));
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEliminarMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(219, 219, 219));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Eliminar");

        javax.swing.GroupLayout botonEliminarLayout = new javax.swing.GroupLayout(botonEliminar);
        botonEliminar.setLayout(botonEliminarLayout);
        botonEliminarLayout.setHorizontalGroup(
            botonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        botonEliminarLayout.setVerticalGroup(
            botonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 155, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNuevoMousePressed
        if (puedeAnadir()) {
            PanelNuevaRelacion frame = new PanelNuevaRelacion(content);
            frame.setSize(830, 490);
            frame.setLocation(0, 0);
            content.removeAll();
            content.add(frame, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
    }//GEN-LAST:event_botonNuevoMousePressed

    private void botonEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarMousePressed
        if (table1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Para editar debes haber seleccionado algun dato en la tabla.");
        } else {
            //Obtencion del id del objeto seleccionaod en la tabla
            String codigo = table1.getValueAt(table1.getSelectedRow(), 0).toString();
            editarRelacion(codigo);
        }
    }//GEN-LAST:event_botonEditarMousePressed

    private void botonEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMousePressed
        ConsultasGestion con = new ConsultasGestion();
        if (table1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Para dar de baja debes haber seleccionado algun dato en la tabla.");
        } else {
            //Obtencion del id del objeto seleccionaod en la tabla
            int codigo = Integer.parseInt(table1.getValueAt(table1.getSelectedRow(), 0).toString());
            con.eliminarGestion(codigo);
            con.cerrarConexion();
        }
        cargarDatos();
    }//GEN-LAST:event_botonEliminarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonEditar;
    private javax.swing.JPanel botonEliminar;
    private javax.swing.JPanel botonNuevo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
