package co.com.AutoFacebook.tasks.taskrecibodepago;

import co.com.AutoFacebook.models.modelrecibodepago.CredencialesRecibodepagoFutcol;
import co.com.AutoFacebook.models.modelsedes.CredencialesSedesFutcol;
import co.com.AutoFacebook.utils.hooks.SesionVariable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFacebook.userinterface.userinterfaceinscripciones.autenticacionInscripcionesFutcol.*;
import static co.com.AutoFacebook.userinterface.userinterfacejueces.autenticacionJuecesFutcol.BTN_PARTICIPANTES;
import static co.com.AutoFacebook.userinterface.userinterfacejugadores.autenticacionJugadoresFutcol.MENSAJEJUGADORES_CONFIRMAR;
import static co.com.AutoFacebook.userinterface.userinterfacerecibodepago.autenticacionRecibodepagoFutcol.*;
import static co.com.AutoFacebook.userinterface.userinterfacesedes.autenticacionSedesFutcol.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticarseRecibodepagoFutcol implements Task {

    private final List<CredencialesRecibodepagoFutcol> credencialesRecibodepagoFutcol;

    public AutenticarseRecibodepagoFutcol(List<CredencialesRecibodepagoFutcol> credencialesRecibodepagoFutcol) {
        this.credencialesRecibodepagoFutcol = credencialesRecibodepagoFutcol;
    }

    public static AutenticarseRecibodepagoFutcol aute(List<CredencialesRecibodepagoFutcol> credencialesRecibodepagoFutcol) {
        return Instrumented.instanceOf(AutenticarseRecibodepagoFutcol.class).withProperties(credencialesRecibodepagoFutcol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (credencialesRecibodepagoFutcol == null || credencialesRecibodepagoFutcol.isEmpty()) {
            throw new IllegalArgumentException("No hay información de credenciales.");
        }

        CredencialesRecibodepagoFutcol crf = credencialesRecibodepagoFutcol.get(0);

        actor.attemptsTo(
                MoveMouse.to(BTN_PARTICIPANTES),
                Click.on(OPCION_RECIBOS),
                Enter.theValue(crf.getIdinscripcion()).into(OPCION_IDINSCRIPCION),
                Enter.theValue(crf.getIdtorneorecibo()).into(OPCION_IDTORNEORECIBO),
                Enter.theValue(crf.getMontorecibo()).into(OPCION_MONTORECIBO),
                Enter.theValue(crf.getFecharecibo()).into(OPCION_FECHARECIBO),
                Click.on(OPCION_CONFIRMADORECIBO),
                Enter.theValue(crf.getMetododepagorecibo()).into(OPCION_METODODEPAGORECIBO),
                Enter.theValue(crf.getNumerodecomprobante()).into(OPCION_NUMERODECOMPROBANTE),
                Click.on(BTN_CREARRECIBO),
                WaitUntil.the(MENSAJERECIBODEPAGO_CONFIRMAR, WebElementStateMatchers.containsText("Recibo creado exitosamente")).forNoMoreThan(10).seconds()
        );
        // theActorInTheSpotlight().remember(SesionVariable.usuario.toString(), cf.getDireccion());
    }
}