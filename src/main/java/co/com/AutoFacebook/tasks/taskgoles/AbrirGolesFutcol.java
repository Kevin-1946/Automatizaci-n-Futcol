package co.com.AutoFacebook.tasks.taskgoles;

import co.com.AutoFacebook.userinterface.userinterfacegoles.InicioGolesFutcol;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirGolesFutcol implements Task {

    InicioGolesFutcol inicioGolesFutcol;

    public static AbrirGolesFutcol laPaginaGolesFutcol() {
        return Tasks.instrumented(AbrirGolesFutcol.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(inicioGolesFutcol));
    }
}