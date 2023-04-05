package core.whizlabs.pages;

import core.BasePage;
import core.whizlabs.assertions.QuizDetailsAssertions;
import core.whizlabs.elements.QuizDetailsElements;
import infra.drivers.Driver;

public class QuizDetailsPage extends BasePage<QuizDetailsElements, QuizDetailsAssertions> {

    @Override
    protected String getUrl() {
        return Driver.getBrowser().getCurrentUrl();
    }

    @Override
    public QuizDetailsPage navigate() {
        super.navigate();
        Driver.waitUntilPageLoadsCompletely();
        System.out.println("page url = " + Driver.getBrowser().getCurrentUrl());
        System.out.println("page title = " + Driver.getBrowser().getTitle());
        return this;
    }

    public int numberOfQuestions() {
        return Integer.parseInt(elements().numberOfQuestions().getText());
    }

    public QuizDetailsPage startQuiz() {
        elements().startQuizButton().click();
        return this;
    }

    public QuizDetailsPage startOnPracticeMode() {
        elements().startQuizAsPracticeSection();
        elements().startAsPracticeButton().click();
        elements().bitchPlease();
        return this;
    }



    //    public WhizlabsPracticeTestsPage crawlAllTests(){
//        var free = elements().freeTest();
//        var practice = elements().practiceTest();
//        var tests = new ArrayList<WebElement>();
//        tests.addAll(free);
//        tests.addAll(practice);
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
