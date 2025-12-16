package co.com.AutoFacebook.tasks.taskencuentros;

import co.com.AutoFacebook.models.modelencuentros.CredencialesEncuentrosFutcol;
import co.com.AutoFacebook.utils.hooks.SesionVariable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFacebook.userinterface.userinterfaceamonestaciones.autenticarseAmonestacionesFutcol.MENSAJECREARAMONESTACION_CONFIRMAR;
import static co.com.AutoFacebook.userinterface.userinterfacecreartorneo.autenticacionCrearTorneoFutcol.SELECCION_MODALIDAD;
import static co.com.AutoFacebook.userinterface.userinterfacecreartorneo.autenticacionCrearTorneoFutcol.SELECCION_TIPO;
import static co.com.AutoFacebook.userinterface.userinterfaceencuentros.autenticacionEncuentrosFutcol.*;
import static co.com.AutoFacebook.userinterface.userinterfaceequipos.autenticacionEquiposFutcol.SELECCION_TORNEO;
import static co.com.AutoFacebook.userinterface.userinterfacejueces.autenticacionJuecesFutcol.SELECCION_SEDE;
import static co.com.AutoFacebook.userinterface.userinterfacesedes.autenticacionSedesFutcol.BTN_TORNEOS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AutenticarseEncuentrosFutcol implements Task {

    private final List<CredencialesEncuentrosFutcol> credencialesEncuentrosFutcol;

    public AutenticarseEncuentrosFutcol(List<CredencialesEncuentrosFutcol> credencialesEncuentrosFutcol) {
        this.credencialesEncuentrosFutcol = credencialesEncuentrosFutcol;
    }

    public static AutenticarseEncuentrosFutcol aute(List<CredencialesEncuentrosFutcol> credencialesEncuentrosFutcol) {
        return Instrumented.instanceOf(AutenticarseEncuentrosFutcol.class).withProperties(credencialesEncuentrosFutcol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (credencialesEncuentrosFutcol == null || credencialesEncuentrosFutcol.isEmpty()) {
            throw new IllegalArgumentException("No hay información de encuentros.");
        }

        CredencialesEncuentrosFutcol cesf = credencialesEncuentrosFutcol.get(0);

        actor.attemptsTo(
                MoveMouse.to(BTN_TORNEOS),
                Click.on(OPCION_ENCUENTROS),
                SelectFromOptions.byVisibleText("Relampago").from(SELECCION_TIPO),
                SelectFromOptions.byVisibleText("SENA - Complejo sur").from(SELECCION_SEDEENCUENTROS),
                SelectFromOptions.byVisibleText("Mixto").from(SELECCION_MODALIDAD),
                Enter.theValue(cesf.getDiaencuentro()).into(CAMPO_DIAENCUENTRO),
                Enter.theValue(cesf.getHoraencuentro()).into(CAMPO_HORAENCUENTRO),
                SelectFromOptions.byVisibleText("Millonarios FC").from(SELECCION_EQUIPOLOCAL),
                SelectFromOptions.byVisibleText("Santa Fe").from(SELECCION_EQUIPOVISITANTE),
                Enter.theValue(cesf.getGoleslocalencuentro()).into(CAMPO_GOLESLOCAL),
                Enter.theValue(cesf.getGolesvisitanteencuentro()).into(CAMPO_GOLESVISITANTE),
                Click.on(BTN_CREARENCUENTRO),
                WaitUntil.the(MENSAJEENCUENTROS_CONFIRMAR, WebElementStateMatchers.containsText("Encuentro creado exitosamente")).forNoMoreThan(10).seconds()
        );
    }
}