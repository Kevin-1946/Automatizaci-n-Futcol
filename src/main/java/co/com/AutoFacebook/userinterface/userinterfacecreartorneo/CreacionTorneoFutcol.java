package co.com.AutoFacebook.userinterface.userinterfacecreartorneo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CreacionTorneoFutcol extends PageObject {

    public static Target SELECT_TIPO_TORNEO = Target.the("Select tipo de torneo")
            .locatedBy("(//select)[1]");

    public static Target SELECT_CATEGORIA = Target.the("Select categoría")
            .locatedBy("(//select)[2]");

    public static Target INPUT_FECHA_INICIO = Target.the("Input fecha inicio")
            .locatedBy("(//input[@type='date'])[1]");

    public static Target INPUT_FECHA_FIN = Target.the("Input fecha fin")
            .locatedBy("(//input[@type='date'])[2]");

    public static Target SELECT_MODALIDAD = Target.the("Select modalidad")
            .locatedBy("(//select)[3]");

    public static Target INPUT_ORGANIZADOR = Target.the("Input organizador")
            .locatedBy("//input[@placeholder='Organizador']");

    public static Target INPUT_PRECIO = Target.the("Input precio")
            .locatedBy("//input[@placeholder='Precio']");

    public static Target SELECT_SEDE = Target.the("Select sede")
            .locatedBy("(//select)[4]");

    public static Target BTN_CREAR = Target.the("Botón Crear")
            .locatedBy("//button[contains(text(),'Crear')]");

    public static Target MENSAJE_EXITO = Target.the("Mensaje de éxito")
            .locatedBy("//h1 | //div[contains(@class,'success')] | //div[contains(@class,'alert')]");
}