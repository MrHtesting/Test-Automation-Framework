package StepDefinitions;

import Utilities.GenericFunctions;
import Utilities.WebBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks extends WebBrowser {

    @Before
    public void beforeScenario() {
        driver = null;
        driver = WebBrowser.getDriver();
    }

    @After
    public void afterScenario(Scenario scenario) {
        try {
            if (scenario.isFailed() && driver != null) {
                byte[] screenshotBytes = GenericFunctions.captureScreenshotAsBytes(driver);
                scenario.attach(screenshotBytes, "image/png", scenario.getName());
            }
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot: " + e.getMessage());
        } finally {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }
    }
}