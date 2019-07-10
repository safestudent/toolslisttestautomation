package co.uk.safebear.pages.locators;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class ToolsPageLocators {

    // messages

    private By successfulLoginMessage = By.xpath(".//body/div[@class = 'container']/p/b");

}
