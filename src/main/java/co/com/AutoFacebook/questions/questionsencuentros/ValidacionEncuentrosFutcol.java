package co.com.AutoFacebook.questions.questionsencuentros;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.AutoFacebook.userinterface.userinterfaceencuentros.autenticacionEncuentrosFutcol.MENSAJEENCUENTROS_CONFIRMAR;

public class ValidacionEncuentrosFutcol implements Question<Boolean> {

    public static ValidacionEncuentrosFutcol validacionEncuentrosFutcol() {
        return new ValidacionEncuentrosFutcol();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String textoPantalla = Text.of(MENSAJEENCUENTROS_CONFIRMAR)
                .viewedBy(actor)
                .asString()
                .trim();

        System.out.println("Texto visible en pantalla: [" + textoPantalla + "]");

        return textoPantalla.equalsIgnoreCase("Encuentro creado exitosamente");
    }
}