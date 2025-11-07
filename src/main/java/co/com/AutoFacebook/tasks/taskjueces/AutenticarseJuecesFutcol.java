package co.com.AutoFacebook.tasks.taskjueces;

import co.com.AutoFacebook.models.modeljueces.CredencialesJuecesFutcol;
import co.com.AutoFacebook.utils.hooks.SesionVariable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import java.util.List;
import static co.com.AutoFacebook.userinterface.userinterfacejueces.autenticacionJuecesFutcol.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticarseJuecesFutcol implements Task {

    private final List<CredencialesJuecesFutcol> credencialesJuecesFutcol;

    public AutenticarseJuecesFutcol(List<CredencialesJuecesFutcol> credencialesJuecesFutcol) {
        this.credencialesJuecesFutcol = credencialesJuecesFutcol;
    }

    public static AutenticarseJuecesFutcol aute(List<CredencialesJuecesFutcol> credencialesJuecesFutcol) {
        return Instrumented.instanceOf(AutenticarseJuecesFutcol.class).withProperties(credencialesJuecesFutcol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (credencialesJuecesFutcol == null || credencialesJuecesFutcol.isEmpty()) {
            throw new IllegalArgumentException("No hay información de credenciales.");
        }

        CredencialesJuecesFutcol cjf = credencialesJuecesFutcol.get(0);

        actor.attemptsTo(
                MoveMouse.to(BTN_PARTICIPANTES),
                Click.on(OPCION_JUECES),
                Enter.theValue(cjf.getJuez()).into(CAMPO_JUEZ),
                Enter.theValue(cjf.getNumerojuez()).into(CAMPO_NUMEROJUEZ),
                Enter.theValue(cjf.getCorreojuez()).into(CAMPO_CORREOJUEZ),
                Click.on(SELECCION_SEDE),
                SelectFromOptions.byVisibleText("SENA - Complejo sur").from(SELECCION_SEDE),
                Click.on(BTN_CREARJUEZ)
        );
        theActorInTheSpotlight().remember(SesionVariable.usuario.toString(), cjf.getJuez());
    }
}