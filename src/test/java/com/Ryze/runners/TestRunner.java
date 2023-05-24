package com.Ryze.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {
				"pretty",
				"html:target/cucumber" ,
				"json:target/cucumber"
		},
		tags="@ryze",
		dryRun=false,
		features="src/test/resources/features/",
        glue= "com/Ryze/step_definitions")

public class TestRunner extends AbstractTestNGCucumberTests {

	@AfterClass
	public void teardown() {


	}
}