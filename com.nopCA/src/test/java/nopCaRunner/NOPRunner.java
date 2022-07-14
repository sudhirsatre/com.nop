package nopCaRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions
				(
//@io.cucumber.testng.CucumberOptions
//(
		features = ".//Features//Loginnop.feature", 
		glue = "nopCAsetpDefinition", 
		dryRun = false, 
		monochrome = true, 
		plugin = {"pretty", "html:target/cucumberreports.html" }
	//	tags = "@loginadmin"

)

public class NOPRunner {

}
