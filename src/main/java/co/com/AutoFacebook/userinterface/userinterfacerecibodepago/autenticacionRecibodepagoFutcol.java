package co.com.AutoFacebook.userinterface.userinterfacerecibodepago;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class autenticacionRecibodepagoFutcol extends PageObject {

    public static final Target OPCION_RECIBOS = Target.the("Opción Inscripciones")
            .locatedBy("//div[contains(@class,'navbar-item') and contains(@class,'has-dropdown')]" +
                    "[.//a[@href='/participantes']]//div[contains(@class,'navbar-dropdown')]//a[normalize-space()='Recibos']");
    public static Target OPCION_IDINSCRIPCION = Target.the("Ingrese el nombre de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[1]");
    public static Target OPCION_IDTORNEORECIBO = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[2]");
    public static Target OPCION_MONTORECIBO = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[3]");
    public static Target OPCION_FECHARECIBO = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[4]");
    public static Target OPCION_CONFIRMADORECIBO = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/label/input");
    public static Target OPCION_METODODEPAGORECIBO = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[5]");
    public static Target OPCION_NUMERODECOMPROBANTE = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[6]");
    public static Target BTN_CREARRECIBO = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/button");
    public static Target MENSAJERECIBODEPAGO_CONFIRMAR= Target.the("Administrador")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/h3");
}