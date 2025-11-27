package co.com.AutoFacebook.questions.questionscreartorneo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.userinterfacecreartorneo.autenticacionCrearTorneoFutcol.MENSAJECREARTORNEO_CONFIRMAR;

public class ValidacionCrearTorneoFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionCrearTorneoFutcol.class);
    private static final String MENSAJECREARTORNEO_ESPERADO = "Gestión de Torneos";

    public static ValidacionCrearTorneoFutcol validacionCrearTorneoFutcol() {
        return new ValidacionCrearTorneoFutcol();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJECREARTORNEO_CONFIRMAR).viewedBy(actor).asString().trim();
            logger.info("Texto encontrado en MENSAJE_ORDEN: " + texto);
            return MENSAJECREARTORNEO_ESPERADO.equalsIgnoreCase(texto);
        } catch (Exception e) {
            logger.error("No se encontró el Mensaje: " + e.getMessage());
            return false;
        }
    }
}