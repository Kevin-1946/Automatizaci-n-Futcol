package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.modellogin.CredencialesInicioSesionFutcol;
import co.com.AutoFacebook.questions.questionslogin.ValidacionLoginFutcol;
import co.com.AutoFacebook.tasks.tasklogin.AbrirFutcol;
import co.com.AutoFacebook.tasks.tasklogin.AutenticarseFutcol;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStepDefinitionsFutcol {

    @Dado("^que el usuario se encuentra en la vista de inicio de sesion de FutCol$")
    public void queElUsuarioSeEncuentraEnLaVistaDeInicioDeSesionDeFutCol() {
        theActorInTheSpotlight().wasAbleTo(AbrirFutcol.laPaginaFutcol());
    }


    @Cuando("^ingrese las credenciales correctas de su rol \\(correo y contrasena\\)$")
    public void ingreseLasCredencialesCorrectasDeSuRolCorreoYContrasena(List<CredencialesInicioSesionFutcol> credencialesFutcol) {
            theActorInTheSpotlight().wasAbleTo(AutenticarseFutcol.aute(credencialesFutcol));
    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su página de inicio de sesion de FutCol$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamenteYRedirigidoASuPáginaDeInicioDeSesionDeFutCol() {
        theActorInTheSpotlight().should(seeThat(ValidacionLoginFutcol.validacionLoginFutcol()));
    }
}