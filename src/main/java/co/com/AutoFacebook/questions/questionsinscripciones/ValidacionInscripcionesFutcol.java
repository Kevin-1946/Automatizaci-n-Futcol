package co.com.AutoFacebook.questions.questionsinscripciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.userinterfaceinscripciones.autenticacionInscripcionesFutcol.MENSAJEINSCRIPCIONES_CONFIRMAR;

public class ValidacionInscripcionesFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(co.com.AutoFacebook.questions.questionsinscripciones.ValidacionInscripcionesFutcol.class);
    private static final String MENSAJEINSCRIPCIONES_ESPERADO = "Inscripciones";

    public static co.com.AutoFacebook.questions.questionsinscripciones.ValidacionInscripcionesFutcol validacionInscripcionesFutcol() {
        return new co.com.AutoFacebook.questions.questionsinscripciones.ValidacionInscripcionesFutcol();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJEINSCRIPCIONES_CONFIRMAR).viewedBy(actor).asString().trim();
            logger.info("Texto encontrado en MENSAJE_ORDEN: " + texto);
            return MENSAJEINSCRIPCIONES_ESPERADO.equalsIgnoreCase(texto);
        } catch (Exception e) {
            logger.error("No se encontró el Mensaje: " + e.getMessage());
            return false;
        }
    }
}