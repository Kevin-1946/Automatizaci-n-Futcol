package co.com.AutoFacebook.questions.questionslogin;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.userinterfacelogin.autenticacionFutcol.MENSAJE_CONFIRMAR;

public class ValidacionLoginFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionLoginFutcol.class);
    private static final String MENSAJE_ESPERADO = "¡Bienvenido a FUTCOL!";

    public static ValidacionLoginFutcol validacionLoginFutcol() {
        return new ValidacionLoginFutcol();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_CONFIRMAR).viewedBy(actor).asString().trim();
            logger.info("Texto encontrado en MENSAJE_ORDEN: " + texto);
            return MENSAJE_ESPERADO.equalsIgnoreCase(texto);
        } catch (Exception e) {
            logger.error("No se encontró el Mensaje: " + e.getMessage());
            return false;
        }
    }
}