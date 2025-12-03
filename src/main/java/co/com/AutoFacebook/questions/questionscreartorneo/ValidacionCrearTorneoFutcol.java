package co.com.AutoFacebook.questions.questionscreartorneo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.userinterfacecreartorneo.autenticacionCrearTorneoFutcol.MENSAJECREARTORNEO_CONFIRMAR;
import static co.com.AutoFacebook.userinterface.userinterfaceencuentros.autenticacionEncuentrosFutcol.MENSAJEENCUENTROS_CONFIRMAR;

public class ValidacionCrearTorneoFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionCrearTorneoFutcol.class);
    private static final String MENSAJECREARTORNEO_ESPERADO = "Gestión de Torneos";

    public static ValidacionCrearTorneoFutcol validacionCrearTorneoFutcol() {
        return new ValidacionCrearTorneoFutcol();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        String texto = Text.of(MENSAJEENCUENTROS_CONFIRMAR).viewedBy(actor).asString().trim();
        return MENSAJECREARTORNEO_ESPERADO.equalsIgnoreCase(texto);
    }
}