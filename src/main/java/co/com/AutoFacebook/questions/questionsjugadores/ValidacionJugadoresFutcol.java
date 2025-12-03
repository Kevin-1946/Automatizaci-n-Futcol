package co.com.AutoFacebook.questions.questionsjugadores;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.userinterfaceencuentros.autenticacionEncuentrosFutcol.MENSAJEENCUENTROS_CONFIRMAR;
import static co.com.AutoFacebook.userinterface.userinterfacejugadores.autenticacionJugadoresFutcol.MENSAJEJUGADORES_CONFIRMAR;

public class ValidacionJugadoresFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionJugadoresFutcol.class);
    private static final String MENSAJEJUGADORES_ESPERADO = "Lista de Jugadores";

    public static ValidacionJugadoresFutcol validacionJugadoresFutcol() {
        return new ValidacionJugadoresFutcol();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto = Text.of(MENSAJEENCUENTROS_CONFIRMAR).viewedBy(actor).asString().trim();
        return MENSAJEJUGADORES_ESPERADO.equalsIgnoreCase(texto);
    }
}