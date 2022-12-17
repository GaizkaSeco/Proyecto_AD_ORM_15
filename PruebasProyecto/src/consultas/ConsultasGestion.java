package consultas;

import hibernate.*;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.PersistenceException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultasGestion {
    Session session = null;
    List<GestionEntity> gestion = new ArrayList<GestionEntity>();

    public ConsultasGestion() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public List<GestionEntity> recuperarGestionGeneral() {
        gestion.clear();
        try {
            Query q = session.createQuery("from GestionEntity");
            List<GestionEntity> lista = q.list();
            gestion.addAll(lista);
        } catch (ObjectNotFoundException o) {
            System.out.println("ERROR");
        }
        return gestion;
    }

    public boolean editarRelacion(String codigo, String codprove, String codpieza, String codproye, int cantidad, String estado, List<PiezasEntity> piezas, List<ProyectosEntity> proyectos, List<ProveedoresEntity> proveedores) {
        try {
            PiezasEntity pieza;
            pieza = null;
            ProveedoresEntity proveedor = null;
            ProyectosEntity proyecto = null;
            for (PiezasEntity piezasEntity : piezas) {
                if (piezasEntity.getCodpiezas().equals(codpieza)) {
                    pieza = piezasEntity;
                }
            }
            for (ProveedoresEntity proveedore : proveedores) {
                if (proveedore.getCodprov().equals(codprove)) {
                    proveedor = proveedore;
                }
            }
            for (ProyectosEntity proyectosEntity : proyectos) {
                if (proyectosEntity.getCodproye().equals(codproye)) {
                    proyecto = proyectosEntity;
                }
            }
            Transaction tx = session.beginTransaction();
            GestionEntity gestion = new GestionEntity();
            gestion.setId(Integer.parseInt(codigo));
            gestion.setPiezasByCodpieza(pieza);
            gestion.setProveedoresByCodproveedor(proveedor);
            gestion.setProyectosByCodproyecto(proyecto);
            gestion.setCantidad(cantidad);
            gestion.setEstado(estado);
            session.update(gestion);
            tx.commit();
            JOptionPane.showMessageDialog(null, "La relacion se ha editado correctamente.");
        } catch (PersistenceException e) {
            JOptionPane.showMessageDialog(null, "Ha surgido un error y no se ha podido editar la nueva relacion comprueba que los datos son correctos.");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean anadirRelacion(String codprove, String codpieza, String codproye, int cantidad) {
        try {
            ConsultasPiezas consultasPiezas = new ConsultasPiezas();
            PiezasEntity pieza = consultasPiezas.cargarDatoConcreto(codpieza);
            consultasPiezas.cerrarConexion();
            ConsultasProyectos consultasProyectos = new ConsultasProyectos();
            ProyectosEntity proyecto = consultasProyectos.cargarDatoConcreto(codproye);
            consultasProyectos.cerrarConexion();
            ConsultasProveedores consultasProveedores = new ConsultasProveedores();
            ProveedoresEntity proveedor = consultasProveedores.cargarDatoConcreto(codprove);
            consultasProveedores.cerrarConexion();
            Transaction tx = session.beginTransaction();
            GestionEntity gestion = new GestionEntity();
            gestion.setPiezasByCodpieza(pieza);
            gestion.setProveedoresByCodproveedor(proveedor);
            gestion.setProyectosByCodproyecto(proyecto);
            gestion.setCantidad(cantidad);
            gestion.setEstado("alta");
            session.save(gestion);
            tx.commit();
            JOptionPane.showMessageDialog(null, "La relacion se ha añadido correctamente.");
        } catch (PersistenceException e) {
            JOptionPane.showMessageDialog(null, "Ha surgido un error y no se ha podido añadir la nueva relacion.");
            return false;
        }
        return true;
    }

    public void eliminarGestion(int codigo) {
        GestionEntity gestion = new GestionEntity();
        Transaction tx = session.beginTransaction();
        gestion = session.load(GestionEntity.class, codigo);
        gestion.setEstado("baja");
        tx.commit();
        session.update(gestion);
    }

    public GestionEntity cargarDatoConcreto(String codigo) {
        GestionEntity relacion = new GestionEntity();
        relacion = session.load(GestionEntity.class, Integer.parseInt(codigo));
        return relacion;
    }

    public void cerrarConexion() {
        session.close();
    }
}
