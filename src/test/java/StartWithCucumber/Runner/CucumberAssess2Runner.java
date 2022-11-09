package StartWithCucumber.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature\\CucumberAssess2.feature", glue = {"StartWithCucumber.StepDefinition"}, tags = "@Regression")
public class CucumberAssess2Runner {
}
