package co.com.AutoFacebook.tasks.tasksedes;

import co.com.AutoFacebook.userinterface.userinterfacesedes.InicioSedesFutcol;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirSedesFutcol implements Task {

    InicioSedesFutcol inicioSedesFutcol;

    public static AbrirSedesFutcol laPaginaSedesFutcol() {
        return Tasks.instrumented(AbrirSedesFutcol.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(inicioSedesFutcol));
    }
}