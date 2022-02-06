package org.TestRunner1;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import baseClassv.ReportGeneration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Elanchezhiyan\\eclipse-workspace1\\BaseCumber\\src\\test\\resources\\cumberpom.feature"}, 
glue= {"org.stepDefhook"}, monochrome=true,dryRun=false,plugin= {"pretty","html:C:\\Users\\Elanchezhiyan\\eclipse-workspace1\\BaseCumber\\target",
		"json:C:\\Users\\Elanchezhiyan\\eclipse-workspace1\\BaseCumber\\target\\sample.json",
		"junit:C:\\Users\\Elanchezhiyan\\eclipse-workspace1\\BaseCumber\\target\\sample.xml",
		"json:C:\\Users\\Elanchezhiyan\\eclipse-workspace1\\BaseCumber\\target\\gana.json"})
public class Gana {
	
	@AfterClass
	public static void afterClass() {

		ReportGeneration.generateJVMReports("C:\\Users\\Elanchezhiyan\\eclipse-workspace1\\BaseCumber\\target\\gana.json");
		
	}

}
