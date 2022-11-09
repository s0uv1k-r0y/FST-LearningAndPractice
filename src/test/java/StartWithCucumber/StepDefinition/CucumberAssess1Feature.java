package StartWithCucumber.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberAssess1Feature {
    WebDriver driver;

    @Given("Website is launched")
    public void website_is_launched() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares & Dependencies\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://elearningm1.upskills.in/");
    }

    @When("Sign up is visible")
    public void sign_up_is_visible() {
        if (driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/auth/inscription.php']")).isDisplayed()) {
            System.out.println("Sign Up button displayed");
        }
    }

    @Then("Click sign up button")
    public void click_sign_up_button() {
        driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/auth/inscription.php']")).click();
    }

    @When("Register button is displayed")
    public void register_button_is_displayed() {
        if (driver.findElement(By.name("submit")).isDisplayed()) {
            System.out.println("Register button displayed");
        }
    }

    @Then("Fill all required details and click register")
    public void fill_all_required_details_and_click_register() {
        driver.findElement(By.name("firstname")).sendKeys("Aatif22");
        driver.findElement(By.name("lastname")).sendKeys("Aaslaam22");
        driver.findElement(By.name("email")).sendKeys("22aaslamaatif1232@yahoo.com");
        driver.findElement(By.name("official_code")).sendKeys("007");
        driver.findElement(By.name("username")).sendKeys("22aaslamaatif7211232");
        driver.findElement(By.id("pass1")).sendKeys("1aaslamaatif2141232");
        driver.findElement(By.id("pass2")).sendKeys("1aaslamaatif2141232");
        driver.findElement(By.name("phone")).sendKeys("12345678902");
        driver.findElement(By.name("submit")).click();
    }

    @When("Next button is displayed")
    public void next_button_is_displayed() {
        if (driver.findElement(By.name("next")).isDisplayed())
            System.out.println("Next button is displayed");
        driver.findElement(By.name("next")).click();
    }

    @Then("Click on Profile")
    public void click_on_profile() {
        driver.findElement(By.xpath("//a[@href='#']")).click();
        driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/social/home.php']")).click();
    }

    @When("Message icon displayed")
    public void message_icon_displayed() {
        if (driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/messages/inbox.php?f=social']")).isDisplayed())
            System.out.println("Message icon is displayed");
    }

    @Then("Click on message icon and compose")
    public void click_on_message_icon_and_compose() {
        driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/messages/inbox.php?f=social']")).click();
        driver.findElement(By.xpath("//img[@title='Compose message']")).click();
    }

    @When("Send message button is displayed")
    public void send_message_button_is_displayed() {
        if (driver.findElement(By.name("compose")).isDisplayed()) {
            System.out.println("Send Message button is displayed");
        }
    }

    @Then("Compose message and send")
    public void compose_message_and_send() {
        if (driver.findElement(By.name("compose")).isDisplayed()) {
            driver.findElement(By.xpath("//input[@class='select2-search__field' and @placeholder='Please select an option']")).sendKeys("David Das");
            driver.findElement(By.xpath("//input[@class='select2-search__field' and @placeholder='Please select an option']")).sendKeys(Keys.ENTER);
            driver.findElement(By.name("title")).sendKeys("Subject test 123456789674523");
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, content']")));
            driver.findElement(By.xpath("//body/p")).sendKeys("Message Content");
        }
        driver.switchTo().defaultContent();
        driver.findElement(By.name("compose")).click();
        try {
            if (driver.findElement(By.xpath("//div[@class='alert alert-success']")).isDisplayed()) {
                System.out.println("Message sent");
            }
        } catch (Exception e) {
            if (driver.findElement(By.xpath("//div[@class='alert alert-danger']")).isDisplayed()) {
                System.out.println("Error occurred while sending message");
            }
        }
    }

}
