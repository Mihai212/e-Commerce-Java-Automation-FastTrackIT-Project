package Pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterAccountPage extends BasePage {
    public RegisterAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void moveCursorArrowToMyAccountButton() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.xpath("//*[@id='widget-navbar-217834']/ul/li[6]/a/div/span"));
        actions1.moveToElement(targetElement1).perform();
    }

    @FindBy(css = "[href=\"https://ecommerce-playground.lambdatest.io/index.php?route=account/login\"]")
    private WebElement myAccountLoginButton;

    public void clickOnMyAccountLoginButton() {
        myAccountLoginButton.click();
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/div/a")
    private WebElement newCustomerButton;

    public void clickOnNewCustomerButton() {
        newCustomerButton.click();
    }

    @FindBy(css = "[placeholder=\"First Name\"]")
    private WebElement firstNameTextField;

    public void enterInTheFirstNameTextField(String text) {
        firstNameTextField.sendKeys(text);
    }

    @FindBy(css = "[placeholder=\"Last Name\"]")
    private WebElement lastNameTextField;

    public void enterInTheLastNameTextField(String text) {
        lastNameTextField.sendKeys(text);
    }

    @FindBy(css = "[placeholder=\"E-Mail\"]")
    private WebElement emailTextField;

    private final Faker faker = new Faker();
    public void enterInEmailTextField() {
        String randomEmail = faker.internet().emailAddress();
        emailTextField.sendKeys(randomEmail);}

    @FindBy(css = "[placeholder=\"Telephone\"]")
    private WebElement telephoneTextField;

    public void enterInTelephoneTextField(String text) {
        telephoneTextField.sendKeys(text);
    }

    @FindBy(css = "[placeholder=\"Password\"]")
    private WebElement passwordTextField;

    public void enterInPasswordTextField(String text) {
        passwordTextField.sendKeys(text);
    }

    @FindBy(css = "[placeholder=\"Password Confirm\"]")
    private WebElement passwordConfirmTextField;

    public void enterInPasswordConfirmTextField(String text) {
        passwordConfirmTextField.sendKeys(text);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/div[1]/label")
    private WebElement yesRadioButton;

    public void clickOnYesRadioButton() {
        yesRadioButton.click();
    }

    @FindBy(css = "[href=\"https://ecommerce-playground.lambdatest.io/index.php?route=information/information/agree&information_id=3\"]")
    private WebElement privacyPolicyBootStrapModal;

    public void clickOnPrivacyPolicyBootStrapModal() {
        privacyPolicyBootStrapModal.click();
    }

    public void exitThePrivacyPolicyBootstrap() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.modal-header>button.close")));
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(closeButton).click().perform();
    }

    @FindBy(css = "[for=\"input-agree\"]")
    private WebElement agreeCheckBox;

    public void clickOnAgreeCheckBox() {
        agreeCheckBox.click();
    }

    @FindBy(css = "[value=\"Continue\"]")
    private WebElement continueRegistrationButton;

    public void clickOnContinueRegistrationButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[value=\"Continue\"]")));
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(closeButton).click().perform();
    }

    @FindBy(css = "#content > div > a")
    private WebElement continueConfirmedRegistrationButtonTwo;

    public void clickOnContinueConfirmedRegistrationButtonTwo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement clickOnContinueConfirmedRegistrationButtonTwo = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#content > div > a")));
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(clickOnContinueConfirmedRegistrationButtonTwo).click().perform();
    }
}

