package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "agencias", schema = "proyecto_ad", catalog = "")
public class AgenciasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "nombre", nullable = false, length = 20)
    private String nombre;
    @Basic
    @Column(name = "fecha_apertura", nullable = false, length = 10)
    private String fechaApertura;
    @Basic
    @Column(name = "direccion", nullable = false, length = 25)
    private String direccion;
    @Basic
    @Column(name = "email", nullable = false, length = 40)
    private String email;
    @Basic
    @Column(name = "telefono", nullable = false)
    private int telefono;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
