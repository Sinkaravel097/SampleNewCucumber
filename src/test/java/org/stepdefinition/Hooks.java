package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	@Before(order=10)
	public void beforeExecution2() {
		System.out.println("Maximize window");
		maximizeWindow();
	}
	
	@Before(order=5)
	public void beforeExecution() {
		System.out.println("Browser Launch");
		launchBrowser();
	}
 
	
	@After(order=1)
	public void afterExecution() {
		System.out.println("Close browser");
		browserClose();
	}
	
	@After(order=4)
	public void afterExecution1(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] ss = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(ss, "image/png");
			System.out.println("Failed Scenario : " + s.getName());
		}
		
	}

}
