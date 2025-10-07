import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestClass {
@Test
public void verifyStatusCode() {
	
	RestAssured.useRelaxedHTTPSValidation();
	
	Response response = RestAssured.given()
			.auth().basic("admin", "password123")
			.when()
			.get("https://restful-booker.herokuapp.com/auth");
	
	System.out.println(response.getBody().asPrettyString());
	System.out.println(response.getStatusCode());

}
}
