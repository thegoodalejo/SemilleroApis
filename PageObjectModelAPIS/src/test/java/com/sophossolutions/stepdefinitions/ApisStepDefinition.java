package com.sophossolutions.stepdefinitions;

import com.sophossolutions.apis.GetUser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApisStepDefinition {
	
	@Given("Quiero consultar un registro en la api {string}")
	public void quieroConsultarUnRegistroEnLaApi(String urlApi) {
	    GetUser.guardarUrlApi(urlApi);
	}

	@When("Envio la consulta del usuario {string} con GET para el endpoint {string}")
	public void envioLaConsultaDelUsuarioConGETParaElEndpoint(String idUsuario, String endPoint) {
	    GetUser.enviarIdUsuario(idUsuario, endPoint);
	}

	@Then("Valido que la respuesta tenga status {int} y tenga nombre {string} y apellido {string}")
	public void validoQueLaRespuestaTengaStatusYTengaNombreYApellido(Integer codigoStatus, String nombre, String apellido) {
	    
	}
	
}
