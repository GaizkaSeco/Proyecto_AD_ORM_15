/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import consultas.ConsultasGestion;
import consultas.ConsultasProveedores;
import consultas.ConsultasProyectos;
import hibernate.GestionEntity;
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
public class PanelGestionProyectos extends javax.swing.JPanel {
    String[] nombreColumnas = {"Codigo", "Nombre", "Ciudad", "Estado"};
    JPanel content;
    TableRowSorter<DefaultTableModel> sorter;
    /**
     * Creates new form PanelGestionProyectos
     */
    public PanelGestionProyectos(JPanel content) {
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
        nombreField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        ciudadField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

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

        botonBaja.setBackground(new java.awt.Color(57, 57, 58));
        botonBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBajaMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(219, 219, 219));
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

        add(botonBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 155, -1));

        botonEditar.setBackground(new java.awt.Color(57, 57, 58));
        botonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEditarMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(219, 219, 219));
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

        add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, 155, -1));

        nombreField.setBackground(new java.awt.Color(204, 204, 204));
        nombreField.setBorder(null);
        nombreField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreFieldKeyReleased(evt);
            }
        });
        add(nombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 160, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 160, -1));

        ciudadField.setBackground(new java.awt.Color(204, 204, 204));
        ciudadField.setBorder(null);
        ciudadField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ciudadFieldKeyReleased(evt);
            }
        });
        add(ciudadField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 160, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 160, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Buscar por nombre: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Buscar por ciudad:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, -1, -1));

        codField.setBackground(new java.awt.Color(204, 204, 204));
        codField.setBorder(null);
        codField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codFieldKeyReleased(evt);
            }
        });
        add(codField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 160, 30));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 160, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Buscar por codigo: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void fixtable(JScrollPane scroll) {
        scroll.getViewport().setBackground(Color.WHITE);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel p = new JPanel();
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        scroll.setBorder(new EmptyBorder(5, 10, 5, 10));
    }

    public void bajaProyecto(String codigo) {
        ConsultasProyectos con = new ConsultasProyectos();
        con.bajaProyecto(codigo);
        con.cerrarConexion();
        cargarDatos();
    }

    public void editarProyecto(String codigo) {
        PanelEditarProyecto frame = new PanelEditarProyecto(content, codigo);
        frame.setSize(830,490);
        frame.setLocation(0,0);
        content.removeAll();
        content.add(frame, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    public void cargarDatos() {
        ConsultasProyectos con = new ConsultasProyectos();
        List<ProyectosEntity> proyectos = new ArrayList<ProyectosEntity>();
        proyectos = con.recuperarProyectos();
        int cantidad = proyectos.size();
        String[][] d = new String[cantidad][4];
        for (int i = 0; i < proyectos.size(); i++) {
            d[i][0] = String.valueOf(proyectos.get(i).getCodproye());
            d[i][1] = String.valueOf(proyectos.get(i).getNombre());
            d[i][2] = String.valueOf(proyectos.get(i).getCiudad());
            d[i][3] = String.valueOf(proyectos.get(i).getEstado());
        }
        //se carga el modelo de la tabla
        con.cerrarConexion();
        DefaultTableModel modelo = new DefaultTableModel(d, nombreColumnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table1.setModel(modelo);
        table1.setAutoCreateRowSorter(true);
        sorter = new TableRowSorter<>(modelo);
        table1.setRowSorter(sorter);
    }

    private void botonBajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBajaMousePressed
        if (table1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Para eliminar debes haber seleccionado algun dato en la tabla.");
        } else {
            //Obtencion del id del objeto seleccionaod en la tabla
            String codigo = table1.getValueAt(table1.getSelectedRow(), 0).toString();
            boolean relacion = false;
            ConsultasGestion con = new ConsultasGestion();
            List<GestionEntity> gestiones = con.recuperarGestionGeneral();
            con.cerrarConexion();
            for (GestionEntity gestion : gestiones) {
                if (gestion.getProyectosByCodproyecto().getCodproye().equals(codigo) && gestion.getEstado().equals("alta")) {
                    relacion = true;
                    break;
                }
            }
            if (relacion) {
                int op = JOptionPane.showConfirmDialog(this, "El proyecto que vas a dar de baja tiene una gestion activa.\n ??Estas seguro de que quieres dar de baja este proyecto?");
                if (op == 0) {
                    bajaProyecto(codigo);
                }
            } else {
                bajaProyecto(codigo);
            }
        }
    }//GEN-LAST:event_botonBajaMousePressed

    private void botonEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEditarMousePressed
        if (table1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Para editar debes haber seleccionado algun dato en la tabla.");
        } else {
            //Obtencion del id del objeto seleccionaod en la tabla
            String codigo = table1.getValueAt(table1.getSelectedRow(), 0).toString();
            editarProyecto(codigo);
        }
    }//GEN-LAST:event_botonEditarMousePressed

    private void nombreFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreFieldKeyReleased
        sorter.setRowFilter(RowFilter.regexFilter("(?i)"+nombreField.getText(), 1));
    }//GEN-LAST:event_nombreFieldKeyReleased

    private void ciudadFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ciudadFieldKeyReleased
        sorter.setRowFilter(RowFilter.regexFilter("(?i)"+ciudadField.getText(), 2));
    }//GEN-LAST:event_ciudadFieldKeyReleased

    private void codFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codFieldKeyReleased
        sorter.setRowFilter(RowFilter.regexFilter("(?i)"+codField.getText(), 0));
    }//GEN-LAST:event_codFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonBaja;
    private javax.swing.JPanel botonEditar;
    private javax.swing.JTextField ciudadField;
    private javax.swing.JTextField codField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
