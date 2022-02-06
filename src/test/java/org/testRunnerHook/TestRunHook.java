package org.testRunnerHook;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import baseClassv.ReportGeneration;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:\\Users\\Elanchezhiyan\\eclipse-workspace1\\BaseCumber\\src\\test\\resources\\adactinHooks.feature" }, glue = {"org.stepDefhook" }, 
				monochrome = true, dryRun = true, plugin = { "pretty",
						"html:C:\\Users\\Elanchezhiyan\\eclipse-workspace1\\BaseCumber\\target",
						"json:C:\\Users\\Elanchezhiyan\\eclipse-workspace1\\BaseCumber\\target\\sample1.json",
						"junit:C:\\Users\\Elanchezhiyan\\eclipse-workspace1\\BaseCumber\\target\\sample1.xml",
						"json:C:\\Users\\Elanchezhiyan\\eclipse-workspace1\\BaseCumber\\target\\gana1.json" }, 
						snippets = SnippetType.CAMELCASE)
public class TestRunHook {
	@AfterClass
	public static void afterClass() {
		ReportGeneration
				.generateJVMReports("C:\\Users\\Elanchezhiyan\\eclipse-workspace1\\BaseCumber\\target\\gana1.json");

	}

}
