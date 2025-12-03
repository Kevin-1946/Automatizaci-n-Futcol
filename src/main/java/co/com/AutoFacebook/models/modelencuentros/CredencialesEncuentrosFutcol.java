package co.com.AutoFacebook.models.modelencuentros;

public class CredencialesEncuentrosFutcol {

    private String nombreencuentro;
    private String diaencuentro;
    private String horaencuentro;
    private String goleslocalencuentro;
    private String golesvisitanteencuentro;

    public String getNombreencuentro() {
        return nombreencuentro;
    }

    public void setNombreencuentro(String nombreencuentro) {
        this.nombreencuentro = nombreencuentro;
    }

    public String getDiaencuentro() {
        return diaencuentro;
    }

    public void setDiaencuentro(String diaencuentro) {
        this.diaencuentro = diaencuentro;
    }

    public String getHoraencuentro() {
        return horaencuentro;
    }

    public void setHoraencuentro(String horaencuentro) {
        this.horaencuentro = horaencuentro;
    }

    public String getGoleslocalencuentro() {
        return goleslocalencuentro;
    }

    public void setGoleslocalencuentro(String goleslocalencuentro) {
        this.goleslocalencuentro = goleslocalencuentro;
    }

    public String getGolesvisitanteencuentro() {
        return golesvisitanteencuentro;
    }

    public void setGolesvisitanteencuentro(String golesvisitanteencuentro) {
        this.golesvisitanteencuentro = golesvisitanteencuentro;
    }

    public CredencialesEncuentrosFutcol(String nombreencuentro, String diaencuentro, String horaencuentro, String goleslocalencuentro, String golesvisitanteencuentro) {
        this.nombreencuentro = nombreencuentro;
        this.diaencuentro = diaencuentro;
        this.horaencuentro = horaencuentro;
        this.goleslocalencuentro = goleslocalencuentro;
        this.golesvisitanteencuentro = golesvisitanteencuentro;
    }
}