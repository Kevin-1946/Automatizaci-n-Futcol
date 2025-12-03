package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.modelrecibodepago.CredencialesRecibodepagoFutcol;
import co.com.AutoFacebook.questions.questionsrecibodepago.ValidacionRecibodepagoFutcol;
import co.com.AutoFacebook.tasks.taskrecibodepago.AutenticarseRecibodepagoFutcol;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import static org.hamcrest.Matchers.is;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RecibodepagoStepDefinitionsFutcol {
    @Cuando("^ingrese la informacion del recibo de pago$")
    public void ingreseLaInformacionDelReciboDePago(List<CredencialesRecibodepagoFutcol> credencialesRecibodepagoFutcol) {
        theActorInTheSpotlight().wasAbleTo(AutenticarseRecibodepagoFutcol.aute(credencialesRecibodepagoFutcol));
    }

    @Entonces("^se creara un recibo de pago visible en otros modulos$")
    public void seCrearaUnReciboDePagoVisibleEnOtrosModulos() {
        theActorInTheSpotlight().should(seeThat(ValidacionRecibodepagoFutcol.validacionRecibodepagoFutcol(), is(true)));
    }
}
