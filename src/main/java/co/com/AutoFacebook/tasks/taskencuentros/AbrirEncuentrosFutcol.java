package co.com.AutoFacebook.tasks.taskencuentros;

import co.com.AutoFacebook.userinterface.userinterfaceencuentros.InicioEncuentrosFutcol;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirEncuentrosFutcol implements Task {

    InicioEncuentrosFutcol inicioEncuentrosFutcol;

    public static AbrirEncuentrosFutcol laPaginaEncuentrosFutcol() {return Tasks.instrumented(AbrirEncuentrosFutcol.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(inicioEncuentrosFutcol));
    }
}