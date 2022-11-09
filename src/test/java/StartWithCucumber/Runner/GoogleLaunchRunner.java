package StartWithCucumber.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature\\GoogleLaunch.feature", glue = {"StartWithCucumber.StepDefinition"})
public class GoogleLaunchRunner {

//	 if you want to execute only certain feature files then mention path features="Feature\\_______.feature"
//	 else if you only use features="Feature" it will include all feature files
//@CucumberOptions(features="Feature\\login.feature",glue= {"stepDefinition"})
//@CucumberOptions(features="Feature\\DataTable.feature",glue= {"stepDefinition"})
//@CucumberOptions(features="Feature\\ScenarioOutline.feature",glue= {"stepDefinition"})
//@CucumberOptions(features = "Feature\\Background.feature", glue = { "stepDefinition" })

//	to execute certain tags
//@CucumberOptions(features="Feature\\login.feature",glue= {"stepDefinition"},tags= {"@invalid"})

//	to execute certain groups
//@CucumberOptions(features="Feature",glue= {"stepDefinition"},tags= {"@smoke"})

//	to generate report we use pretty plugin
//@CucumberOptions(features="Feature",glue= {"stepDefinition"},tags= {"@invalid"},plugin= {"pretty"})

//	to remove ? from pretty reports use monochrome which is set false by default
//@CucumberOptions(features="Feature",glue= {"stepDefinition"},tags= {"@invalid"},plugin= {"pretty"},monochrome = true)

//	usage report gives duration for each step
//@CucumberOptions(features="Feature",glue= {"stepDefinition"},tags= {"@invalid"},plugin= {"usage"})

//	to generate html report into a target folder
//@CucumberOptions(features="Feature",glue= {"stepDefinition"},tags= {"@invalid"},plugin= {"pretty","html:HTMLTarget/CucumberHtmlReport"})

//	to generate json report into a target folder
//@CucumberOptions(features="Feature",glue= {"stepDefinition"},tags= {"@invalid"},plugin= {"pretty","json:JSONTarget/CucumberJSONReport"})

//	to generate junit report into a target folder in xml format
//    @CucumberOptions(features = "Feature", glue = {"stepDefinition"}, tags = {"@invalid"}, plugin = {"pretty", "junit:JunitTarget/CucumberJunitReport.xml"})


}



