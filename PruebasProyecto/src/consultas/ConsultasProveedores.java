package consultas;

import hibernate.HibernateUtil;
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

public class ConsultasProveedores {
    Session session = null;
    List<ProveedoresEntity> proveedores =new ArrayList<ProveedoresEntity>();

    public ConsultasProveedores() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public List<ProveedoresEntity> recuperarProveedores() {
        proveedores.clear();
        try {
            Query q = session.createQuery("from ProveedoresEntity");
            List<ProveedoresEntity> lista = q.list();
            proveedores.addAll(lista);

        } catch (ObjectNotFoundException o) {
            System.out.println("ERROR");
        }
        return proveedores;
    }

    public ProveedoresEntity cargarDatoConcreto(String codigo) {
            ProveedoresEntity proveedor = new ProveedoresEntity();
            proveedor = session.load(ProveedoresEntity.class, codigo);
            return proveedor;
    }

    public boolean anadirProveedor(String codigo, String nombre, String apellido, String direccion) {
        ProveedoresEntity proveedor = new ProveedoresEntity();
        Transaction tx = session.beginTransaction();
        proveedor.setCodprov(codigo);
        proveedor.setNombre(nombre);
        proveedor.setApellidos(apellido);
        proveedor.setDireccion(direccion);
        proveedor.setEstado("alta");
        session.save(proveedor);
        try {
            tx.commit();
            JOptionPane.showMessageDialog(null, "El proveedor se ha añadido correctamente.");
        } catch (ConstraintViolationException e) {
            System.out.println("EMPLEADO DUPLICADO");
            System.out.printf("MENSAJE:%s%n", e.getMessage());
            System.out.printf("COD ERROR:%d%n", e.getErrorCode());
            System.out.printf("ERROR SQL:%s%n", e.getSQLException().getMessage());
            return false;
        }
        return true;
    }

    public boolean editarProveedor(String codigo, String nombre, String apellido, String direccion, String estado) {
        ProveedoresEntity proveedor = new ProveedoresEntity();
        Transaction tx = session.beginTransaction();
        proveedor.setCodprov(codigo);
        proveedor.setNombre(nombre);
        proveedor.setApellidos(apellido);
        proveedor.setDireccion(direccion);
        proveedor.setEstado(estado);
        session.update(proveedor);
        try {
            tx.commit();
            JOptionPane.showMessageDialog(null, "El proveedor se ha editado correctamente.");
        } catch (ConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Ha surgido un error intentalo de nuevo mas tarde.");
            return false;
        }
        return true;
    }

    public void bajaProveedor(String codigo) {
        ProveedoresEntity pro = new ProveedoresEntity();
        Transaction tx = session.beginTransaction();
        pro = session.load(ProveedoresEntity.class, codigo);
        pro.setEstado("baja");
        tx.commit();
        session.update(pro);
    }

    public void cerrarConexion() {
        session.close();
    }
}
