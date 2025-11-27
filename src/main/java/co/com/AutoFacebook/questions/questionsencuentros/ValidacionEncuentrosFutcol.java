package co.com.AutoFacebook.questions.questionsencuentros;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.userinterfaceencuentros.autenticacionEncuentrosFutcol.MENSAJEENCUENTROS_CONFIRMAR;

public class ValidacionEncuentrosFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionEncuentrosFutcol.class);
    private static final String MENSAJEENCUENTROS_ESPERADO = "Encuentros";

    public static ValidacionEncuentrosFutcol validacionEncuentrosFutcol() {
        return new ValidacionEncuentrosFutcol();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJEENCUENTROS_CONFIRMAR).viewedBy(actor).asString().trim();
            logger.info("Texto encontrado en MENSAJE_ORDEN: " + texto);
            return MENSAJEENCUENTROS_ESPERADO.equalsIgnoreCase(texto);
        } catch (Exception e) {
            logger.error("No se encontró el Mensaje: " + e.getMessage());
            return false;
        }
    }
}