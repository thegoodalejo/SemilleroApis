package com.sophossolutions.stepsdefinitions;

import com.sophossolutions.apis.GetListUsers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequestGetListUsersStepDefinition {

	@Given("Quiero realizar una consulta en la api {string}")
	public void quieroRealizarUnaConsultaEnLaApi(String strBaseUrl) {
	   GetListUsers.setBaseUrl(strBaseUrl);
	}

	@When("Solicito la informacion de los usuarios para el endpoint {string}")
	public void solicitoLaInformacionDeLosUsuariosParaElEndpoint(String strEndpoint) {
	   GetListUsers.executeGetListUsers(strEndpoint);
	}

	@Then("Valido que la respuesta tenga status {int} y contenga total {string}")
	public void validoQueLaRespuestaTengaStatusYContengaTotal(Integer intEstado, String strTotal) {
	    GetListUsers.validateResponsive(intEstado, strTotal);
	}
}
