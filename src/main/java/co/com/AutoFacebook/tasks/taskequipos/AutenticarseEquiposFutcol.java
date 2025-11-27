package co.com.AutoFacebook.tasks.taskequipos;

import co.com.AutoFacebook.interactions.Alerts;
import co.com.AutoFacebook.models.modelequipos.CredencialesEquiposFutcol;
import co.com.AutoFacebook.utils.hooks.SesionVariable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import static co.com.AutoFacebook.userinterface.userinterfaceequipos.autenticacionEquiposFutcol.*;
import static co.com.AutoFacebook.userinterface.userinterfacesedes.autenticacionSedesFutcol.BTN_TORNEOS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AutenticarseEquiposFutcol implements Task {

    private final List<CredencialesEquiposFutcol> credencialesEquiposFutcol;

    public AutenticarseEquiposFutcol(List<CredencialesEquiposFutcol> credencialesEquiposFutcol) {
        this.credencialesEquiposFutcol = credencialesEquiposFutcol;
    }

    public static AutenticarseEquiposFutcol aute(List<CredencialesEquiposFutcol> credencialesEquiposFutcol) {
        return Instrumented.instanceOf(AutenticarseEquiposFutcol.class).withProperties(credencialesEquiposFutcol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (credencialesEquiposFutcol == null || credencialesEquiposFutcol.isEmpty()) {
            throw new IllegalArgumentException("No hay información de credenciales.");
        }

        CredencialesEquiposFutcol cef = credencialesEquiposFutcol.get(0);

        actor.attemptsTo(
                MoveMouse.to(BTN_TORNEOS),
                Click.on(OPCION_EQUIPOS),
                Enter.theValue(cef.getEquiponombre()).into(CAMPO_EQUIPO),
                Click.on(SELECCION_TORNEO),
                SelectFromOptions.byVisibleText("Relampago").from(SELECCION_TORNEO),
                Click.on(BTN_CREAREQUIPO),
                Alerts.aceptarSiAparece(3),
                WaitUntil.the(MENSAJEEQUIPOS_CONFIRMAR, isVisible()).forNoMoreThan(10).seconds()
        );
        theActorInTheSpotlight().remember(SesionVariable.usuario.toString(), cef.getEquiponombre());
    }
}