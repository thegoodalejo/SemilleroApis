package com.sophossolutions.apis;

import static org.junit.Assert.assertEquals;
import net.serenitybdd.rest.SerenityRest;

public class GetUser {
	
	private static String apiUrl;
	
	public static void guardarUrlApi(String urlApi) {
		
		apiUrl = urlApi;
	
	}

	public static void enviarIdUsuario(String idUsuario, String endPoint) {
		
		String urlTarget = apiUrl + endPoint + idUsuario;
		
		SerenityRest.
		when().get(urlTarget).
		then().assertThat().statusCode(200);
		
		SerenityRest.lastResponse().prettyPeek();
	}

	public static void validarUsuario(Integer codigoStatus, String nombre, String apellido) {
		
		assertEquals(String.valueOf(codigoStatus),String.valueOf(SerenityRest.lastResponse().getStatusCode()));
		assertEquals(nombre,SerenityRest.lastResponse().jsonPath().get("data.first_name"));
		assertEquals(apellido,SerenityRest.lastResponse().jsonPath().get("data.last_name"));
		
	}

}
