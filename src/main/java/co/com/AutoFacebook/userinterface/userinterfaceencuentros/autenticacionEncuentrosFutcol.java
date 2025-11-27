package co.com.AutoFacebook.userinterface.userinterfaceencuentros;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class autenticacionEncuentrosFutcol extends PageObject {

    public static final Target OPCION_ENCUENTROS = Target.the("Opción Encuentros")
            .locatedBy("//div[contains(@class,'navbar-item') and contains(@class,'has-dropdown')]" +
                    "[.//a[@href='/torneos']]//div[contains(@class,'navbar-dropdown')]//a[normalize-space()='Encuentros']");
    public static Target SELECCION_SEDEENCUENTROS = Target.the("Clique en el boton Crear")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/select[2]");
    public static Target CAMPO_DIAENCUENTRO = Target.the("Ingrese el nombre de la sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[1]");
    public static final Target CAMPO_HORAENCUENTRO = Target.the("Selector de sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[2]");
    public static Target SELECCION_EQUIPOLOCAL = Target.the("Clique en el boton Crear")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/select[4]");
    public static Target SELECCION_EQUIPOVISITANTE = Target.the("Clique en el boton Crear")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/select[5]");
    public static Target CAMPO_GOLESLOCAL = Target.the("Clique en el boton Crear")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[3]");
    public static Target CAMPO_GOLESVISITANTE = Target.the("Clique en el boton Crear")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[4]");
    public static Target BTN_CREARENCUENTRO = Target.the("Clique en el boton Crear")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/button");
    public static Target MENSAJEENCUENTROS_CONFIRMAR= Target.the("Encuentros")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/h2");
}