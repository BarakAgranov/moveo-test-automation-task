package core.whizlabs.pages;

import core.BasePage;
import core.whizlabs.assertions.QuizListAssertions;
import core.whizlabs.elements.QuizListElements;
import infra.drivers.Driver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class QuizListPage extends BasePage<QuizListElements, QuizListAssertions> {

    @Override
    protected String getUrl() {
        return "https://www.whizlabs.com/learn/course/google-cloud-certified-professional-data-engineer/250";
    }

    @Override
    public QuizListPage navigate() {
        super.navigate();
        Driver.waitUntilPageLoadsCompletely();
        System.out.println("page url = " + Driver.getBrowser().getCurrentUrl());
        System.out.println("page title = " + Driver.getBrowser().getTitle());
        return this;
    }

    public QuizListPage enterQuiz(WebElement enterQuizButton) {
        enterQuizButton.click();
        return this;
    }

    public List<WebElement> getQuizList() {
        var freeQuizList = elements().freeQuiz();
        var practiceQuizList = elements().practiceQuiz();
        var quizList = new ArrayList<WebElement>();
        quizList.addAll(freeQuizList);
        quizList.addAll(practiceQuizList);
        return quizList;
    }

    //    public WhizlabsPracticeTestsPage crawlAllTests(){

//        for (WebElement test: tests) {
//            test.click();
//            var numOfQuestions = Integer.parseInt(elements().numberOfQuestions().getText());
//            System.out.println(numOfQuestions);
//            elements().startQuiz().click();
//            elements().startQuizAsPractice().click();
//            elements().bitchPlease().click();
//            for (int i = 1; i <= numOfQuestions; i++) {
//                elements().showAnswer().click();
//                System.out.println(elements().getExplanation().getText());
//                elements().nextQuestion();
//            }
//            elements().submitTest();
//            elements().quitTest();
//
//        }
//        return this;
//    }


}
