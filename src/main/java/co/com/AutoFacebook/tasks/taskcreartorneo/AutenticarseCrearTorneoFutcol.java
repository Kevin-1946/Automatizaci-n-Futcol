package co.com.AutoFacebook.tasks.taskcreartorneo;

import co.com.AutoFacebook.models.modelcreartorneo.CredencialesCrearTorneoFutcol;
import co.com.AutoFacebook.utils.hooks.SesionVariable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFacebook.userinterface.userinterfaceamonestaciones.autenticarseAmonestacionesFutcol.MENSAJECREARAMONESTACION_CONFIRMAR;
import static co.com.AutoFacebook.userinterface.userinterfacecreartorneo.autenticacionCrearTorneoFutcol.*;
import static co.com.AutoFacebook.userinterface.userinterfacecreartorneo.autenticacionCrearTorneoFutcol.SELECCIONTORNEO_SEDE;
import static co.com.AutoFacebook.userinterface.userinterfacesedes.autenticacionSedesFutcol.BTN_TORNEOS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticarseCrearTorneoFutcol implements Task {

    private final List<CredencialesCrearTorneoFutcol> credencialesCrearTorneoFutcol;

    public AutenticarseCrearTorneoFutcol(List<CredencialesCrearTorneoFutcol> credencialesCrearTorneoFutcol) {
        this.credencialesCrearTorneoFutcol = credencialesCrearTorneoFutcol;
    }

    public static AutenticarseCrearTorneoFutcol aute(List<CredencialesCrearTorneoFutcol> credencialesCrearTorneoFutcol) {
        return Instrumented.instanceOf(AutenticarseCrearTorneoFutcol.class).withProperties(credencialesCrearTorneoFutcol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (credencialesCrearTorneoFutcol == null || credencialesCrearTorneoFutcol.isEmpty()) {
            throw new IllegalArgumentException("No hay información de credenciales.");
        }

        CredencialesCrearTorneoFutcol ct = credencialesCrearTorneoFutcol.get(0);

        actor.attemptsTo(
                MoveMouse.to(BTN_TORNEOS),
                Click.on(OPCION_TORNEOS),
                SelectFromOptions.byVisibleText("Mixto").from(SELECCION_TIPO),
                SelectFromOptions.byVisibleText("Juvenil").from(SELECCION_CATEGORIA),
                Enter.theValue(ct.getFechaInicio()).into(CAMPO_FECHAINICIO),
                Enter.theValue(ct.getFechaFin()).into(CAMPO_FECHAFIN),
                SelectFromOptions.byVisibleText("Mixto").from(SELECCION_MODALIDAD),
                Enter.theValue(ct.getOrganizador()).into(CAMPO_ORGANIZADOR),
                Enter.theValue(ct.getPrecio()).into(CAMPO_PRECIO),
                SelectFromOptions.byVisibleText("SENA - Complejo sur").from(SELECCIONTORNEO_SEDE),
                Click.on(BTN_CREARTORNEO),
                WaitUntil.the(MENSAJECREARTORNEO_CONFIRMAR, WebElementStateMatchers.containsText("Torneo creado exitosamente")).forNoMoreThan(10).seconds()
        );
        // theActorInTheSpotlight().remember(SesionVariable.usuario.toString(), ct.getOrganizador());
    }
}
