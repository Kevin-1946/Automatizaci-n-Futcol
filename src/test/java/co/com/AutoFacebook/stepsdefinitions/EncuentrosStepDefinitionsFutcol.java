package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.modelencuentros.CredencialesEncuentrosFutcol;
import co.com.AutoFacebook.questions.questionsencuentros.ValidacionEncuentrosFutcol;
import co.com.AutoFacebook.tasks.taskencuentros.AutenticarseEncuentrosFutcol;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import static org.hamcrest.Matchers.is;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EncuentrosStepDefinitionsFutcol {

    @Cuando("^ingrese la informacion del encuentro$")
    public void ingreseLaInformacionDelEncuentro(List<CredencialesEncuentrosFutcol> credencialesEncuentrosFutcol) {
        theActorInTheSpotlight().wasAbleTo(AutenticarseEncuentrosFutcol.aute(credencialesEncuentrosFutcol));
    }

    @Entonces("^se creara un encuentro visible en otros modulos$")
    public void seCrearaUnEncuentroVisibleEnOtrosModulos() {
        theActorInTheSpotlight().should(seeThat(ValidacionEncuentrosFutcol.validacionEncuentrosFutcol(), is(true))
        );
    }
}
