package consultas;

import hibernate.GestionEntity;
import hibernate.HibernateUtil;
import hibernate.PiezasEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class ConsultasGestion {
    Session session = null;
    List<PiezasEntity> piezas = new ArrayList<PiezasEntity>();

    public ConsultasGestion() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public List<GestionEntity> recuperarGestionGeneral() {
        return new ArrayList<>();
    }

    public void cerrarConexion() {
        session.close();
    }
}
