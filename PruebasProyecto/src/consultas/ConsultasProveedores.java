package consultas;

import hibernate.AgenciasEntity;
import hibernate.HibernateUtil;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class ConsultasProveedores {
    Session session = null;
    List<AgenciasEntity> agencias =new ArrayList<AgenciasEntity>();

    public ConsultasProveedores() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public List<AgenciasEntity> recuperarProveedores() {
        try {
            Query q = session.createQuery("from AgenciasEntity");
            List<AgenciasEntity> lista = q.list();
            agencias.addAll(lista);

        } catch (ObjectNotFoundException o) {
            System.out.println("ERROR");
        }
        session.close();
        return agencias;
    }
}
