package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.modelsedes.CredencialesSedesFutcol;
import co.com.AutoFacebook.questions.questionssedes.ValidacionSedesFutcol;
import co.com.AutoFacebook.tasks.tasksedes.AutenticarseSedesFutcol;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SedesStepDefinitionsFutcol {

    @Cuando("^ingrese la informacion en los campos$")
    public void ingreseLaInformacionEnLosCampos(List<CredencialesSedesFutcol> credencialesSedesFutcol) {
        theActorInTheSpotlight().wasAbleTo(AutenticarseSedesFutcol.aute(credencialesSedesFutcol));
    }

    @Entonces("^se creara una sede visible en otro modulos$")
    public void seCrearaUnaSedeVisibleEnOtroModulos() {
        theActorInTheSpotlight().should(seeThat(ValidacionSedesFutcol.validacionSedesFutcol()));
    }
}
