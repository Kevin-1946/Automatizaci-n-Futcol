package co.com.AutoFacebook.models.modelinscripciones;

public class CredencialesInscripcionesFutcol {

    private String idequipoinscripcion;
    private String idtorneoinscripcion;
    private String fechainscripcion;
    private String formadepago;
    private String estadodepago;
    private String valorinscripcion;

    public String getIdequipoinscripcion() {
        return idequipoinscripcion;
    }

    public void setIdequipoinscripcion(String idequipoinscripcion) {
        this.idequipoinscripcion = idequipoinscripcion;
    }

    public String getIdtorneoinscripcion() {
        return idtorneoinscripcion;
    }

    public void setIdtorneoinscripcion(String idtorneoinscripcion) {
        this.idtorneoinscripcion = idtorneoinscripcion;
    }

    public String getFechainscripcion() {
        return fechainscripcion;
    }

    public void setFechainscripcion(String fechainscripcion) {
        this.fechainscripcion = fechainscripcion;
    }

    public String getEstadodepago() {
        return estadodepago;
    }

    public void setEstadodepago(String estadodepago) {
        this.estadodepago = estadodepago;
    }

    public String getFormadepago() {
        return formadepago;
    }

    public void setFormadepago(String formadepago) {
        this.formadepago = formadepago;
    }

    public String getValorinscripcion() {
        return valorinscripcion;
    }

    public void setValorinscripcion(String valorinscripcion) {
        this.valorinscripcion = valorinscripcion;
    }

    public CredencialesInscripcionesFutcol(String idequipoinscripcion, String fechainscripcion, String idtorneoinscripcion, String formadepago, String estadodepago, String valorinscripcion) {
        this.idequipoinscripcion = idequipoinscripcion;
        this.fechainscripcion = fechainscripcion;
        this.idtorneoinscripcion = idtorneoinscripcion;
        this.formadepago = formadepago;
        this.estadodepago = estadodepago;
        this.valorinscripcion = valorinscripcion;
    }
}