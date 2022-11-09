package StartWithCucumber.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature\\TwitterLogin.feature", glue = {"StartWithCucumber.StepDefinition"})
public class TwitterLoginRunner {
}
