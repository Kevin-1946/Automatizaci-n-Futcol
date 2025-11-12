package co.com.AutoFacebook.userinterface.userinterfacegoles;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class autenticacionGolesFutcol extends PageObject {

    public static final Target BTN_TORNEOS = Target.the("Menú Torneos")
            .locatedBy("//div[contains(@class,'navbar-item') and contains(@class,'has-dropdown')]//a[@href='/torneos']");
    public static final Target OPCION_GOLES = Target.the("Opción Sedes")
            .locatedBy("//div[contains(@class,'navbar-item') and contains(@class,'has-dropdown')]" +
                    "[.//a[@href='/torneos']]//div[contains(@class,'navbar-dropdown')]//a[normalize-space()='Goleadores']");
    public static Target CAMPO_IDJUGADORGOLES = Target.the("Ingrese el nombre de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[1]");
    public static Target CAMPO_IDENCUENTROGOLES = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[2]");
    public static Target CAMPO_CANTIDADGOLES = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[3]");
    public static Target BTN_REGISTRARGOLES = Target.the("Clique en el boton Crear")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/button");
    public static Target MENSAJEGOLES_CONFIRMAR= Target.the("Gestión de Sedes")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/h2");
}