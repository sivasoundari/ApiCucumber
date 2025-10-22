package org.stepdifinition;

import org.baseclass.BaseClass;

import io.cucumber.java.en.*;

public class StepClass extends BaseClass{

	
	

	@Given("User creates the request object {string};")
	public void user_creates_the_request_object(String string) {
	requestObject(string);
	attachHeader("x-api-key", "reqres-free-v1");
		
	  
	}
	@When("Users add the query parameter {string} and {string}")
	public void users_add_the_query_parameter_and(String string, String string2) {
		attachQueryParam(string, string2);
		
	  
	}
	@When("Users creates the response object {string}")
	public void users_creates_the_response_object(String string) {
		
		responseObject(string , "api/users");
	    
	}
	@Then("User validate the responseCode {int}")
	public void user_validate_the_response_code(Integer int1) {
		
		responseBody();
		responseBody();
		
		validateResponseCode(200);
		System.out.println("============validate the status code===========");
		
		validateResponseBody("data[2].first_name", "Tobias");
		
		System.out.println("============validated the ResponseBody===========");
		
		System.out.println("response code is validated");
		System.out.println("responseBody is validated");
		
	}



}
