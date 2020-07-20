package demo;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteDemo {
	
	@Test
	public void tc_delete() {
		given().
			contentType(ContentType.JSON).
		when().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204);
		
	}
	
}
