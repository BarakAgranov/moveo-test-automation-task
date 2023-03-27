package core.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CareersPageElements extends BaseElements{

    public WebElement pageHeaderTitle() {
        return browser.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/h2[1]"));
    }

    public WebElement applicationFormIFrame() {
        return browser.findElement(By.xpath("//iframe[@title='application form']"));
    }

    public WebElement applicationFormTitle() {
        return browser.findElement(By.xpath("//div[@class='form-title']"));
    }

    public WebElement nameInput() {
        return browser.findElement(By.xpath("//*[@id='answer-name']/div/input"));
    }

    public WebElement cvUpload() {
        return browser.findElement(By.xpath("//*[@id='answer-files']/div/div/input"));
    }

    public WebElement positionDropdown() {
        return browser.findElement(By.xpath("//*[@id='react-select-2-input']"));
    }

    public WebElement positionOptions() {
        return browser.findElement(By.xpath("//div[@class='menu dropdown-menu-wrapper css-34fls1-menu']"));
    }

    public WebElement hdyhauOptions() {
        return browser.findElement(By.xpath("//*[@id='react-select-3-input']"));

    }

    public WebElement emailInput() {
        return browser.findElement(By.xpath("//input[@class='form-input email-form-input']"));
    }

    public WebElement phoneCountryCodeInput() {
        return browser.findElement(By.xpath("//*[@id='react-select-2--value']/div[2]/input"));
    }

    public WebElement phoneCountryCodeDropdown() {
        return browser.findElement(By.xpath("//div[@class='Select-menu-outer']"));
    }

    public WebElement phoneNumberInput() {
        return browser.findElement(By.xpath("//*[@id='answer-phone_1']/div/div/input"));
    }

    public WebElement privacyPolicyCheckbox() {
        return browser.findElement(By.xpath("//*[@id='answer-check']"));
    }

    public WebElement commentsInput() {
        return browser.findElement(By.xpath("//*[@id='answer-pulse__update']/div/textarea"));
    }

    public WebElement notRobotFrame() {
        return browser.findElement(By.xpath("//*[@id='surveyModeScrollElement']/div[9]/div[1]/div/div/div/div/div/div/iframe"));
    }

    public WebElement notRobotCheckbox() {
        return browser.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[1]"));
    }

    public WebElement submitButton() {
        return browser.findElement(By.xpath("//*[@id='surveyModeScrollElement']/div[9]/div[1]/div/button"));
    }
}
