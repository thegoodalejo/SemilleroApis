package com.sophossolutions.apis;

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

}
