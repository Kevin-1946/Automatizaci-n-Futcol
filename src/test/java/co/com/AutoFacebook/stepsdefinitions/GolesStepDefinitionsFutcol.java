package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.modelgoles.CredencialesGolesFutcol;
import co.com.AutoFacebook.questions.questionsgoles.ValidacionGolesFutcol;
import co.com.AutoFacebook.tasks.taskgoles.AutenticarseGolesFutcol;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GolesStepDefinitionsFutcol {

    @Cuando("^ingrese la informacion en los campos de jugador y encuentro$")
    public void ingreseLaInformacionEnLosCamposDeJugadorYEncuentro(List<CredencialesGolesFutcol> credencialesGolesFutcol) {
        theActorInTheSpotlight().wasAbleTo(AutenticarseGolesFutcol.aute(credencialesGolesFutcol));
    }

    @Entonces("^se crearan los goles visibles en otro modulos$")
    public void seCrearanLosGolesVisiblesEnOtroModulos() {
        theActorInTheSpotlight().should(seeThat(ValidacionGolesFutcol.validacionGolesFutcol()));
    }
}
