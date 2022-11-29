package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "proyectos", schema = "proyecto_ad_final", catalog = "")
public class ProyectosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "codproye", nullable = false, length = 6)
    private String codproye;
    @Basic
    @Column(name = "nombre", nullable = false, length = 40)
    private String nombre;
    @Basic
    @Column(name = "ciudad", nullable = true, length = 40)
    private String ciudad;
    @Basic
    @Column(name = "estado", nullable = false, length = 4)
    private String estado;

    public String getCodproye() {
        return codproye;
    }

    public void setCodproye(String codproye) {
        this.codproye = codproye;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}