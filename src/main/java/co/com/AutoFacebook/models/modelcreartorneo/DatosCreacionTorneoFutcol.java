package co.com.AutoFacebook.models.modelcreartorneo;

public class DatosCreacionTorneoFutcol {

    private String tipoTorneo;
    private String categoria;
    private String fechaInicio;
    private String fechaFin;
    private String modalidad;
    private String organizador;
    private String precio;
    private String sede;

    // Constructor
    public DatosCreacionTorneoFutcol(String tipoTorneo, String categoria,
                                     String fechaInicio, String fechaFin,
                                     String modalidad, String organizador,
                                     String precio, String sede) {
        this.tipoTorneo = tipoTorneo;
        this.categoria = categoria;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.modalidad = modalidad;
        this.organizador = organizador;
        this.precio = precio;
        this.sede = sede;
    }

    // Getters
    public String getTipoTorneo() { return tipoTorneo; }
    public String getCategoria() { return categoria; }
    public String getFechaInicio() { return fechaInicio; }
    public String getFechaFin() { return fechaFin; }
    public String getModalidad() { return modalidad; }
    public String getOrganizador() { return organizador; }
    public String getPrecio() { return precio; }
    public String getSede() { return sede; }

    // Setters
    public void setTipoTorneo(String tipoTorneo) { this.tipoTorneo = tipoTorneo; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }
    public void setFechaFin(String fechaFin) { this.fechaFin = fechaFin; }
    public void setModalidad(String modalidad) { this.modalidad = modalidad; }
    public void setOrganizador(String organizador) { this.organizador = organizador; }
    public void setPrecio(String precio) { this.precio = precio; }
    public void setSede(String sede) { this.sede = sede; }
}