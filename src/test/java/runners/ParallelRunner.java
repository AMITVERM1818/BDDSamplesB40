package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//features//", glue = {
"stepDefs" }, dryRun = false, monochrome = true, plugin = { "pretty",
		"html:target\\Reports\\HtmlReport.html",
//		"usage:target\\Reports\\UsageReport",
//		"json:target\\reports\\JsonReport.json",
//		"rerun:target\\failedScenarios.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class ParallelRunner extends AbstractTestNGCucumberTests {
	
	 @DataProvider(parallel = true)
	    public Object[][] scenarios() {
	        
		return super.scenarios();
		 
	    }
}
