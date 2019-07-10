package co.uk.safebear.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

    public static WebElement waitForElement(By locator, WebDriver driver){

        // This is where we set the timeout value (of 5 seconds)
        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement element;

        try{

            // Try to find the element straight away
            element = driver.findElement(locator);

        } catch (TimeoutException e){

            // If you can't, use the 'explicit wait'
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element = driver.findElement(locator);

        } catch (Exception e) {

            // If it still isn't there, print a stack trace and take a screenshot.
            System.out.println(e.toString());
            Screenshots.capturescreenshot(driver, Screenshots.generateScreenShotFileName());
            throw (e);

        }

        // return the web element if it's been found.
        return element;

    }

}
