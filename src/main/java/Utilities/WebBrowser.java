package Utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebBrowser {
    public static WebDriver driver = null;
    public static String  browser = readProp.readValuesFromConfigFile("BROWSER");
    public static String  baseURL = readProp.readValuesFromConfigFile("BASE_URL");


    public static WebDriver getDriver() {

        if (driver == null) {

            if (browser.equals("Chrome")) {
                driver = new ChromeDriver();

            } else if (browser.equals("Firefox")) {
                driver = new FirefoxDriver();
            }


        }

        driver.manage().window().maximize();
        driver.navigate().to(baseURL);
        return driver;

    }
}
	

