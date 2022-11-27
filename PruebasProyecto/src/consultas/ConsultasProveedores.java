package consultas;

import hibernate.AgenciasEntity;
import hibernate.HibernateUtil;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ConsultasProveedores {
    Session session = null;

    public ConsultasProveedores() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public void recuperarProveedores() {
        try {
            AgenciasEntity agencia = new AgenciasEntity();
            agencia = (AgenciasEntity) session.load(AgenciasEntity.class, 1);
            System.out.println(agencia.getNombre());
        } catch (ObjectNotFoundException o) {
            System.out.println("ERROR");
        }
        session.close();
    }
}
