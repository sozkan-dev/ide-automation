package stepDefinitions;

import factory.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageObjects.BasePage;
import pageObjects.LoginPage;

public class LoginStepDefinitions {
    private PageManager pageManager;
    private LoginPage loginPage;

    public LoginStepDefinitions() {
        this.pageManager = new PageManager(Base.getDriver());
        this.loginPage = pageManager.getLoginPage();
    }

    @Given("I am on the login page")
    public void ı_am_on_the_login_page() {
        loginPage.clickToLoginButton();

    }

    @When("I enter valid username and password")
    public void ı_enter_valid_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I click the login button")
    public void ı_click_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should be redirected to the homepage")
    public void ı_should_be_redirected_to_the_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see a welcome message")
    public void ı_should_see_a_welcome_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
