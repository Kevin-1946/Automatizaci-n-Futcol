package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.modeljugadores.CredencialesJugadoresFutcol;
import co.com.AutoFacebook.questions.questionsjugadores.ValidacionJugadoresFutcol;
import co.com.AutoFacebook.tasks.taskjugadores.AutenticarseJugadoresFutcol;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class JugadoresStepDefinitionsFutcol {

    @Cuando("^ingrese la informacion del jugador$")
    public void ingreseLaInformacionDelJugador(List<CredencialesJugadoresFutcol> credencialesJugadoresFutcol) {
        theActorInTheSpotlight().wasAbleTo(AutenticarseJugadoresFutcol.aute(credencialesJugadoresFutcol));
    }

    @Entonces("^se creara un jugador$")
    public void seCrearaUnJugador() {
        theActorInTheSpotlight().should(seeThat(ValidacionJugadoresFutcol.validacionJugadoresFutcol()));
    }
}
