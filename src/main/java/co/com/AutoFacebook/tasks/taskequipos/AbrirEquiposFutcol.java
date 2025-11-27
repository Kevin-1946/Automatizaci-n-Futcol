package co.com.AutoFacebook.tasks.taskequipos;

import co.com.AutoFacebook.userinterface.userinterfaceequipos.InicioEquiposFutcol;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirEquiposFutcol implements Task {

    InicioEquiposFutcol inicioEquiposFutcol;

    public static AbrirEquiposFutcol laPaginaEquiposFutcol() {
        return Tasks.instrumented(AbrirEquiposFutcol.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(inicioEquiposFutcol));
    }
}