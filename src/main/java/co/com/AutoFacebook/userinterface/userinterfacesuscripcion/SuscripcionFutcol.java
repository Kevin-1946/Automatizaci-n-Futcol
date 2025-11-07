package co.com.AutoFacebook.userinterface.userinterfacesuscripcion;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SuscripcionFutcol extends PageObject {

    // boton suscribirse
    public static Target BTN_SUSCRIBIRSE = Target.the("Clic en el botón Suscribirse del menú")
            .locatedBy("//*[@id=\"root\"]/div/nav/div[2]/a[2]");

    // equipo
    public static Target CAMPO_NOMBRE_EQUIPO = Target.the("Ingrese el nombre del equipo")
            .locatedBy("//*[@id=\"nombre_equipo\"]");

    public static Target SELECT_TORNEO = Target.the("Seleccione el torneo")
            .locatedBy("//*[@id=\"torneo_id\"]");

    public static Target SELECT_FORMA_PAGO = Target.the("Seleccione la forma de pago")
            .locatedBy("//*[@id=\"forma_pago\"]");

    // capitan
    public static Target CAMPO_NOMBRE_CAPITAN = Target.the("Ingrese el nombre completo del capitán")
            .locatedBy("//*[@id=\"capitan_nombre\"]");

    public static Target CAMPO_CORREO_CAPITAN = Target.the("Ingrese el correo del capitán")
            .locatedBy("//*[@id=\"capitan_email\"]");

    public static Target CAMPO_DOCUMENTO_CAPITAN = Target.the("Ingrese el documento del capitán")
            .locatedBy("//*[@id=\"capitan_documento\"]");

    public static Target CAMPO_CONTRASENA_CAPITAN = Target.the("Ingrese la contraseña del capitán")
            .locatedBy("//*[@id=\"capitan_password\"]");

    public static Target SELECT_GENERO_CAPITAN = Target.the("Seleccione el género del capitán")
            .locatedBy("//*[@id=\"capitan_genero\"]");

    public static Target CAMPO_EDAD_CAPITAN = Target.the("Ingrese la edad del capitán")
            .locatedBy("//*[@id=\"capitan_edad\"]");

    public static Target CAMPO_FECHA_NACIMIENTO_CAPITAN = Target.the("Ingrese la fecha de nacimiento del capitán")
            .locatedBy("//*[@id=\"capitan_fecha_nacimiento\"]");

    // jugador1
    public static Target CAMPO_NOMBRE_JUGADOR1 = Target.the("Ingrese el nombre del jugador 1")
            .locatedBy("//*[@id=\"jugador_0_nombre\"]");

    public static Target CAMPO_EMAIL_JUGADOR1 = Target.the("Ingrese el email del jugador 1")
            .locatedBy("//*[@id=\"jugador_0_email\"]");

    public static Target CAMPO_DOCUMENTO_JUGADOR1 = Target.the("Ingrese el documento del jugador 1")
            .locatedBy("//*[@id=\"jugador_0_documento\"]");

    public static Target SELECT_GENERO_JUGADOR1 = Target.the("Seleccione el género del jugador 1")
            .locatedBy("//*[@id=\"jugador_0_genero\"]");

    public static Target CAMPO_EDAD_JUGADOR1 = Target.the("Ingrese la edad del jugador 1")
            .locatedBy("//*[@id=\"jugador_0_edad\"]");

    public static Target CAMPO_FECHA_NACIMIENTO_JUGADOR1 = Target.the("Ingrese la fecha de nacimiento del jugador 1")
            .locatedBy("//*[@id=\"jugador_0_fecha_nacimiento\"]");

    // jugador 2
    public static Target CAMPO_NOMBRE_JUGADOR2 = Target.the("Ingrese el nombre del jugador 2")
            .locatedBy("//*[@id=\"jugador_1_nombre\"]");

    public static Target CAMPO_EMAIL_JUGADOR2 = Target.the("Ingrese el email del jugador 2")
            .locatedBy("//*[@id=\"jugador_1_email\"]");

    public static Target CAMPO_DOCUMENTO_JUGADOR2 = Target.the("Ingrese el documento del jugador 2")
            .locatedBy("//*[@id=\"jugador_1_documento\"]");

    public static Target SELECT_GENERO_JUGADOR2 = Target.the("Seleccione el género del jugador 2")
            .locatedBy("//*[@id=\"jugador_1_genero\"]");

    public static Target CAMPO_EDAD_JUGADOR2 = Target.the("Ingrese la edad del jugador 2")
            .locatedBy("//*[@id=\"jugador_1_edad\"]");

    public static Target CAMPO_FECHA_NACIMIENTO_JUGADOR2 = Target.the("Ingrese la fecha de nacimiento del jugador 2")
            .locatedBy("//*[@id=\"jugador_1_fecha_nacimiento\"]");

    // jugador 3
    public static Target CAMPO_NOMBRE_JUGADOR3 = Target.the("Ingrese el nombre del jugador 3")
            .locatedBy("//*[@id=\"jugador_2_nombre\"]");

    public static Target CAMPO_EMAIL_JUGADOR3 = Target.the("Ingrese el email del jugador 3")
            .locatedBy("//*[@id=\"jugador_2_email\"]");

    public static Target CAMPO_DOCUMENTO_JUGADOR3 = Target.the("Ingrese el documento del jugador 3")
            .locatedBy("//*[@id=\"jugador_2_documento\"]");

    public static Target SELECT_GENERO_JUGADOR3 = Target.the("Seleccione el género del jugador 3")
            .locatedBy("//*[@id=\"jugador_2_genero\"]");

    public static Target CAMPO_EDAD_JUGADOR3 = Target.the("Ingrese la edad del jugador 3")
            .locatedBy("//*[@id=\"jugador_2_edad\"]");

    public static Target CAMPO_FECHA_NACIMIENTO_JUGADOR3 = Target.the("Ingrese la fecha de nacimiento del jugador 3")
            .locatedBy("//*[@id=\"jugador_2_fecha_nacimiento\"]");

    // jugador 4
    public static Target CAMPO_NOMBRE_JUGADOR4 = Target.the("Ingrese el nombre del jugador 4")
            .locatedBy("//*[@id=\"jugador_3_nombre\"]");

    public static Target CAMPO_EMAIL_JUGADOR4 = Target.the("Ingrese el email del jugador 4")
            .locatedBy("//*[@id=\"jugador_3_email\"]");

    public static Target CAMPO_DOCUMENTO_JUGADOR4 = Target.the("Ingrese el documento del jugador 4")
            .locatedBy("//*[@id=\"jugador_3_documento\"]");

    public static Target SELECT_GENERO_JUGADOR4 = Target.the("Seleccione el género del jugador 4")
            .locatedBy("//*[@id=\"jugador_3_genero\"]");

    public static Target CAMPO_EDAD_JUGADOR4 = Target.the("Ingrese la edad del jugador 4")
            .locatedBy("//*[@id=\"jugador_3_edad\"]");

    public static Target CAMPO_FECHA_NACIMIENTO_JUGADOR4 = Target.the("Ingrese la fecha de nacimiento del jugador 4")
            .locatedBy("//*[@id=\"jugador_3_fecha_nacimiento\"]");

    // jugador 5
    public static Target CAMPO_NOMBRE_JUGADOR5 = Target.the("Ingrese el nombre del jugador 5")
            .locatedBy("//*[@id=\"jugador_4_nombre\"]");

    public static Target CAMPO_EMAIL_JUGADOR5 = Target.the("Ingrese el email del jugador 5")
            .locatedBy("//*[@id=\"jugador_4_email\"]");

    public static Target CAMPO_DOCUMENTO_JUGADOR5 = Target.the("Ingrese el documento del jugador 5")
            .locatedBy("//*[@id=\"jugador_4_documento\"]");

    public static Target SELECT_GENERO_JUGADOR5 = Target.the("Seleccione el género del jugador 5")
            .locatedBy("//*[@id=\"jugador_4_genero\"]");

    public static Target CAMPO_EDAD_JUGADOR5 = Target.the("Ingrese la edad del jugador 5")
            .locatedBy("//*[@id=\"jugador_4_edad\"]");

    public static Target CAMPO_FECHA_NACIMIENTO_JUGADOR5 = Target.the("Ingrese la fecha de nacimiento del jugador 5")
            .locatedBy("//*[@id=\"jugador_4_fecha_nacimiento\"]");

    //jugador 6
    public static Target CAMPO_NOMBRE_JUGADOR6 = Target.the("Ingrese el nombre del jugador 6")
            .locatedBy("//*[@id=\"jugador_5_nombre\"]");

    public static Target CAMPO_EMAIL_JUGADOR6 = Target.the("Ingrese el email del jugador 6")
            .locatedBy("//*[@id=\"jugador_5_email\"]");

    public static Target CAMPO_DOCUMENTO_JUGADOR6 = Target.the("Ingrese el documento del jugador 6")
            .locatedBy("//*[@id=\"jugador_5_documento\"]");

    public static Target SELECT_GENERO_JUGADOR6 = Target.the("Seleccione el género del jugador 6")
            .locatedBy("//*[@id=\"jugador_5_genero\"]");

    public static Target CAMPO_EDAD_JUGADOR6 = Target.the("Ingrese la edad del jugador 6")
            .locatedBy("//*[@id=\"jugador_5_edad\"]");

    public static Target CAMPO_FECHA_NACIMIENTO_JUGADOR6 = Target.the("Ingrese la fecha de nacimiento del jugador 6")
            .locatedBy("//*[@id=\"jugador_5_fecha_nacimiento\"]");

    //jugador 7
    public static Target CAMPO_NOMBRE_JUGADOR7 = Target.the("Ingrese el nombre del jugador 7")
            .locatedBy("//*[@id=\"jugador_6_nombre\"]");

    public static Target CAMPO_EMAIL_JUGADOR7 = Target.the("Ingrese el email del jugador 7")
            .locatedBy("//*[@id=\"jugador_6_email\"]");

    public static Target CAMPO_DOCUMENTO_JUGADOR7 = Target.the("Ingrese el documento del jugador 7")
            .locatedBy("//*[@id=\"jugador_6_documento\"]");

    public static Target SELECT_GENERO_JUGADOR7 = Target.the("Seleccione el género del jugador 7")
            .locatedBy("//*[@id=\"jugador_6_genero\"]");

    public static Target CAMPO_EDAD_JUGADOR7 = Target.the("Ingrese la edad del jugador 7")
            .locatedBy("//*[@id=\"jugador_6_edad\"]");

    public static Target CAMPO_FECHA_NACIMIENTO_JUGADOR7 = Target.the("Ingrese la fecha de nacimiento del jugador 7")
            .locatedBy("//*[@id=\"jugador_6_fecha_nacimiento\"]");

    //botones añadir y enviar
    public static Target BTN_ANADIR_JUGADOR = Target.the("Clic en el botón Añadir jugador")
            .locatedBy("//*[@id=\"root\"]/div/main/div/form/div[4]/div[3]/button");

    public static Target BTN_ENVIAR_INSCRIPCION = Target.the("Clic en el botón Enviar Inscripción")
            .locatedBy("//*[@id=\"root\"]/div/main/div/form/div[5]/button");

    public static Target MENSAJE_INSCRIPCION_EXITOSA = Target.the("Mensaje de inscripción exitosa")
            .locatedBy("//*[@id=\"root\"]/div/main/div/div[2]/div/h2");
}