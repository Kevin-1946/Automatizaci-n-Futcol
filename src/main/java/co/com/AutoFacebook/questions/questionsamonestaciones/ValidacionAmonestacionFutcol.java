package co.com.AutoFacebook.questions.questionsamonestaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.userinterfaceamonestaciones.autenticarseAmonestacionesFutcol.MENSAJECREARAMONESTACION_CONFIRMAR;

public class ValidacionAmonestacionFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(co.com.AutoFacebook.questions.questionsamonestaciones.ValidacionAmonestacionFutcol.class);
    private static final String MENSAJECREARAMONESTACION_ESPERADO = "Amonestación creada exitosamente";

    public static co.com.AutoFacebook.questions.questionsamonestaciones.ValidacionAmonestacionFutcol validacionAmonestacionFutcol() {
        return new co.com.AutoFacebook.questions.questionsamonestaciones.ValidacionAmonestacionFutcol();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJECREARAMONESTACION_CONFIRMAR).viewedBy(actor).asString().trim();
            logger.info("Texto encontrado en MENSAJE_ORDEN: " + texto);
            return MENSAJECREARAMONESTACION_ESPERADO.equalsIgnoreCase(texto);
        } catch (Exception e) {
            logger.error("No se encontró el mensaje de confirmación de amonestacion: {} " + e.getMessage());
            return false;
        }
    }
}