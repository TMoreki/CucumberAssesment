package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

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

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUserMenu() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(userMenuButton_xpath));
        userMenuButton_xpath.click();
    }

    public void clickAdminPanel() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(adminPanelOption_xpath));
        adminPanelOption_xpath.click();
    }

    public void clickGroups() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(groupsNavButton_xpath));
        groupsNavButton_xpath.click();
    }

    public void clickCreateGroup() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(createGroupButton_xpath));
        createGroupButton_xpath.click();
    }
}
