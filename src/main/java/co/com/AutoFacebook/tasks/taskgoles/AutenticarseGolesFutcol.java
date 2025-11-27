package co.com.AutoFacebook.tasks.taskgoles;

import co.com.AutoFacebook.models.modelgoles.CredencialesGolesFutcol;
import co.com.AutoFacebook.utils.hooks.SesionVariable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import java.util.List;
import static co.com.AutoFacebook.userinterface.userinterfacegoles.autenticacionGolesFutcol.*;
import static co.com.AutoFacebook.userinterface.userinterfacesedes.autenticacionSedesFutcol.BTN_TORNEOS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticarseGolesFutcol implements Task {

    private final List<CredencialesGolesFutcol> credencialesGolesFutcol;

    public AutenticarseGolesFutcol(List<CredencialesGolesFutcol> credencialesGolesFutcol) {
        this.credencialesGolesFutcol = credencialesGolesFutcol;
    }

    public static AutenticarseGolesFutcol aute(List<CredencialesGolesFutcol> credencialesGolesFutcol) {
        return Instrumented.instanceOf(AutenticarseGolesFutcol.class).withProperties(credencialesGolesFutcol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (credencialesGolesFutcol == null || credencialesGolesFutcol.isEmpty()) {
            throw new IllegalArgumentException("No hay información de credenciales.");
        }

        CredencialesGolesFutcol cgf = credencialesGolesFutcol.get(0);

        actor.attemptsTo(
                MoveMouse.to(BTN_TORNEOS),
                Click.on(OPCION_GOLES),
                Enter.theValue(cgf.getIdjugadorgoles()).into(CAMPO_IDJUGADORGOLES),
                Enter.theValue(cgf.getIdencuentrogoles()).into(CAMPO_IDENCUENTROGOLES),
                Enter.theValue(cgf.getCantidadgoles()).into(CAMPO_CANTIDADGOLES),
                Click.on(BTN_REGISTRARGOLES)
        );
        theActorInTheSpotlight().remember(SesionVariable.usuario.toString(), cgf.getIdjugadorgoles());
    }
}