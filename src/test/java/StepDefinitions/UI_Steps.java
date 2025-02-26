package StepDefinitions;

import OR.UI_OR;
import Utilities.GenericFunctions;
import Utilities.RandomUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import Utilities.WebBrowser;


public class UI_Steps {

    WebDriver driver;
    UI_OR objHomePage;

    public UI_Steps() {
        this.driver = WebBrowser.getDriver();
        objHomePage = new UI_OR();
    }

    @Given("User is on home Page")
    public void user_is_on_home_page() {
        Assert.assertEquals("Web form", GenericFunctions.getCurrentPageTitle());
    }

    @When("User enters random string in text field")
    public void userEntersRandomStringInTextField() {
        GenericFunctions.sendData(objHomePage.input_text_field, RandomUtils.generateString(10));
    }

    @And("User clicks submit button")
    public void userClicksSubmitButton() {
        GenericFunctions.clickElement(objHomePage.button_submit);
    }

    @Then("User should see {string} text is displayed")
    public void userShouldSeeTextIsDisplayed(String text) {
        Assert.assertEquals(text, GenericFunctions.getElementText(objHomePage.header_form_submitted));
    }

    @When("User selects {int} from dropdown")
    public void userSelectsOptionIndexFromDropdown(int optionIndex) {
        GenericFunctions.getOptions(objHomePage.input_dropdown, optionIndex).click();

    }

    @Then("User can see that field is {string}")
    public void userCanSeeThatFieldIs(String state) {
    }

    @Then("User can see that disabled field is {string}")
    public void userCanSeeThatDisabledFieldIs(String state) {
        Assert.assertTrue(Boolean.parseBoolean(GenericFunctions.getAttributes(objHomePage.input_disabled_field, state)));

    }

    @Then("User can see that readonly field is {string}")
    public void userCanSeeThatReadonlyFieldIs(String state) {
        Assert.assertTrue(Boolean.parseBoolean(GenericFunctions.getAttributes(objHomePage.input_readOnly_field, state)));

    }


}