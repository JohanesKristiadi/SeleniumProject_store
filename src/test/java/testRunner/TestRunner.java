package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src\\test\\java\\feature\\checkout.feature"},
		dryRun = false,
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		glue = {"steps", "hooks"}
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
