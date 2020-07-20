package demo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class GitDemo {
	
	@Test
	public void tc_get() {
		baseURI = "http://localhost:3000";
		
		given().
			param("courseId", 1).
			get("/students").
		then().
			statusCode(200).
			log().all();		
		
	}
	
	//===========
			//dev-1
			@Test
			public void tc_post() {
				JSONObject reqBody = new JSONObject();
				reqBody.put("firstName", "Divya");
				reqBody.put("courseId", 3);
				
				baseURI = "http://localhost:3000";
				
				given().
					contentType(ContentType.JSON).
					accept(ContentType.JSON).
					body(reqBody.toJSONString()).
				when().
					post("/students").
				then().
					statusCode(201).
					log().all();
				
				/*
				 * statements
				 * logic....
				 * 
				 */
			}
			
			
			//dev-2
			public void tc_put() {
				/*
				 * logic
				 * data source
				 * 
				 * 
				 */
			}
			


}
