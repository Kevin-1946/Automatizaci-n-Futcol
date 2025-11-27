package co.com.AutoFacebook.models.modelrecibodepago;

public class CredencialesRecibodepagoFutcol {

    private String idinscripcion;
    private String idtorneorecibo;
    private String montorecibo;
    private String fecharecibo;
    private String metododepagorecibo;
    private String numerodecomprobante;

    public String getIdinscripcion() {
        return idinscripcion;
    }

    public void setIdinscripcion(String idinscripcion) {
        this.idinscripcion = idinscripcion;
    }

    public String getIdtorneorecibo() {
        return idtorneorecibo;
    }

    public void setIdtorneorecibo(String idtorneorecibo) {
        this.idtorneorecibo = idtorneorecibo;
    }

    public String getMontorecibo() {
        return montorecibo;
    }

    public void setMontorecibo(String montorecibo) {
        this.montorecibo = montorecibo;
    }

    public String getFecharecibo() {
        return fecharecibo;
    }

    public void setFecharecibo(String fecharecibo) {
        this.fecharecibo = fecharecibo;
    }

    public String getMetododepagorecibo() {
        return metododepagorecibo;
    }

    public void setMetododepagorecibo(String metododepagorecibo) {
        this.metododepagorecibo = metododepagorecibo;
    }

    public String getNumerodecomprobante() {
        return numerodecomprobante;
    }

    public void setNumerodecomprobante(String numerodecomprobante) {
        this.numerodecomprobante = numerodecomprobante;
    }

    public CredencialesRecibodepagoFutcol(String idinscripcion, String idtorneorecibo, String montorecibo, String fecharecibo, String metododepagorecibo, String numerodecomprobante) {
        this.idinscripcion = idinscripcion;
        this.idtorneorecibo = idtorneorecibo;
        this.montorecibo = montorecibo;
        this.fecharecibo = fecharecibo;
        this.metododepagorecibo = metododepagorecibo;
        this.numerodecomprobante = numerodecomprobante;
    }
}
