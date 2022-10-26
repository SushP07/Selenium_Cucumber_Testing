package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NGLogoSteps {


    WebDriver driver;

    @Given("I launch Chrome Browser")
    public void i_launch_chrome_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sushrut.pakhale\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @When("I open National Grid Home Page")
    public void i_open_national_grid_home_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.nationalgrid.co.uk/");
    }

    @Then("I verify that the logo is on Page")
    public void i_verify_that_the_logo_is_on_page() {
        // Write code here that turns the phrase above into concrete actions
        boolean display = driver.findElement(By.xpath("//*[@id=\"ng-app\"]/div[2]/header/div[1]/div/div[1]/div[1]/div/a/span/img")).isDisplayed();
        Assert.assertEquals(true, display);
    }

    @When("I navigate to url {string}")
    public void i_navigate_to_url(String url) {
        driver.get("https://www.nationalgrid.co.uk/power-cut-information");

    }
    @Then("I should get page title as {string}")
    public void i_should_get_page_title_as(String string) {
        boolean display = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/div/div[1]/h1")).isDisplayed();
        Assert.assertEquals(true, display);
    }
    @Then("I navigate back to National Grid Home Page")
    public void i_navigate_back_to_national_grid_home_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.nationalgrid.co.uk/");
    }



    @Then("Close Browser")
    public void close_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }
}
