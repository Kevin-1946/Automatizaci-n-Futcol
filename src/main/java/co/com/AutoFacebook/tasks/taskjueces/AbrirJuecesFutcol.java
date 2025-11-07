package co.com.AutoFacebook.tasks.taskjueces;

import co.com.AutoFacebook.userinterface.userinterfacejueces.InicioJuecesFutcol;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirJuecesFutcol implements Task {

    InicioJuecesFutcol inicioJuecesFutcol;

    public static AbrirJuecesFutcol laPaginaJuecesFutcol() {
        return Tasks.instrumented(AbrirJuecesFutcol.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(inicioJuecesFutcol));
    }
}