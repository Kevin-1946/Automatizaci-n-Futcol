package co.com.AutoFacebook.tasks;

import co.com.AutoFacebook.models.CredencialesInicioSesionSaucedemo;
import co.com.AutoFacebook.utils.hooks.SesionVariable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.List;

import static co.com.AutoFacebook.userinterface.autenticacionSaucedemo.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticarseSaucedemo implements Task {

    private final List<CredencialesInicioSesionSaucedemo> credencialesSaucedemo;

    public AutenticarseSaucedemo(List<CredencialesInicioSesionSaucedemo> credencialesSaucedemo) {
        this.credencialesSaucedemo = credencialesSaucedemo;
    }

    public static AutenticarseSaucedemo aute(List<CredencialesInicioSesionSaucedemo> credencialesSaucedemo) {
        return Instrumented.instanceOf(AutenticarseSaucedemo.class).withProperties(credencialesSaucedemo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (credencialesSaucedemo == null || credencialesSaucedemo.isEmpty()) {
            throw new IllegalArgumentException("No hay información de credenciales.");
        }

        CredencialesInicioSesionSaucedemo cs = credencialesSaucedemo.get(0);

        actor.attemptsTo(
                Enter.theValue(cs.getUsername()).into(CAMPO_USERNAME),
                Enter.theValue(cs.getPassword()).into(CAMPO_PASSWORD),
                Click.on(BTN_LOGIN),
                Click.on(BTN_ADDTOCARD),
                Click.on(BTN_CARRITO),
                Click.on(BTN_CHECKOUT),
                Enter.theValue(cs.getFirstName()).into(CAMPO_FIRSTNAME),
                Enter.theValue(cs.getLastName()).into(CAMPO_LASTNAME),
                Enter.theValue(cs.getPostalCode()).into(CAMPO_POSTALCODE),
                Click.on(BTN_CONTINUE),
                Click.on(BTN_FINISH)
        );

        theActorInTheSpotlight().remember(SesionVariable.usuario.toString(), cs.getUsername());
    }
}