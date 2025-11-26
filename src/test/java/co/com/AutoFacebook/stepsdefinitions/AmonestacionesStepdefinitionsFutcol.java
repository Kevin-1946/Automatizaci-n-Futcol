package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.modelsamonestacion.CredencialesAmonestacionFutcol;
import co.com.AutoFacebook.questions.questionsamonestaciones.ValidacionAmonestacionFutcol;
import co.com.AutoFacebook.tasks.taskamonestaciones.AutenticarseAmonestacionFutcol;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AmonestacionesStepdefinitionsFutcol {
    @Cuando("^rellena el formulario de amonestaciones$")
    public void cuandoRellenaElFormularioDeAmonestaciones(List<CredencialesAmonestacionFutcol> credencialesAmonestacionFutcols) {
        theActorInTheSpotlight().wasAbleTo(AutenticarseAmonestacionFutcol.aute(credencialesAmonestacionFutcols));
    }

    @Entonces("^se creara una tarjeta$")
    public void seCrearaUnaTarjeta() {
        theActorInTheSpotlight().should(seeThat(ValidacionAmonestacionFutcol.validacionAmonestacionFutcol()));
    }

}
