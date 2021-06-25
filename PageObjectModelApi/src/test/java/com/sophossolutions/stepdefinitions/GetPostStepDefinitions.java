package com.sophossolutions.stepdefinitions;


import com.sophossolutions.pages.GetPostHome;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GetPostStepDefinitions {
	

	
	
	@Given("Quiero relizar un registro en la api {string}")
	public void quieroRelizarUnRegistroEnLaApi(String string) {
		GetPostHome.pasarUrl(string);
	}

	@When("Envio la informacion del usuario para el endpoint {string}")
	public void envioLaInformacionDelUsuarioParaElEndpoint(String string, DataTable dataTable) {
	    
		GetPostHome.EjecutarPostGet(string, dataTable);
	}

	@Then("Valido que la respuesta tenga status {int}")
	public void validoQueLaRespuestaTengaStatus(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	

}
