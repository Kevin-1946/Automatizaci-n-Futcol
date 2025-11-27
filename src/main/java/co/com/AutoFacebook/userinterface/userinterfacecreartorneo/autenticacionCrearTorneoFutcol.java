package co.com.AutoFacebook.userinterface.userinterfacecreartorneo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class autenticacionCrearTorneoFutcol extends PageObject {

    public static final Target OPCION_TORNEOS = Target.the("Opción Torneos")
            .locatedBy("//div[contains(@class,'navbar-item') and contains(@class,'has-dropdown')]" +
                    "[.//a[@href='/torneos']]//div[contains(@class,'navbar-dropdown')]//a[normalize-space()='Torneos']");

    public static Target SELECCION_TIPO = Target.the("Select tipo de torneo")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/select[1]");

    public static Target SELECCION_CATEGORIA = Target.the("Select categoría")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/select[2]");

    public static Target CAMPO_FECHAINICIO = Target.the("Input fecha inicio")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[1]");

    public static Target CAMPO_FECHAFIN = Target.the("Input fecha fin")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[2]");

    public static Target SELECCION_MODALIDAD = Target.the("Select modalidad")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/select[3]");

    public static Target CAMPO_ORGANIZADOR = Target.the("Input organizador")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[3]");

    public static Target CAMPO_PRECIO = Target.the("Input precio")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/input[4]");

    public static Target SELECCIONTORNEO_SEDE = Target.the("Select sede")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/select[4]");

    public static Target BTN_CREARTORNEO = Target.the("Botón Crear")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/form/button");

    public static Target MENSAJECREARTORNEO_CONFIRMAR = Target.the("Mensaje de éxito")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/h2[1]");
}