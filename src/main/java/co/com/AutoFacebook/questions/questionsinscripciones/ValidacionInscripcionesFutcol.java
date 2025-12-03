package co.com.AutoFacebook.questions.questionsinscripciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.userinterfaceencuentros.autenticacionEncuentrosFutcol.MENSAJEENCUENTROS_CONFIRMAR;
import static co.com.AutoFacebook.userinterface.userinterfaceinscripciones.autenticacionInscripcionesFutcol.MENSAJEINSCRIPCIONES_CONFIRMAR;

public class ValidacionInscripcionesFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(co.com.AutoFacebook.questions.questionsinscripciones.ValidacionInscripcionesFutcol.class);
    private static final String MENSAJEINSCRIPCIONES_ESPERADO = "Inscripciones";

    public static co.com.AutoFacebook.questions.questionsinscripciones.ValidacionInscripcionesFutcol validacionInscripcionesFutcol() {
        return new co.com.AutoFacebook.questions.questionsinscripciones.ValidacionInscripcionesFutcol();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        String texto = Text.of(MENSAJEENCUENTROS_CONFIRMAR).viewedBy(actor).asString().trim();
        return MENSAJEINSCRIPCIONES_ESPERADO.equalsIgnoreCase(texto);
    }
}