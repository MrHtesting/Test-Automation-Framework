package StepDefinitions;

import Utilities.GenericFunctions;
import Utilities.WebBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class Hooks extends WebBrowser {


    public Hooks() {
        WebDriver driver;
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {

            byte[] screenshotBytes = GenericFunctions.captureScreenshotAsBytes(driver);


            scenario.attach(screenshotBytes, "image/png", scenario.getName());
        }

        if (driver != null) {
            driver.quit();
        }

    }
}
