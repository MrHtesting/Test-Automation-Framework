package Utilities;

import java.time.Duration;
import java.util.*;
import java.lang.*;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GenericFunctions extends WebBrowser {


    public static void clickElement(WebElement element) {
        waitForElementClickable(element).click();

    }

    public static WebElement waitForElementVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForElementClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static boolean isElementDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception ex) {
            return false;
        }
    }

    public static String getElementText(WebElement element) {
        return element.getText();
    }


    public static void mouseHover(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }


    public static void ActionsClick(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).click().build().perform();
    }

    public static void javascriptClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }


    public static String getCurrentPageTitle() {
        return driver.getTitle();
    }


    public static WebElement getOptions(WebElement element, int i) {
        Select select = new Select(element);
        List<WebElement> allOptions = select.getOptions();
        return allOptions.get(i);
    }


    public static void sendData(WebElement element, String inputData) {
        waitForElementVisibility(element).sendKeys(inputData);
    }

    public static byte[] captureScreenshotAsBytes(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    public static String getAttributes(WebElement element, String attribute) {
        return element.getDomAttribute(attribute);
    }
}
	


