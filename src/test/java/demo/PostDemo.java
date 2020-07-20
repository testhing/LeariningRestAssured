package demo;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class PostDemo {
	
	@Test
	public void tc_post() {
		JSONObject reqBody = new JSONObject();
		
		reqBody.put("name", "Namratha");
		reqBody.put("job", "Sr SDET");
		//we have created the req body
		
		given().
			body(reqBody.toJSONString()).
			contentType(ContentType.JSON).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201).log().all();
		
		
	}
}
