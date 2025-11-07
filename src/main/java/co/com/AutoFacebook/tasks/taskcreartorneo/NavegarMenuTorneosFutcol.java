package co.com.AutoFacebook.tasks.taskcreartorneo;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.AutoFacebook.userinterface.userinterfacecreartorneo.MenuAdministradorFutcol.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavegarMenuTorneosFutcol implements Task {

    public static NavegarMenuTorneosFutcol navegarMenuTorneosFutcol() {
        return Instrumented.instanceOf(NavegarMenuTorneosFutcol.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MENU_TORNEOS, isVisible()).forNoMoreThan(10).seconds(),
                MoveMouse.to(MENU_TORNEOS),
                WaitUntil.the(OPCION_TORNEOS, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(OPCION_TORNEOS)
        );
    }
}