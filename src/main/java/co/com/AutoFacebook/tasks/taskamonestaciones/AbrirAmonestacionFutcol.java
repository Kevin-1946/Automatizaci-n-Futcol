package co.com.AutoFacebook.tasks.taskamonestaciones;

import co.com.AutoFacebook.userinterface.userinterfaceamonestaciones.InicioAmonestacionesFutcol;
import co.com.AutoFacebook.userinterface.userinterfaceamonestaciones.InicioAmonestacionesFutcol;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirAmonestacionFutcol implements Task {

    InicioAmonestacionesFutcol inicioAmonestacionesFutcol;

    public static co.com.AutoFacebook.tasks.taskamonestaciones.AbrirAmonestacionFutcol amonestacionFutcol() {return Tasks.instrumented(co.com.AutoFacebook.tasks.taskamonestaciones.AbrirAmonestacionFutcol.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Open.browserOn(inicioAmonestacionesFutcol));
    }
}
