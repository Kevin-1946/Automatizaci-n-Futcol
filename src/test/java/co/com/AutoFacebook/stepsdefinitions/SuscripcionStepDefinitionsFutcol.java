package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.modelsuscripcion.DatosSuscripcionFutcol;
import co.com.AutoFacebook.questions.questionssuscripcion.ValidacionSuscripcionFutcol;
import co.com.AutoFacebook.tasks.tasksuscripcion.AbrirSuscripcionFutcol;
import co.com.AutoFacebook.tasks.tasksuscripcion.SuscribirseFutcol;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SuscripcionStepDefinitionsFutcol {

    @Dado("^que el usuario se encuentra en la vista de suscripcion de FutCol$")
    public void queElUsuarioSeEncuentraEnLaVistaDeSuscripcionDeFutCol() {
        theActorInTheSpotlight().wasAbleTo(AbrirSuscripcionFutcol.laPaginaSuscripcion());
    }

    @Cuando("^ingrese todos los datos requeridos para la inscripcion del equipo$")
    public void ingreseLosDatosRequeridosParaLaInscripcionDelEquipo(List<DatosSuscripcionFutcol> datosSuscripcion) {
        theActorInTheSpotlight().wasAbleTo(SuscribirseFutcol.conLosDatos(datosSuscripcion));
    }

    @Entonces("^se debe verificar que la inscripcion haya sido exitosa$")
    public void seDebeVerificarQueLaInscripcionHayaSidoExitosa() {
        theActorInTheSpotlight().should(seeThat(ValidacionSuscripcionFutcol.validacionSuscripcion()));
    }
}