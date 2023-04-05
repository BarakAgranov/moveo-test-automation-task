package core;

import infra.drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseElements {

    protected WebDriver browser;
    protected WebDriverWait browserWait;
    protected Actions browserActions;

    public BaseElements() {
        browser = Driver.getBrowser();
        browserWait = Driver.getBrowserWait();
    }

    public void switchToDefault() {
        browser.switchTo().defaultContent();
    }

}
