package com.sophossolutions.stepdefinitions;

import com.sophossolutions.apis.Api;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApiStepDefinition {
	
	
	@Given("Deseo Crear un usuario en {string}")
	public void deseoCrearUnUsuarioEn(String string) {
		Api.setBaseUrl(string);
	}

	@When("Envio la información del usuario para {string}")
	public void envioLaInformaciónDelUsuarioPara(String endPoint, DataTable userInfo) {
		Api.ejecutarPost(endPoint, userInfo);
	}

	@Then("Valido que la respuesta tenga status {int} y contenga id {int}")
	public void validoQueLaRespuestaTengaStatusYContengaId(Integer int1, Integer int2) {

	}
}
