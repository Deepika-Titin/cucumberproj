package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	@Before
	public void launchBrowser() {
		loadBrowser();
		
	}
	
	@After
	public void afterScenario(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			byte[]screenshotAs=ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "image/png");
			System.out.println(s.getName()+"Scenario Failed");
			closebrowser();
			
		}
			
	
	}
	
	

}
