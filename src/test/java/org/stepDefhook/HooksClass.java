package org.stepDefhook;

import org.cuBase.BaseClassG;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClassG{
	
	@Before
	public void beforeScenario() {
		
		sysout("validation start");

		
	}
	
	@After
	public void afterScenario(Scenario s) {
		
		if(s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "name.png");
		}
		driver.close();
	}

}
