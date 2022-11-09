package StartWithCucumber.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature\\CucumberAssess1.feature", glue = {"StartWithCucumber.StepDefinition"})
public class CucumberAssess1Runner {
}
