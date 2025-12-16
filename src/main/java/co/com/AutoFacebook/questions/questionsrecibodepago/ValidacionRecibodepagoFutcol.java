package co.com.AutoFacebook.questions.questionsrecibodepago;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static co.com.AutoFacebook.userinterface.userinterfacerecibodepago.autenticacionRecibodepagoFutcol.MENSAJERECIBODEPAGO_CONFIRMAR;

public class ValidacionRecibodepagoFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionRecibodepagoFutcol.class);
    private static final String MENSAJERECIBODEPAGO_ESPERADO = "Recibo creado exitosamente";

    public static ValidacionRecibodepagoFutcol validacionRecibodepagoFutcol() {return new ValidacionRecibodepagoFutcol();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJERECIBODEPAGO_CONFIRMAR).viewedBy(actor).asString().trim();
            logger.info("Texto encontrado en MENSAJESEDES_CONFIRMAR: {}", texto);
            return MENSAJERECIBODEPAGO_ESPERADO.equalsIgnoreCase(texto);
        } catch (Exception e) {
            logger.error("No se encontró el mensaje de confirmación de sedes: {}", e.getMessage());
            return false;
        }
    }
}