package consultas;

import hibernate.HibernateUtil;
import hibernate.PiezasEntity;
import hibernate.ProveedoresEntity;
import hibernate.ProyectosEntity;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultasProyectos {
    Session session = null;
    List<ProyectosEntity> piezas = new ArrayList<ProyectosEntity>();

    public ConsultasProyectos() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public List<ProyectosEntity> recuperarProyectos() {
        piezas.clear();
        try {
            Query q = session.createQuery("from ProyectosEntity ");
            List<ProyectosEntity> lista = q.list();
            piezas.addAll(lista);
        } catch (ObjectNotFoundException o) {
            System.out.println("ERROR");
        }
        return piezas;
    }

    public ProyectosEntity cargarDatoConcreto(String codigo) {
        ProyectosEntity proyecto = new ProyectosEntity();
        proyecto = session.load(ProyectosEntity.class, codigo);
        return proyecto;
    }

    public boolean anadirProyecto(String codigo, String nombre, String ciudad) {
        ProyectosEntity proyecto = new ProyectosEntity();
        Transaction tx = session.beginTransaction();
        proyecto.setCodproye(codigo);
        proyecto.setNombre(nombre);
        proyecto.setCiudad(ciudad);
        proyecto.setEstado("alta");
        session.save(proyecto);
        try {
            tx.commit();
            JOptionPane.showMessageDialog(null, "El proyecto se ha añadido correctamente.");
        } catch (ConstraintViolationException e) {
            System.out.println("EMPLEADO DUPLICADO");
            System.out.printf("MENSAJE:%s%n", e.getMessage());
            System.out.printf("COD ERROR:%d%n", e.getErrorCode());
            System.out.printf("ERROR SQL:%s%n", e.getSQLException().getMessage());
            return false;
        }
        return true;
    }

    public boolean editarProyecto(String codigo, String nombre, String ciudad, String estado) {
        ProyectosEntity pieza = new ProyectosEntity();
        Transaction tx = session.beginTransaction();
        pieza.setCodproye(codigo);
        pieza.setNombre(nombre);
        pieza.setCiudad(ciudad);
        pieza.setEstado(estado);
        session.update(pieza);
        try {
            tx.commit();
            JOptionPane.showMessageDialog(null, "El proyecto se ha editado correctamente.");
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Ha surgido un error intentalo de nuevo mas tarde.");
            return false;
        }
        return true;
    }

    public void bajaProyecto(String codigo) {
        ProyectosEntity pieza = new ProyectosEntity();
        Transaction tx = session.beginTransaction();
        pieza = session.load(ProyectosEntity.class, codigo);
        pieza.setEstado("baja");
        tx.commit();
        session.update(pieza);
    }

    public void cerrarConexion() {
        session.close();
    }
}
