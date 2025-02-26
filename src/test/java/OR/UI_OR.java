package OR;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.*;
import Utilities.WebBrowser;
import org.openqa.selenium.support.PageFactory;

public class UI_OR extends WebBrowser {
    public UI_OR() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "my-text-id")
    public WebElement input_text_field;

    @FindBy(css = "[type=submit]")
    public WebElement button_submit;

    @FindBy(xpath = "//h1[text()='Form submitted']")
    public WebElement header_form_submitted;

    @FindBy(css = "[name='my-select']")
    public WebElement input_dropdown;

    @FindBy(css = "[name='my-disabled']")
    public WebElement input_disabled_field;

    @FindBy(css = "[name='my-readonly']")
    public WebElement input_readOnly_field;


}


