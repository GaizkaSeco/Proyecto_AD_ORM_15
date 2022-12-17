/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import consultas.ConsultasGestion;
import consultas.ConsultasPiezas;
import consultas.ConsultasProveedores;
import hibernate.GestionEntity;
import hibernate.PiezasEntity;
import hibernate.ProveedoresEntity;
import hibernate.ProyectosEntity;
import scrollbar.ScrollBarCustom;
import table.TableHeader;

/**
 * @author omega
 */
public class PanelGestionGlobalPiezas extends javax.swing.JPanel {
    JPanel content;
    String[] nombreColumnasProveedores = {"Codigo", "Nombre", "Direccion", "Estado"};
    String[] nombreColumnasProyectos = {"Codigo", "Nombre", "Ciudad", "Estado"};

    /**
     * Creates new form PanelGestionGlobalPiezas
     */
    public PanelGestionGlobalPiezas(JPanel content) {
        initComponents();
        this.content = content;

        tableProveedores.setShowHorizontalLines(true);
        tableProveedores.setGridColor(new Color(230, 230, 230));
        tableProveedores.setRowHeight(30);
        tableProveedores.getTableHeader().setReorderingAllowed(true);
        tableProveedores.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if (column == nombreColumnasProveedores.length) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        fixtable(jScrollPane1);
        tableProyectos.setShowHorizontalLines(true);
        tableProyectos.setGridColor(new Color(230, 230, 230));
        tableProyectos.setRowHeight(30);
        tableProyectos.getTableHeader().setReorderingAllowed(true);
        tableProyectos.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if (column == nombreColumnasProyectos.length) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        jScrollPane2.getViewport().setBackground(Color.WHITE);
        jScrollPane2.setVerticalScrollBar(new ScrollBarCustom());
        fixtable(jScrollPane2);
        ConsultasPiezas con = new ConsultasPiezas();
        List<PiezasEntity> piezas = con.recuperarPiezas();
        for (PiezasEntity pieza : piezas) {
            jComboBox1.addItem(pieza.getCodpiezas());
        }
        con.cerrarConexion();
    }

    public void fixtable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }

    public void cargarTablaProveedores(List<ProveedoresEntity> proveedores) {
        //cargamos los datos
        int cantidad = proveedores.size();
        String[][] d = new String[cantidad][4];
        for (int i = 0; i < proveedores.size(); i++) {
            d[i][0] = String.valueOf(proveedores.get(i).getCodprov());
            d[i][1] = String.valueOf(proveedores.get(i).getNombre());
            d[i][2] = String.valueOf(proveedores.get(i).getDireccion());
            d[i][3] = String.valueOf(proveedores.get(i).getEstado());
        }
        //se carga el modelo de la tabla
        tableProveedores.setModel(new DefaultTableModel(d, nombreColumnasProveedores) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
    }

    public void cargarTablaProyectos(List<ProyectosEntity> proyectos) {
        //cargamos los datos
        int cantidad = proyectos.size();
        String[][] d = new String[cantidad][4];
        for (int i = 0; i < proyectos.size(); i++) {
            d[i][0] = String.valueOf(proyectos.get(i).getCodproye());
            d[i][1] = String.valueOf(proyectos.get(i).getNombre());
            d[i][2] = String.valueOf(proyectos.get(i).getCiudad());
            d[i][3] = String.valueOf(proyectos.get(i).getEstado());
        }
        //se carga el modelo de la tabla
        tableProyectos.setModel(new DefaultTableModel(d, nombreColumnasProyectos) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableProveedores = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProyectos = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableProveedores);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 400, 360));

        tableProyectos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableProyectos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 400, 360));

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 270, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Piezas");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        //cambiar automaticamente los datos al cambiar el objeto del combobox
        List<ProveedoresEntity> proveedores = new ArrayList<ProveedoresEntity>();
        List<ProyectosEntity> proyectos = new ArrayList<ProyectosEntity>();
        String cod = jComboBox1.getSelectedItem().toString();
        ConsultasGestion consultasGestion = new ConsultasGestion();
        List<GestionEntity> gestiones = consultasGestion.recuperarGestionGeneral();
        for (GestionEntity gestione : gestiones) {
            if (gestione.getPiezasByCodpieza().getCodpiezas().equals(cod)) {
                proveedores.add(gestione.getProveedoresByCodproveedor());
                proyectos.add(gestione.getProyectosByCodproyecto());
            }
        }
        cargarTablaProveedores(proveedores);
        cargarTablaProyectos(proyectos);
        consultasGestion.cerrarConexion();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableProveedores;
    private javax.swing.JTable tableProyectos;
    // End of variables declaration//GEN-END:variables
}
