package core.whizlabs.elements;

import core.BaseElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeElements extends BaseElements {

    public WebElement signInButton() {
        return browser.findElement(By.xpath("//*[@id='wrapper']/header/div/div[2]/div[3]/a[1]"));
    }

    public WebElement email() {
        return browserWait
                .until(ExpectedConditions.
                        elementToBeClickable(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/form/div/div[1]/input")))
                .findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/form/div/div[1]/input"));
    }

    public WebElement password() {
        return browser.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/form/div/div[2]/input"));
    }

    public WebElement submitButton() {
        return browserWait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/form/button")))
                .findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/form/button"));
    }

}
