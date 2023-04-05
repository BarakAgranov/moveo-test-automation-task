package core.moveo.pages;

import core.BasePage;
import core.moveo.assertions.CareersPageAssertions;
import core.moveo.elements.CareersPageElements;
import infra.drivers.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.Random;

public class CareersPage extends BasePage<CareersPageElements, CareersPageAssertions> {

    private final Random random = new Random();
    private final int ORIGIN = 4;
    private final int BOUND = 10;

    @Override
    protected String getUrl() {
        return "https://www.moveo.group/careers";
    }

    @Override
    public CareersPage navigate() {
        super.navigate();
        Driver.waitUntilPageLoadsCompletely();
        Driver.waitForAjax();
        return this;
    }

    public CareersPage switchToApplicationFormIFrame() {

        Driver.getBrowserWait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(elements().applicationFormIFrame()));
        System.out.println("switchToApplicationFormIFrame");
        return this;
    }

//    public CareersPage fillName(String name) {
//
//        WebElement nameInput = elements().nameInput();
//        Driver.getActions()
//                .scrollToElement(nameInput)
//                .pause(Duration.ofSeconds(random.nextInt(ORIGIN, BOUND)))
//                .moveToElement(nameInput)
//                .pause(Duration.ofSeconds(random.nextInt(ORIGIN, BOUND)))
//                .release(nameInput)
//                .perform();
//        nameInput.sendKeys(name);
//        System.out.println("fillName");
//        return this;
//    }
//
//    public CareersPage uploadCv() {
//
//        Path resourceDirectory = Paths.get("src", "main", "resources");
//        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
//        WebElement cvUpload = elements().cvUpload();
//        Driver.getActions()
//                .scrollToElement(cvUpload)
//                .pause(Duration.ofSeconds(random.nextInt(ORIGIN, BOUND)))
//                .moveToElement(cvUpload)
//                .pause(Duration.ofSeconds(random.nextInt(ORIGIN, BOUND)))
//                .perform();
//        cvUpload.sendKeys(absolutePath + "/TEST - automation candidate.txt");
//        System.out.println("uploadCv");
//        return this;
//    }
//
//
//    public CareersPage selectPosition() {
//
//        WebElement positionsDropdown = elements().positionDropdown();
//        Driver.getActions()
//                .scrollToElement(positionsDropdown)
//                .pause(Duration.ofSeconds(random.nextInt(ORIGIN, BOUND)))
//                .moveToElement(positionsDropdown)
//                .pause(Duration.ofSeconds(random.nextInt(ORIGIN, BOUND)))
//                .release(positionsDropdown)
//                .perform();
//        positionsDropdown.click();
//        System.out.println("selectPosition");
//        return this;
//    }
//
//    public CareersPage selectHdyhau(String hdyhau) {
//
//        WebElement hdyhauInput = elements().hdyhauOptions();
//        Driver.getActions()
//                .scrollToElement(hdyhauInput)
//                .pause(Duration.ofSeconds(random.nextInt(ORIGIN, BOUND)))
//                .moveToElement(hdyhauInput)
//                .pause(Duration.ofSeconds(random.nextInt(ORIGIN, BOUND)))
//                .release(hdyhauInput)
//                .perform();
//        hdyhauInput.sendKeys(hdyhau);
//        System.out.println("selectHdyhau");
//        return this;
//    }
//
//    public CareersPage fillEmail(String email) {
//
//        WebElement emailInput = elements().emailInput();
//        Driver.getActions()
//                .scrollToElement(emailInput)
//                .pause(Duration.ofSeconds(random.nextInt(ORIGIN, BOUND)))
//                .moveToElement(emailInput)
//                .pause(Duration.ofSeconds(random.nextInt(ORIGIN, BOUND)))
//                .release(emailInput)
//                .perform();
//        emailInput.sendKeys(email);
//        System.out.println("fillEmail");
//        return this;
//    }
//
//    public CareersPage fillPhoneNumber(String code, String number) {
//
//        WebElement phoneNumber = elements().phoneNumberInput();
//        Driver.getActions()
//                .scrollToElement(phoneNumber)
//                .pause(Duration.ofSeconds(random.nextInt(ORIGIN, BOUND)))
//                .moveToElement(phoneNumber)
//                .pause(Duration.ofSeconds(random.nextInt(ORIGIN, BOUND)))
//                .release(phoneNumber)
//                .perform();
//        elements().phoneCountryCodeInput().sendKeys(code);
//        elements().phoneCountryCodeDropdown().click();
//        elements().phoneNumberInput().sendKeys(number);
//        System.out.println("fillPhoneNumber");
//        return this;
//    }
//
//    public CareersPage checkPrivacyPolicy() {
//
//        elements().privacyPolicyCheckbox().click();
//        System.out.println("checkPrivacyPolicy");
//        return this;
//    }
//
//    public CareersPage addComment(String comment) {
//
//        elements().commentsInput().sendKeys(comment);
//        System.out.println("addComment");
//        return this;
//    }
//
//    public CareersPage checkCaptcha() {
//
//        Driver.getBrowserWait().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(elements().notRobotFrame()));
//        elements().notRobotCheckbox().click();
//        Driver.getBrowser().switchTo().defaultContent();
//        System.out.println("checkCaptcha");
//        return this;
//    }
//
//    public CareersPage submitForm() {
//
//        Driver.getBrowser().switchTo().frame(elements().applicationFormIFrame());
//        Driver.getBrowserWait().until(ExpectedConditions.elementToBeClickable(elements().submitButton())).click();
//        System.out.println("submitForm");
//        return this;
//    }


}
