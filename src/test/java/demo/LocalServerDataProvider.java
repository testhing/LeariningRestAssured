package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class LocalServerDataProvider {
	@DataProvider(name = "studentRecords" )
	public Object[][] apiDataProvider() {
		/*
		Object[][] dataObjects = new Object[2][2];
		
		dataObjects[0][0] = "Pradeep";
		dataObjects[0][1] = 2;
		
		dataObjects[1][0] = "Sushma";
		dataObjects[1][1] = 3;
		
		return dataObjects;
		*/
		
		return new Object[][] {
			{"Binita",3},
			{"Jyothi",1},
			{"Ashesh",2}
		};
		
	}
	
	
	
	@Test(dataProvider = "studentRecords")
	public void tc_post(String firstName, int coursid) {
		JSONObject reqBody = new JSONObject();
		reqBody.put("firstName", firstName);
		reqBody.put("courseId", coursid);
		
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
	}

}
