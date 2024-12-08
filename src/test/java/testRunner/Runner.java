package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "stepDefinitions",
        plugin = {
                "pretty",
        }
)
public class Runner extends AbstractTestNGCucumberTests {

}