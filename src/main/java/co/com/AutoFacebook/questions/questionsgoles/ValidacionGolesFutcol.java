package co.com.AutoFacebook.questions.questionsgoles;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.userinterfaceencuentros.autenticacionEncuentrosFutcol.MENSAJEENCUENTROS_CONFIRMAR;
import static co.com.AutoFacebook.userinterface.userinterfacegoles.autenticacionGolesFutcol.MENSAJEGOLES_CONFIRMAR;

public class ValidacionGolesFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionGolesFutcol.class);
    private static final String MENSAJEGOLES_ESPERADO = "Goles por Jugador";

    public static ValidacionGolesFutcol validacionGolesFutcol() {
        return new ValidacionGolesFutcol();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto = Text.of(MENSAJEENCUENTROS_CONFIRMAR).viewedBy(actor).asString().trim();
        return MENSAJEGOLES_ESPERADO.equalsIgnoreCase(texto);
    }
}