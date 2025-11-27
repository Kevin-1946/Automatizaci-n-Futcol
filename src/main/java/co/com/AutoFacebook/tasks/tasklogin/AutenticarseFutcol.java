package co.com.AutoFacebook.tasks.tasklogin;

import co.com.AutoFacebook.models.modellogin.CredencialesInicioSesionFutcol;
import co.com.AutoFacebook.utils.hooks.SesionVariable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.AutoFacebook.userinterface.userinterfacelogin.autenticacionFutcol.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticarseFutcol implements Task {

    private final List<CredencialesInicioSesionFutcol> credencialesFutcol;

    public AutenticarseFutcol(List<CredencialesInicioSesionFutcol> credencialesFutcol) {
        this.credencialesFutcol = credencialesFutcol;
    }

    public static AutenticarseFutcol aute(List<CredencialesInicioSesionFutcol> credencialesFutcol) {
        return Instrumented.instanceOf(AutenticarseFutcol.class).withProperties(credencialesFutcol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (credencialesFutcol == null || credencialesFutcol.isEmpty()) {
            throw new IllegalArgumentException("No hay información de credenciales.");
        }

        CredencialesInicioSesionFutcol cf = credencialesFutcol.get(0);

        actor.attemptsTo(
                Click.on(BTN_INICIARSESION),
                Enter.theValue(cf.getCorreo()).into(CAMPO_CORREO),
                Enter.theValue(cf.getContrasena()).into(CAMPO_CONTRASENA),
                Click.on(BTN_INICIAR)
        );

        theActorInTheSpotlight().remember(SesionVariable.usuario.toString(), cf.getCorreo());
    }
}