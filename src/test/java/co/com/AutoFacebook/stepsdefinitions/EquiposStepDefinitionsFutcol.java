package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.modelequipos.CredencialesEquiposFutcol;
import co.com.AutoFacebook.questions.questionsequipos.ValidacionEquiposFutcol;
import co.com.AutoFacebook.tasks.taskequipos.AutenticarseEquiposFutcol;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EquiposStepDefinitionsFutcol {

    @Cuando("^ingrese la informacion del equipo$")
    public void ingreseLaInformacionDelEquipo(List<CredencialesEquiposFutcol> credencialesEquiposFutcol) {
        theActorInTheSpotlight().wasAbleTo(AutenticarseEquiposFutcol.aute(credencialesEquiposFutcol));

    }

    @Entonces("^se creara un equipo visible en otros modulos$")
    public void seCrearaUnEquipoVisibleEnOtrosModulos() {
        theActorInTheSpotlight().should(seeThat(ValidacionEquiposFutcol.validacionEquiposFutcol()));
    }
}
