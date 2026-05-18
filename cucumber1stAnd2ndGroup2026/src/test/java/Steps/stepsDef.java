package Steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class stepsDef extends Base{


    @Given("i am on the login page")
    public void i_am_on_the_login_page() {
        homePage.clickLoginButton();
        loginPage.verifyLoginPageIsDisplayed();
    }

    @And("I enter email (.*)$")
    public void i_enter_email(String email) {
        loginPage.enterEmail(email);
    }

    @And("I enter password (.*)$")
    public void i_enter_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click login button")
    public void i_click_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("i should be logged in successfully")
    public void i_should_be_logged_in_successfully() {

    }

    @And("I click mobile automation")
    public void iClickMobileAutomation() {

    }

    @And("I click on user menu")
    public void i_click_on_user_menu() {
        adminPage.clickUserMenu();
    }

    @And("I click on admin panel")
    public void i_click_on_admin_panel() {
        adminPage.clickAdminPanel();
    }

    @And("I click on groups")
    public void i_click_on_groups() {
        adminPage.clickGroups();
    }

    @And("I click on create group button")
    public void i_click_on_create_group_button() {
        adminPage.clickCreateGroup();
    }

    @After
    public void closeBrowser() {
    }
}
