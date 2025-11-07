package co.com.AutoFacebook.tasks.taskcreartorneo;

import co.com.AutoFacebook.models.modelcreartorneo.DatosCreacionTorneoFutcol;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.AutoFacebook.userinterface.userinterfacecreartorneo.CreacionTorneoFutcol.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CrearTorneoFutcol implements Task {

    private final List<DatosCreacionTorneoFutcol> datosTorneo;

    public CrearTorneoFutcol(List<DatosCreacionTorneoFutcol> datosTorneo) {
        this.datosTorneo = datosTorneo;
    }

    public static CrearTorneoFutcol crearTorneoFutcol(List<DatosCreacionTorneoFutcol> datosTorneo) {
        return Instrumented.instanceOf(CrearTorneoFutcol.class).withProperties(datosTorneo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (datosTorneo == null || datosTorneo.isEmpty()) {
            throw new IllegalArgumentException("No hay información de torneo.");
        }

        DatosCreacionTorneoFutcol dt = datosTorneo.get(0);

        actor.attemptsTo(
                WaitUntil.the(SELECT_TIPO_TORNEO, isVisible()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byVisibleText(dt.getTipoTorneo()).from(SELECT_TIPO_TORNEO),

                SelectFromOptions.byVisibleText(dt.getCategoria()).from(SELECT_CATEGORIA),

                Enter.theValue(dt.getFechaInicio()).into(INPUT_FECHA_INICIO),
                Enter.theValue(dt.getFechaFin()).into(INPUT_FECHA_FIN),

                SelectFromOptions.byVisibleText(dt.getModalidad()).from(SELECT_MODALIDAD),

                Enter.theValue(dt.getOrganizador()).into(INPUT_ORGANIZADOR),
                Enter.theValue(dt.getPrecio()).into(INPUT_PRECIO),

                SelectFromOptions.byVisibleText(dt.getSede()).from(SELECT_SEDE),

                Click.on(BTN_CREAR)
        );
    }
}