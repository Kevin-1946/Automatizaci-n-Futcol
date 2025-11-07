package co.com.AutoFacebook.tasks.tasksuscripcion;

import co.com.AutoFacebook.models.modelsuscripcion.DatosSuscripcionFutcol;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

import static co.com.AutoFacebook.userinterface.userinterfacesuscripcion.SuscripcionFutcol.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SuscribirseFutcol implements Task {

    private final List<DatosSuscripcionFutcol> datosSuscripcion;

    public SuscribirseFutcol(List<DatosSuscripcionFutcol> datosSuscripcion) {
        this.datosSuscripcion = datosSuscripcion;
    }

    public static SuscribirseFutcol conLosDatos(List<DatosSuscripcionFutcol> datosSuscripcion) {
        return Instrumented.instanceOf(SuscribirseFutcol.class).withProperties(datosSuscripcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (datosSuscripcion == null || datosSuscripcion.isEmpty()) {
            throw new IllegalArgumentException("No hay información de suscripción.");
        }

        DatosSuscripcionFutcol datos = datosSuscripcion.get(0);

        actor.attemptsTo(
                Click.on(BTN_SUSCRIBIRSE),

                // equipo
                Scroll.to(CAMPO_NOMBRE_EQUIPO),
                Enter.theValue(datos.getNombreEquipo()).into(CAMPO_NOMBRE_EQUIPO),

                WaitUntil.the(CAMPO_NOMBRE_EQUIPO, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(datos.getNombreEquipo()).into(CAMPO_NOMBRE_EQUIPO),
                SelectFromOptions.byVisibleText(datos.getTorneo()).from(SELECT_TORNEO),
                SelectFromOptions.byVisibleText(datos.getFormaPago()).from(SELECT_FORMA_PAGO),

                // capitan
                Scroll.to(CAMPO_NOMBRE_CAPITAN),
                Enter.theValue(datos.getNombreCapitan()).into(CAMPO_NOMBRE_CAPITAN),

                Enter.theValue(datos.getNombreCapitan()).into(CAMPO_NOMBRE_CAPITAN),
                Enter.theValue(datos.getCorreoCapitan()).into(CAMPO_CORREO_CAPITAN),
                Enter.theValue(datos.getDocumentoCapitan()).into(CAMPO_DOCUMENTO_CAPITAN),
                Enter.theValue(datos.getContrasenaCapitan()).into(CAMPO_CONTRASENA_CAPITAN),
                SelectFromOptions.byVisibleText(datos.getGeneroCapitan()).from(SELECT_GENERO_CAPITAN),
                Enter.theValue(datos.getEdadCapitan()).into(CAMPO_EDAD_CAPITAN),
                Enter.theValue(datos.getFechaNacimientoCapitan()).into(CAMPO_FECHA_NACIMIENTO_CAPITAN),

                //jugador 1
                Scroll.to(CAMPO_NOMBRE_JUGADOR1),
                Enter.theValue(datos.getNombreJugador1()).into(CAMPO_NOMBRE_JUGADOR1),

                Enter.theValue(datos.getNombreJugador1()).into(CAMPO_NOMBRE_JUGADOR1),
                Enter.theValue(datos.getEmailJugador1()).into(CAMPO_EMAIL_JUGADOR1),
                Enter.theValue(datos.getDocumentoJugador1()).into(CAMPO_DOCUMENTO_JUGADOR1),
                SelectFromOptions.byVisibleText(datos.getGeneroJugador1()).from(SELECT_GENERO_JUGADOR1),
                Enter.theValue(datos.getEdadJugador1()).into(CAMPO_EDAD_JUGADOR1),
                Enter.theValue(datos.getFechaNacimientoJugador1()).into(CAMPO_FECHA_NACIMIENTO_JUGADOR1),

                // jugador 2
                WaitUntil.the(CAMPO_NOMBRE_JUGADOR2, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(datos.getNombreJugador2()).into(CAMPO_NOMBRE_JUGADOR2),
                Enter.theValue(datos.getEmailJugador2()).into(CAMPO_EMAIL_JUGADOR2),
                Enter.theValue(datos.getDocumentoJugador2()).into(CAMPO_DOCUMENTO_JUGADOR2),
                SelectFromOptions.byVisibleText(datos.getGeneroJugador2()).from(SELECT_GENERO_JUGADOR2),
                Enter.theValue(datos.getEdadJugador2()).into(CAMPO_EDAD_JUGADOR2),
                Enter.theValue(datos.getFechaNacimientoJugador2()).into(CAMPO_FECHA_NACIMIENTO_JUGADOR2),

                // jugador 3
                Scroll.to(CAMPO_NOMBRE_JUGADOR3),
                Enter.theValue(datos.getNombreJugador3()).into(CAMPO_NOMBRE_JUGADOR3),

                WaitUntil.the(CAMPO_NOMBRE_JUGADOR3, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(datos.getNombreJugador3()).into(CAMPO_NOMBRE_JUGADOR3),
                Enter.theValue(datos.getEmailJugador3()).into(CAMPO_EMAIL_JUGADOR3),
                Enter.theValue(datos.getDocumentoJugador3()).into(CAMPO_DOCUMENTO_JUGADOR3),
                SelectFromOptions.byVisibleText(datos.getGeneroJugador3()).from(SELECT_GENERO_JUGADOR3),
                Enter.theValue(datos.getEdadJugador3()).into(CAMPO_EDAD_JUGADOR3),
                Enter.theValue(datos.getFechaNacimientoJugador3()).into(CAMPO_FECHA_NACIMIENTO_JUGADOR3),

                //jugador 4
                WaitUntil.the(CAMPO_NOMBRE_JUGADOR4, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(datos.getNombreJugador4()).into(CAMPO_NOMBRE_JUGADOR4),
                Enter.theValue(datos.getEmailJugador4()).into(CAMPO_EMAIL_JUGADOR4),
                Enter.theValue(datos.getDocumentoJugador4()).into(CAMPO_DOCUMENTO_JUGADOR4),
                SelectFromOptions.byVisibleText(datos.getGeneroJugador4()).from(SELECT_GENERO_JUGADOR4),
                Enter.theValue(datos.getEdadJugador4()).into(CAMPO_EDAD_JUGADOR4),
                Enter.theValue(datos.getFechaNacimientoJugador4()).into(CAMPO_FECHA_NACIMIENTO_JUGADOR4),

                //jugador 5
                Scroll.to(CAMPO_NOMBRE_JUGADOR5),
                Enter.theValue(datos.getNombreJugador5()).into(CAMPO_NOMBRE_JUGADOR5),

                WaitUntil.the(CAMPO_NOMBRE_JUGADOR5, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(datos.getNombreJugador5()).into(CAMPO_NOMBRE_JUGADOR5),
                Enter.theValue(datos.getEmailJugador5()).into(CAMPO_EMAIL_JUGADOR5),
                Enter.theValue(datos.getDocumentoJugador5()).into(CAMPO_DOCUMENTO_JUGADOR5),
                SelectFromOptions.byVisibleText(datos.getGeneroJugador5()).from(SELECT_GENERO_JUGADOR5),
                Enter.theValue(datos.getEdadJugador5()).into(CAMPO_EDAD_JUGADOR5),
                Enter.theValue(datos.getFechaNacimientoJugador5()).into(CAMPO_FECHA_NACIMIENTO_JUGADOR5),

                //jugador 6
                WaitUntil.the(CAMPO_NOMBRE_JUGADOR6, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(datos.getNombreJugador6()).into(CAMPO_NOMBRE_JUGADOR6),
                Enter.theValue(datos.getEmailJugador6()).into(CAMPO_EMAIL_JUGADOR6),
                Enter.theValue(datos.getDocumentoJugador6()).into(CAMPO_DOCUMENTO_JUGADOR6),
                SelectFromOptions.byVisibleText(datos.getGeneroJugador6()).from(SELECT_GENERO_JUGADOR6),
                Enter.theValue(datos.getEdadJugador6()).into(CAMPO_EDAD_JUGADOR6),
                Enter.theValue(datos.getFechaNacimientoJugador6()).into(CAMPO_FECHA_NACIMIENTO_JUGADOR6),

                Click.on(BTN_ANADIR_JUGADOR),
                Scroll.to(CAMPO_NOMBRE_JUGADOR7),
                Enter.theValue(datos.getNombreJugador7()).into(CAMPO_NOMBRE_JUGADOR7),

                //jugador 7
                WaitUntil.the(CAMPO_NOMBRE_JUGADOR7, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(datos.getNombreJugador7()).into(CAMPO_NOMBRE_JUGADOR7),
                Enter.theValue(datos.getEmailJugador7()).into(CAMPO_EMAIL_JUGADOR7),
                Enter.theValue(datos.getDocumentoJugador7()).into(CAMPO_DOCUMENTO_JUGADOR7),
                SelectFromOptions.byVisibleText(datos.getGeneroJugador7()).from(SELECT_GENERO_JUGADOR7),
                Enter.theValue(datos.getEdadJugador7()).into(CAMPO_EDAD_JUGADOR7),
                Enter.theValue(datos.getFechaNacimientoJugador7()).into(CAMPO_FECHA_NACIMIENTO_JUGADOR7),

                Scroll.to(BTN_ENVIAR_INSCRIPCION),
                Click.on(BTN_ENVIAR_INSCRIPCION)
        );
    }
}