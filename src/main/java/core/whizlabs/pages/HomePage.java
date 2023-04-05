package core.whizlabs.pages;

import core.BasePage;
import core.whizlabs.assertions.HomeAssertions;
import core.whizlabs.elements.HomeElements;
import infra.drivers.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage<HomeElements, HomeAssertions> {

    @Override
    protected String getUrl() {
        return "https://www.whizlabs.com";
    }

    @Override
    public HomePage navigate() {
        super.navigate();
        Driver.waitUntilPageLoadsCompletely();
        Driver.waitForAjax();
        System.out.println("page url = " + Driver.getBrowser().getCurrentUrl());
        System.out.println("page title = " + Driver.getBrowser().getTitle());
        return this;
    }

    public HomePage openSignInForm() {
        elements().signInButton().click();
        return this;
    }

    public HomePage fillEmail(String email) {
        elements().email().sendKeys(email);
        return this;
    }

    public HomePage fillPassword(String password) {
        elements().password().sendKeys(password);
        return this;
    }

    public HomePage submit() {
        elements().submitButton().click();
        Driver.getBrowserWait().until(ExpectedConditions.invisibilityOf(elements().signInButton()));
        return this;
    }



}
