package co.com.AutoFacebook.tasks.taskrecibodepago;

import co.com.AutoFacebook.userinterface.userinterfacerecibodepago.InicioRecibodepagoFutcol;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirRecibodepagoFutcol implements Task {

    InicioRecibodepagoFutcol inicioRecibodepagoFutcol;

    public static AbrirRecibodepagoFutcol laPaginaRecibodepagoFutcol() {return Tasks.instrumented(AbrirRecibodepagoFutcol.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(inicioRecibodepagoFutcol));
    }
}