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

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    //==============================================================================================================

    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[2]/div[1]/div[2]/div/form/div/div[1]/div[1]/div[1]/button")
    private WebElement allCategoriesDropDownList;

    public void clickOnAllCategoriesDropDownList() {
        allCategoriesDropDownList.click();
    }

    //==============================================================================================================
    @FindBy(css = "div.dropdown.search-category.show > div > a:nth-child(6)")
    private WebElement softwareCategory;

    public void clickOnSoftwareCategory() {
        softwareCategory.click();
    }

    //==============================================================================================================
    @FindBy(xpath = "/html/body/div[1]/div[5]/header/div[2]/div[1]/div[2]/div/form/div/div[1]/div[1]/div[2]/input")
    private WebElement searchForProducts;

    public void typeInSearchForProducts(String product) {
        searchForProducts.sendKeys(product);
    }

    //==============================================================================================================
    @FindBy(css = "[class=\"type-text\"]")
    private WebElement searchButtonFromSearchForProducts;

    public void clickOnSearchButtonFromSearchForProducts() {
        searchButtonFromSearchForProducts.click();

    }

    @FindBy(css = "[class=\"btn btn-compare compare-29 \"]")
    private WebElement compareButtonForPalmTreoPro;

    public void moveCursorArrowToPalmTreoPro() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.cssSelector("#mz-product-grid-image-29-212469 > div > div.carousel-item.active > img"));
        actions1.moveToElement(targetElement1).perform();
    }

    public void clickOnCompareButtonForPalmTreoPro() {
        compareButtonForPalmTreoPro.click();
    }

    @FindBy(css = "[class=\"btn btn-compare compare-30 \"]")
    private WebElement compareButtonForCanonEOS5D;

    public void moveCursorArrowToCanonEOS5D() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.cssSelector("#mz-product-grid-image-30-212469 > div > div.carousel-item.active > img"));
        actions1.moveToElement(targetElement1).perform();
    }

    public void clickOnCompareButtonForCanonEOS5D() {
        compareButtonForCanonEOS5D.click();
    }

    @FindBy(css = "[class=\"btn btn-compare compare-33 \"]")
    private WebElement compareButtonForSamsungSyncMaster941BW;

    public void moveCursorArrowToSamsungSyncMaster941BW() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.cssSelector("#mz-product-grid-image-33-212469 > div > div.carousel-item.active > img"));
        actions1.moveToElement(targetElement1).perform();
    }

    public void clickOnCompareButtonForSamsungSyncMaster941BW() {
        compareButtonForSamsungSyncMaster941BW.click();
    }

    @FindBy(css = "#notification-box-top > div > div.toast-body > a")
    private WebElement productComparePageButton;

    public void clickOnProductComparePageButton() {
        productComparePageButton.click();
    }

    @FindBy(css = "tbody:nth-child(3) > tr > td:nth-child(4) > a")
    private WebElement removeSamsungSyncMaster941BWButton;

    public void clickOnRemoveSamsungSyncMaster941BWButton() {
        removeSamsungSyncMaster941BWButton.click();
    }

    @FindBy(css = "tbody:nth-child(3) > tr > td:nth-child(3) > a")
    private WebElement removeCanonEOS5DButton;

    public void clickOnRemoveCanonEOS5DButton() {
        removeCanonEOS5DButton.click();
    }

    @FindBy(css = "tbody:nth-child(3) > tr > td:nth-child(2) > a")
    private WebElement removePalmTreoProButton;

    public void clickOnRemovePalmTreoProButton() {
        removePalmTreoProButton.click();
    }

    //===============================================================================================================
    @FindBy(css = "button.btn.btn-quick-view.quick-view-29")
    private WebElement quickViewPalmTreoProButton;

    public void clickOnQuickViewPalmTreoProButton() {
        quickViewPalmTreoProButton.click();
    }

    @FindBy(css = "[class=\"close btn btn-link fas mz-modal-close\"]")
    private WebElement quickViewPalmTreoProExitButton;

    public void exitQuickViewPalmTreoProExitButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4)); // 10 seconds wait time
        wait.until(ExpectedConditions.elementToBeClickable(quickViewPalmTreoProExitButton)).click();
    }

    //=========================================================================================================
    @FindBy(css = "[class=\"btn btn-wishlist wishlist-29 \"]")
    private WebElement addToWishListPalmTreoProButton;

    public void clickOnAddToWishListPalmTreoProButton() {
        addToWishListPalmTreoProButton.click();
    }

    @FindBy(css = "[class=\"btn btn-wishlist wishlist-30 \"]")
    private WebElement addToWishListCanonEOS5DButton;

    public void clickOnCanonEOS5DButton() {
        addToWishListCanonEOS5DButton.click();
    }

    @FindBy(css = "[class=\"btn btn-wishlist wishlist-33 \"]")
    private WebElement addWishListSamsungSyncMaster941BWButton;

    public void clickOnAddWishListSamsungSyncMaster941BWButton() {
        addWishListSamsungSyncMaster941BWButton.click();
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

    @FindBy(css = "#content > div:nth-child(1) > div > div > div:nth-child(4) > a")
    private WebElement modifyYouWishListButton;

    public void clickOnModifyYouWishListButton() {
        modifyYouWishListButton.click();
    }

    @FindBy(css = "[value=\"Login\"]")
    private WebElement loginRegisterCustomerButton;

    public void clickOnLoginRegisterCustomerButton() {
        loginRegisterCustomerButton.click();
    }


    @FindBy(css = "tr:nth-child(1) > td.text-right.text-nowrap > a")
    private WebElement removePalmTreoProButtonFromWishList;

    public void clickOnRemovePalmTreoProButtonFromWishList() {
        removePalmTreoProButtonFromWishList.click();
    }

    @FindBy(css = "tr:nth-child(1) > td.text-right.text-nowrap > a")
    private WebElement removeCanonEOS5DButtonFromWishList;

    public void clickOnRemoveCanonEOS5DButtonFromWishList() {
        removeCanonEOS5DButtonFromWishList.click();
    }

    @FindBy(css = "tr:nth-child(1) > td.text-right.text-nowrap > a")
    private WebElement removeSamsungSyncMaster941BWButtonFromWishList;

    public void clickOnRemoveSamsungSyncMaster941BWButtonFromWishList() {
        removeSamsungSyncMaster941BWButtonFromWishList.click();
    }

    @FindBy(css = "[class=\"btn btn-cart cart-29\"]")
    private WebElement addPalmTreoProButtonFromCart;

    public void clickOnAddPalmTreoProButtonFromCart() {
        addPalmTreoProButtonFromCart.click();

    }

    @FindBy(css = "[class=\"btn btn-cart cart-33\"]")
    private WebElement addSamsungSyncMaster941BWButtonFromCart;

    public void clickOnAddSamsungSyncMaster941BWButtonFromCart() {
        addSamsungSyncMaster941BWButtonFromCart.click();
    }

    @FindBy(css = "[id=\"entry_217825\"]")
    private WebElement cartIcon;

    public void clickOnCartIcon() {
        cartIcon.click();
    }

    @FindBy(css = "#entry_217850")
    private WebElement EditCartButton;

    public void clickOnEditCartButton() {
        EditCartButton.click();
    }

    public void moveCursorOnEditCartButton() {
        Actions actions1 = new Actions(driver);
        WebElement targetElement1 = driver.findElement(By.cssSelector("#entry_217850"));
        actions1.moveToElement(targetElement1).perform();
    }

    @FindBy(css = "tr:nth-child(1) > td:nth-child(4) > div > input")
    private WebElement selectPalmTreoProQuantityField;

    public void clickOnPalmTreoProQuantityField() {
        selectPalmTreoProQuantityField.click();
    }

    @FindBy(css = "tr:nth-child(1) > td:nth-child(4) > div > input")
    private WebElement typeInPalmTreoProQuantityField;

    public void typeInPalmTreoProQuantityField(String quantityPamTreoPro) {
        typeInPalmTreoProQuantityField.sendKeys(quantityPamTreoPro);
    }

    public void deleteAllCharactersFromPalmTreoProField() {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        actions.sendKeys(Keys.DELETE);
        actions.perform();
    }


    @FindBy(css = "tr:nth-child(2) > td:nth-child(4) > div > input")
    private WebElement selectSamsungSyncMaster941BWQuantityField;

    public void clickOnSamsungSyncMaster941BWQuantityField() {
        selectSamsungSyncMaster941BWQuantityField.click();
    }

    @FindBy(css = "tr:nth-child(2) > td:nth-child(4) > div > input")
    private WebElement samsungSyncMaster941BWQuantityField;

    public void typeInSamsungSyncMaster941BWQuantityField(String quantitySamsungSyncMaster941BW) {
        samsungSyncMaster941BWQuantityField.sendKeys(quantitySamsungSyncMaster941BW);
    }

    public void deleteAllCharactersFromSamsungSyncMaster941BWField() {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        actions.sendKeys(Keys.DELETE);
        actions.perform();
    }

    @FindBy(css = "tr:nth-child(1) > td:nth-child(4) > div > div > button.btn.btn-danger")
    private WebElement removePalmTreoFromProCartButton;

    public void clickOnRemovePalmTreoFromProCartButton() {
        removePalmTreoFromProCartButton.click();
    }

    @FindBy(css = "tr:nth-child(1) > td:nth-child(4) > div > div > button.btn.btn-primary")
    private WebElement updateCartButtonPalmTreo;

    public void clickOnUpdateCartButtonPalmTreo() {
        updateCartButtonPalmTreo.click();
    }
    @FindBy (css = "td:nth-child(4) > div > div > button.btn.btn-primary")
    private WebElement updateCartButtonPalmSamsungSyncMaster941BWField;

    public void clickOnUpdateCartButtonSamsungSyncMaster941BWField() {
        waitForElementToBePresent(driver, By.cssSelector("td:nth-child(4) > div > div > button.btn.btn-primary"), 12);
        updateCartButtonPalmSamsungSyncMaster941BWField.click();
    }

    @FindBy(css = "[class=\"btn btn-lg btn-primary\"]")
    private WebElement checkoutCartButton;

    public void clickOnCheckoutCartButton() {
        checkoutCartButton.click();
    }

    @FindBy(css = "[data-target=\"#collapse-coupon\"]")
    private WebElement closeUseCouponCodeField;

    public void clickOnCloseUseCouponCodeField() {
        closeUseCouponCodeField.click();
    }

    private void waitForElementToBePresent(WebDriver driver, By by, int i) {
    }

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[2]/div/div[2]/textarea")
    private WebElement addCommentsAboutYourOrderFromCart;

    public void clickOnAddCommentsAboutYourOrderFromCart(String addComments) {
        addCommentsAboutYourOrderFromCart.sendKeys(addComments);
        waitForElementToBePresent(driver, By.cssSelector("/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[2]/div/div[2]/textarea"), 12);
    }

    @FindBy(css = "div:nth-child(6) > label > a")
    private WebElement termsAndConditionsButtonFromCart;

    public void clickOnTermsAndConditionsButtonFromCart() {
        termsAndConditionsButtonFromCart.click();
        waitForElementToBePresent(driver, By.cssSelector("div:nth-child(6) > label > a"), 100);

    }

    @FindBy(css = "#modal-agree > div > div > div.modal-header > button")
    private WebElement exitTermsAndConditionsButtonFromCart;

    public void clickOnExitTermsAndConditionsButtonFromCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement clickOnContinueConfirmedRegistrationButtonTwo = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#modal-agree > div > div > div.modal-header > button")));
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(clickOnContinueConfirmedRegistrationButtonTwo).click().perform();
    }

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div/div/form/div/div[2]/div/div[5]/label")
    private WebElement agreeTermsAndConditionsCheckBoxButtonFromCart;

    public void clickOnAgreeTermsAndConditionsCheckBoxButtonFromCart() {
        agreeTermsAndConditionsCheckBoxButtonFromCart.click();
    }

    @FindBy(css = "[id=\"button-save\"]")
    private WebElement continueOrderButton;

    public void clickOnContinueOrderButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement clickOnContinueOrderButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id=\"button-save\"]")));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(clickOnContinueOrderButton).click().perform();
    }

    @FindBy(xpath = "//*[@id=\"button-confirm\"]")
    private WebElement confirmOrderButton;

    public void clickOnConfirmOrderButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement clickOnConfirmOrderButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"button-confirm\"]")));
        clickOnConfirmOrderButton.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"button-confirm\"]")));
//=============================================================================================================
    }

    @FindBy(css = "#mz-carousel-213240 > ul > li:nth-child(1)")
    private WebElement firstSlideFromHomePage;

    public void clickOnFirstSlideFromHomePageFromIphoneA14Bionic() {
        firstSlideFromHomePage.click();
    }

    @FindBy(css = "#mz-carousel-213240 > div > div.carousel-item.active > a > img")
    private WebElement iphoneA14BionicSlideFromHomePage;

    public void clickOnIphoneA14BionicSlideFromHomePage() {
        iphoneA14BionicSlideFromHomePage.click();
    }

    @FindBy(css = "[for=\"rating-1-216860\"]")
    private WebElement oneStarForIphoneA14Bionic;

    public void clickOnOneStarForIphoneA14Bionic() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement clickOnOneStarForIphoneA14Bionic = wait.until(ExpectedConditions.elementToBeClickable(oneStarForIphoneA14Bionic));
        oneStarForIphoneA14Bionic.click();
    }

    @FindBy(css = "[for=\"rating-2-216860\"]")
    private WebElement twoStarForIphoneA14Bionic;

    public void clickOnTwoStarForIphoneA14Bionic() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement clickOnTwoStarForIphoneA14Bionic = wait.until(ExpectedConditions.elementToBeClickable(twoStarForIphoneA14Bionic));
        twoStarForIphoneA14Bionic.click();
    }

    @FindBy(css = "[for=\"rating-3-216860\"]")
    private WebElement threeStarForIphoneA14Bionic;

    public void clickOnThreeStarForIphoneA14Bionic() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement clickOnThreeStarForIphoneA14Bionic = wait.until(ExpectedConditions.elementToBeClickable(threeStarForIphoneA14Bionic));
        threeStarForIphoneA14Bionic.click();
    }

    @FindBy(css = "[placeholder=\"Your Name\"]")
    private WebElement theNameForReviewFieldForIphoneA14Bionic;

    public void typeInTheNameForReviewFieldForIphoneA14Bionic(String review) {
        theNameForReviewFieldForIphoneA14Bionic.sendKeys(review);
    }

    public void clickTheNameForReviewFieldForIphoneA14Bionic() {
        theNameForReviewFieldForIphoneA14Bionic.click();
    }

    public void deleteAllCharactersFromTheNameForReviewFieldForIphoneA14Bionic() {
        clickTheNameForReviewFieldForIphoneA14Bionic();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        actions.sendKeys(Keys.DELETE);
        actions.perform();
    }

    public void deleteAllCharactersFromTheInputReviewFieldForIphoneA14Bionic() {
        clickTheNameForReviewFieldForIphoneA14Bionic();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        actions.sendKeys(Keys.DELETE);
        actions.perform();
    }

    @FindBy(css = "[id=\"input-review\"]")
    private WebElement inputReviewFieldForIphoneA14Bionic;

    public void typeInInputReviewFieldForIphoneA14Bionic(String review) {
        inputReviewFieldForIphoneA14Bionic.sendKeys(review);
    }

    @FindBy(xpath = "//*[@id=\"button-review\"]")
    private WebElement writeReviewButtonForIphoneA14Bionic;

    public void clickOnWriteReviewButtonForIphoneA14Bionic() {
        writeReviewButtonForIphoneA14Bionic.click();
    }

    @FindBy(css = "[alt=\"Poco Electro\"]")
    private WebElement lambdaTestPlaygroundSymbol;

    public void clickOnLambdaTestPlaygroundSymbol() {
        lambdaTestPlaygroundSymbol.click();
    }
    //============================================================================================================
}

