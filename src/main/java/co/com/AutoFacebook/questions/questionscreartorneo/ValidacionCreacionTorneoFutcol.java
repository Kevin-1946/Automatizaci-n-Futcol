package co.com.AutoFacebook.questions.questionscreartorneo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.userinterfacecreartorneo.CreacionTorneoFutcol.MENSAJE_EXITO;

public class ValidacionCreacionTorneoFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionCreacionTorneoFutcol.class);
    private static final String MENSAJE_ESPERADO = "exitosa"; // AJUSTA ESTO según el mensaje real

    public static ValidacionCreacionTorneoFutcol validacionCreacionTorneoFutcol() {
        return new ValidacionCreacionTorneoFutcol();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_EXITO).viewedBy(actor).asString().trim();
            logger.info("Texto encontrado en MENSAJE_EXITO: " + texto);
            return texto.toLowerCase().contains(MENSAJE_ESPERADO.toLowerCase());
        } catch (Exception e) {
            logger.error("No se encontró el Mensaje: " + e.getMessage());
            return false;
        }
    }
}