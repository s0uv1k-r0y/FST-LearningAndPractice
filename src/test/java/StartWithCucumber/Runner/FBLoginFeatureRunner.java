package StartWithCucumber.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature\\FBLogin.feature", glue = {"StartWithCucumber.StepDefinition"})
public class FBLoginFeatureRunner {
}
