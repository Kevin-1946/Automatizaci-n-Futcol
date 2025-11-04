package co.com.AutoFacebook.userinterface.userinterfacelogin;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class autenticacionFutcol extends PageObject {


    public static Target BTN_INICIARSESION = Target.the("Clique en el boton Iniciar Sesion")
            .locatedBy("//*[@id=\"root\"]/div/nav/div[2]/a[1]");
    public static Target CAMPO_CORREO = Target.the("Ingrese el correo")
            .locatedBy("//*[@id=\"root\"]/div/main/div/form/input[1]");

    public static Target CAMPO_CONTRASENA = Target.the("Ingrese la contraseña")
            .locatedBy("//*[@id=\"root\"]/div/main/div/form/input[2]");

    public static Target BTN_INICIAR = Target.the("Clique en el boton Iniciar Sesion")
            .locatedBy("//*[@id=\"root\"]/div/main/div/form/button");
    public static Target MENSAJE_CONFIRMAR = Target.the("¡Bienvenido a FUTCOL!")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div/h1");
}
