package com.Ryze.step_definitions;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Ryze.utilities.Driver;

import cucumber.api.Scenario;


public class Hooks {
	@Before
	public void setUp() {
		WebDriver driver=Driver.getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			//taking a screenshot
			final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
			// adding the screenshot to the report
			scenario.embed(screenshot,"image/png");
		}
		Driver.closeDriver();
		
	}
	
}
