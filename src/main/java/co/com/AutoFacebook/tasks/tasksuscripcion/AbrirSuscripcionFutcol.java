package co.com.AutoFacebook.tasks.tasksuscripcion;

import co.com.AutoFacebook.userinterface.userinterfacesuscripcion.InicioSuscripcionFutcol;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirSuscripcionFutcol implements Task {

    InicioSuscripcionFutcol inicioSuscripcionFutcol;

    public static AbrirSuscripcionFutcol laPaginaSuscripcion() {
        return Tasks.instrumented(AbrirSuscripcionFutcol.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(inicioSuscripcionFutcol));
    }
}