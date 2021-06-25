package com.sophossolutions.stepdefinitions;

import com.sophossolutions.apis.PostNoAuth;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistroApiStepDefinitions {

	@Given("quiero realizar un registro en la api {string}")
	public void quieroRealizarUnRegistroEnLaApi(String url) {
		PostNoAuth.setBaseUrl(url);
	}

	@When("Envio la informacion del usuario para el endpoint {string}")
	public void envioLaInformacionDelUsuarioParaElEndpoint(String endPoint, DataTable userInfo) {
		PostNoAuth.executePostNoAuth(endPoint,userInfo);
	}

	@Then("valido que la respuesta tenga status {int}, contenga id {int} y token {string}")
	public void validoQueLaRespuestaTengaStatusContengaIdYToken(Integer statusCode, Integer id, String token) {
		PostNoAuth.validateResponse(statusCode,id, token);
	}

}
