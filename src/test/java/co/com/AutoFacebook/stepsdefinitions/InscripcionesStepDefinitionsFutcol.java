package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.modelinscripciones.CredencialesInscripcionesFutcol;
import co.com.AutoFacebook.questions.questionsinscripciones.ValidacionInscripcionesFutcol;
import co.com.AutoFacebook.tasks.taskinscripciones.AutenticarseInscripcionesFutcol;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import static org.hamcrest.Matchers.is;

import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InscripcionesStepDefinitionsFutcol {

    @Cuando("^ingrese la informacion de la inscripcion$")
    public void ingreseLaInformacionDeLaInscripcion(List<CredencialesInscripcionesFutcol> credencialesInscripcionesFutcol) {
        theActorInTheSpotlight().wasAbleTo(AutenticarseInscripcionesFutcol.aute(credencialesInscripcionesFutcol));
    }

    @Entonces("^se creara una inscripcion visible en otros modulos$")
    public void seCrearaUnaInscripcionVisibleEnOtrosModulos() {
        theActorInTheSpotlight().should(seeThat(ValidacionInscripcionesFutcol.validacionInscripcionesFutcol(), is(true)));
    }
}
