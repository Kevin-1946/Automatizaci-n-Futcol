package co.com.AutoFacebook.userinterface.userinterfacejueces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class autenticacionJuecesFutcol extends PageObject {

    public static final Target BTN_PARTICIPANTES = Target.the("Menú Torneos")
            .locatedBy("//div[contains(@class,'navbar-item') and contains(@class,'has-dropdown')]//a[@href='/participantes']");
    public static final Target OPCION_JUECES = Target.the("Opción Sedes")
            .locatedBy("//div[contains(@class,'navbar-item') and contains(@class,'has-dropdown')]" +
                    "[.//a[@href='/participantes']]//div[contains(@class,'navbar-dropdown')]//a[normalize-space()='Jueces']");
    public static Target CAMPO_JUEZ = Target.the("Ingrese el nombre de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[1]");
    public static Target CAMPO_NUMEROJUEZ = Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[2]");
    public static Target CAMPO_CORREOJUEZ= Target.the("Ingrese la direccion de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[3]");
    public static final Target SELECCION_SEDE = Target.the("Selector de sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/select");
    public static Target BTN_CREARJUEZ= Target.the("Gestión de Sedes")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/button");
    public static Target MENSAJEJUECES_CONFIRMAR= Target.the("Gestión de Sedes")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/h2");
}