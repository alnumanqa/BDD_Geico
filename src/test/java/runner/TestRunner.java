package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@smoke and not @regression",
				 features = "src/test/java/features", 
				 glue = {"base","stepdef"},
				 monochrome = true,
				 dryRun = false,
				 plugin = {"pretty","html:target/report.html", "json:target/report_json.json"})
 
public class TestRunner {

}
