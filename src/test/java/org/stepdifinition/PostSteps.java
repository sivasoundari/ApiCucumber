package org.stepdifinition;

import org.baseclass.BaseClass;

import io.cucumber.java.en.*;

public class PostSteps extends BaseClass {



	@Given("User create the request object {string}")
	public void user_create_the_request_object(String string) {
		
		requestObject("https://reqres.in/");
	 
		attachHeader("x-api-key", "reqres-free-v1");
	}
	@When("User add the payload")
	public void user_add_the_payload() {
		
		

	}
	@When("User creates the response Object {string}")
	public void user_creates_the_response_object(String string) {
	   
	}
	@Then("User validate ResponseCode")
	public void user_validate_response_code() {
	   
		
		
	}




}
