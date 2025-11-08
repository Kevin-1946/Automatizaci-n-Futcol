package co.com.AutoFacebook.userinterface.userinterfacejugadores;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class autenticacionJugadoresFutcol extends PageObject {

    public static final Target OPCION_JUGADORES = Target.the("Opción Sedes")
            .locatedBy("//div[contains(@class,'navbar-item') and contains(@class,'has-dropdown')]" +
                    "[.//a[@href='/participantes']]//div[contains(@class,'navbar-dropdown')]//a[normalize-space()='Jugadores']");
    public static Target CAMPO_NOMBRE = Target.the("Ingrese el nombre de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[1]");
    public static Target CAMPO_DOCUMENTO = Target.the("Ingrese el nombre de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[2]");
    public static Target CAMPO_NACIMIENTO = Target.the("Ingrese el nombre de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[3]");
    public static Target CAMPO_CORREOJUGADOR = Target.the("Ingrese el nombre de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[4]");
    public static Target CAMPO_CONTRASENA = Target.the("Ingrese el nombre de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[5]");
    public static Target CAMPO_IDEQUIPO = Target.the("Ingrese el nombre de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[6]");
    public static Target BTN_CREARJUGADOR= Target.the("Gestión de Sedes")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/button");
    public static Target MENSAJEJUGADORES_CONFIRMAR= Target.the("Gestión de Sedes")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/h3");
}