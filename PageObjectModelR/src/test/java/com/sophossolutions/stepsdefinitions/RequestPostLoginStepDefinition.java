package com.sophossolutions.stepsdefinitions;

import com.sophossolutions.apis.PostLogin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequestPostLoginStepDefinition {
	

	@Given("Quiero realizar un login en la api {string}")
	public void quieroRealizarUnLoguinEnLaApi(String strBaseUrl) {
		PostLogin.setBaseUrl(strBaseUrl);
	}

	@When("Envio la informacion del usuario para el endpoint {string}")
	public void envioLaInformacionDelUsuarioParaElEndpoint(String strEndpoint, DataTable dataUserInfo) {
		PostLogin.executePostLogin(strEndpoint, dataUserInfo);
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //

	}
	@Then("Valido que la respuesta tenga status {int} y contenga token {string}")
	public void validoQueLaRespuestaTengaStatusYContengaToken(Integer strStatusCode, String strToken) {
		PostLogin.validateResponsive(strStatusCode, strToken);
		}
}
