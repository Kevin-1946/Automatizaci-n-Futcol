package co.com.AutoFacebook.stepsdefinitions;

import co.com.AutoFacebook.models.modelcreartorneo.DatosCreacionTorneoFutcol;
import co.com.AutoFacebook.models.modellogin.CredencialesInicioSesionFutcol;
import co.com.AutoFacebook.tasks.taskcreartorneo.CrearTorneoFutcol;
import co.com.AutoFacebook.tasks.taskcreartorneo.NavegarMenuTorneosFutcol;
import co.com.AutoFacebook.tasks.tasklogin.AbrirFutcol;
import co.com.AutoFacebook.tasks.tasklogin.AutenticarseFutcol;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static co.com.AutoFacebook.questions.questionscreartorneo.ValidacionCreacionTorneoFutcol.validacionCreacionTorneoFutcol;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class CreacionTorneoStepDefinitionsFutcol {

    @Dado("que el administrador ingresa a la plataforma FUTCOL")
    public void queElAdministradorIngresaALaPlataformaFUTCOL() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AbrirFutcol.laPaginaFutcol()
        );
    }

    @Cuando("inicia sesión con credenciales de administrador")
    public void iniciaSesionConCredencialesDeAdministrador() {
        List<CredencialesInicioSesionFutcol> credenciales = new ArrayList<>();
        credenciales.add(new CredencialesInicioSesionFutcol("admin@torneo.com", "admin123"));

        OnStage.theActorInTheSpotlight().attemptsTo(
                AutenticarseFutcol.aute(credenciales)
        );
    }

    @Cuando("navega al menú de creación de torneos")
    public void navegaAlMenuDeCreacionDeTorneos() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NavegarMenuTorneosFutcol.navegarMenuTorneosFutcol()
        );
    }

    @Cuando("completa el formulario con los siguientes datos:")
    public void completaElFormularioConLosSiguientesDatos(DataTable dataTable) {
        List<Map<String, String>> datos = dataTable.asMaps();

        List<DatosCreacionTorneoFutcol> listaDatosTorneo = new ArrayList<>();

        for (Map<String, String> fila : datos) {
            DatosCreacionTorneoFutcol torneo = new DatosCreacionTorneoFutcol(
                    fila.get("tipoTorneo"),
                    fila.get("categoria"),
                    fila.get("fechaInicio"),
                    fila.get("fechaFin"),
                    fila.get("modalidad"),
                    fila.get("organizador"),
                    fila.get("precio"),
                    fila.get("sede")
            );
            listaDatosTorneo.add(torneo);
        }

        OnStage.theActorInTheSpotlight().attemptsTo(
                CrearTorneoFutcol.crearTorneoFutcol(listaDatosTorneo)
        );
    }

    @Entonces("debería ver el mensaje de confirmación de creación exitosa")
    public void deberiaVerElMensajeDeConfirmacionDeCreacionExitosa() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("La validación de creación de torneo",
                        validacionCreacionTorneoFutcol(),
                        is(true)
                )
        );
    }
}