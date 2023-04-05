
import core.whizlabs.pages.HomePage;
import core.whizlabs.pages.QuizDetailsPage;
import core.whizlabs.pages.QuizListPage;
import core.whizlabs.pages.QuizPage;
import infra.drivers.Driver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhizlabsTest {

    @BeforeMethod
    public void testInit()  {
        Driver.startDockerizedBrowser();
    }

    @AfterMethod
    public void testCleanup() {
        Driver.stopBrowser();
    }

    @Test
    public void dumbAndDumber() {

        var homePage = new HomePage();
        var quizListPage = new QuizListPage();

        homePage.navigate()
                .openSignInForm()
                .fillEmail("chatwithus@flane.co.il")
                .fillPassword("Flane2022!")
                .submit();

        var quizList = quizListPage.navigate().getQuizList();

        for (WebElement quiz: quizList) {

            quizListPage.enterQuiz(quiz);
            var quizDetails = new QuizDetailsPage().navigate();
            var numOfQuestions = quizDetails.numberOfQuestions();
            System.out.println(numOfQuestions);

            quizDetails.startQuiz().startOnPracticeMode();


        }
    }
}
