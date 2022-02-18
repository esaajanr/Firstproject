import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Tests_Patch {

	//@Test
	public void test_01_patch() {
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Jagmeet");
		request.put("job", "automation");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		header("Content-Type", "application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		patch("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
	}
	
	@Test
	public void test_delete() {
		
		when().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(204).
		log().all();
	}

	private RestAssured when() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
