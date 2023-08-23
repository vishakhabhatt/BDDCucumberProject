package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/Admin.feature",
		glue = "stepDefination",
		dryRun =false,
		monochrome = true,
		publish = true
	
		)

public class TestRunner {
	
}

