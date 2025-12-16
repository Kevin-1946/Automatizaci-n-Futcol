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
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFacebook.userinterface.userinterfaceamonestaciones.autenticarseAmonestacionesFutcol.MENSAJECREARAMONESTACION_CONFIRMAR;
import static co.com.AutoFacebook.userinterface.userinterfacejueces.autenticacionJuecesFutcol.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticarseJuecesFutcol implements Task {

    private final List<CredencialesJuecesFutcol> credencialesJuecesFutcol;

    public AutenticarseJuecesFutcol(List<CredencialesJuecesFutcol> credencialesJuecesFutcol) {
        this.credencialesJuecesFutcol = credencialesJuecesFutcol;
    }

    public static AutenticarseJuecesFutcol aute(List<CredencialesJuecesFutcol> credencialesJuecesFutcol) {
        return Instrumented.instanceOf(AutenticarseJuecesFutcol.class)
                .withProperties(credencialesJuecesFutcol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (credencialesJuecesFutcol == null || credencialesJuecesFutcol.isEmpty()) {
            throw new IllegalArgumentException("No hay información de credenciales.");
        }

        CredencialesJuecesFutcol cjf = credencialesJuecesFutcol.get(0);

        int rnd = (int) (Math.random() * 9000) + 1000;

        String correoUnico = cjf.getCorreojuez() + rnd;

        actor.attemptsTo(
                MoveMouse.to(BTN_PARTICIPANTES),
                Click.on(OPCION_JUECES),
                Enter.theValue(cjf.getJuez()).into(CAMPO_JUEZ),
                Enter.theValue(cjf.getNumerojuez()).into(CAMPO_NUMEROJUEZ),
                Enter.theValue(correoUnico).into(CAMPO_CORREOJUEZ),
                SelectFromOptions.byVisibleText("SENA - Complejo sur").from(SELECCION_SEDE),
                Click.on(BTN_CREARJUEZ),
                WaitUntil.the(MENSAJEJUECES_CONFIRMAR, WebElementStateMatchers.containsText("Juez creado exitosamente")).forNoMoreThan(10).seconds()
        );
        // theActorInTheSpotlight().remember(SesionVariable.usuario.toString(), cjf.getJuez());
    }
}
