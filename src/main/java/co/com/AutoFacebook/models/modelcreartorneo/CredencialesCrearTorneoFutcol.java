package co.com.AutoFacebook.models.modelcreartorneo;

public class CredencialesCrearTorneoFutcol {

    private String tipoTorneo;
    private String categoria;
    private String fechaInicio;
    private String fechaFin;
    private String modalidad;
    private String organizador;
    private String precio;
    private String sede;

    public String getTipoTorneo() {
        return tipoTorneo;
    }

    public void setTipoTorneo(String tipoTorneo) {
        this.tipoTorneo = tipoTorneo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public CredencialesCrearTorneoFutcol(String tipoTorneo, String categoria, String fechaInicio, String fechaFin, String modalidad, String organizador, String precio, String sede) {
        this.tipoTorneo = tipoTorneo;
        this.categoria = categoria;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.modalidad = modalidad;
        this.organizador = organizador;
        this.precio = precio;
        this.sede = sede;
    }
}

