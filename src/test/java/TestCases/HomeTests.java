package TestCases;

import Pages.BasePage;
import Pages.HomePage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTests extends BasePage {
    private HomePage homePage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        homePage = new HomePage(driver);
    }

    @Description("Add Products To Compare One Another")
    @Test(priority = 1)
    public void addProductsForComparison() {
        homePage.clickOnAllCategoriesDropDownList();
        homePage.clickOnSoftwareCategory();
        homePage.typeInSearchForProducts("a");
        homePage.clickOnSearchButtonFromSearchForProducts();

        homePage.moveCursorArrowToPalmTreoPro();
        homePage.clickOnCompareButtonForPalmTreoPro();

        homePage.moveCursorArrowToCanonEOS5D();
        homePage.clickOnCompareButtonForCanonEOS5D();

        homePage.moveCursorArrowToSamsungSyncMaster941BW();
        homePage.clickOnCompareButtonForSamsungSyncMaster941BW();

        homePage.clickOnProductComparePageButton();

        homePage.clickOnRemoveSamsungSyncMaster941BWButton();
        homePage.clickOnRemoveCanonEOS5DButton();
        homePage.clickOnRemovePalmTreoProButton();


        WebElement successWarningAddToComparePage = driver.findElement(By.cssSelector("#content > p"));
        String actualResult = successWarningAddToComparePage.getText();
        Assert.assertEquals(actualResult, "You have not chosen any products to compare.");

    }

    @Description("Get Quick View Of A Product")
    @Test(priority = 2)
    public void getQuickViewOfAProduct() {
        homePage.clickOnAllCategoriesDropDownList();
        homePage.clickOnSoftwareCategory();
        homePage.typeInSearchForProducts("a");
        homePage.clickOnSearchButtonFromSearchForProducts();


        homePage.moveCursorArrowToPalmTreoPro();
        homePage.clickOnQuickViewPalmTreoProButton();
        homePage.exitQuickViewPalmTreoProExitButton();

        String actualResult = driver.findElement(By.cssSelector("div > div:nth-child(1) > div > div.caption > h4 > a")).getText();
        Assert.assertEquals(actualResult, "Palm Treo Pro");
    }

    @Description("Add Products To Wish List And Delete Them")
    @Test(priority = 3)
    public void addProductsToWishList() {
        homePage.clickOnAllCategoriesDropDownList();
        homePage.clickOnSoftwareCategory();
        homePage.typeInSearchForProducts("a");
        homePage.clickOnSearchButtonFromSearchForProducts();


        homePage.moveCursorArrowToPalmTreoPro();
        homePage.clickOnAddToWishListPalmTreoProButton();

        homePage.moveCursorArrowToCanonEOS5D();
        homePage.clickOnCanonEOS5DButton();

        homePage.moveCursorArrowToSamsungSyncMaster941BW();
        homePage.clickOnAddWishListSamsungSyncMaster941BWButton();

        homePage.moveCursorArrowToMyAccountButton();
        homePage.clickOnMyAccountLoginButton();
        homePage.typeInEmailAddressRegisterCustomerField("amira.nicolas@hotmail.com");
        homePage.typeInPasswordRegisterCustomerField("1234");
        homePage.clickOnLoginRegisterCustomerButton();

        homePage.clickOnModifyYouWishListButton();

        homePage.clickOnRemovePalmTreoProButtonFromWishList();
        homePage.clickOnRemoveCanonEOS5DButtonFromWishList();
        homePage.clickOnRemoveSamsungSyncMaster941BWButtonFromWishList();

        String actualResult = driver.findElement(By.cssSelector("[class=\"alert alert-success alert-dismissible\"]")).getText();
        Assert.assertEquals(actualResult, "Success: You have modified your wish list!\n" +
                "×");
    }

    @Description("Add Products To Cart And Delete Them")
    @Test(priority = 4)
    public void addProductsToCart() {
        homePage.clickOnAllCategoriesDropDownList();
        homePage.clickOnSoftwareCategory();
        homePage.typeInSearchForProducts("a");
        homePage.clickOnSearchButtonFromSearchForProducts();

        homePage.moveCursorArrowToPalmTreoPro();
        homePage.clickOnAddPalmTreoProButtonFromCart();

        homePage.moveCursorArrowToSamsungSyncMaster941BW();
        homePage.clickOnAddSamsungSyncMaster941BWButtonFromCart();

        homePage.clickOnCartIcon();
        homePage.moveCursorOnEditCartButton();
        homePage.clickOnEditCartButton();

        homePage.clickOnPalmTreoProQuantityField();
        homePage.deleteAllCharactersFromPalmTreoProField();
        homePage.typeInPalmTreoProQuantityField("4");

        homePage.clickOnSamsungSyncMaster941BWQuantityField();
        homePage.deleteAllCharactersFromSamsungSyncMaster941BWField();
        homePage.typeInSamsungSyncMaster941BWQuantityField("8");

        homePage.clickOnUpdateCartButtonPalmTreo();
        homePage.clickOnRemovePalmTreoFromProCartButton();
        homePage.clickOnUpdateCartButtonSamsungSyncMaster941BWField();
        homePage.clickOnUpdateCartButtonSamsungSyncMaster941BWField();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();}

        String actualResult1 = driver.findElement(By.cssSelector("[class=\"alert alert-success alert-dismissible\"]")).getText();
        Assert.assertEquals(actualResult1, "Success: You have modified your shopping cart!\n" +
                "×");
    }

    @Description("Add Products To Cart And Finish And Order")
    @Test(priority = 5)
    public void addProductsToCartAndFinishAnOrder() {
        homePage.moveCursorArrowToMyAccountButton();
        homePage.clickOnMyAccountLoginButton();

        homePage.typeInEmailAddressRegisterCustomerField("amira.nicolas@hotmail.com"); //Change The E-mail If The Test Fails
        homePage.typeInPasswordRegisterCustomerField("1234");
        homePage.clickOnLoginRegisterCustomerButton();

        homePage.clickOnAllCategoriesDropDownList();
        homePage.clickOnSoftwareCategory();
        homePage.typeInSearchForProducts("a");
        homePage.clickOnSearchButtonFromSearchForProducts();


        homePage.moveCursorArrowToPalmTreoPro();
        homePage.clickOnAddPalmTreoProButtonFromCart();

        homePage.moveCursorArrowToSamsungSyncMaster941BW();
        homePage.clickOnAddSamsungSyncMaster941BWButtonFromCart();

        homePage.clickOnCartIcon();
        homePage.moveCursorOnEditCartButton();
        homePage.clickOnEditCartButton();

        homePage.clickOnPalmTreoProQuantityField();
        homePage.deleteAllCharactersFromPalmTreoProField();
        homePage.typeInPalmTreoProQuantityField("4");

        homePage.clickOnSamsungSyncMaster941BWQuantityField();
        homePage.deleteAllCharactersFromSamsungSyncMaster941BWField();
        homePage.typeInSamsungSyncMaster941BWQuantityField("8");
        homePage.clickOnRemovePalmTreoFromProCartButton();
        homePage.clickOnUpdateCartButtonPalmTreo();
        homePage.clickOnCheckoutCartButton();

        homePage.clickOnCloseUseCouponCodeField();
        homePage.clickOnAddCommentsAboutYourOrderFromCart("Thank You");
        homePage.clickOnTermsAndConditionsButtonFromCart();
        homePage.clickOnExitTermsAndConditionsButtonFromCart();

        homePage.clickOnAgreeTermsAndConditionsCheckBoxButtonFromCart();
        homePage.clickOnContinueOrderButton();
        homePage.clickOnConfirmOrderButton();


        String actualResult = driver.findElement(By.cssSelector("[class=\"page-title my-3\"]")).getText();
        Assert.assertEquals(actualResult, "Your order has been placed!");
    }

    @Description("Send Three Different Reviews For A Product")
    @Test(priority = 6)
    public void sendThreeDifferentReviewsForAProduct() {

        homePage.clickOnFirstSlideFromHomePageFromIphoneA14Bionic();
        homePage.clickOnIphoneA14BionicSlideFromHomePage();

        homePage.clickOnOneStarForIphoneA14Bionic();
        homePage.typeInTheNameForReviewFieldForIphoneA14Bionic("Pop Ionel");
        homePage.typeInInputReviewFieldForIphoneA14Bionic("This is not An iPhone A14 Bionic. It is a fridge!");
        homePage.clickOnWriteReviewButtonForIphoneA14Bionic();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();}

        String actualResult = driver.findElement(By.xpath("//*[@id=\"form-review\"]/div[2]")).getText();
        Assert.assertEquals(actualResult, "Thank you for your review. It has been submitted to the webmaster for approval.");
    }

    @Description("Verify Warning Of A Review With An Unchecked Star")
    @Test(priority = 7)
    public void verifyWarningOfAReviewWithAnUncheckedStar() {

        homePage.clickOnFirstSlideFromHomePageFromIphoneA14Bionic();
        homePage.clickOnIphoneA14BionicSlideFromHomePage();

        homePage.typeInTheNameForReviewFieldForIphoneA14Bionic("Pop Darius");
        homePage.typeInInputReviewFieldForIphoneA14Bionic("I clicked on an advertisement for the iPhone A14 Bionic, but this is a fridge!");
        homePage.clickOnWriteReviewButtonForIphoneA14Bionic();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();}

        String actualResult = driver.findElement(By.xpath("//*[@id=\"form-review\"]/div[2]")).getText();
        Assert.assertEquals(actualResult, "Warning: Please select a review rating!");
    }

    @Description("Verify Warning Of A Review With A 10 Characters Commentary")
    @Test(priority = 8)
    public void verifyWarningOfAReviewWithATenCharactersCommentary() {

        homePage.clickOnFirstSlideFromHomePageFromIphoneA14Bionic();
        homePage.clickOnIphoneA14BionicSlideFromHomePage();

        homePage.clickOnOneStarForIphoneA14Bionic();
        homePage.typeInTheNameForReviewFieldForIphoneA14Bionic("Pop Ionel");
        homePage.typeInInputReviewFieldForIphoneA14Bionic("Not Apple.");
        homePage.clickOnWriteReviewButtonForIphoneA14Bionic();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();}

        String actualResult = driver.findElement(By.xpath("//*[@id=\"form-review\"]/div[2]")).getText();
        Assert.assertEquals(actualResult, "Warning: Review Text must be between 25 and 1000 characters!");
    }

    @Description("Verify Warning Of A Review Without Any Name")
    @Test(priority = 9)
    public void verifyWarningOfAReviewWithoutAnyName() {

        homePage.clickOnFirstSlideFromHomePageFromIphoneA14Bionic();
        homePage.clickOnIphoneA14BionicSlideFromHomePage();

        homePage.clickOnOneStarForIphoneA14Bionic();
        homePage.typeInInputReviewFieldForIphoneA14Bionic("This is not An iPhone A14 Bionic. It is a fridge!");
        homePage.clickOnWriteReviewButtonForIphoneA14Bionic();

        homePage.clickOnTwoStarForIphoneA14Bionic();
        homePage.typeInTheNameForReviewFieldForIphoneA14Bionic("Pop Darius");
        homePage.deleteAllCharactersFromTheInputReviewFieldForIphoneA14Bionic();
        homePage.typeInInputReviewFieldForIphoneA14Bionic("I clicked on an advertisement for the iPhone A14 Bionic, but this is a fridge!");
        homePage.clickOnWriteReviewButtonForIphoneA14Bionic();


        String actualResult = driver.findElement(By.xpath("//*[@id=\"form-review\"]/div[2]")).getText();
        Assert.assertEquals(actualResult, "Warning: Review Name must be between 3 and 25 characters!");
    }
}