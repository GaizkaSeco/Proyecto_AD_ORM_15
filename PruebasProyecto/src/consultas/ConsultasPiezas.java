package consultas;

import hibernate.HibernateUtil;
import hibernate.PiezasEntity;
import hibernate.ProveedoresEntity;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.query.Query;

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
        } catch (ConstraintViolationException e) {
            System.out.println("EMPLEADO DUPLICADO");
            System.out.printf("MENSAJE:%s%n", e.getMessage());
            System.out.printf("COD ERROR:%d%n", e.getErrorCode());
            System.out.printf("ERROR SQL:%s%n", e.getSQLException().getMessage());
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
