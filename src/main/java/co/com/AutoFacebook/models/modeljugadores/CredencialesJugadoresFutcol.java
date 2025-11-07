package co.com.AutoFacebook.models.modeljugadores;

public class CredencialesJugadoresFutcol {

    private String nombre;
    private String documento;
    private String nacimiento;
    private String correojugador;
    private String contrasenajugador;
    private String idequipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCorreojugador() {
        return correojugador;
    }

    public void setCorreojugador(String correojugador) {
        this.correojugador = correojugador;
    }

    public String getContrasenajugador() {
        return contrasenajugador;
    }

    public void setContrasenajugador(String contrasenajugador) {
        this.contrasenajugador = contrasenajugador;
    }

    public String getIdequipo() {
        return idequipo;
    }

    public void setIdequipo(String idequipo) {
        this.idequipo = idequipo;
    }

    public CredencialesJugadoresFutcol(String nombre, String documento, String nacimiento, String correojugador, String contrasenajugador, String idequipo) {
        this.nombre = nombre;
        this.documento = documento;
        this.nacimiento = nacimiento;
        this.correojugador = correojugador;
        this.contrasenajugador = contrasenajugador;
        this.idequipo = idequipo;
    }
}
