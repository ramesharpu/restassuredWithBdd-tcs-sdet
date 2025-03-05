package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class PetApiTest extends BaseTest{
	String endPoint = "pet/findByStatus";
	
	@Test
	public void statusCodeCheck() {
		request
			.param("status", "available")
			.when()
				.get(endPoint)
			.then()
				.statusCode(200)
				.statusLine("HTTP/1.1 200 OK");			
	}
	
	@Test
	public void statusMessageCheck() {
		request
			.param("status", "available")
			.when()
				.get(endPoint)
			.then()
				.statusLine("HTTP/1.1 200 OK");			
	}
	
	@Test
	public void BodyTest() {
		assertTrue(request
			.param("status", "available")
			.when()
				.get(endPoint)
				.body().asPrettyString().contains("doggie"));	
	}
	
}
