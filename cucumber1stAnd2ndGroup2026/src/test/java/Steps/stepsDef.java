package Steps;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.testng.Assert;

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

    @And("I enter group name (.*)$")
    public void i_enter_group_name(String name) {
        adminPage.enterGroupName(name);
    }

    @And("I enter group description (.*)$")
    public void i_enter_group_description(String description) {
        adminPage.enterGroupDescription(description);
    }

    @And("I select group year (.*)$")
    public void i_select_group_year(String year) {
        adminPage.selectGroupYear(year);
    }

    @And("I enter max capacity (.*)$")
    public void i_enter_max_capacity(String capacity) {
        adminPage.enterMaxCapacity(capacity);
    }

    @And("I enter start date (.*)$")
    public void i_enter_start_date(String startDate) {
        adminPage.enterStartDate(startDate);
    }

    @And("I enter end date (.*)$")
    public void i_enter_end_date(String endDate) {
        adminPage.enterEndDate(endDate);
    }

    @And("I click submit create group")
    public void i_click_submit_create_group() {
        adminPage.clickSubmitCreateGroup();
    }

    @And("I click back to website")
    public void i_click_back_to_website() {
        adminPage.clickBackToWebsite();
    }

    @And("I logout")
    public void i_logout() {
        adminPage.clickLogout();
    }

    @And("I navigate to sign up page")
    public void i_navigate_to_sign_up_page() {
        signUpPage.clickLoginNav();
        signUpPage.clickSignUpHere();
    }

    @And("I enter first name (.*)$")
    public void i_enter_first_name(String firstName) {
        signUpPage.enterFirstName(firstName);
    }

    @And("I enter last name (.*)$")
    public void i_enter_last_name(String lastName) {
        signUpPage.enterLastName(lastName);
    }

    @And("I enter registration email (.*)$")
    public void i_enter_registration_email(String email) {
        signUpPage.enterEmail(email);
    }

    @And("I enter registration password (.*)$")
    public void i_enter_registration_password(String password) {
        signUpPage.enterPassword(password);
    }

    @And("I enter confirm password (.*)$")
    public void i_enter_confirm_password(String confirmPassword) {
        signUpPage.enterConfirmPassword(confirmPassword);
    }

    @Then("the created group should exist in the group dropdown")
    public void the_created_group_should_exist_in_the_group_dropdown() {
        Assert.assertTrue(signUpPage.isGroupPresentInDropdown(adminPage.getCreatedGroupName()),
                "Group '" + adminPage.getCreatedGroupName() + "' was not found in the sign-up dropdown");
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
