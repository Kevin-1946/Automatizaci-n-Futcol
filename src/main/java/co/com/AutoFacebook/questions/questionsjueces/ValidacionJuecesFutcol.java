package co.com.AutoFacebook.questions.questionsjueces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static co.com.AutoFacebook.userinterface.userinterfacejueces.autenticacionJuecesFutcol.MENSAJEJUECES_CONFIRMAR;

public class ValidacionJuecesFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionJuecesFutcol.class);
    private static final String MENSAJEJUECES_ESPERADO = "Jueces";

    public static ValidacionJuecesFutcol validacionJuecesFutcol() {
        return new ValidacionJuecesFutcol();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJEJUECES_CONFIRMAR).viewedBy(actor).asString().trim();
            logger.info("Texto encontrado en MENSAJEJUECES_CONFIRMAR: {}", texto);
            return MENSAJEJUECES_ESPERADO.equalsIgnoreCase(texto);
        } catch (Exception e) {
            logger.error("No se encontró el mensaje de confirmación de sedes: {}", e.getMessage());
            return false;
        }
    }
}