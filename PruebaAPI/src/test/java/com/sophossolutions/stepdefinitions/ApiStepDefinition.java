package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.Api;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApiStepDefinition
{
	@Given("Quiero probar registro en la pagina {string} en api {string}")
	public void quieroProbarRegistroEnLaPaginaEnApi(String string, String string2)
	{
		Api.navegarUrl(string, string2);
	}

	@When("Envio informacion al endpoint {string}")
	public void envioInformacionAlEndpoint(String string, DataTable dataTable) {

		Api.probarPostGet(string, dataTable);
	}

	@Then("Valido que la respuesta tenga status {int}")
	public void validoQueLaRespuestaTengaStatus(Integer int1) {
		Api.conprobarInformacion();
	}
}