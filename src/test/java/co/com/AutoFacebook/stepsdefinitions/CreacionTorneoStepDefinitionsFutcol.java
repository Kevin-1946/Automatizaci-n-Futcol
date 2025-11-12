package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.modelcreartorneo.CredencialesCrearTorneoFutcol;
import co.com.AutoFacebook.models.modellogin.CredencialesInicioSesionFutcol;
import co.com.AutoFacebook.questions.questionscreartorneo.ValidacionCrearTorneoFutcol;
import co.com.AutoFacebook.questions.questionslogin.ValidacionLoginFutcol;
import co.com.AutoFacebook.tasks.taskcreartorneo.AbrirCrearTorneoFutcol;
import co.com.AutoFacebook.tasks.taskcreartorneo.AutenticarseCrearTorneoFutcol;
import co.com.AutoFacebook.tasks.tasklogin.AbrirFutcol;
import co.com.AutoFacebook.tasks.tasklogin.AutenticarseFutcol;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static co.com.AutoFacebook.questions.questionscreartorneo.ValidacionCrearTorneoFutcol.validacionCrearTorneoFutcol;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class CreacionTorneoStepDefinitionsFutcol {
    @Cuando("^rellena el formulario de torneo$")
    public void rellenaElFormularioDeTorneo(List<CredencialesCrearTorneoFutcol> credencialesCrearTorneoFutcol) {
        theActorInTheSpotlight().wasAbleTo(AutenticarseCrearTorneoFutcol.aute(credencialesCrearTorneoFutcol));
    }

    @Entonces("^creara un torneo visible en todos los modulos$")
    public void crearaUnTorneoVisibleEnTodosLosModulos() {
        theActorInTheSpotlight().should(seeThat(ValidacionCrearTorneoFutcol.validacionCrearTorneoFutcol()));
    }

}