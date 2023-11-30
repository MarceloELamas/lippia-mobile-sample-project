package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.loginClockifyConstants;
import com.crowdar.examples.services.loginClockifyService;
import cucumber.api.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.crowdar.examples.constants.entradaHorasConstants;
import com.crowdar.examples.services.entradaHorasService;

public class entradaHorasSteps extends PageSteps {

    @Given("me encuentro logeado y en la pagina home")
    public void meEncuentroLogeadoYEnLaPaginaHome() {
        loginClockifyService.loginVisible();
        MobileActionManager.setInput(loginClockifyConstants.MAIL_INPUT, "marcelolamas2495@gmail.com");
        MobileActionManager.setInput(loginClockifyConstants.PASS_INPUT, "Marcelo123");
        MobileActionManager.click(loginClockifyConstants.LOGIN_BUTTON);
        loginClockifyService.loginTextVisible();

    }

    @When("hago clic en el boton ADD celeste")
    public void hagoClicEnElBotonADDCeleste() {
        MobileActionManager.click(entradaHorasConstants.ADD_BUTTON);
    }

    @When("visualizo el texto Add Entry")
    public void visualizoElTextoAddEntry() {
        entradaHorasService.addEntriesVisible();
    }

    @When("hago click en hora e ingreso el valor '(.*)'$")
    public void hagoClickEnHoraEIngresoElValor(String hora) {
        entradaHorasService.contadorClicsHora(hora);

    }

    @When("hago click en minutos e ingreso el valor '(.*)'$")
    public void hagoClickEnMinutosEIngresoElValor(String min) {
        entradaHorasService.contadorClicsMin(min);
    }

    @When("hago click en el boton SEND")
    public void hagoClickEnElBotonSEND() {
        MobileActionManager.click(entradaHorasConstants.SEND_BUTTON);
    }

    @Then("valido que el texto This Week sea visible")
    public void validoQueElTextoThisWeekSeaVisible() {
        entradaHorasService.thisWeekTextVisible();
    }

    @When("hago click en la fecha actual")
    public void hagoClickEnLaFechaActual() {
        MobileActionManager.click(entradaHorasConstants.FECHA_ACTUAL);
    }

    @When("hago click en la fecha {}")
    public void hagoClickEnLaFecha(String fecha) {
        MobileActionManager.click(entradaHorasService.setFecha(fecha));
    }

    @When("hago click en la felcha Back")
    public void hagoClickEnLaFelchaBack() {
        MobileActionManager.click(entradaHorasConstants.FLECHA_BACK);
    }

    @When("hago click en DISCARD")
    public void hagoClickEnDISCARD() {
        MobileActionManager.click(entradaHorasConstants.DISCARD_BUTTON);
    }

    @When("hago click en el boton MENU")
    public void hagoClickEnElBotonMENU() {
        MobileActionManager.click(entradaHorasConstants.MENU_BUTTON);
    }

    @When("hago click en SETTINGS")
    public void hagoClickEnSETTINGS() {
        MobileActionManager.click(entradaHorasConstants.SETTINGS_BUTTON);
    }

    @When("hago click en el Switch dark mode")
    public void hagoClickEnElSwitchDarkMode() {
        MobileActionManager.click(entradaHorasConstants.SWITCH_DARKMODE);
    }

    @Then("valido la existencia de la opcion Enable dark mode")
    public void validoLaExistenciaDeLaOpcionEnableDarkMode() {
        entradaHorasService.enableDarkModeVisible();
    }
}
