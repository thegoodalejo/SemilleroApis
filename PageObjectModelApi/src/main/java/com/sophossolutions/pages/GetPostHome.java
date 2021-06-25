package com.sophossolutions.pages;





import java.util.Map;



import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;




public class GetPostHome {
	
	private static final String CONTENT_TYPE = "application/json";
	private static String baseUrl;
	
	
	public static void pasarUrl(String url) {
		GetPostHome.baseUrl = url;
	}
	
	public static void EjecutarPostGet(String endpoint, DataTable user) {
		
		Map<String, String> body = user.asMap(String.class,String.class);
		
		SerenityRest.when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(200);
		
		SerenityRest.lastResponse().prettyPeek();
		System.out.println(".................");
		System.out.println(baseUrl + " " + endpoint);
		System.out.println(".................");
		SerenityRest.given().contentType(CONTENT_TYPE).when().body(body).post(baseUrl.concat(endpoint));
		
		SerenityRest.lastResponse().prettyPeek();

	}
	
	public static void ValidarInformacion() {
		SerenityRest.lastResponse().prettyPeek();
		System.out.println(".................");
		System.out.println(SerenityRest.lastResponse().jsonPath().get("id").toString());
		System.out.println(".................");
		System.out.println(SerenityRest.lastResponse().jsonPath().get("token").toString());
	}
	
}
