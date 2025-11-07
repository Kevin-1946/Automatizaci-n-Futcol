package co.com.AutoFacebook.userinterface.userinterfacecreartorneo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MenuAdministradorFutcol extends PageObject {

    public static Target MENU_TORNEOS = Target.the("Menú Torneos en navbar")
            .locatedBy("//a[contains(text(),'Torneos')]");

    public static Target OPCION_TORNEOS = Target.the("Opción Torneos del submenú")
            .locatedBy("//a[contains(text(),'Torneos') and contains(@href,'admin')]");
}