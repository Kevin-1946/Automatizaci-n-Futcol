package co.com.AutoFacebook.userinterface.userinterfaceamonestaciones;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class autenticarseAmonestacionesFutcol extends PageObject {

    public static final Target OPCION_AMONESTACIONES = Target.the("Opción Sedes")
            .locatedBy("//div[contains(@class,'navbar-item') and contains(@class,'has-dropdown')]" +
                    "[.//a[@href='/torneos']]//div[contains(@class,'navbar-dropdown')]//a[normalize-space()='Amonestaciones']");

    public static Target SELECCION_ENCUENTRO = Target.the("Select encuentro")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/select[1]");

    public static Target SELECCION_JUGADOR = Target.the("Select jugador")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/select[2]");

    public static Target CAMPO_NUMEROCAMISETA = Target.the("Input numero camiseta")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input");

    public static Target BTN_TARJETA = Target.the("Select tarjeta")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/label[3]/input");

    public static Target BTN_CREARAMONESTACION = Target.the("Input organizador")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/button");

    public static Target MENSAJECREARAMONESTACION_CONFIRMAR = Target.the("Input organizador")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/div");
}
