package com.sophossolutions.stepdefinitions;

import com.sophossolutions.api.ComandosApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	@Given("Quiero hacer una peticion en la api {string}")
	public void quieroHacerUnaPeticionEnLaApi(String string) {
	    // Write code here that turns the phrase above into concrete actions
		ComandosApi.ejecutarGet();
	}

	@When("Envio peticion {string}")
	public void envioPeticion(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Valido la respuesta {int}")
	public void validoLaRespuesta(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
