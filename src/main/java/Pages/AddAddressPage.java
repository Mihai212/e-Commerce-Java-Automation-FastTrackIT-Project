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

public class AddAddressPage extends BasePage {
    public AddAddressPage(WebDriver driver) {
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
    private WebElement loginRegisterCustomerButton;

    public void clickOnLoginRegisterCustomerButton() {
        loginRegisterCustomerButton.click();
    }

    @FindBy(css = "#content > div:nth-child(1) > div > div > div:nth-child(1) > a")
    private WebElement editYourAccountInfoButton;

    public void clickOnEditYourAccountInfo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement clickOnEditYourAccountInfo = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#content > div:nth-child(1) > div > div > div:nth-child(1) > a")));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(clickOnEditYourAccountInfo).click().perform();
    }
    //Edit Your Address Book Entries ====================================================================

    @FindBy(css = "#content > div:nth-child(1) > div > div > div:nth-child(3) > a")
    private WebElement modifyYourAddressBookEntries;

    public void clickOnModifyYourAddressBookEntries() {
        modifyYourAddressBookEntries.click();
    }

    @FindBy(css = "[class=\"btn btn-primary\"]")
    private WebElement newAddressBookEntriesButton;

    public void clickOnNewAddressBookEntriesButton() {
        newAddressBookEntriesButton.click();
    }

    //Fields==========================================================================================================
    @FindBy(css = "[name=\"firstname\"]")
    private WebElement firstNameFromAddAddressBookEntriesField;

    public void typeInFirstNameFromAddAddressBookEntriesField(String firstName) {
        firstNameFromAddAddressBookEntriesField.sendKeys(firstName);
    }

    @FindBy(css = "[name=\"lastname\"]")
    private WebElement lastNameFromAddAddressBookEntriesField;

    public void typeInLastNameFromAddAddressBookEntriesField(String lastName) {
        lastNameFromAddAddressBookEntriesField.sendKeys(lastName);
    }

    @FindBy(css = "[name=\"company\"]")
    private WebElement companyFromAddAddressBookEntriesField;

    public void typeInCompanyFromAddAddressBookEntriesField(String company) {
        companyFromAddAddressBookEntriesField.sendKeys(company);
    }

    @FindBy(css = "[name=\"address_1\"]")
    private WebElement firstAddressFromAddAddressBookEntriesField;

    public void typeInFirstAddressFromAddAddressBookEntriesField(String firstAddress) {
        firstAddressFromAddAddressBookEntriesField.sendKeys(firstAddress);
    }

    @FindBy(css = "[name=\"address_2\"]")
    private WebElement secondAddressFromAddAddressBookEntriesField;

    public void typeInSecondAddressFromAddAddressBookEntriesField(String secondAddress) {
        secondAddressFromAddAddressBookEntriesField.sendKeys(secondAddress);
    }

    @FindBy(css = "[name=\"city\"]")
    private WebElement cityFromAddAddressBookEntriesField;

    public void typeInCityFromAddAddressBookEntriesField(String city) {
        cityFromAddAddressBookEntriesField.sendKeys(city);
    }

    @FindBy(css = "[name=\"postcode\"]")
    private WebElement postCodeFromAddAddressBookEntriesField;

    public void typeInPostCodeFromAddAddressBookEntriesField(String postcode) {
        postCodeFromAddAddressBookEntriesField.sendKeys(postcode);
    }

    //Country Options===============================================================================================
    @FindBy(css = "[name=\"country_id\"]")
    private WebElement countryFromAddAddressBookEntriesField;

    public void selectCountryFromAddAddressBookEntriesField() {
        countryFromAddAddressBookEntriesField.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4)); // 10 seconds wait time
        wait.until(ExpectedConditions.elementToBeClickable(countryFromAddAddressBookEntriesField)).click();
    }

    @FindBy(css = "[value=\"210\"]")
    private WebElement selectTogoOptionFromCountryDropDown;

    public void clickOnTogoOptionFromCountryDropDown() {
        selectTogoOptionFromCountryDropDown.click();
    }

    @FindBy(css = "[value=\"26\"]")
    private WebElement selectBoliviaOptionFromCountryDropDown;

    public void clickOnBoliviaOptionFromCountryDropDown() {
        selectBoliviaOptionFromCountryDropDown.click();
    }

    @FindBy(css = "[value=\"239\"]")
    private WebElement selectZimbabweOptionFromCountryDropDown;

    public void clickOnZimbabweOptionFromCountryDropDown() {
        selectZimbabweOptionFromCountryDropDown.click();
    }

    @FindBy(css = "[value=\"98\"]")
    private WebElement selectIcelandOptionFromCountryDropDown;

    public void clickOnIcelandOptionFromCountryDropDown() {
        selectIcelandOptionFromCountryDropDown.click();
    }

    //Region Options================================================================================================
    @FindBy(css = "[id=\"input-zone\"]")
    private WebElement regionAddAddressBookEntriesField;

    public void selectRegionFromAddAddressBookEntriesField() {
        regionAddAddressBookEntriesField.click();
    }

    @FindBy(css = "[value=\"3265\"]")
    private WebElement selectKaraOptionFromRegionDropDown;

    public void clickOnKaraOptionFromRegionDropDown() {
        selectKaraOptionFromRegionDropDown.click();
    }

    @FindBy(css = "[value=\"408\"]")
    private WebElement selectPotosiOptionFromRegionDropDown;

    public void clickOnPotosiOptionFromRegionDropDown() {
        selectPotosiOptionFromRegionDropDown.click();
    }

    @FindBy(css = "[value=\"3833\"]")
    private WebElement selectHarareOptionFromRegionDropDown;

    public void clickOnHarareOptionFromRegionDropDown() {
        selectHarareOptionFromRegionDropDown.click();
    }

    @FindBy(css = "[value=\"1467\"]")
    private WebElement selectAusturlandOptionFromRegionDropDown;

    public void clickOnAusturlandOptionFromRegionDropDown() {
        selectAusturlandOptionFromRegionDropDown.click();
    }

    //Radio Buttons=================================================================================================
    @FindBy(css = "div:nth-child(1) >label > input")
    private WebElement selectYesDefaultAddressRadioButton;

    public void clickOnYesDefaultAddressRadioButton() {
        selectYesDefaultAddressRadioButton.click();
    }

    @FindBy(css = "div:nth-child(2) > label > input")
    private WebElement selectNoDefaultAddressRadioButton;

    public void clickOnNoDefaultAddressRadioButton() {
        selectNoDefaultAddressRadioButton.click();
    }

    @FindBy(css = "[value=\"Continue\"]")
    private WebElement continueButtonAddAddress;

    public void clickOnContinueButtonFromAddAddress() {
        continueButtonAddAddress.click();
        //===========================================================================================================
    }

    @FindBy(css = "tr:nth-child(1) > td.text-right.p-3 > a.btn.btn-danger")
    private WebElement deleteButtonIonutPopNonDefaulAddress;

    public void clickOnDeleteButtonIonutPopNonDefaultAddress() {
        deleteButtonIonutPopNonDefaulAddress.click();
    }

    @FindBy(css = "td.text-right.p-3 > a.btn.btn-danger")
    private WebElement deleteButtonPopescuIonelDefaultAddress;

    public void clickOnDeleteButtonPopescuIonelDefaultAddress() {
        deleteButtonPopescuIonelDefaultAddress.click();
    }

    @FindBy(css = "tr:nth-child(2) > td.text-right.p-3 > a.btn.btn-danger")
    private WebElement deleteButtonGracePopNonDefaultAddress;

    public void clickOnDeleteButtonGracePopNonDefaultAddress() {
        deleteButtonGracePopNonDefaultAddress.click();
    }

    @FindBy(css = "tr:nth-child(2) > td.text-right.p-3 > a.btn.btn-danger")
    private WebElement deleteButtonAnastasiaPopNonDefaultAddress;

    public void clickOnDeleteButtonAnastasiaPopNonDefaultAddress() {
        deleteButtonAnastasiaPopNonDefaultAddress.click();
    }

    @FindBy(css = "tr:nth-child(2) > td.text-right.p-3 > a.btn.btn-danger")
    private WebElement deleteButtonDragosPopNonDefaultAddress;

    public void clickOnDeleteButtonDragosPopNonDefaultAddress() {
        deleteButtonDragosPopNonDefaultAddress.click();
    }

    @FindBy(css = "tr:nth-child(2) > td.text-right.p-3 > a.btn.btn-danger")
    private WebElement deleteButtonIonutPopNonDefaulAddress2;

    public void clickOnDeleteButtonIonutPopNonDefaultAddress2() {
        deleteButtonIonutPopNonDefaulAddress2.click();
    }

    @FindBy(css = "tr:nth-child(2) > td.text-right.p-3 > a.btn.btn-info")
    private WebElement editDragosPopAddressButton;

    public void ClickOnEditDragosPopAddressButton() {
        editDragosPopAddressButton.click();
    }

    @FindBy(css = "[value=\"Continue\"]")
    private WebElement continueEditIonutPopAddressButton;

    public void ClickOnContinueEditIonutPopAddressButton() {
        continueEditIonutPopAddressButton.click();
    }

    public void deleteAllCharactersFromTheCompanyField() {
        companyFromAddAddressBookEntriesField.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        actions.sendKeys(Keys.DELETE);
        actions.perform();
    }

    public void deleteAllCharactersFromTheFirstAddressField() {
        firstAddressFromAddAddressBookEntriesField.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        actions.sendKeys(Keys.DELETE);
        actions.perform();
    }

    public void deleteAllCharactersFromTheSecondAddressField() {
        secondAddressFromAddAddressBookEntriesField.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        actions.sendKeys(Keys.DELETE);
        actions.perform();
    }

    public void deleteAllCharactersFromTheCityField() {
        cityFromAddAddressBookEntriesField.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        actions.sendKeys(Keys.DELETE);
        actions.perform();
    }

    public void deleteAllCharactersFromThePostCodeField() {
        postCodeFromAddAddressBookEntriesField.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        actions.sendKeys(Keys.DELETE);
        actions.perform();
    }
}

