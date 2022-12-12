package hibernate;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "piezas", schema = "proyecto_ad_final", catalog = "")
public class PiezasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codpiezas", nullable = false, length = 6)
    private String codpiezas;
    @Basic
    @Column(name = "nombre", nullable = false, length = 20)
    private String nombre;
    @Basic
    @Column(name = "precio", nullable = false, precision = 0)
    private double precio;
    @Basic
    @Column(name = "descripcion", nullable = true, length = -1)
    private String descripcion;
    @Basic
    @Column(name = "estado", nullable = false, length = 4)
    private String estado;
    @OneToMany(mappedBy = "piezasByCodpieza")
    private Collection<GestionEntity> gestionsByCodpiezas;

    public String getCodpiezas() {
        return codpiezas;
    }

    public void setCodpiezas(String codpiezas) {
        this.codpiezas = codpiezas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Collection<GestionEntity> getGestionsByCodpiezas() {
        return gestionsByCodpiezas;
    }

    public void setGestionsByCodpiezas(Collection<GestionEntity> gestionsByCodpiezas) {
        this.gestionsByCodpiezas = gestionsByCodpiezas;
    }
}
