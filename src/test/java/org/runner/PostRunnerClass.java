package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\USER\\eclipse-workspace\\ApiCucumber\\src\\test\\resources\\Feature files\\Post.feature",
glue="org.stepdifinition")
public class PostRunnerClass {

	
}
