package co.com.AutoFacebook.tasks.taskencuentros;

import co.com.AutoFacebook.models.modelencuentros.CredencialesEncuentrosFutcol;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;

import static co.com.AutoFacebook.userinterface.userinterfacecreartorneo.autenticacionCrearTorneoFutcol.*;
import static co.com.AutoFacebook.userinterface.userinterfaceencuentros.autenticacionEncuentrosFutcol.*;
import static co.com.AutoFacebook.userinterface.userinterfacesedes.autenticacionSedesFutcol.BTN_TORNEOS;
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
                SelectFromOptions.byVisibleText("Relampago").from(SELECCION_TIPO)
        );

        actor.remember("tipoTorneoSeleccionado", "Relampago");

        actor.attemptsTo(
                SelectFromOptions.byVisibleText("SENA - Complejo sur").from(SELECCION_SEDEENCUENTROS),
                SelectFromOptions.byVisibleText("Mixto").from(SELECCION_MODALIDAD),
                Enter.theValue(cesf.getDiaencuentro()).into(CAMPO_DIAENCUENTRO),
                Enter.theValue(cesf.getHoraencuentro()).into(CAMPO_HORAENCUENTRO),
                SelectFromOptions.byVisibleText("Millonarios FC").from(SELECCION_EQUIPOLOCAL),
                SelectFromOptions.byVisibleText("Santa Fe").from(SELECCION_EQUIPOVISITANTE),
                Scroll.to(CAMPO_GOLESLOCAL),
                Enter.theValue(cesf.getGoleslocalencuentro()).into(CAMPO_GOLESLOCAL),
                Enter.theValue(cesf.getGolesvisitanteencuentro()).into(CAMPO_GOLESVISITANTE),
                Click.on(BTN_CREARENCUENTRO),
                WaitUntil.the(MENSAJEENCUENTROS_CONFIRMAR, isVisible()).forNoMoreThan(10).seconds(),
                Ensure.that(MENSAJEENCUENTROS_CONFIRMAR).text().contains("Encuentro creado exitosamente")
        );
    }
}
