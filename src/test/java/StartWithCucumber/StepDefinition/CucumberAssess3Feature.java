package StartWithCucumber.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberAssess3Feature {
    WebDriver driver;


    @Given("E-learn Website has been launched")
    public void e_learn_website_has_been_launched() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares & Dependencies\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://elearningm1.upskills.in/");
    }

    @When("Sign up button is visible")
    public void sign_up_button_is_visible() {
        if (driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/auth/inscription.php']")).isDisplayed()) {
            System.out.println("Sign Up button displayed");
        }
    }

    @Then("Click sign-up button")
    public void click_sign_up_button() {
        driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/auth/inscription.php']")).click();
    }

    @When("Register Button is visible")
    public void register_button_is_visible() {
        if (driver.findElement(By.name("submit")).isDisplayed()) {
            System.out.println("Register button displayed");
        }
    }

    @Then("Fill all the required details and click register")
    public void fill_all_the_required_details_and_click_register() {
        driver.findElement(By.name("firstname")).sendKeys("Aatif4");
        driver.findElement(By.name("lastname")).sendKeys("Aaslaam4");
        driver.findElement(By.name("email")).sendKeys("aaslamaatif1234@yahoo.com");
        driver.findElement(By.name("official_code")).sendKeys("007");
        driver.findElement(By.name("username")).sendKeys("aaslamaatif7214");
        driver.findElement(By.id("pass1")).sendKeys("1aaslamaatif2141232");
        driver.findElement(By.id("pass2")).sendKeys("1aaslamaatif2141232");
        driver.findElement(By.name("phone")).sendKeys("12345678903");
        driver.findElement(By.name("submit")).click();
    }

    @When("Next Button is visible")
    public void next_button_is_visible() {
        if (driver.findElement(By.name("next")).isDisplayed())
            System.out.println("Next button is displayed");
    }

    @Then("Click on Next button and edit profile")
    public void click_on_next_button_and_edit_profile() {
        driver.findElement(By.name("next")).click();
        driver.findElement(By.xpath("//li[@id='current']/a")).click();
        driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/auth/profile.php']")).click();
    }

    @When("Pre-populated fields and Save settings button displayed")
    public void pre_populated_fields_and_save_settings_button_displayed() {
        if (driver.findElement(By.name("apply_change")).isDisplayed())
            System.out.println("Pre-populated fields and Save Settings button displayed");
    }

    @Then("Update user details and Save")
    public void update_user_details_and_save() {
        String firstname = driver.findElement(By.name("firstname")).getAttribute("value");
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(firstname + Math.random());
        String lastname = driver.findElement(By.name("lastname")).getAttribute("value");
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(lastname + Math.random());
        driver.findElement(By.name("phone")).sendKeys("87432582347");
        driver.findElement(By.name("apply_change")).click();
        if (driver.findElement(By.xpath("//div[@class='alert alert-info']")).isDisplayed()) {
            System.out.println("Profile updated");
        }
    }


}
