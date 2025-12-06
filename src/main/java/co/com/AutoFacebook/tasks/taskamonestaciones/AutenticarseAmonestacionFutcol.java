package co.com.AutoFacebook.tasks.taskamonestaciones;

import co.com.AutoFacebook.models.modelsamonestacion.CredencialesAmonestacionFutcol;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFacebook.userinterface.userinterfaceamonestaciones.autenticarseAmonestacionesFutcol.*;
import static co.com.AutoFacebook.userinterface.userinterfacesedes.autenticacionSedesFutcol.BTN_TORNEOS;
import static co.com.AutoFacebook.userinterface.userinterfacesedes.autenticacionSedesFutcol.MENSAJESEDES_CONFIRMAR;


public class AutenticarseAmonestacionFutcol implements Task {

    private final List<CredencialesAmonestacionFutcol> credencialesAmonestacionFutcol;

    public AutenticarseAmonestacionFutcol(List<CredencialesAmonestacionFutcol> credencialesAmonestacionFutcol) {
        this.credencialesAmonestacionFutcol = credencialesAmonestacionFutcol;
    }

    public static co.com.AutoFacebook.tasks.taskamonestaciones.AutenticarseAmonestacionFutcol aute(List<CredencialesAmonestacionFutcol> credencialesAmonestacionFutcol) {
        return Instrumented.instanceOf(co.com.AutoFacebook.tasks.taskamonestaciones.AutenticarseAmonestacionFutcol.class).withProperties(credencialesAmonestacionFutcol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (credencialesAmonestacionFutcol == null || credencialesAmonestacionFutcol.isEmpty()) {
            throw new IllegalArgumentException("No hay información de credenciales.");
        }

        CredencialesAmonestacionFutcol cef = credencialesAmonestacionFutcol.get(0);

        actor.attemptsTo(
                MoveMouse.to(BTN_TORNEOS),
                Click.on(OPCION_AMONESTACIONES),
                SelectFromOptions.byVisibleText("Los dragones vs Combo alpinito - 2025-12-24").from(SELECCION_ENCUENTRO),
                SelectFromOptions.byVisibleText("Camilo Suarez - Los dragones").from(SELECCION_JUGADOR),
                Enter.theValue(cef.getNumeroCamiseta()).into(CAMPO_NUMEROCAMISETA),
                Click.on(BTN_TARJETA),
                Click.on(BTN_CREARAMONESTACION),
                WaitUntil.the(MENSAJECREARAMONESTACION_CONFIRMAR, WebElementStateMatchers.containsText("Amonestación creada exitosamente")).forNoMoreThan(10).seconds()
        );
        // TheSpotlight().remember(SesionVariable.usuario.toString(), ct.getOrganizador());
    }
}
