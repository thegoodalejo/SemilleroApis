package com.sophossolutions.stepdefinitions;

import com.sophossolutions.api.ComandosApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionPost {
	
	@Given("Quiero hacer una peticion en la api de tipo post {string}")
	public void quieroHacerUnaPeticionEnLaApiDeTipoPost(String strUrl) {
		ComandosApi.ingresarUrl(strUrl);
	}

	@When("Envio la informacion para la peticion {string}")
	public void envioLaInformacionParaLaPeticion(String string, DataTable dataTable) {
	    ComandosApi.ejecutarPost(string, dataTable);
	}

	@Then("Valido la respuesta tenga status {int} id {int} y token {string}")
	public void validoLaRespuestaTengaStatusIdYToken(Integer int1, Integer int2, String string) {
	   ComandosApi.verificarRespuestaStatus(int1);
	   ComandosApi.verificarRespuestaIdYToken(int2, string);
	}

}
