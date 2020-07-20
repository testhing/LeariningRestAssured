package demo;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutDemo {
	
	@Test
	public void tc_put() {
		JSONObject reqBody = new JSONObject();
		
		reqBody.put("name", "Binita");
		reqBody.put("job", "TPM");
		//we have created the req body
		
		given().
			body(reqBody.toJSONString()).
			contentType(ContentType.JSON).
		when().
			put("https://reqres.in/api/users/2").
		then().
			statusCode(200).log().all();
		
		
	}
	
}
