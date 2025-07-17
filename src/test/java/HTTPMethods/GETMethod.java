package HTTPMethods;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class GETMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="http://www.appdomain.com/";
		Response res= given().header("Content-Type", "application/json").
				when().get("users").
				then().extract().response();
		
		System.out.println(res.asPrettyString());

	}

	

}
