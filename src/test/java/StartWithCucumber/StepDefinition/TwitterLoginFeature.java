package StartWithCucumber.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterLoginFeature {
    WebDriver driver;


    @Given("User is on Twitter Login page")
    public void user_is_on_twitter_login_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares & Dependencies\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.twitter.com/");
        driver.findElement(By.xpath("//a[@href='/login']")).click();
    }

    @When("^User logs in with ([^\"]*) and ([^\"]*)$")
    public void user_logs_in_with_email_and_password(String email, String password) {
        driver.findElement(By.xpath("//input[@name='text']")).sendKeys(email);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @Then("User Enters text and tries to login")
    public void user_enters_text_and_tries_to_login() {
        driver.findElement(By.xpath("//span[text()='Log in']")).click();
        driver.quit();
    }


}
