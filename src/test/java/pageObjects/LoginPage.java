package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ActionHelper;

import javax.swing.*;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='login-text']")
    private WebElement loginBtn;

    public void clickToLoginButton(){
        ActionHelper.Click(loginBtn);
    }
}
