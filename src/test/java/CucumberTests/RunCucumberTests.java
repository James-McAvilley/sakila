package CucumberTests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//New Change
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Cucumber",
                glue = "src/test/CucumberTests")


public class RunCucumberTests {
}
