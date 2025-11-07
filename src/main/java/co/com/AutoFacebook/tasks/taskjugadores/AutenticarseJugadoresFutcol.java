package co.com.AutoFacebook.tasks.taskjugadores;

import co.com.AutoFacebook.models.modeljugadores.CredencialesJugadoresFutcol;
import co.com.AutoFacebook.utils.hooks.SesionVariable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import java.util.List;
import static co.com.AutoFacebook.userinterface.userinterfacejueces.autenticacionJuecesFutcol.BTN_PARTICIPANTES;
import static co.com.AutoFacebook.userinterface.userinterfacejugadores.autenticacionJugadoresFutcol.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticarseJugadoresFutcol implements Task {

    private final List<CredencialesJugadoresFutcol> credencialesJugadoresFutcol;

    public AutenticarseJugadoresFutcol(List<CredencialesJugadoresFutcol> credencialesJugadoresFutcol) {
        this.credencialesJugadoresFutcol = credencialesJugadoresFutcol;
    }

    public static AutenticarseJugadoresFutcol aute(List<CredencialesJugadoresFutcol> credencialesJugadoresFutcol) {
        return Instrumented.instanceOf(AutenticarseJugadoresFutcol.class).withProperties(credencialesJugadoresFutcol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (credencialesJugadoresFutcol == null || credencialesJugadoresFutcol.isEmpty()) {
            throw new IllegalArgumentException("No hay información de credenciales.");
        }

        CredencialesJugadoresFutcol cjsf = credencialesJugadoresFutcol.get(0);

        actor.attemptsTo(
                MoveMouse.to(BTN_PARTICIPANTES),
                Click.on(OPCION_JUGADORES),
                Enter.theValue(cjsf.getNombre()).into(CAMPO_NOMBRE),
                Enter.theValue(cjsf.getDocumento()).into(CAMPO_DOCUMENTO),
                Enter.theValue(cjsf.getNacimiento()).into(CAMPO_NACIMIENTO),
                Enter.theValue(cjsf.getCorreojugador()).into(CAMPO_CORREOJUGADOR),
                Enter.theValue(cjsf.getContrasenajugador()).into(CAMPO_CONTRASENA),
                Enter.theValue(cjsf.getIdequipo()).into(CAMPO_IDEQUIPO),
                Click.on(BTN_CREARJUGADOR)
        );
        theActorInTheSpotlight().remember(SesionVariable.usuario.toString(), cjsf.getNombre());
    }
}