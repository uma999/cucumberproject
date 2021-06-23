package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\uma93\\eclipse-workspace\\cucumberproject\\Features\\login.feature",
		glue={"stepdefnition"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty",
			"html:test-output","json:target/jsonreport/report.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)
public class TestRunner {

	

}
