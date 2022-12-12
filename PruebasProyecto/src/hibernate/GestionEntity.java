package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "gestion", schema = "proyecto_ad_final", catalog = "")
public class GestionEntity {
    @Basic
    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    @Basic
    @Column(name = "estado", nullable = false, length = 4)
    private String estado;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name = "codproveedor", referencedColumnName = "codprov", nullable = false)
    private ProveedoresEntity proveedoresByCodproveedor;
    @ManyToOne
    @JoinColumn(name = "codpieza", referencedColumnName = "codpiezas", nullable = false)
    private PiezasEntity piezasByCodpieza;
    @ManyToOne
    @JoinColumn(name = "codproyecto", referencedColumnName = "codproye", nullable = false)
    private ProyectosEntity proyectosByCodproyecto;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProveedoresEntity getProveedoresByCodproveedor() {
        return proveedoresByCodproveedor;
    }

    public void setProveedoresByCodproveedor(ProveedoresEntity proveedoresByCodproveedor) {
        this.proveedoresByCodproveedor = proveedoresByCodproveedor;
    }

    public PiezasEntity getPiezasByCodpieza() {
        return piezasByCodpieza;
    }

    public void setPiezasByCodpieza(PiezasEntity piezasByCodpieza) {
        this.piezasByCodpieza = piezasByCodpieza;
    }

    public ProyectosEntity getProyectosByCodproyecto() {
        return proyectosByCodproyecto;
    }

    public void setProyectosByCodproyecto(ProyectosEntity proyectosByCodproyecto) {
        this.proyectosByCodproyecto = proyectosByCodproyecto;
    }
}
