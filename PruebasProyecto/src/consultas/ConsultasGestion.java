package consultas;

import hibernate.*;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

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
        } catch (ConstraintViolationException e) {
            System.out.println("EMPLEADO DUPLICADO");
            System.out.printf("MENSAJE:%s%n", e.getMessage());
            System.out.printf("COD ERROR:%d%n", e.getErrorCode());
            System.out.printf("ERROR SQL:%s%n", e.getSQLException().getMessage());
            return false;
        }
        return true;
    }

    public void eliminarGestion(String codigo) {
        GestionEntity gestion = new GestionEntity();
        Transaction tx = session.beginTransaction();
        gestion = session.load(GestionEntity.class, codigo);
        gestion.setEstado("baja");
        tx.commit();
        session.update(gestion);
    }

    public void cerrarConexion() {
        session.close();
    }
}
