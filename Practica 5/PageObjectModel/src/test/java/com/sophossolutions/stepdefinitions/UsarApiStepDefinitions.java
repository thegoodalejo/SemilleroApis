package com.sophossolutions.stepdefinitions;

import com.sophossolutions.pages.*; 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UsarApiStepDefinitions {
	
	ApisHome Apis;
	@Given("Deseo realizar un registro en la API {string}")
	public void deseoRealizarUnRegistroEnLaAPI(String strUrl) {
	    // Write code here that turns the phrase above into concrete actions
	  //Apis.navegateTo(strUrl);	
	}

	@When("Enviar los datos a la API {string}")
	public void enviarLosDatosALaAPI(String endPoint, io.cucumber.datatable.DataTable userInfo) {
	Apis.PostNoAuth(endPoint, userInfo);	
	   
	}

	@Then("Verificar que la respuesta sea un {int}")
	public void verificarQueLaRespuestaSeaUn(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

}
