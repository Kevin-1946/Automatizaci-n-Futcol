package co.com.AutoFacebook.tasks;

import co.com.AutoFacebook.userinterface.InicioSaucedemo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirSaucedemo implements Task {

    InicioSaucedemo inicioSaucedemo;

    public static AbrirSaucedemo laPaginaSaucedemo() {return Tasks.instrumented(AbrirSaucedemo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Open.browserOn(inicioSaucedemo));
    }
}