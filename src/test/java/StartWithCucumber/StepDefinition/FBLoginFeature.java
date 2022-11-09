package StartWithCucumber.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginFeature {
WebDriver driver;

    @Given("User is on Login page")
    public void user_is_on_login_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares & Dependencies\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @When("User enters email {string} and password {string}")
    public void user_enters_email_and_password(String string, String string2) {
        driver.findElement(By.id("email")).sendKeys(string);
        driver.findElement(By.id("pass")).sendKeys(string2);
    }

    @Then("User Enters text")
    public void user_enters_text() {
        driver.findElement(By.name("login")).click();
    }


}
