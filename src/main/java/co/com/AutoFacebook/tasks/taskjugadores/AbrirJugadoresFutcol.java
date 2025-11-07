package co.com.AutoFacebook.tasks.taskjugadores;

import co.com.AutoFacebook.userinterface.userinterfacejugadores.InicioJugadoresFutcol;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirJugadoresFutcol implements Task {

    InicioJugadoresFutcol inicioJugadoresFutcol;

    public static AbrirJugadoresFutcol laPaginaJugadoresFutcol() {return Tasks.instrumented(AbrirJugadoresFutcol.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Open.browserOn(inicioJugadoresFutcol));
    }
}