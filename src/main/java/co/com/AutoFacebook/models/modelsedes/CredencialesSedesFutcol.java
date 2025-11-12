package co.com.AutoFacebook.models.modelsedes;

public class CredencialesSedesFutcol {

    private String sede;
    private String direccion;

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public CredencialesSedesFutcol(String sede, String direccion) {
        this.sede = sede;
        this.direccion = direccion;
    }
}