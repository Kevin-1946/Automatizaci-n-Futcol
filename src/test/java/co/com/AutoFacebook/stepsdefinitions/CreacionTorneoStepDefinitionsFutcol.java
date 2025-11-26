package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.modelcreartorneo.CredencialesCrearTorneoFutcol;
import co.com.AutoFacebook.questions.questionscreartorneo.ValidacionCrearTorneoFutcol;
import co.com.AutoFacebook.tasks.taskcreartorneo.AutenticarseCrearTorneoFutcol;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

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