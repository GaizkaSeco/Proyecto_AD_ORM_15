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
public class PanelGestionGlobalProveedores extends javax.swing.JPanel {
    JPanel content;
    String[] nombreColumnasPiezas = {"Codigo", "Nombre", "Precio", "Descripcion"};
    String[] nombreColumnasProyectos = {"Codigo", "Nombre", "Ciudad", "Estado"};

    /**
     * Creates new form PanelGestionGlobalProveedores
     */
    public PanelGestionGlobalProveedores(JPanel content) {
        initComponents();
        this.content = content;

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
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        fixtable(jScrollPane1);
        tablePiezas.setShowHorizontalLines(true);
        tablePiezas.setGridColor(new Color(230, 230, 230));
        tablePiezas.setRowHeight(30);
        tablePiezas.getTableHeader().setReorderingAllowed(true);
        tablePiezas.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                if (column == nombreColumnasPiezas.length) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        jScrollPane2.getViewport().setBackground(Color.WHITE);
        jScrollPane2.setVerticalScrollBar(new ScrollBarCustom());
        fixtable(jScrollPane2);
        ConsultasProveedores con = new ConsultasProveedores();
        List<ProveedoresEntity> proveedores = con.recuperarProveedores();
        for (ProveedoresEntity proveedor : proveedores) {
            jComboBox1.addItem(proveedor.getCodprov());
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

    public void cargarTablaPiezas(List<PiezasEntity> piezas) {
        //cargamos los datos
        int cantidad = piezas.size();
        String[][] d = new String[cantidad][4];
        for (int i = 0; i < piezas.size(); i++) {
            d[i][0] = String.valueOf(piezas.get(i).getCodpiezas());
            d[i][1] = String.valueOf(piezas.get(i).getNombre());
            d[i][2] = String.valueOf(piezas.get(i).getPrecio());
            d[i][3] = String.valueOf(piezas.get(i).getDescripcion());
        }
        //se carga el modelo de la tabla
        tablePiezas.setModel(new DefaultTableModel(d, nombreColumnasPiezas) {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePiezas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProyectos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        labelProyectos = new javax.swing.JLabel();
        labelPiezas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 270, -1));

        tablePiezas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablePiezas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 400, 350));

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
        jScrollPane2.setViewportView(tableProyectos);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 400, 350));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Proveedor");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        labelProyectos.setForeground(new java.awt.Color(0, 0, 0));
        labelProyectos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelProyectos.setText("Numero de proyectos suministrados: ");
        add(labelProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 400, 30));

        labelPiezas.setForeground(new java.awt.Color(0, 0, 0));
        labelPiezas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPiezas.setText("Numero de piezas suministradas(total):");
        add(labelPiezas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 400, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PROYECTOS");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, 400, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PIEZAS");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 56, 400, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        //cambiar automaticamente los datos al cambiar el objeto del combobox
        List<PiezasEntity> piezas = new ArrayList<PiezasEntity>();
        List<ProyectosEntity> proyectos = new ArrayList<ProyectosEntity>();
        String cod = jComboBox1.getSelectedItem().toString();
        ConsultasGestion consultasGestion = new ConsultasGestion();
        List<GestionEntity> gestiones = consultasGestion.recuperarGestionGeneral();
        for (GestionEntity gestione : gestiones) {
            if (gestione.getProveedoresByCodproveedor().getCodprov().equals(cod)) {
                piezas.add(gestione.getPiezasByCodpieza());
                proyectos.add(gestione.getProyectosByCodproyecto());
            }
        }
        cargarTablaPiezas(piezas);
        cargarTablaProyectos(proyectos);
        consultasGestion.cerrarConexion();
        //Numero de peizas suministradas
        int total = 0;
        for (GestionEntity gestione : gestiones) {
            if (gestione.getProveedoresByCodproveedor().getCodprov().equals(jComboBox1.getSelectedItem())) {
                total = total + gestione.getCantidad();
            }
        }
        labelPiezas.setText("Numero de piezas suministradas(total): " + total);
        //numero de proyectos suministrados
        labelProyectos.setText("Numero de proyectos suministrados: " + proyectos.size());
    }//GEN-LAST:event_jComboBox1ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelPiezas;
    private javax.swing.JLabel labelProyectos;
    private javax.swing.JTable tablePiezas;
    private javax.swing.JTable tableProyectos;
    // End of variables declaration//GEN-END:variables
}
