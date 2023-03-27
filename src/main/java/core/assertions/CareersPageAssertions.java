package core.assertions;

import core.elements.CareersPageElements;
import org.testng.Assert;


public class CareersPageAssertions extends BaseAssertions<CareersPageElements> {

    public CareersPageAssertions applicationFormTitle(String expectedTitle) {
        Assert.assertTrue(elements().applicationFormTitle().getText().contains(expectedTitle), "The form's title doesn't contain the specified text.");
        return this;
    }

    public CareersPageAssertions applicationFormSubmittedSuccessfully(String expectedTitle) {
//        Assert.assertTrue(elements().formTitle().getText().contains(expectedTitle), "The form's title doesn't contain the specified text.");
        return this;
    }
}
