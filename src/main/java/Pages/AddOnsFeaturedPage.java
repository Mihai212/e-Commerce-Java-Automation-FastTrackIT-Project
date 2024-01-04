package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddOnsFeaturedPage extends BasePage {
    public AddOnsFeaturedPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#widget-navbar-217834 > ul > li:nth-child(5) > a")
    private WebElement addOnsFeaturedDropDownList;

    public void moveCursorArrowToAddOnsFeaturedDropDownList() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.cssSelector("#widget-navbar-217834 > ul > li:nth-child(5) > a"));
        actions1.moveToElement(targetElement1).perform();
    }

    @FindBy(css = "[href=\"https://ecommerce-playground.lambdatest.io/index.php?route=extension/maza/page&page_id=9\"]")
    private WebElement widgetsOptionFromAddOnsFeaturedDropDownList;

    public void clickOnWidgetsOptionFromAddOnsFeaturedDropDownList() {
        widgetsOptionFromAddOnsFeaturedDropDownList.click();
    }

    public void moveCursorArrowToEffectNumberOne() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.cssSelector("[class=\"hover-effect hover-effect-10\"]"));
        actions1.moveToElement(targetElement1).perform();
    }

    public void moveCursorArrowToEffectNumberTwo() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.cssSelector("[class=\"hover-effect hover-effect-2\"]"));
        actions1.moveToElement(targetElement1).perform();
    }

    public void moveCursorArrowToEffectNumberThree() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.cssSelector("[class=\"hover-effect hover-effect-4\"]"));
        actions1.moveToElement(targetElement1).perform();
    }

    public void moveCursorArrowToEffectNumberFour() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.cssSelector("[class=\"hover-effect hover-effect-5\"]"));
        actions1.moveToElement(targetElement1).perform();
    }

    public void moveCursorArrowToEffectNumberFive() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.cssSelector("[class=\"hover-effect hover-effect-6\"]"));
        actions1.moveToElement(targetElement1).perform();
    }

    public void moveCursorArrowToEffectNumberSix() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.cssSelector("[class=\"hover-effect hover-effect-7\"]"));
        actions1.moveToElement(targetElement1).perform();
    }

    public void moveCursorArrowToEffectNumberSeven() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.cssSelector("[class=\"hover-effect hover-effect-8\"]"));
        actions1.moveToElement(targetElement1).perform();
    }

    public void moveCursorArrowToUpToTwelveEffect() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.cssSelector("[class=\"hover-effect hover-effect-11\"]"));
        actions1.moveToElement(targetElement1).perform();
    }

    //===============================================================================================================
    @FindBy(css = "[id=\"mz-faq-label-214664-0\"]")
    private WebElement firstQuestionFromFaqCategory;

    public void clickOnFirstQuestionFromFaqCategory() {
        firstQuestionFromFaqCategory.click();
    }

    @FindBy(css = "[id=\"mz-faq-label-214664-1\"]")
    private WebElement secondQuestionFromFaqCategory;

    public void clickOnSecondQuestionFromFaqCategory() {
        secondQuestionFromFaqCategory.click();
    }

    @FindBy(css = "[id=\"mz-faq-label-214664-2\"]")
    private WebElement thirdQuestionFromFaqCategory;

    public void clickOnThirdQuestionFromFaqCategory() {
        thirdQuestionFromFaqCategory.click();
    }

    //=================================================================================================================
    @FindBy(css = "#entry_214689 > div > form > div > div > input[type=email]")
    private WebElement emailFirstFieldFromNewsletter;

    public void typeInEmailFirstFieldFromNewsletter(String firstFieldEmail) {
        emailFirstFieldFromNewsletter.sendKeys(firstFieldEmail);
    }

    @FindBy(css = "#entry_214689 > div > form > div > button")
    private WebElement emailFirstFieldButtonFromNewsletter;

    public void clickOnEmailFirstFieldButtonFromNewsletter() {
        emailFirstFieldFromNewsletter.click();
    }

    @FindBy(css = "#entry_214689 > div > form > div > div > input[type=email]")
    private WebElement emailSecondFieldFromNewsletter;

    public void typeInEmailSecondFieldFromNewsletter(String firstFieldEmail) {
        emailSecondFieldFromNewsletter.sendKeys(firstFieldEmail);
    }

    @FindBy(css = "#entry_214690 > div > form > div > button")
    private WebElement emailSecondFieldButtonFromNewsletter;

    public void clickOnEmailSecondFieldButtonFromNewsletter() {
        emailSecondFieldFromNewsletter.click();
    }

    @FindBy(css = "[id=\"entry_214739\"]")
    private WebElement currencyOfTheSiteDropDownList;

    public void clickOnCurrencyOfTheSiteDropDownList() {
        currencyOfTheSiteDropDownList.click();
    }

    @FindBy(css = "[data-code=\"EUR\"]")
    private WebElement euroCurrencyOfTheSiteFromDropDownList;

    public void clickOnEuroCurrencyOfTheSiteFromDropDownList() {
        euroCurrencyOfTheSiteFromDropDownList.click();
    }

    @FindBy(css = "[data-code=\"GBP\"]")
    private WebElement gbpCurrencyOfTheSiteFromDropDownList;

    public void clickOnGBPCurrencyOfTheSiteFromDropDownList() {
        gbpCurrencyOfTheSiteFromDropDownList.click();
    }

    @FindBy(css = "[data-code=\"USD\"]")
    private WebElement usdCurrencyOfTheSiteFromDropDownList;

    public void clickOnUSDCurrencyOfTheSiteFromDropDownList() {
        usdCurrencyOfTheSiteFromDropDownList.click();
    }

    @FindBy(css = "[alt=\"Poco Electro\"]")
    private WebElement lambdaTestPlayGroundSymbol;

    public void clickOnLambdaTestPlayGroundSymbol() {
        lambdaTestPlayGroundSymbol.click();
    }

    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[2]/div[1]/div[2]/div/form/div/div[1]/div[1]/div[2]/input")
    private WebElement searchForProductsFieldFromHomePage;

    public void typeInSearchForProductsFieldFromHomePage(String product) {
        searchForProductsFieldFromHomePage.sendKeys(product);
    }
}