package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.CredencialesInicioSesion;
import co.com.AutoFacebook.models.CredencialesInicioSesionSaucedemo;
import co.com.AutoFacebook.questions.ValidacionLogin;
import co.com.AutoFacebook.questions.ValidacionLoginSaucedemo;
import co.com.AutoFacebook.tasks.AbrirPagina;
import co.com.AutoFacebook.tasks.AbrirSaucedemo;
import co.com.AutoFacebook.tasks.Autenticarse;
import co.com.AutoFacebook.tasks.AutenticarseSaucedemo;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticacionStepDefinitionsSaucedemo {

    @Dado("^que el usuario ingrese a la pagina oficial de Saucedemo$")
    public void queElUsuarioIngreseALaPaginaOficialDeSaucedemo() {
        theActorInTheSpotlight().wasAbleTo(AbrirSaucedemo.laPaginaSaucedemo());
    }


    @Cuando("^digite las credenciales validas por la web$")
    public void digiteLasCredencialesValidasPorLaWeb(List<CredencialesInicioSesionSaucedemo> credencialesSaucedemo) {
        theActorInTheSpotlight().wasAbleTo(AutenticarseSaucedemo.aute(credencialesSaucedemo));
    }

    @Entonces("^se debe redirigir al usuario a la compra de un producto$")
    public void seDebeRedirigirAlUsuarioALaCompraDeUnProducto() {
        theActorInTheSpotlight().should(seeThat(ValidacionLoginSaucedemo.validacionLoginSaucedemo()));
    }
}
