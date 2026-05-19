package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class AdminPage {
    WebDriver driver;

    @FindBy(xpath = "//*[@id='app-root']/nav/div[1]/div[3]/div/button")
    WebElement userMenuButton_xpath;

    @FindBy(xpath = "//*[@id='app-root']/nav/div[1]/div[3]/div/div/button[4]/span[2]")
    WebElement adminPanelOption_xpath;

    @FindBy(xpath = "//*[@id='app-root']/div/div[2]/nav/button[4]")
    WebElement groupsNavButton_xpath;

    @FindBy(xpath = "//*[@id='app-root']/div/div[3]/div/div[2]/button")
    WebElement createGroupButton_xpath;

    @FindBy(xpath = "//*[@id='app-root']/div/div[3]/div/div[4]/div/form/div[1]/input")
    WebElement groupName_xpath;

    @FindBy(xpath = "//textarea[@name='description' and @placeholder='Group description...']")
    WebElement groupDescription_xpath;

    @FindBy(xpath = "//input[@type='number' and @name='year']")
    WebElement groupYear_xpath;

    @FindBy(xpath = "//form/div[3]/div[2]//input")
    WebElement groupMaxCapacity_xpath;

    @FindBy(xpath = "//input[@name='startDate']")
    WebElement groupStartDate_xpath;

    @FindBy(xpath = "//input[@name='endDate']")
    WebElement groupEndDate_xpath;

    @FindBy(xpath = "//button[@type='submit' and text()='Create Group']")
    WebElement submitCreateGroup_xpath;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriverWait getWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    private void pause() {
        try { Thread.sleep(2000); } catch (InterruptedException ignored) {}
    }

    public void clickUserMenu() {
        getWait().until(elementToBeClickable(userMenuButton_xpath));
        userMenuButton_xpath.click();
        pause();
    }

    public void clickAdminPanel() {
        getWait().until(elementToBeClickable(adminPanelOption_xpath));
        adminPanelOption_xpath.click();
        pause();
    }

    public void clickGroups() {
        getWait().until(elementToBeClickable(groupsNavButton_xpath));
        groupsNavButton_xpath.click();
        pause();
    }

    public void clickCreateGroup() {
        getWait().until(elementToBeClickable(createGroupButton_xpath));
        createGroupButton_xpath.click();
        pause();
    }

    public void enterGroupName(String name) {
        getWait().until(visibilityOf(groupName_xpath));
        groupName_xpath.sendKeys(name);
        pause();
    }

    public void enterGroupDescription(String description) {
        getWait().until(visibilityOf(groupDescription_xpath));
        groupDescription_xpath.sendKeys(description);
        pause();
    }

    public void selectGroupYear(String year) {
        getWait().until(visibilityOf(groupYear_xpath));
        groupYear_xpath.clear();
        groupYear_xpath.sendKeys(year);
        pause();
    }

    public void enterMaxCapacity(String capacity) {
        getWait().until(visibilityOf(groupMaxCapacity_xpath));
        groupMaxCapacity_xpath.sendKeys(capacity);
        pause();
    }

    public void enterStartDate(String startDate) {
        getWait().until(visibilityOf(groupStartDate_xpath));
        ((JavascriptExecutor) driver).executeScript(
            "var nativeInputValueSetter = Object.getOwnPropertyDescriptor(window.HTMLInputElement.prototype, 'value').set;" +
            "nativeInputValueSetter.call(arguments[0], arguments[1]);" +
            "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));",
            groupStartDate_xpath, startDate);
        pause();
    }

    public void enterEndDate(String endDate) {
        getWait().until(visibilityOf(groupEndDate_xpath));
        ((JavascriptExecutor) driver).executeScript(
            "var nativeInputValueSetter = Object.getOwnPropertyDescriptor(window.HTMLInputElement.prototype, 'value').set;" +
            "nativeInputValueSetter.call(arguments[0], arguments[1]);" +
            "arguments[0].dispatchEvent(new Event('input', { bubbles: true }));",
            groupEndDate_xpath, endDate);
        pause();
    }

    public void clickSubmitCreateGroup() {
        getWait().until(elementToBeClickable(submitCreateGroup_xpath));
        submitCreateGroup_xpath.click();
        pause();
    }
}
