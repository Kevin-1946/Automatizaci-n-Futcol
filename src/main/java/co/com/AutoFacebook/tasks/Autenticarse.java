package co.com.AutoFacebook.tasks;

import co.com.AutoFacebook.models.CredencialesInicioSesion;
import co.com.AutoFacebook.utils.hooks.SesionVariable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.apache.commons.lang3.RandomStringUtils;
import java.util.List;
import static co.com.AutoFacebook.userinterface.autenticacion.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Autenticarse implements Task {

    private final List<CredencialesInicioSesion> credenciales;

    public Autenticarse(List<CredencialesInicioSesion> credenciales) {
        this.credenciales = credenciales;
    }

    public static Autenticarse aute(List<CredencialesInicioSesion> credenciales) {
        return Instrumented.instanceOf(Autenticarse.class).withProperties(credenciales);
    }

    private final String numero = RandomStringUtils.random(2, false, true);

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (credenciales == null || credenciales.isEmpty()) {
            throw new IllegalArgumentException("La lista de credenciales está vacía o es nula.");
        }

        CredencialesInicioSesion c = credenciales.get(0);

        actor.attemptsTo(
                Click.on(INPUT_USUARIO),
                Enter.theValue(c.getUsuarios()).into(INPUT_USUARIO),
                Click.on(INPUT_CLAVE),
                Enter.theValue(c.getClave()).into(INPUT_CLAVE),
                Click.on(BTN_INICIOSESION)
        );

        theActorInTheSpotlight().remember(SesionVariable.usuario.toString(), c.getUsuarios());
    }
}
