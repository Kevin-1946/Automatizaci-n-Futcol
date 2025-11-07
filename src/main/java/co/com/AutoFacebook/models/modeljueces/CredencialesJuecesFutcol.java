package co.com.AutoFacebook.models.modeljueces;

public class CredencialesJuecesFutcol {

    private String juez;
    private String numerojuez;
    private String correojuez;

    public String getJuez() {
        return juez;
    }

    public void setJuez(String juez) {
        this.juez = juez;
    }

    public String getNumerojuez() {
        return numerojuez;
    }

    public void setNumerojuez(String numerojuez) {
        this.numerojuez = numerojuez;
    }

    public String getCorreojuez() {
        return correojuez;
    }

    public void setCorreojuez(String correojuez) {
        this.correojuez = correojuez;
    }

    public CredencialesJuecesFutcol(String juez, String numerojuez, String correojuez) {
        this.juez = juez;
        this.numerojuez = numerojuez;
        this.correojuez = correojuez;
    }
}
