package co.com.AutoFacebook.questions.questionssedes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.userinterfaceencuentros.autenticacionEncuentrosFutcol.MENSAJEENCUENTROS_CONFIRMAR;
import static co.com.AutoFacebook.userinterface.userinterfacesedes.autenticacionSedesFutcol.MENSAJESEDES_CONFIRMAR;

public class ValidacionSedesFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionSedesFutcol.class);
    private static final String MENSAJESEDES_ESPERADO = "Gestión de Sedes";

    public static ValidacionSedesFutcol validacionSedesFutcol() {
        return new ValidacionSedesFutcol();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto = Text.of(MENSAJEENCUENTROS_CONFIRMAR).viewedBy(actor).asString().trim();
        return MENSAJESEDES_ESPERADO.equalsIgnoreCase(texto);
    }
}