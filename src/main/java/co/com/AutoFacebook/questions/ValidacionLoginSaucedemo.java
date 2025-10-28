package co.com.AutoFacebook.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.AutoFacebook.userinterface.autenticacionSaucedemo.MENSAJE_ORDEN;

public class ValidacionLoginSaucedemo implements Question<Boolean> {

    private static final Logger logger = LoggerFactory.getLogger(ValidacionLoginSaucedemo.class);
    private static final String MENSAJE_ESPERADO = "Thank you for your order!";

    public static ValidacionLoginSaucedemo validacionLoginSaucedemo() {
        return new ValidacionLoginSaucedemo();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            String texto = Text.of(MENSAJE_ORDEN).viewedBy(actor).asString().trim();
            logger.info("Texto encontrado en MENSAJE_ORDEN: " + texto);
            return MENSAJE_ESPERADO.equalsIgnoreCase(texto);
        } catch (Exception e) {
            logger.error("No se encontró el Mensaje: " + e.getMessage());
            return false;
        }
    }
}