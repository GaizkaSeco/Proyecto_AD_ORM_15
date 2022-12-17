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

import javax.persistence.PersistenceException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultasPiezas {
    Session session = null;
    List<PiezasEntity> piezas = new ArrayList<PiezasEntity>();

    public ConsultasPiezas() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public boolean anadirPieza(String codigo, String nombre, float precio, String descripcion) {
        PiezasEntity pieza = new PiezasEntity();
        Transaction tx = session.beginTransaction();
        pieza.setCodpiezas(codigo);
        pieza.setNombre(nombre);
        pieza.setPrecio(precio);
        pieza.setDescripcion(descripcion);
        pieza.setEstado("alta");
        session.save(pieza);
        try {
            tx.commit();
            JOptionPane.showMessageDialog(null, "La pieza se ha añadido correctamente.");
        } catch (PersistenceException e) {
            JOptionPane.showMessageDialog(null, "Ha surgido un error y no se ha podido añadir la pieza comprueba que los datos con correctos.");
            return false;
        }
        return true;
    }

    public List<PiezasEntity> recuperarPiezas() {
        piezas.clear();
        try {
            Query q = session.createQuery("from PiezasEntity ");
            List<PiezasEntity> lista = q.list();
            piezas.addAll(lista);
        } catch (ObjectNotFoundException o) {
            System.out.println("ERROR");
        }
        return piezas;
    }

    public PiezasEntity cargarDatoConcreto(String codigo) {
        PiezasEntity pieza = new PiezasEntity();
        pieza = session.load(PiezasEntity.class, codigo);
        return pieza;
    }

    public List<PiezasEntity> cargarAltas() {
        List<PiezasEntity> piezas = new ArrayList<PiezasEntity>();
        Query q = session.createQuery("from PiezasEntity where estado = 'alta'");
        piezas = q.list();
        return piezas;
    }

    public boolean editarPieza(String codigo, String nombre, float precio, String descripcion, String estado) {
        PiezasEntity pieza = new PiezasEntity();
        Transaction tx = session.beginTransaction();
        pieza.setCodpiezas(codigo);
        pieza.setNombre(nombre);
        pieza.setPrecio(precio);
        pieza.setDescripcion(descripcion);
        pieza.setEstado(estado);
        session.update(pieza);
        try {
            tx.commit();
            JOptionPane.showMessageDialog(null, "La pieza se ha editado correctamente.");
        } catch (PersistenceException e) {
            JOptionPane.showMessageDialog(null, "Ha surgido un error y no se ha podido editar la pieza comprueba que los datos con correctos.");
            return false;
        }
        return true;
    }

    public void bajaPieza(String codigo) {
        PiezasEntity pieza = new PiezasEntity();
        Transaction tx = session.beginTransaction();
        pieza = session.load(PiezasEntity.class, codigo);
        pieza.setEstado("baja");
        tx.commit();
        session.update(pieza);
    }

    public void cerrarConexion() {
        session.close();
    }
}
