package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.ReqresHome;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReqresApiStepDefinitions {
	
	@Given("Quiero realizar un registro en la api {string}")
	public void quieroRealizarUnRegistroEnLaApi(String url) {		
		ReqresHome.setBaseUrl(url);
	}

	@When("Envio la información del usuario para el endpoint {string}")
	public void envioLaInformaciónDelUsuarioParaElEndpoint(String endPoint, DataTable userInfo) throws InterruptedException {
		ReqresHome.executPostNoRegister(endPoint, userInfo);
	}

	@Then("Valido que la respuesta tenga status {int} y contenga error {string}")
	public void validoQueLaRespuestaTengaStatusYContengaError(int status, String error) {
		ReqresHome.validateResponse(status, error);
	}

}
