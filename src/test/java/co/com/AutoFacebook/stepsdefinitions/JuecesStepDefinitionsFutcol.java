package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.modeljueces.CredencialesJuecesFutcol;
import co.com.AutoFacebook.questions.questionsjueces.ValidacionJuecesFutcol;
import co.com.AutoFacebook.tasks.taskjueces.AutenticarseJuecesFutcol;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class JuecesStepDefinitionsFutcol {
    @Cuando("^ingrese la informacion del juez$")
    public void ingreseLaInformacionDelJuez(List<CredencialesJuecesFutcol> credencialesJuecesFutcol) {
        theActorInTheSpotlight().wasAbleTo(AutenticarseJuecesFutcol.aute(credencialesJuecesFutcol));
    }

    @Entonces("^se creara un juez visible en otro modulos$")
    public void seCrearaUnJuezVisibleEnOtroModulos() {
        theActorInTheSpotlight().should(seeThat(ValidacionJuecesFutcol.validacionJuecesFutcol()));
    }
}
