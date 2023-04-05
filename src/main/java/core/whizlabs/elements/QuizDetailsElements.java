package core.whizlabs.elements;

import core.BaseElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class QuizDetailsElements extends BaseElements {

    public WebElement startQuizButton() {
        return browserWait.
                until(ExpectedConditions.
                        visibilityOfElementLocated(By.
                                xpath("//button[@class='btn btn-startQuiz']")))
                .findElement(By.
                        xpath("//button[@class='btn btn-startQuiz']"));
    }

    public WebElement startQuizAsPracticeSection() {
        return browserWait.
                until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By
                        .xpath("//div[@class='MuiPaper-root MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm MuiPaper-elevation24 MuiPaper-rounded']")))
                .findElement(By
                        .xpath("//div[@class='MuiPaper-root MuiDialog-paper MuiDialog-paperScrollPaper MuiDialog-paperWidthSm MuiPaper-elevation24 MuiPaper-rounded']"));
    }

    public WebElement startAsPracticeButton() {
        return browserWait.
                until(ExpectedConditions.elementToBeClickable(By.
                        xpath("//input[@class='jss39']")))
                .findElement(By.
                        xpath("//input[@class='jss39']"));
    }

    public WebElement bitchPlease() {
        return browserWait.
                until(ExpectedConditions.
                        visibilityOfElementLocated(By.
                                xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text btn btn-submit btn-start']")))
                .findElement(By.
                        xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text btn btn-submit btn-start']"));
    }

    public WebElement numberOfQuestions() {
        return browserWait.
                until(ExpectedConditions.
                        visibilityOfElementLocated(By.
                                xpath("//*[@id='content-area']/div[2]/div/div[2]/div[1]/div[2]/div[1]/span/strong")))
                .findElement(By.
                        xpath("//*[@id='content-area']/div[2]/div/div[2]/div[1]/div[2]/div[1]/span/strong"));
    }
}
