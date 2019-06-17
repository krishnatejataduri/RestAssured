package APITesting.api;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class WeatherGetRequests {
	
	//Simple get request to get weather update based on city
	//Should return status code 200
	@Test
	public void Test_01(){
		
		Response response = when().get("http://api.openweathermap.org/data/2.5/weather?q=London");
		System.out.println(response.getStatusCode());
	}

}
