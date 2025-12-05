package co.com.AutoFacebook.tasks.taskinscripciones;

import co.com.AutoFacebook.models.modelencuentros.CredencialesEncuentrosFutcol;
import co.com.AutoFacebook.models.modelinscripciones.CredencialesInscripcionesFutcol;
import co.com.AutoFacebook.models.modelsedes.CredencialesSedesFutcol;
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
import static co.com.AutoFacebook.userinterface.userinterfaceinscripciones.autenticacionInscripcionesFutcol.*;
import static co.com.AutoFacebook.userinterface.userinterfacejueces.autenticacionJuecesFutcol.BTN_PARTICIPANTES;
import static co.com.AutoFacebook.userinterface.userinterfacesedes.autenticacionSedesFutcol.BTN_TORNEOS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticarseInscripcionesFutcol implements Task {

    private final List<CredencialesInscripcionesFutcol> credencialesInscripcionesFutcol;

    public AutenticarseInscripcionesFutcol(List<CredencialesInscripcionesFutcol> credencialesInscripcionesFutcol) {
        this.credencialesInscripcionesFutcol = credencialesInscripcionesFutcol;
    }

    public static AutenticarseInscripcionesFutcol aute(List<CredencialesInscripcionesFutcol> credencialesInscripcionesFutcol) {
        return Instrumented.instanceOf(AutenticarseInscripcionesFutcol.class).withProperties(credencialesInscripcionesFutcol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (credencialesInscripcionesFutcol == null || credencialesInscripcionesFutcol.isEmpty()) {
            throw new IllegalArgumentException("No hay información de encuentros.");
        }

        CredencialesInscripcionesFutcol cif = credencialesInscripcionesFutcol.get(0);

        actor.attemptsTo(
                MoveMouse.to(BTN_PARTICIPANTES),
                Click.on(OPCION_INSCRIPCIONES),
                Enter.theValue(cif.getIdequipoinscripcion()).into(OPCION_IDEQUIPO),
                Enter.theValue(cif.getIdtorneoinscripcion()).into(OPCION_IDTORNEO),
                Enter.theValue(cif.getFechainscripcion()).into(OPCION_FECHAINSCRIPCION),
                Enter.theValue(cif.getFormadepago()).into(OPCION_FORMADEPAGO),
                Enter.theValue(cif.getEstadodepago()).into(OPCION_ESTADODEPAGO),
                Click.on(SELECCION_CORREOELECTRONICO),
                Enter.theValue(cif.getValorinscripcion()).into(OPCION_VALORINSCRIPCION),
                Click.on(BTN_CREARINSCRIPCION),
                WaitUntil.the(MENSAJEINSCRIPCIONES_CONFIRMAR, WebElementStateMatchers.containsText("Inscripción registrada exitosamente")).forNoMoreThan(10).seconds()
        );
        // theActorInTheSpotlight().remember(SesionVariable.usuario.toString(), cgf.getIdjugadorgoles());
    }
}