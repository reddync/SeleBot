package config.General;

import config.SeleniumConfig.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Click extends AbstractPage {


    /**
     * Initialize UserAbstractPage.
     *
     * @param driver .
     */
    public Click(WebDriver driver) {
        super(driver);
    }

    public Browser on(String elementName) {
        String callerClassName = new Exception().getStackTrace()[1].getFileName();
        SeleniumUtility seleniumUtility = new SeleniumUtility(driver);
        seleniumUtility.findElement(callerClassName, elementName).click();
        return browser;
    }

    public Browser on(WebElement el) {
        el.click();
        return browser;
    }


}
