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
import scrollbar.ScrollBarCustom;
import table.TableHeader;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omega
 */
public class PanelEstadisticas extends javax.swing.JPanel {
    JPanel content;
    String[] nombreColumnasProveedores = {"Codigo Prov.", "Nombre", "Apellido", "NºPiezas", "Cantidad Suministrada", "NºProyectos"};
    String[] nombreColumnasProyectos = {"Codigo Proye.", "Piezas suministradas", "NºProveedores", };


    /**
     * Creates new form PanelEstadistics
     */
    public PanelEstadisticas(JPanel content) {
        initComponents();
        this.content = content;

        //cargar datos
        ConsultasGestion con = new ConsultasGestion();
        List<GestionEntity> relaciones = con.recuperarGestionGeneral();
        con.cerrarConexion();

        //Modelo de la tabla
        table1.setShowHorizontalLines(true);
        table1.setGridColor(new Color(230, 230, 230));
        table1.setRowHeight(30);
        table1.getTableHeader().setReorderingAllowed(true);
        table1.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if (column == nombreColumnasProveedores.length) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        jScrollPane2.getViewport().setBackground(Color.WHITE);
        jScrollPane2.setVerticalScrollBar(new ScrollBarCustom());
        fixtable(jScrollPane2);
        cargarDatosProveedores();

        //Recuperar pieza mas suministrada
        int cantidad = 0;
        int cantidadpro = 0;
        String cod = null;
        for (int i = 0; i < relaciones.size(); i++) {
            for (GestionEntity relacione : relaciones) {
                if (relaciones.get(i).getPiezasByCodpieza().getCodpiezas().equals(relacione.getPiezasByCodpieza().getCodpiezas())) {
                    cantidadpro = cantidadpro + relacione.getCantidad();
                }
            }
            if (cantidad < cantidadpro) {
                cantidad = cantidadpro;
                cod = relaciones.get(i).getPiezasByCodpieza().getCodpiezas();
            }
            cantidadpro = 0;
        }
        labelPiezasMas.setText("Pieza de la que se ha suministrado mas cantidad: " + cod + " - " + cantidad);
        cantidad = 0;
        cod = null;
        //pieza que se ha suministrado a mas proyectos
        for (int i = 0; i < relaciones.size(); i++) {
            for (GestionEntity relacione : relaciones) {
                if (relaciones.get(i).getPiezasByCodpieza().getCodpiezas().equals(relacione.getPiezasByCodpieza().getCodpiezas())) {
                    cantidadpro = cantidadpro + 1;
                }
            }
            if (cantidad < cantidadpro) {
                cantidad = cantidadpro;
                cod = relaciones.get(i).getPiezasByCodpieza().getCodpiezas();
            }
            cantidadpro = 0;
        }
        labelPiezasProyecto.setText("Pieza que se ha suministrado a mas proyectos: " + cod + " - " + cantidad);
        cantidad = 0;
        cod = null;
        //proveedor que ha suministrado mas cantidad de piezas
        for (int i = 0; i < relaciones.size(); i++) {
            for (GestionEntity relacione : relaciones) {
                if (relaciones.get(i).getProveedoresByCodproveedor().getCodprov().equals(relacione.getProveedoresByCodproveedor().getCodprov())) {
                    cantidadpro = cantidadpro + relacione.getCantidad();
                }
            }
            if (cantidad < cantidadpro) {
                cantidad = cantidadpro;
                cod = relaciones.get(i).getProveedoresByCodproveedor().getCodprov();
            }
            cantidadpro = 0;
        }
        labelProveedorPiezasCantidad.setText("Proveedor que ha suministrado mas cantidad de piezas " + cod  + " - " + cantidad);
        cantidad = 0;
        cod = null;
        //proveedor que ha suministrado a mas proyectos
        for (int i = 0; i < relaciones.size(); i++) {
            for (GestionEntity relacione : relaciones) {
                if (relaciones.get(i).getProveedoresByCodproveedor().getCodprov().equals(relacione.getProveedoresByCodproveedor().getCodprov())) {
                    cantidadpro = cantidadpro + 1;
                }
            }
            if (cantidad < cantidadpro) {
                cantidad = cantidadpro;
                cod = relaciones.get(i).getProveedoresByCodproveedor().getCodprov();
            }
            cantidadpro = 0;
        }
        labelProveedorProyectosMax.setText("Proveedor que ha suministrado a mas proyectos: " + cod  + " - " + cantidad);
    }

    public void fixtable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }

    public void cargarDatosProveedores() {
        ConsultasProveedores con = new ConsultasProveedores();
        List<ProveedoresEntity> proveedores = new ArrayList<ProveedoresEntity>();
        proveedores = con.recuperarProveedores();
        con.cerrarConexion();
        ConsultasGestion consultasGestion = new ConsultasGestion();
        List<GestionEntity> relaciones = new ArrayList<GestionEntity>();
        relaciones = consultasGestion.recuperarGestionGeneral();
        con.cerrarConexion();
        List<String> piezas = new ArrayList<String>();
        List<String> proyectos = new ArrayList<String>();
        int suministrado = 0;
        int cantidad = proveedores.size();
        String[][] d = new String[cantidad][6];
        for (int i = 0; i < proveedores.size(); i++) {
            d[i][0] = String.valueOf(proveedores.get(i).getCodprov());
            d[i][1] = String.valueOf(proveedores.get(i).getNombre());
            d[i][2] = String.valueOf(proveedores.get(i).getApellidos());
            for (GestionEntity relacione : relaciones) {
                if (relacione.getProveedoresByCodproveedor().getCodprov().equals(proveedores.get(i).getCodprov())) {
                    if (!piezas.contains(relacione.getPiezasByCodpieza().getCodpiezas())) {
                        piezas.add(relacione.getPiezasByCodpieza().getCodpiezas());
                    }
                    if (!proyectos.contains(relacione.getProyectosByCodproyecto().getCodproye())) {
                        proyectos.add(relacione.getProyectosByCodproyecto().getCodproye());
                    }
                    suministrado = suministrado + relacione.getCantidad();
                }
            }
            d[i][3] = String.valueOf(piezas.size());
            d[i][4] = String.valueOf(suministrado);
            d[i][5] = String.valueOf(proyectos.size());
            suministrado = 0;
            piezas.clear();
            proyectos.clear();
        }
        //se carga el modelo de la tabla
        con.cerrarConexion();
        DefaultTableModel modelo = new DefaultTableModel(d, nombreColumnasProveedores) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table1.setModel(modelo);
    }

    public void cargarDatosPiezas() {
        //recuperamos proyectos
        ConsultasProyectos con = new ConsultasProyectos();
        List<ProyectosEntity> proyectos = new ArrayList<ProyectosEntity>();
        proyectos = con.recuperarProyectos();
        con.cerrarConexion();
        //recuperamos relaciones
        ConsultasGestion consultasGestion = new ConsultasGestion();
        List<GestionEntity> relaciones = new ArrayList<GestionEntity>();
        relaciones = consultasGestion.recuperarGestionGeneral();
        con.cerrarConexion();
        //cargamos los datos a la tabla
        List<String> proveedores = new ArrayList<String>();
        int suministrado = 0;
        int cantidad = proyectos.size();
        String[][] d = new String[cantidad][3];
        for (int i = 0; i < proyectos.size(); i++) {
            d[i][0] = String.valueOf(proyectos.get(i).getCodproye());
            for (GestionEntity relacione : relaciones) {
                if (relacione.getProyectosByCodproyecto().getCodproye().equals(proyectos.get(i).getCodproye())) {
                    if (!proveedores.contains(relacione.getProveedoresByCodproveedor().getCodprov())) {
                        proveedores.add(relacione.getProveedoresByCodproveedor().getCodprov());
                    }
                    suministrado = suministrado + relacione.getCantidad();
                }
            }
            d[i][1] = String.valueOf(suministrado);
            d[i][2] = String.valueOf(proveedores.size());
            suministrado = 0;
            proveedores.clear();
        }
        //se carga el modelo de la tabla
        con.cerrarConexion();
        DefaultTableModel modelo = new DefaultTableModel(d, nombreColumnasProyectos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table1.setModel(modelo);
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
        jTable1 = new javax.swing.JTable();
        labelPiezasMas = new javax.swing.JLabel();
        labelPiezasProyecto = new javax.swing.JLabel();
        labelProveedorPiezasCantidad = new javax.swing.JLabel();
        labelProveedorProyectosMax = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        botonProveedores = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonProyectos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPiezasMas.setForeground(new java.awt.Color(0, 0, 0));
        labelPiezasMas.setText("Pieza de la que se ha suministrado mas cantidad: ");
        add(labelPiezasMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 470, 30));

        labelPiezasProyecto.setForeground(new java.awt.Color(0, 0, 0));
        labelPiezasProyecto.setText("Pieza que se ha suministrado a mas proyectos:");
        add(labelPiezasProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 470, 30));

        labelProveedorPiezasCantidad.setForeground(new java.awt.Color(0, 0, 0));
        labelProveedorPiezasCantidad.setText("Proveedor que ha suministrado mas cantidad de piezas");
        add(labelProveedorPiezasCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 470, 30));

        labelProveedorProyectosMax.setForeground(new java.awt.Color(0, 0, 0));
        labelProveedorProyectosMax.setText("Proveedor que ha suministrado a mas proyectos:");
        add(labelProveedorProyectosMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 470, 30));

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
        jScrollPane2.setViewportView(table1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 810, 210));

        botonProveedores.setBackground(new java.awt.Color(57, 57, 58));
        botonProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonProveedoresMousePressed(evt);
            }
        });
        botonProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(219, 219, 219));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROVEEDORES");
        botonProveedores.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        add(botonProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 160, 40));

        botonProyectos.setBackground(new java.awt.Color(57, 57, 58));
        botonProyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonProyectosMousePressed(evt);
            }
        });
        botonProyectos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(219, 219, 219));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PROYECTOS");
        botonProyectos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        add(botonProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 160, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void botonProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProveedoresMousePressed
        cargarDatosProveedores();
    }//GEN-LAST:event_botonProveedoresMousePressed

    private void botonProyectosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProyectosMousePressed
        cargarDatosPiezas();
    }//GEN-LAST:event_botonProyectosMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonProveedores;
    private javax.swing.JPanel botonProyectos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelPiezasMas;
    private javax.swing.JLabel labelPiezasProyecto;
    private javax.swing.JLabel labelProveedorPiezasCantidad;
    private javax.swing.JLabel labelProveedorProyectosMax;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
