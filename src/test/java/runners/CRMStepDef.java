package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//taggedfeatures//", glue = {
"stepDefs" }, 
dryRun = false, 
monochrome = true, 
plugin = { 
		"html:target\\Reports\\HtmlReport.html",
//		"usage:target\\Reports\\UsageReport",
//		"json:target\\reports\\JsonReport.json",
//		"rerun:target\\failedScenarios.txt",
//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
//--Tags at Scenario Level--
//tags = "@SmokeTest"
//tags = "@RegressionTest"
//tags = "@RegressionTest and @SmokeTest"
//tags = "@RegressionTest or @SmokeTest"
//tags = "not @RegressionTest"
//--Tags at Feature Level--
//tags = "@PhaseOne"
//tags = "@PhaseTwo"
//tags = "@PhaseOne and @SmokeTest"
//tags = "@PhaseTwo and @RegressionTest"
//tags = "not @PhaseOne and @RegressionTest"
tags = "@PhaseOne and not @RegressionTest"

)

public class CRMStepDef extends AbstractTestNGCucumberTests {
	
	

}
