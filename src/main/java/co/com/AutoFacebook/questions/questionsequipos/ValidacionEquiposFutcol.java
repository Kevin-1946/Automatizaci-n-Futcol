package co.com.AutoFacebook.questions.questionsequipos;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.userinterfaceencuentros.autenticacionEncuentrosFutcol.MENSAJEENCUENTROS_CONFIRMAR;
import static co.com.AutoFacebook.userinterface.userinterfaceequipos.autenticacionEquiposFutcol.MENSAJEEQUIPOS_CONFIRMAR;

public class ValidacionEquiposFutcol implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionEquiposFutcol.class);
    private static final String MENSAJEEQUIPOS_ESPERADO = "Gestión de Equipos";

    public static ValidacionEquiposFutcol validacionEquiposFutcol() {
        return new ValidacionEquiposFutcol();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto = Text.of(MENSAJEENCUENTROS_CONFIRMAR).viewedBy(actor).asString().trim();
        return MENSAJEEQUIPOS_ESPERADO.equalsIgnoreCase(texto);
    }
}