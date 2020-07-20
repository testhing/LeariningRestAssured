package demo;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetDemo {
	
	@Test
	public void tc_get() {
		given().
			header("User-Agent","Eclispe").
			get("https://reqres.in/api/users/2").
		then().
			body("data.first_name", equalTo("Janet")).
			body("ad.url", equalTo("http://statuscode.org/")).log().all();
	}

}
