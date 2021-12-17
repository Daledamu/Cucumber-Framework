package com.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
		
		features = "./featureFile/OrangeHrm.feature",// path of the feature file
		glue = "com.qa.steps",// step definition package name
		plugin = {"html:target/html_output.html",
				"json:target/json_output.json",
				"junit:target/junit_output.xml","pretty"},//to generate varies report
		monochrome = true, //to remove unwanted symbols from the console
		dryRun = true
		
		
		
		
		)

public class TestRunner {

}
