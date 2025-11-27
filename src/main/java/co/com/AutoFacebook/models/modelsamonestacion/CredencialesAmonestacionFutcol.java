package co.com.AutoFacebook.models.modelsamonestacion;

public class CredencialesAmonestacionFutcol {

    private String selectEncuentro;

    private String selectJugador;

    private String equipoJugador;

    public String getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(String numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getEquipoJugador() {
        return equipoJugador;
    }

    public void setEquipoJugador(String equipoJugador) {
        this.equipoJugador = equipoJugador;
    }

    public String getSelectJugador() {
        return selectJugador;
    }

    public void setSelectJugador(String selectJugador) {
        this.selectJugador = selectJugador;
    }

    public String getSelectEncuentro() {
        return selectEncuentro;
    }

    public void setSelectEncuentro(String selectEncuentro) {
        this.selectEncuentro = selectEncuentro;
    }

    public CredencialesAmonestacionFutcol(String selectEncuentro, String selectJugador, String equipoJugador, String numeroCamiseta) {
        this.selectEncuentro = selectEncuentro;
        this.selectJugador = selectJugador;
        this.equipoJugador = equipoJugador;
        this.numeroCamiseta = numeroCamiseta;
    }

    private String numeroCamiseta;

}
