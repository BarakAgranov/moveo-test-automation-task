package infra.drivers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {

    private static WebDriverWait browserWait;
    private static WebDriver browser;

    public static WebDriver getBrowser() {
        if (browser == null) {
            throw new NullPointerException("The WebDriver browser instance was not initialized. You should first call the start() method.");
        }
        return browser;
    }

    public static void setBrowser(WebDriver browser) {
        Driver.browser = browser;
    }

    public static Actions getActions() {
        return new Actions(Driver.getBrowser());
    }

    public static WebDriverWait getBrowserWait() {
        if (browserWait == null || browser == null) {
            throw new NullPointerException("The WebDriver browser wait instance was not initialized. You should first call the start() method.");
        }
        return browserWait;
    }

    public static void setBrowserWait(WebDriverWait browserWait) {
        Driver.browserWait = browserWait;
    }

    public static void startDockerizedBrowser(DockerizedBrowserType browserType, Duration defaultTimeout) {
        WebDriver driver = browserType.createDriver();
        setBrowser(driver);
        setBrowserWait(new WebDriverWait(getBrowser(), defaultTimeout));

    }

    public static void startDockerizedBrowser(DockerizedBrowserType browserType) {
        startDockerizedBrowser(browserType, Duration.ofSeconds(20));
    }

    public static void startDockerizedBrowser() {
        startDockerizedBrowser(DockerizedBrowserType.CHROME);
    }

    public static void stopBrowser() {

        getBrowser().quit();
        setBrowser(null);
        setBrowserWait(null);
    }

    public static void waitForAjax() {
        var javascriptExecutor = (JavascriptExecutor)browser;
        browserWait.until(d -> javascriptExecutor.executeScript("return window.jQuery != undefined && jQuery.active == 0"));
    }

    public static void waitUntilPageLoadsCompletely() {
        var javascriptExecutor = (JavascriptExecutor)browser;
        browserWait.until(d -> javascriptExecutor.executeScript("return document.readyState").toString().equals("complete"));
    }
}
