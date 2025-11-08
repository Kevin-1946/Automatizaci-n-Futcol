package co.com.AutoFacebook.userinterface.userinterfacesedes;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class autenticacionSedesFutcol extends PageObject {

    public static final Target BTN_TORNEOS = Target.the("Menú Torneos")
            .locatedBy("//div[contains(@class,'navbar-item') and contains(@class,'has-dropdown')]//a[@href='/torneos']");
    public static final Target OPCION_SEDES = Target.the("Opción Sedes")
            .locatedBy("//div[contains(@class,'navbar-item') and contains(@class,'has-dropdown')]" +
                    "[.//a[@href='/torneos']]//div[contains(@class,'navbar-dropdown')]//a[normalize-space()='Sedes']");
    public static Target CAMPO_SEDE = Target.the("Ingrese el nombre de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[1]");
    public static Target CAMPO_DIRECCION = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[2]");
    public static Target BTN_CREAR = Target.the("Clique en el boton Crear")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/div/button");
    public static Target MENSAJESEDES_CONFIRMAR= Target.the("Gestión de Sedes")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/h2");
}