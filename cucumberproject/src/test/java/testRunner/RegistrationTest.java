package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith (Cucumber.class)
	@CucumberOptions(
			features="C:\\Users\\uma93\\eclipse-workspace\\cucumberproject\\Features\\datatablelist.feature",
			glue={"stepDefinition"},
			dryRun=false,
			monochrome=true,
			plugin= {"pretty","html:test-output"}
			
			)
	
	
	
	public  class RegistrationTest {
		// TODO Auto-generated constructor stub
	}


