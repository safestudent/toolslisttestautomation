package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginPageLocators {

    // fields

    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");

    // buttons

    private By loginButtonLocator = By.id("enter");

    // messages

    private By failedLoginMessage = By.xpath(".//p[@id='rejectLogin']/b");

}
