package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditYourAccountPage extends BasePage {
    public EditYourAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void moveCursorArrowToMyAccountButton() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.xpath("//*[@id='widget-navbar-217834']/ul/li[6]/a/div/span"));
        actions1.moveToElement(targetElement1).perform();
    }

    //Edit Your Account Information With Another Valid Information=======================================================
    @FindBy(css = "[href=\"https://ecommerce-playground.lambdatest.io/index.php?route=account/login\"]")
    private WebElement myAccountLoginButton;

    public void clickOnMyAccountLoginButton() {
        myAccountLoginButton.click();
    }

    @FindBy(css = "[name=\"email\"]")
    private WebElement emailAddressRegisterCustomerField;

    public void typeInEmailAddressRegisterCustomerField(String email) {
        emailAddressRegisterCustomerField.sendKeys(email);
    }

    @FindBy(css = "[name=\"password\"]")
    private WebElement passwordRegisterCustomerField;

    public void typeInPasswordRegisterCustomerField(String password) {
        passwordRegisterCustomerField.sendKeys(password);
    }

    @FindBy(css = "[value=\"Login\"]")
    private WebElement loginReturningCustomerButton;

    public void clickOnLoginReturningCustomerButton() {
        loginReturningCustomerButton.click();
    }

    @FindBy(css = "#content > div:nth-child(1) > div > div > div:nth-child(1) > a")
    private WebElement editYourAccountInfoButton;

    public void clickOnEditYourAccountInfo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement clickOnEditYourAccountInfo = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#content > div:nth-child(1) > div > div > div:nth-child(1) > a")));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(clickOnEditYourAccountInfo).click().perform();
    }

    @FindBy(css = "[name=\"firstname\"]")
    private WebElement firstNameFieldFromMyAccountInfo;

    public void enterInFirstNameFieldFromMyAccountInfo(String firstName) {
        firstNameFieldFromMyAccountInfo.sendKeys(firstName);
    }

    public void deleteAllCharactersFromTheFirstNameFieldFromMyAccountInfo() {
        firstNameFieldFromMyAccountInfo.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        actions.sendKeys(Keys.DELETE);
        actions.perform();
    }

    @FindBy(css = "[name=\"lastname\"]")
    private WebElement lastNameFieldLastNameFieldFromMyAccountInfo;

    public void enterInTheLastNameFieldFromMyAccountInfo(String lastName) {
        lastNameFieldLastNameFieldFromMyAccountInfo.sendKeys(lastName);
    }

    public void deleteAllCharactersFromTheLastNameFieldFromMyAccountInfo() {
        lastNameFieldLastNameFieldFromMyAccountInfo.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        actions.sendKeys(Keys.DELETE);
        actions.perform();
    }

    @FindBy(css = "[name=\"email\"]")
    private WebElement emailFieldFromTheEmailFieldFromMyAccountInfo;

    public void enterInEmailFieldFromTheEmailFieldFromMyAccountInfo(String email) {
        emailFieldFromTheEmailFieldFromMyAccountInfo.sendKeys(email);
    }

    public void deleteAllCharactersFromTheEmailFieldFromMyAccountInfo() {
        emailFieldFromTheEmailFieldFromMyAccountInfo.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        actions.sendKeys(Keys.DELETE);
        actions.perform();
    }

    @FindBy(css = "[name=\"telephone\"]")
    private WebElement telephoneFieldFromTheEmailFieldFromMyAccountInfo;

    public void enterInTelephoneFieldFromTheEmailFieldFromMyAccountInfo(String telephone) {
        telephoneFieldFromTheEmailFieldFromMyAccountInfo.sendKeys(telephone);
    }

    public void deleteAllCharactersFromTheTelephoneFieldFromMyAccountInfo() {
        telephoneFieldFromTheEmailFieldFromMyAccountInfo.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        actions.sendKeys(Keys.DELETE);
        actions.perform();
    }


    @FindBy(css = "[value=\"Continue\"]")
    private WebElement editContinueButtonFromMyAccountInfo;

    public void clickEditContinueButtonFromMyAccountInfo() {
        editContinueButtonFromMyAccountInfo.click();
    }
    //Edit Your Account Information With Another Valid Information=======================================

    //Edit Your Password With Another Valid Password=====================================================
    @FindBy(css = "#content > div:nth-child(1) > div > div > div:nth-child(2) > a")
    private WebElement changeYourPassword;

    public void clickChangeYourPassword() {
        changeYourPassword.click();
    }

    @FindBy(css = "[name=\"password\"]")
    private WebElement changePasswordField;

    public void typeInChangePasswordField(String password) {
        changePasswordField.sendKeys(password);
    }

    @FindBy(css = "[name=\"confirm\"]")
    private WebElement confirmPasswordField;

    public void typeInConfirmPasswordField(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }

    @FindBy(css = "[value=\"Continue\"]")
    private WebElement continueChangePasswordButton;

    public void clickContinueChangePasswordButton() {
        continueChangePasswordButton.click();
    }
    //Edit Your Password With Another Valid Password=====================================================

    //Forgotten Password========================================================================================
    @FindBy(css = "#content > div > div:nth-child(2) > div > div > form > div:nth-child(2) > a")
    private WebElement forgottenPasswordButtonFromReturningCustomer;

    public void clickOnForgottenPasswordButtonFromReturningCustomer() {
        forgottenPasswordButtonFromReturningCustomer.click();
    }

    @FindBy(css = "[id=\"input-email\"]")
    private WebElement yourEmailAddressFieldFromForgottenPassword;

    public void typeInYourEmailAddressFieldFromForgottenPassword(String yourEmailAddress) {
        yourEmailAddressFieldFromForgottenPassword.sendKeys(yourEmailAddress);
    }

    @FindBy(css = "[class=\"btn btn-primary\"]")
    private WebElement continueButtonFromForgottenPassword;

    public void clickOnContinueButtonFromForgottenPassword() {
        continueButtonFromForgottenPassword.click();
    }
}