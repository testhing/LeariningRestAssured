package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class TestingFirstRestAssuredLogic {
	
	@Test
	public void tc_01() {
		Response response = get("https://reqres.in/api/users/2");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());	
		
		Assert.assertEquals(response.getStatusCode(), 200);
		
	
	}

}
