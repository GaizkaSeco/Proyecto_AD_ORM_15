package consultas;

import hibernate.HibernateUtil;
import hibernate.PiezasEntity;
import hibernate.ProveedoresEntity;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class ConsultasPiezas {
    Session session = null;
    List<PiezasEntity> piezas = new ArrayList<PiezasEntity>();

    public ConsultasPiezas() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
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
