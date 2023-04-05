import infra.drivers.DockerizedBrowserType;
import infra.drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CareersPageTests {

    @BeforeMethod
    public void testInit()  {
        Driver.startDockerizedBrowser();
    }

    @AfterMethod
    public void testCleanup() {
        Driver.stopBrowser();
    }

//    @Test
//    public void fillApplicationForm() {

//        var careersPage = new CareersPage();
//        careersPage
//                .navigate()
//                .switchToApplicationFormIFrame()
//                .fillName("TEST - automation candidate")
//                .uploadCv()
//                .selectPosition()
//                .selectHdyhau( "Linkedin")
//                .fillEmail( "test@test.com")
//                .fillPhoneNumber("+972", "0525554422")
//                .checkPrivacyPolicy()
//                .addComment("no comment")
////                .checkCaptcha()
//                .submitForm();
//
//    }
}
