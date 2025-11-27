package co.com.AutoFacebook.utils.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import co.com.AutoFacebook.models.modellogin.CredencialesInicioSesionFutcol;
import co.com.AutoFacebook.tasks.tasklogin.AbrirFutcol;
import co.com.AutoFacebook.tasks.tasklogin.AutenticarseFutcol;
import java.util.Collections;

public class PreparacionEscenario {

    @Before
    public void preparar(Scenario scn) {
        setTheStage(new OnlineCast());
        theActorCalled("usuario");
        theActorInTheSpotlight().attemptsTo(AbrirFutcol.laPaginaFutcol());

        if (scn.getSourceTagNames().contains("@autenticacion")) {
            CredencialesInicioSesionFutcol cred = new CredencialesInicioSesionFutcol("admin@torneo.com","admin123");
            theActorInTheSpotlight().attemptsTo(AutenticarseFutcol.aute(Collections.singletonList(cred)));
        }
    }
}