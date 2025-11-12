package co.com.AutoFacebook.tasks.taskcreartorneo;

import co.com.AutoFacebook.models.modelcreartorneo.CredencialesCrearTorneoFutcol;
import co.com.AutoFacebook.utils.hooks.SesionVariable;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static co.com.AutoFacebook.userinterface.userinterfacecreartorneo.autenticacionCrearTorneoFutcol.*;
import static co.com.AutoFacebook.userinterface.userinterfacecreartorneo.autenticacionCrearTorneoFutcol.SELECCIONTORNEO_SEDE;
import static co.com.AutoFacebook.userinterface.userinterfacesedes.autenticacionSedesFutcol.BTN_TORNEOS;
import static co.com.AutoFacebook.userinterface.userinterfacelogin.autenticacionFutcol.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutenticarseCrearTorneoFutcol implements Task {

    private final List<CredencialesCrearTorneoFutcol> credencialesCrearTorneoFutcol;

    public AutenticarseCrearTorneoFutcol(List<CredencialesCrearTorneoFutcol> credencialesCrearTorneoFutcol) {
        this.credencialesCrearTorneoFutcol = credencialesCrearTorneoFutcol;
    }

    public static AutenticarseCrearTorneoFutcol aute(List<CredencialesCrearTorneoFutcol> credencialesCrearTorneoFutcol) {
        return Instrumented.instanceOf(AutenticarseCrearTorneoFutcol.class).withProperties(credencialesCrearTorneoFutcol);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (credencialesCrearTorneoFutcol == null || credencialesCrearTorneoFutcol.isEmpty()) {
            throw new IllegalArgumentException("No hay información de credenciales.");
        }

        CredencialesCrearTorneoFutcol ct = credencialesCrearTorneoFutcol.get(0);

        actor.attemptsTo(
                MoveMouse.to(BTN_TORNEOS),
                Click.on(OPCION_TORNEOS),
                Click.on(SELECCION_TIPO),
                SelectFromOptions.byVisibleText("Mixto").from(SELECCION_TIPO),
                Click.on(SELECCION_CATEGORIA),
                SelectFromOptions.byVisibleText("Juvenil").from(SELECCION_CATEGORIA),
                Click.on(CAMPO_FECHAINICIO),
                Enter.theValue(ct.getFechaInicio()).into(CAMPO_FECHAINICIO),
                Click.on(CAMPO_FECHAFIN),
                Enter.theValue(ct.getFechaFin()).into(CAMPO_FECHAFIN),
                Click.on(SELECCION_MODALIDAD),
                SelectFromOptions.byVisibleText("Mixto").from(SELECCION_MODALIDAD),
                Scroll.to(CAMPO_ORGANIZADOR),
                Enter.theValue(ct.getOrganizador()).into(CAMPO_ORGANIZADOR),
                Enter.theValue(ct.getPrecio()).into(CAMPO_PRECIO),
                Click.on(SELECCIONTORNEO_SEDE),
                SelectFromOptions.byVisibleText("SENA - Complejo sur").from(SELECCIONTORNEO_SEDE),
                Click.on(BTN_CREARTORNEO)
        );

        theActorInTheSpotlight().remember(SesionVariable.usuario.toString(), ct.getOrganizador());

    }
}
