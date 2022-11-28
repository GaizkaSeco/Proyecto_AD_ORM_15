package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "gestion", schema = "proyecto_ad_final")
@IdClass(GestionEntityPK.class)
public class GestionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codproveedor", nullable = false, length = 6)
    private String codproveedor;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codpieza", nullable = false, length = 6)
    private String codpieza;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codproyecto", nullable = false, length = 6)
    private String codproyecto;
    @Basic
    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    @Basic
    @Column(name = "estado", nullable = false, length = 4)
    private String estado;

    public String getCodproveedor() {
        return codproveedor;
    }

    public void setCodproveedor(String codproveedor) {
        this.codproveedor = codproveedor;
    }

    public String getCodpieza() {
        return codpieza;
    }

    public void setCodpieza(String codpieza) {
        this.codpieza = codpieza;
    }

    public String getCodproyecto() {
        return codproyecto;
    }

    public void setCodproyecto(String codproyecto) {
        this.codproyecto = codproyecto;
    }

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
}
