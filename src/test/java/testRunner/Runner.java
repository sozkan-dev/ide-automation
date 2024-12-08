package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",  // Feature dosyalarının yolu
        glue = "stepDefinitions", // Step definitions'ın yolu
        plugin = {
                "pretty",
        }
)
public class Runner extends AbstractTestNGCucumberTests {

}