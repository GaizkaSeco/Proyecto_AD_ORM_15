package hibernate;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "proveedores", schema = "proyecto_ad_final", catalog = "")
public class ProveedoresEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codprov", nullable = false, length = 6)
    private String codprov;
    @Basic
    @Column(name = "nombre", nullable = false, length = 20)
    private String nombre;
    @Basic
    @Column(name = "apellidos", nullable = false, length = 30)
    private String apellidos;
    @Basic
    @Column(name = "direccion", nullable = false, length = 40)
    private String direccion;
    @Basic
    @Column(name = "estado", nullable = false, length = 4)
    private String estado;
    @OneToMany(mappedBy = "proveedoresByCodproveedor")
    private Collection<GestionEntity> gestionsByCodprov;

    public String getCodprov() {
        return codprov;
    }

    public void setCodprov(String codprov) {
        this.codprov = codprov;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Collection<GestionEntity> getGestionsByCodprov() {
        return gestionsByCodprov;
    }

    public void setGestionsByCodprov(Collection<GestionEntity> gestionsByCodprov) {
        this.gestionsByCodprov = gestionsByCodprov;
    }
}
