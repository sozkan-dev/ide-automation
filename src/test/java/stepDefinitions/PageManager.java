package stepDefinitions;

import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;

public class PageManager {
    private WebDriver driver;

    public PageManager(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        return new LoginPage(driver);
    }
}
