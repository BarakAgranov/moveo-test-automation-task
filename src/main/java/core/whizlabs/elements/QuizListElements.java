package core.whizlabs.elements;

import core.BaseElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class QuizListElements extends BaseElements {


    public List<WebElement> freeQuiz() {
        return browserWait.
                until(ExpectedConditions.
                        visibilityOfElementLocated(By.
                                xpath("//button[@class='secondary']")))
                .findElements(By.xpath("//button[@class='secondary']"));
    }

    public List<WebElement> practiceQuiz() {
        return browserWait.
                until(ExpectedConditions.
                        visibilityOfElementLocated(By.
                                xpath("//button[@class='perpul']")))
                .findElements(By.
                        xpath("//button[@class='perpul']"));
    }



    public WebElement showAnswer() {
        return browserWait.
                until(ExpectedConditions.
                        visibilityOfElementLocated(By.
                                xpath("//button[@class='btn btn-showAnswer show']")))
                .findElement(By.
                        xpath("//input[@class='btn btn-showAnswer show']"));
    }

    public WebElement getExplanation() {
        return browserWait.
                until(ExpectedConditions.
                        visibilityOfElementLocated(By.
                                xpath("//div[@class='explanation-block show-answer']")))
                .findElement(By.
                        xpath("//div[@class='explanation-block show-answer']"));
    }


    public WebElement nextQuestion() {
        return browserWait.
                until(ExpectedConditions.
                        visibilityOfElementLocated(By.
                                xpath("//a[@class='MuiTypography-root MuiLink-root MuiLink-underlineHover btn btn-next false MuiTypography-colorPrimary']")))
                .findElement(By.
                        xpath("//a[@class='MuiTypography-root MuiLink-root MuiLink-underlineHover btn btn-next false MuiTypography-colorPrimary']"));
    }



    public WebElement submitTest() {
        return browserWait.
                until(ExpectedConditions.
                        visibilityOfElementLocated(By.
                                xpath("//a[@class='MuiTypography-root MuiLink-root MuiLink-underlineHover btn btn-submit  MuiTypography-colorPrimary'")))
                .findElement(By.
                        xpath("//a[@class='MuiTypography-root MuiLink-root MuiLink-underlineHover btn btn-submit  MuiTypography-colorPrimary'"));
    }

    public WebElement quitTest() {
        return browserWait.
                until(ExpectedConditions.
                        visibilityOfElementLocated(By.
                                xpath("//a[@class='MuiButtonBase-root MuiButton-root MuiButton-text btn btn-quit'")))
                .findElement(By.
                        xpath("//a[@class='MuiButtonBase-root MuiButton-root MuiButton-text btn btn-quit'"));
    }


}
