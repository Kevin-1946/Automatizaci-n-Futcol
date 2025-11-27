package co.com.AutoFacebook.userinterface.userinterfaceinscripciones;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class autenticacionInscripcionesFutcol extends PageObject {

    public static final Target OPCION_INSCRIPCIONES = Target.the("Opción Inscripciones")
            .locatedBy("//div[contains(@class,'navbar-item') and contains(@class,'has-dropdown')]" +
                    "[.//a[@href='/participantes']]//div[contains(@class,'navbar-dropdown')]//a[normalize-space()='Inscripciones']");
    public static Target OPCION_IDEQUIPO = Target.the("Ingrese el nombre de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[1]");
    public static Target OPCION_IDTORNEO = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[2]");
    public static Target OPCION_FECHAINSCRIPCION = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[3]");
    public static Target OPCION_FORMADEPAGO = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[4]");
    public static Target OPCION_ESTADODEPAGO = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[5]");
    public static Target SELECCION_CORREOELECTRONICO = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/label/input");
    public static Target OPCION_VALORINSCRIPCION = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[6]");
    public static Target BTN_CREARINSCRIPCION = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/button");
    public static Target MENSAJEINSCRIPCIONES_CONFIRMAR= Target.the("Administrador")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/h2");
}