package core.whizlabs.assertions;

import core.BaseAssertions;
import core.whizlabs.elements.HomeElements;
import org.testng.Assert;


public class HomeAssertions extends BaseAssertions<HomeElements> {

    public HomeAssertions assertLoginSuccessfully() {

        Assert.assertTrue(!elements().signInButton().isDisplayed(), "Couldn't sign in successfully, try again.");
        return this;
    }

//    public WhizlabsHomeAssertions applicationFormTitle(String expectedTitle) {
//        Assert.assertTrue(elements().getText().contains(expectedTitle), "The form's title doesn't contain the specified text.");
//        return this;
//    }
}
