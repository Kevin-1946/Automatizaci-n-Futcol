package co.com.AutoFacebook.tasks.taskinscripciones;

import co.com.AutoFacebook.userinterface.userinterfaceinscripciones.InicioInscripcionesFutcol;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirInscripcionesFutcol implements Task {

    InicioInscripcionesFutcol inicioInscripcionesFutcol;

    public static AbrirInscripcionesFutcol laPaginaInscripcionesFutcol() {return Tasks.instrumented(AbrirInscripcionesFutcol.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(inicioInscripcionesFutcol));
    }
}