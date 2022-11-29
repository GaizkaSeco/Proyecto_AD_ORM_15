package consultas;

import hibernate.HibernateUtil;
import hibernate.PiezasEntity;
import hibernate.ProyectosEntity;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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
