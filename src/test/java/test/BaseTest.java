package test;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;


public class BaseTest {
	RequestSpecification request;
	String baseURL = "https://petstore.swagger.io/v2";
	
	@BeforeSuite
	public void beforeSuite() {	
		request = RestAssured.given().baseUri(baseURL).contentType("application/json");		
	}
	
}
