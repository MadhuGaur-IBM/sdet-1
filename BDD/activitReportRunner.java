package testRunner;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ="src/test/java/Features",
		glue ={"stepDefinitions"},
		tags = "@activity2_5",
		dryRun= false,
		plugin = { "pretty", "html:target/cucumber-reports/reports"},
		monochrome = true
		
		
		)
public class activitReportRunner {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
