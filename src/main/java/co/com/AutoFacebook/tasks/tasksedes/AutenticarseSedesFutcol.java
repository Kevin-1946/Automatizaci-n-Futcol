package co.com.AutoFacebook.tasks.tasksedes;

import co.com.AutoFacebook.models.modelsedes.CredencialesSedesFutcol;
import co.com.AutoFacebook.utils.hooks.SesionVariable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import java.util.List;
import static co.com.AutoFacebook.userinterface.userinterfacesedes.autenticacionSedesFutcol.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticarseSedesFutcol implements Task {

    private final List<CredencialesSedesFutcol> credencialesSedesFutcol;

    public AutenticarseSedesFutcol(List<CredencialesSedesFutcol> credencialesSedesFutcol) {
        this.credencialesSedesFutcol = credencialesSedesFutcol;
    }

    public static AutenticarseSedesFutcol aute(List<CredencialesSedesFutcol> credencialesSedesFutcol) {
        return Instrumented.instanceOf(AutenticarseSedesFutcol.class).withProperties(credencialesSedesFutcol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (credencialesSedesFutcol == null || credencialesSedesFutcol.isEmpty()) {
            throw new IllegalArgumentException("No hay información de credenciales.");
        }

        CredencialesSedesFutcol cf = credencialesSedesFutcol.get(0);

        actor.attemptsTo(
                MoveMouse.to(BTN_TORNEOS),
                Click.on(OPCION_SEDES),
                Enter.theValue(cf.getSede()).into(CAMPO_SEDE),
                Enter.theValue(cf.getDireccion()).into(CAMPO_DIRECCION),
                Click.on(BTN_CREAR)
        );
        theActorInTheSpotlight().remember(SesionVariable.usuario.toString(), cf.getDireccion());
    }
}