package infra.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public enum DockerizedBrowserType {

    CHROME {

        public WebDriver createDriver() {

            WebDriverManager.getInstance(DriverManagerType.CHROME).browserInDocker().create();

            return new ChromeDriver(getOptions());
        }

        public ChromeOptions getOptions() {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments(START_MAXIMIZED);
            chromeOptions.addArguments(ALLOW_ORIGINS);
//            chromeOptions.addArguments(NO_SANDBOX);
//            chromeOptions.addArguments("disable-infobars");
//            chromeOptions.addArguments("--disable-extensions");
            chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
//            chromeOptions.addArguments("--headless");
            chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

            return chromeOptions;
        }
    }, FIREFOX {

        public WebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.FIREFOX).browserInDocker().create();

            return new FirefoxDriver(getOptions());
        }

        public FirefoxOptions getOptions() {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.addArguments(START_MAXIMIZED);
            firefoxOptions.addArguments(ALLOW_ORIGINS);


            return firefoxOptions;
        }
    }, EDGE {

        public WebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.EDGE).browserInDocker().enableVnc().create();

            return new EdgeDriver(getOptions());
        }

        public EdgeOptions getOptions() {
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments(START_MAXIMIZED);
            edgeOptions.addArguments(ALLOW_ORIGINS);

            return edgeOptions;
        }
    }, SAFARI {

        public WebDriver createDriver() {
            WebDriverManager.getInstance(DriverManagerType.SAFARI).browserInDocker().enableVnc().create();

            return new SafariDriver(getOptions());
        }

        public SafariOptions getOptions() {
            SafariOptions safariOptions = new SafariOptions();
            safariOptions.setAutomaticInspection(false);

            return safariOptions;
        }
    };

    private static final String START_MAXIMIZED = "--start-maximized";
    private static final String ALLOW_ORIGINS = "--remote-allow-origins=*";
    private static final String NO_SANDBOX = "--no-sandbox";

    public abstract WebDriver createDriver();
    public abstract AbstractDriverOptions<?> getOptions();
}
