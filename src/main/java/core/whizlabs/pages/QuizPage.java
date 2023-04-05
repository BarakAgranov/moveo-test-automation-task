package core.whizlabs.pages;

import core.BasePage;
import core.whizlabs.assertions.QuizAssertions;
import core.whizlabs.elements.QuizElements;
import infra.drivers.Driver;

public class QuizPage extends BasePage<QuizElements, QuizAssertions> {

    @Override
    protected String getUrl() {
        return Driver.getBrowser().getCurrentUrl();
    }

    @Override
    public QuizPage navigate() {
        super.navigate();
        Driver.waitUntilPageLoadsCompletely();
        Driver.waitForAjax();
        System.out.println("page url = " + Driver.getBrowser().getCurrentUrl());
        System.out.println("page title = " + Driver.getBrowser().getTitle());
        return this;
    }
}
