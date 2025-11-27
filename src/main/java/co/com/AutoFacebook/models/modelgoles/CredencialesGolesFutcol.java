package co.com.AutoFacebook.models.modelgoles;

public class CredencialesGolesFutcol {

    private String idjugadorgoles;
    private String idencuentrogoles;
    private String cantidadgoles;

    public String getIdjugadorgoles() {
        return idjugadorgoles;
    }

    public void setIdjugadorgoles(String idjugadorgoles) {
        this.idjugadorgoles = idjugadorgoles;
    }

    public String getIdencuentrogoles() {
        return idencuentrogoles;
    }

    public void setIdencuentrogoles(String idencuentrogoles) {
        this.idencuentrogoles = idencuentrogoles;
    }

    public String getCantidadgoles() {
        return cantidadgoles;
    }

    public void setCantidadgoles(String cantidadgoles) {
        this.cantidadgoles = cantidadgoles;
    }

    public CredencialesGolesFutcol(String idjugadorgoles, String idencuentrogoles, String cantidadgoles) {
        this.idjugadorgoles = idjugadorgoles;
        this.idencuentrogoles = idencuentrogoles;
        this.cantidadgoles = cantidadgoles;
    }
}
