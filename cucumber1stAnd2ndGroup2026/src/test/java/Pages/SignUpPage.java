package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class SignUpPage {
    WebDriver driver;

    @FindBy(xpath = "//button[.//span[text()='Login']]")
    WebElement loginNavButton_xpath;

    @FindBy(xpath = "//button[text()='Sign Up Here']")
    WebElement signUpHereButton_xpath;

    @FindBy(id = "register-firstName")
    WebElement firstName_id;

    @FindBy(id = "register-lastName")
    WebElement lastName_id;

    @FindBy(id = "register-email")
    WebElement email_id;

    @FindBy(id = "register-password")
    WebElement password_id;

    @FindBy(id = "register-confirmPassword")
    WebElement confirmPassword_id;

    @FindBy(id = "register-group")
    WebElement groupDropdown_id;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriverWait getWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    private void pause() {
        try { Thread.sleep(2000); } catch (InterruptedException ignored) {}
    }

    public void clickLoginNav() {
        getWait().until(elementToBeClickable(loginNavButton_xpath));
        loginNavButton_xpath.click();
        pause();
    }

    public void clickSignUpHere() {
        getWait().until(elementToBeClickable(signUpHereButton_xpath));
        signUpHereButton_xpath.click();
        pause();
    }

    public void enterFirstName(String firstName) {
        getWait().until(visibilityOf(firstName_id));
        firstName_id.sendKeys(firstName);
        pause();
    }

    public void enterLastName(String lastName) {
        lastName_id.sendKeys(lastName);
        pause();
    }

    public void enterEmail(String email) {
        email_id.sendKeys(email);
        pause();
    }

    public void enterPassword(String password) {
        password_id.sendKeys(password);
        pause();
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPassword_id.sendKeys(confirmPassword);
        pause();
    }

    public boolean isGroupPresentInDropdown(String groupName) {
        getWait().until(visibilityOf(groupDropdown_id));
        Select select = new Select(groupDropdown_id);
        boolean found = select.getOptions().stream()
                .anyMatch(option -> option.getText().contains(groupName));
        if (found) {
            select.selectByVisibleText(
                select.getOptions().stream()
                    .filter(option -> option.getText().contains(groupName))
                    .findFirst().get().getText()
            );
            pause();
        }
        return found;
    }
}
