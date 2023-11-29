package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.loginClockifyConstants;
import cucumber.api.java.en.Given;
import com.crowdar.examples.services.loginClockifyService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginClockifySteps extends PageSteps {
    @Given("la aplicacion cargo correctamente")
    public void laAplicacionCargoCorrectamente() {
        loginClockifyService.loginVisible();
    }


    @When("el usuario registrado ingresa mail '(.*)' , contraseña '(.*)'$")
    public void elUsuarioRegistradoIngresaMailContrasena(String mail, String pass) {
        MobileActionManager.setInput(loginClockifyConstants.MAIL_INPUT, mail);
        MobileActionManager.setInput(loginClockifyConstants.PASS_INPUT, pass);
    }

    @When("hace click en el boton LOG IN")
    public void haceClickEnElBotonLOGIN() {
        MobileActionManager.click(loginClockifyConstants.LOGIN_BUTTON);
    }

    @Then("valido que el texto Time Entries sea visible")
    public void validoQueElTextoTimeEntriesSeaVisible() {
        loginClockifyService.loginTextVisible();
    }
}
