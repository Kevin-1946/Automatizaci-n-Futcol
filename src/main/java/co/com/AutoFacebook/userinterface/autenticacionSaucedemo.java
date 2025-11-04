package co.com.AutoFacebook.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class autenticacionSaucedemo extends PageObject {

    public static Target CAMPO_USERNAME = Target.the("Ingreso del Username")
            .located(By.id("user-name"));

    public static Target CAMPO_PASSWORD = Target.the("Ingreso de la Password")
            .located(By.id("password"));

    public static Target BTN_LOGIN = Target.the("Click en el boton Login")
            .located(By.id("login-button"));

    public static Target BTN_ADDTOCARD = Target.the("Click en el boton Add to cart")
            .locatedBy("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");

    public static Target BTN_CARRITO = Target.the("Click en el icono del Carrito")
            .locatedBy("//*[@id=\"shopping_cart_container\"]/a");

    public static Target BTN_CHECKOUT = Target.the("Click en el boton Checkout")
            .located(By.id("checkout"));

    public static Target CAMPO_FIRSTNAME = Target.the("Ingreso del First Name")
            .located(By.id("first-name"));

    public static Target CAMPO_LASTNAME = Target.the("Ingreso del Last Name")
            .located(By.id("last-name"));

    public static Target CAMPO_POSTALCODE = Target.the("Ingreso del Postal Code")
            .located(By.id("postal-code"));

    public static Target BTN_CONTINUE = Target.the("Ingreso del Postal Code")
            .located(By.id("continue"));

    public static Target BTN_FINISH = Target.the("Click en el boton Finish")
            .located(By.id("finish"));

    public static Target MENSAJE_ORDEN = Target.the("Thank you for your order!")
            .locatedBy("//*[@id=\"checkout_complete_container\"]/h2");
}
