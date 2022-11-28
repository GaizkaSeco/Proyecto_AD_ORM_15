package hibernate;

import java.io.Serializable;
import java.util.Objects;

public class GestionEntityPK implements Serializable {
    private String codproveedor;
    private String codpieza;
    private String codproyecto;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GestionEntityPK that = (GestionEntityPK) o;
        return Objects.equals(codproveedor, that.codproveedor) && Objects.equals(codpieza, that.codpieza) && Objects.equals(codproyecto, that.codproyecto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codproveedor, codpieza, codproyecto);
    }
}
