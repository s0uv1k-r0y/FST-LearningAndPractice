package StartWithCucumber.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CucumberAssess2Feature {
    WebDriver driver;


    @Given("Calculator Website is launched1")
    public void calculator_website_is_launched1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares & Dependencies\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/");
        Assert.assertEquals(driver.getTitle(), "Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science");
    }

    @When("BMI Calculator link is displayed1")
    public void bmi_calculator_link_is_displayed1() {
        if (driver.findElement(By.xpath("//a[@href='/bmi-calculator.html']")).isDisplayed())
            System.out.println("BMI Calculator link is displayed");
    }

    @Then("Click and verify Page title1")
    public void click_and_verify_page_title1() {
        driver.findElement(By.xpath("//a[@href='/bmi-calculator.html']")).click();
        Assert.assertEquals(driver.getTitle(), "BMI Calculator");
    }

    @When("BMI Calculator is displayed1")
    public void bmi_calculator_is_displayed1() {
        if (driver.findElement(By.xpath("//input[@alt='Calculate']")).isDisplayed())
            System.out.println("BMI Calculator is displayed");
    }

    @Then("^Fill ([^\"]*) , ([^\"]*) and ([^\"]*) and calculate BMI1$")
    public void fill_all_details_and_calculate_bmi1(String age, String height, String weight) {
        driver.findElement(By.id("cage")).clear();
        driver.findElement(By.id("cage")).sendKeys(age);
        driver.findElement(By.id("cheightmeter")).clear();
        driver.findElement(By.id("cheightmeter")).sendKeys(height);
        driver.findElement(By.id("ckg")).clear();
        driver.findElement(By.id("ckg")).sendKeys(weight);
        driver.findElement(By.xpath("//input[@alt='Calculate']")).click();
    }

    @When("Result is displayed1")
    public void result_is_displayed1() {
        if (driver.findElement(By.xpath("//h3[contains(text(),'BMI introduction')]")).isDisplayed())
            System.out.println("Result is Displayed");
        driver.findElement(By.xpath("//a[@href='#']")).click();
    }

    @Then("Capture result and close browser1")
    public void capture_result_and_close_browser1() {
        driver.findElement(By.xpath("//div[@class='bigtext']")).getText();
        System.out.println(driver.findElement(By.xpath("//div[@class='bigtext']")).getText());
        driver.quit();
    }

    @Given("Calculator Website is launched2")
    public void calculator_website_is_launched2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares & Dependencies\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/");
        Assert.assertEquals(driver.getTitle(), "Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science");
    }

    @When("BMI Calculator link is displayed2")
    public void bmi_calculator_link_is_displayed2() {
        if (driver.findElement(By.xpath("//a[@href='/bmi-calculator.html']")).isDisplayed())
            System.out.println("BMI Calculator link is displayed");
    }

    @Then("Click and verify Page title2")
    public void click_and_verify_page_title2() {
        driver.findElement(By.xpath("//a[@href='/bmi-calculator.html']")).click();
        Assert.assertEquals(driver.getTitle(), "BMI Calculator");
    }

    @When("BMI Calculator is displayed2")
    public void bmi_calculator_is_displayed2() {
        if (driver.findElement(By.xpath("//input[@alt='Calculate']")).isDisplayed())
            System.out.println("BMI Calculator is displayed");
    }

    @Then("^Fill ([^\"]*) , ([^\"]*) and ([^\"]*) and calculate BMI2$")
    public void fill_all_details_and_calculate_bmi2(String age, String height, String weight) {
        driver.findElement(By.id("cage")).clear();
        driver.findElement(By.id("cage")).sendKeys(age);
        driver.findElement(By.id("cheightmeter")).clear();
        driver.findElement(By.id("cheightmeter")).sendKeys(height);
        driver.findElement(By.id("ckg")).clear();
        driver.findElement(By.id("ckg")).sendKeys(weight);
        driver.findElement(By.xpath("//input[@alt='Calculate']")).click();
    }

    @When("Result is displayed2")
    public void result_is_displayed2() {
        if (driver.findElement(By.xpath("//h3[contains(text(),'BMI introduction')]")).isDisplayed())
            System.out.println("Result is Displayed");
        driver.findElement(By.xpath("//a[@href='#']")).click();
    }

    @Then("Capture result and close browser2")
    public void capture_result_and_close_browser2() {
        driver.findElement(By.xpath("//div[@class='bigtext']")).getText();
        System.out.println(driver.findElement(By.xpath("//div[@class='bigtext']")).getText());
        driver.quit();
    }

    @Given("Calculator Website is launched3")
    public void calculator_website_is_launched3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares & Dependencies\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/");
        Assert.assertEquals(driver.getTitle(), "Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science");
    }

    @When("BMI Calculator link is displayed3")
    public void bmi_calculator_link_is_displayed3() {
        if (driver.findElement(By.xpath("//a[@href='/bmi-calculator.html']")).isDisplayed())
            System.out.println("BMI Calculator link is displayed");
    }

    @Then("Click and verify Page title3")
    public void click_and_verify_page_title3() {
        driver.findElement(By.xpath("//a[@href='/bmi-calculator.html']")).click();
        Assert.assertEquals(driver.getTitle(), "BMI Calculator");
    }

    @When("BMI Calculator is displayed3")
    public void bmi_calculator_is_displayed3() {
        if (driver.findElement(By.xpath("//input[@alt='Calculate']")).isDisplayed())
            System.out.println("BMI Calculator is displayed");
    }

    @Then("^Fill ([^\"]*) , ([^\"]*) and ([^\"]*) and calculate BMI3$")
    public void fill_all_details_and_calculate_bmi3(String age, String height, String weight) {
        driver.findElement(By.id("cage")).clear();
        driver.findElement(By.id("cage")).sendKeys(age);
        driver.findElement(By.id("cheightmeter")).clear();
        driver.findElement(By.id("cheightmeter")).sendKeys(height);
        driver.findElement(By.id("ckg")).clear();
        driver.findElement(By.id("ckg")).sendKeys(weight);
        driver.findElement(By.xpath("//input[@alt='Calculate']")).click();
    }

    @When("Result is displayed3")
    public void result_is_displayed3() {
        if (driver.findElement(By.xpath("//h3[contains(text(),'BMI introduction')]")).isDisplayed())
            System.out.println("Result is Displayed");
        driver.findElement(By.xpath("//a[@href='#']")).click();
    }

    @Then("Capture result and close browser3")
    public void capture_result_and_close_browser3() {
        driver.findElement(By.xpath("//div[@class='bigtext']")).getText();
        System.out.println(driver.findElement(By.xpath("//div[@class='bigtext']")).getText());
        driver.quit();
    }

    @Given("Calculator Website is launched4")
    public void calculator_website_is_launched4() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares & Dependencies\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/");
        Assert.assertEquals(driver.getTitle(), "Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science");
    }

    @When("BMI Calculator link is displayed4")
    public void bmi_calculator_link_is_displayed4() {
        if (driver.findElement(By.xpath("//a[@href='/bmi-calculator.html']")).isDisplayed())
            System.out.println("BMI Calculator link is displayed");
    }

    @Then("Click and verify Page title4")
    public void click_and_verify_page_title4() {
        driver.findElement(By.xpath("//a[@href='/bmi-calculator.html']")).click();
        Assert.assertEquals(driver.getTitle(), "BMI Calculator");
    }

    @When("BMI Calculator is displayed4")
    public void bmi_calculator_is_displayed4() {
        if (driver.findElement(By.xpath("//input[@alt='Calculate']")).isDisplayed())
            System.out.println("BMI Calculator is displayed");
    }

    @Then("^Fill ([^\"]*) , ([^\"]*) and ([^\"]*) and calculate BMI4$")
    public void fill_all_details_and_calculate_bmi4(String age, String height, String weight) {
        driver.findElement(By.id("cage")).clear();
        driver.findElement(By.id("cage")).sendKeys(age);
        driver.findElement(By.id("cheightmeter")).clear();
        driver.findElement(By.id("cheightmeter")).sendKeys(height);
        driver.findElement(By.id("ckg")).clear();
        driver.findElement(By.id("ckg")).sendKeys(weight);
        driver.findElement(By.xpath("//input[@alt='Calculate']")).click();
    }

    @When("Result is displayed4")
    public void result_is_displayed4() {
        if (driver.findElement(By.xpath("//h3[contains(text(),'BMI introduction')]")).isDisplayed())
            System.out.println("Result is Displayed");
        driver.findElement(By.xpath("//a[@href='#']")).click();
    }

    @Then("Capture result and close browser4")
    public void capture_result_and_close_browser4() {
        driver.findElement(By.xpath("//div[@class='bigtext']")).getText();
        System.out.println(driver.findElement(By.xpath("//div[@class='bigtext']")).getText());
        driver.quit();
    }

    @Given("Calculator Website is launched5")
    public void calculator_website_is_launched5() {
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares & Dependencies\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/");
        Assert.assertEquals(driver.getTitle(), "Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science");
    }

    @When("BMI Calculator link is displayed5")
    public void bmi_calculator_link_is_displayed5() {
        if (driver.findElement(By.xpath("//a[@href='/bmi-calculator.html']")).isDisplayed())
            System.out.println("BMI Calculator link is displayed");
    }

    @Then("Click and verify Page title5")
    public void click_and_verify_page_title5() {
        driver.findElement(By.xpath("//a[@href='/bmi-calculator.html']")).click();
        Assert.assertEquals(driver.getTitle(), "BMI Calculator");
    }

    @When("BMI Calculator is displayed5")
    public void bmi_calculator_is_displayed5() {
        if (driver.findElement(By.xpath("//input[@alt='Calculate']")).isDisplayed())
            System.out.println("BMI Calculator is displayed");
    }

    @Then("^Fill ([^\"]*) , ([^\"]*) and ([^\"]*) and calculate BMI5$")
    public void fill_all_details_and_calculate_bmi5(String age, String height, String weight) {
        driver.findElement(By.id("cage")).clear();
        driver.findElement(By.id("cage")).sendKeys(age);
        driver.findElement(By.id("cheightmeter")).clear();
        driver.findElement(By.id("cheightmeter")).sendKeys(height);
        driver.findElement(By.id("ckg")).clear();
        driver.findElement(By.id("ckg")).sendKeys(weight);
        driver.findElement(By.xpath("//input[@alt='Calculate']")).click();
    }

    @When("Result is displayed5")
    public void result_is_displayed5() {
        if (driver.findElement(By.xpath("//h3[contains(text(),'BMI introduction')]")).isDisplayed())
            System.out.println("Result is Displayed");
        driver.findElement(By.xpath("//a[@href='#']")).click();
    }

    @Then("Capture result and close browser5")
    public void capture_result_and_close_browser5() {
        driver.findElement(By.xpath("//div[@class='bigtext']")).getText();
        System.out.println(driver.findElement(By.xpath("//div[@class='bigtext']")).getText());
        driver.quit();
    }


}
