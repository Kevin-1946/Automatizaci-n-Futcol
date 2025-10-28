package co.com.AutoFacebook.models;

public class CredencialesInicioSesion {

    private String usuarios;
    private String clave;

    public String getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public CredencialesInicioSesion(String usuarios, String clave) {
        this.usuarios = usuarios;
        this.clave = clave;
    }
}
