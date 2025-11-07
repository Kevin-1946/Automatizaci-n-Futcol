package co.com.AutoFacebook.interactions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Alerts {
    public static Performable aceptarSiAparece(int timeoutSegundos) {
        return Task.where("{0} acepta el alert si aparece",
                actor -> {
                    WebDriver driver = BrowseTheWeb.as(actor).getDriver();
                    try {
                        new WebDriverWait(driver, timeoutSegundos)
                                .until(ExpectedConditions.alertIsPresent());
                        driver.switchTo().alert().accept();
                    } catch (Exception ignored) {
                    } finally {
                        driver.switchTo().defaultContent();
                    }
                }
        );
    }
}