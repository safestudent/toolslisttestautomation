package co.uk.safebear.pages;

import co.uk.safebear.pages.locators.LoginPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class LoginPage {

    @NonNull
    WebDriver driver;

    LoginPageLocators locators = new LoginPageLocators();

    public String getPageTitle(){

        return driver.getTitle();

    }

    public void enterUsername(String username){

        driver.findElement(locators.getUsernameLocator()).sendKeys(username);

    }

    public void enterPassword(String password){

        driver.findElement(locators.getPasswordLocator()).sendKeys(password);

    }

    public void clickLoginButton(){

        driver.findElement(locators.getLoginButtonLocator()).click();

    }

    public String checkForFailedLoginWarning()
    {
        return driver.findElement(locators.getFailedLoginMessage()).getText();
    }

}
