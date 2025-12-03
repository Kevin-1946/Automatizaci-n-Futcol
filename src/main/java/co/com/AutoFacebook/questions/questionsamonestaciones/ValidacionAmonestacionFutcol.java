package co.com.AutoFacebook.questions.questionsamonestaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.userinterfaceamonestaciones.autenticarseAmonestacionesFutcol.MENSAJECREARAMONESTACION_CONFIRMAR;
import static co.com.AutoFacebook.userinterface.userinterfaceencuentros.autenticacionEncuentrosFutcol.MENSAJEENCUENTROS_CONFIRMAR;

public class ValidacionAmonestacionFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(co.com.AutoFacebook.questions.questionsamonestaciones.ValidacionAmonestacionFutcol.class);
    private static final String MENSAJECREARAMONESTACION_ESPERADO = "Amonestaciones";

    public static co.com.AutoFacebook.questions.questionsamonestaciones.ValidacionAmonestacionFutcol validacionAmonestacionFutcol() {
        return new co.com.AutoFacebook.questions.questionsamonestaciones.ValidacionAmonestacionFutcol();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto = Text.of(MENSAJEENCUENTROS_CONFIRMAR).viewedBy(actor).asString().trim();
        return MENSAJECREARAMONESTACION_ESPERADO.equalsIgnoreCase(texto);
    }
}