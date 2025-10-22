package org.baseclass;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass{
	
	public static RequestSpecification reqObject;
	public static  Response responseObject;
	
	public static void requestObject(String baseURI) {
		
		
		RestAssured.baseURI=baseURI;
		reqObject = RestAssured.given();
	}
	
	
	public static void attachQueryParam(String paramName, String paramValue) {
		
		reqObject.queryParam(paramName, paramValue);
	}
	
	
	
	public static void attachHeader(String keyName, String keyValue) {
		reqObject.header( keyName,keyValue);
	}
	
	public static void responseObject(String requestType,String resource) {
		switch(requestType) {
		case  "GET":{
			responseObject	=reqObject.request(Method.GET, resource);
			break;
		}
		case "POST" : {
		responseObject=	reqObject.request(Method.POST,resource);
			break;
		}
		case "PUT" :{
			responseObject= reqObject.request(Method.PUT, resource);
			break;
		}
		default :{
			responseObject = reqObject.request(Method.DELETE,resource);
		}
		}
	    }
	
	public static void 	responseCode() {
		
		int statusCode = responseObject.getStatusCode();
		
		System.out.println(statusCode);
	}
		
	
	public static void responseBody() {
		
		String resBody = responseObject.getBody().asPrettyString();
		System.out.println(resBody);
	}
		
	public static void validateResponseCode(int expected) {
		int statusCode = responseObject.getStatusCode();
		Assert.assertEquals(statusCode,expected);
		System.out.println(statusCode);
		
	}
	
	public static void validateResponseBody(String Value, String Expected) {
		Object object = responseObject.jsonPath().get(Value);
		
		String name = (String)object;
		Assert.assertEquals(Expected, name);
	}
	
}

