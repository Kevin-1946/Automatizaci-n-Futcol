package co.com.AutoFacebook.questions.questionssuscripcion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.userinterfacesuscripcion.SuscripcionFutcol.MENSAJE_INSCRIPCION_EXITOSA;

public class ValidacionSuscripcionFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionSuscripcionFutcol.class);
    private static final String MENSAJE_ESPERADO = "Inscripcion exitosa";

    public static ValidacionSuscripcionFutcol validacionSuscripcion() {
        return new ValidacionSuscripcionFutcol();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_INSCRIPCION_EXITOSA).viewedBy(actor).asString().trim();
            logger.info("Texto encontrado en MENSAJE_INSCRIPCION_EXITOSA: " + texto);
            return MENSAJE_ESPERADO.equalsIgnoreCase(texto);
        } catch (Exception e) {
            logger.error("No se encontró el mensaje de inscripción exitosa: " + e.getMessage());
            return false;
        }
    }
}