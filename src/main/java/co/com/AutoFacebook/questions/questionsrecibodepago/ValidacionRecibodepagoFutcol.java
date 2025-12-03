package co.com.AutoFacebook.questions.questionsrecibodepago;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.userinterfaceencuentros.autenticacionEncuentrosFutcol.MENSAJEENCUENTROS_CONFIRMAR;
import static co.com.AutoFacebook.userinterface.userinterfacerecibodepago.autenticacionRecibodepagoFutcol.MENSAJERECIBODEPAGO_CONFIRMAR;

public class ValidacionRecibodepagoFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionRecibodepagoFutcol.class);
    private static final String MENSAJERECIBODEPAGO_ESPERADO = "Lista de Recibos";

    public static ValidacionRecibodepagoFutcol validacionRecibodepagoFutcol() {return new ValidacionRecibodepagoFutcol();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto = Text.of(MENSAJEENCUENTROS_CONFIRMAR).viewedBy(actor).asString().trim();
        return MENSAJERECIBODEPAGO_ESPERADO.equalsIgnoreCase(texto);
    }
}