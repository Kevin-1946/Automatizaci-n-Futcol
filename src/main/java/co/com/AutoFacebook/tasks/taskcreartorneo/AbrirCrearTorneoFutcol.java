package co.com.AutoFacebook.tasks.taskcreartorneo;

import co.com.AutoFacebook.userinterface.userinterfacecreartorneo.InicioCrearTorneoFutcol;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirCrearTorneoFutcol implements Task {

    InicioCrearTorneoFutcol inicioCrearTorneoFutcol;

    public static AbrirCrearTorneoFutcol crearTorneoFutcol() {return Tasks.instrumented(AbrirCrearTorneoFutcol.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Open.browserOn(inicioCrearTorneoFutcol));
    }
}