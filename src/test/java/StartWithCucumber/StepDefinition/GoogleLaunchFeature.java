package StartWithCucumber.StepDefinition;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//import cucumber.api.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLaunchFeature {
    WebDriver driver;

    @Given("Google website is launched")
    public void google_website_is_launched() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares & Dependencies\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @When("Search bar is visible")
    public void search_bar_is_visible() {
        System.out.println(driver.findElement(By.name("q")).isDisplayed());
    }

    @Then("Enter text")
    public void enter_text() {
        driver.findElement(By.name("q")).sendKeys("Hello");
    }

}
