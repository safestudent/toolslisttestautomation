package co.uk.safebear;

import co.uk.safebear.pages.LoginPage;
import co.uk.safebear.pages.ToolsPage;
import co.uk.safebear.utils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Stepdefs {

    WebDriver driver;
    LoginPage loginPage;
    ToolsPage toolsPage;

    @Before
    public void setUp(){
        // Get the driver for the browser (e.g. ChromeDriver)
        driver = Driver.getDriver();
        loginPage = new LoginPage(driver);
        toolsPage = new ToolsPage(driver);
        // Navigate to the URL of our webpage
        driver.get(Driver.getUrl());

    }

    @After
    public void tearDown(){
        try {
            Thread.sleep(Integer.parseInt(System.getProperty("sleep","2000")));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Given("I am logged out")
    public void i_am_logged_out() {
        // Assert that we're on the 'login page'
        Assert.assertEquals("We're not on the Login Page", "Login Page", loginPage.getPageTitle());
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the user is informed that the login is successful")
    public void the_user_is_informed_that_the_login_is_successful() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
