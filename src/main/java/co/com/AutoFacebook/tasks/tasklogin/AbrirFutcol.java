package co.com.AutoFacebook.tasks.tasklogin;

import co.com.AutoFacebook.userinterface.userinterfacelogin.InicioFutcol;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirFutcol implements Task {

    InicioFutcol inicioFutcol;

    public static AbrirFutcol laPaginaFutcol() {return Tasks.instrumented(AbrirFutcol.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Open.browserOn(inicioFutcol));
    }
}