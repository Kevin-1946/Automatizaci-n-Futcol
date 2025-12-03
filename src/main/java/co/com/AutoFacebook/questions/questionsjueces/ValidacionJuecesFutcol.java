package co.com.AutoFacebook.questions.questionsjueces;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.userinterfaceencuentros.autenticacionEncuentrosFutcol.MENSAJEENCUENTROS_CONFIRMAR;
import static co.com.AutoFacebook.userinterface.userinterfacejueces.autenticacionJuecesFutcol.MENSAJEJUECES_CONFIRMAR;

public class ValidacionJuecesFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionJuecesFutcol.class);
    private static final String MENSAJEJUECES_ESPERADO = "Jueces";

    public static ValidacionJuecesFutcol validacionJuecesFutcol() {
        return new ValidacionJuecesFutcol();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto = Text.of(MENSAJEENCUENTROS_CONFIRMAR).viewedBy(actor).asString().trim();
        return MENSAJEJUECES_ESPERADO.equalsIgnoreCase(texto);
    }
}