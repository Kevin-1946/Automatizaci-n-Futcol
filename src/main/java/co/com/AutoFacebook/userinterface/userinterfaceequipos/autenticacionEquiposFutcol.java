package co.com.AutoFacebook.userinterface.userinterfaceequipos;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class autenticacionEquiposFutcol extends PageObject {

    public static final Target OPCION_EQUIPOS = Target.the("Opción Sedes")
            .locatedBy("//div[contains(@class,'navbar-item') and contains(@class,'has-dropdown')]" +
                    "[.//a[@href='/torneos']]//div[contains(@class,'navbar-dropdown')]//a[normalize-space()='Equipos']");
    public static Target CAMPO_EQUIPO = Target.the("Ingrese el nombre de la sede")
            .locatedBy("//*[@id=\"nombre\"]");
    public static final Target SELECCION_TORNEO = Target.the("Selector de sede")
            .locatedBy("//*[@id=\"torneo_id\"]");
    public static Target BTN_CREAREQUIPO = Target.the("Clique en el boton Crear")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/div[4]/button");
    public static Target MENSAJEEQUIPOS_CONFIRMAR= Target.the("Gestión de Sedes")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/h2");
}