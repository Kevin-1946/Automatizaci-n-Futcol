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

import java.util.List;

import static co.com.AutoFacebook.userinterface.userinterfacecreartorneo.autenticacionCrearTorneoFutcol.SELECCION_MODALIDAD;
import static co.com.AutoFacebook.userinterface.userinterfacecreartorneo.autenticacionCrearTorneoFutcol.SELECCION_TIPO;
import static co.com.AutoFacebook.userinterface.userinterfaceencuentros.autenticacionEncuentrosFutcol.*;
import static co.com.AutoFacebook.userinterface.userinterfaceequipos.autenticacionEquiposFutcol.SELECCION_TORNEO;
import static co.com.AutoFacebook.userinterface.userinterfacejueces.autenticacionJuecesFutcol.SELECCION_SEDE;
import static co.com.AutoFacebook.userinterface.userinterfacesedes.autenticacionSedesFutcol.BTN_TORNEOS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

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
                Click.on(SELECCION_TIPO),
                SelectFromOptions.byVisibleText("Relampago").from(SELECCION_TIPO),
                Click.on(SELECCION_SEDEENCUENTROS),
                SelectFromOptions.byVisibleText("SENA - Complejo sur").from(SELECCION_SEDEENCUENTROS),
                Click.on(SELECCION_MODALIDAD),
                SelectFromOptions.byVisibleText("Mixto").from(SELECCION_MODALIDAD),
                Enter.theValue(cesf.getDiaencuentro()).into(CAMPO_DIAENCUENTRO),
                Enter.theValue(cesf.getHoraencuentro()).into(CAMPO_HORAENCUENTRO),
                Click.on(SELECCION_EQUIPOLOCAL),
                SelectFromOptions.byVisibleText("Millonarios FC").from(SELECCION_EQUIPOLOCAL),
                Click.on(SELECCION_EQUIPOVISITANTE),
                SelectFromOptions.byVisibleText("Santa Fe").from(SELECCION_EQUIPOVISITANTE),
                Enter.theValue(cesf.getGoleslocalencuentro()).into(CAMPO_GOLESLOCAL),
                Enter.theValue(cesf.getGolesvisitanteencuentro()).into(CAMPO_GOLESVISITANTE),
                Click.on(BTN_CREARENCUENTRO)
        );
        // theActorInTheSpotlight().remember(SesionVariable.usuario.toString(), cgf.getIdjugadorgoles());
    }
}