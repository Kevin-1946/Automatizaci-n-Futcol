package co.com.AutoFacebook.tasks.taskamonestaciones;

import co.com.AutoFacebook.models.modelsamonestacion.CredencialesAmonestacionFutcol;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import java.util.List;

import static co.com.AutoFacebook.userinterface.userinterfaceamonestaciones.autenticarseAmonestacionesFutcol.*;
import static co.com.AutoFacebook.userinterface.userinterfacesedes.autenticacionSedesFutcol.BTN_TORNEOS;


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
                Click.on(SELECCION_ENCUENTRO),
                SelectFromOptions.byVisibleText("Millonarios FC vs Santa Fe - 2025-09-15").from(SELECCION_ENCUENTRO),
                Click.on(SELECCION_JUGADOR),
                SelectFromOptions.byVisibleText("Javier Pulido - Millonarios FC").from(SELECCION_JUGADOR),
                Click.on(CAMPO_NUMEROCAMISETA),
                Enter.theValue(cef.getNumeroCamiseta()).into(CAMPO_NUMEROCAMISETA),
                Click.on(BTN_TARJETA),
                Click.on(BTN_CREARAMONESTACION)
        );

        //nTheSpotlight().remember(SesionVariable.usuario.toString(), ct.getOrganizador());

    }
}
