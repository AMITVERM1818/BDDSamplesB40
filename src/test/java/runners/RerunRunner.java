package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failedScenarios.txt", 
		glue = {"stepDefs" }, 
		dryRun = false, 
		monochrome = true, 
		plugin = { "pretty"})

public class RerunRunner extends AbstractTestNGCucumberTests {

}
