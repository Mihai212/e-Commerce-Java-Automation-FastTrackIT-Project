import Pages.AddOnsFeaturedPage;
import Pages.BasePage;
import Pages.BlogArticlePage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddOnsFeaturedTests extends BasePage {

    private AddOnsFeaturedPage addOnsFeaturedPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        addOnsFeaturedPage = new AddOnsFeaturedPage(driver);
    }

    @Description("Verify If The Effects From Add Ons Featured Work")
    @Test(priority = 1)
    public void verifyTheEffectsFromAddOnsFeatured() {
        addOnsFeaturedPage.moveCursorArrowToAddOnsFeaturedDropDownList();
        addOnsFeaturedPage.clickOnWidgetsOptionFromAddOnsFeaturedDropDownList();

        addOnsFeaturedPage.moveCursorArrowToEffectNumberOne();
        addOnsFeaturedPage.moveCursorArrowToEffectNumberTwo();
        addOnsFeaturedPage.moveCursorArrowToEffectNumberThree();
        addOnsFeaturedPage.moveCursorArrowToEffectNumberFour();
        addOnsFeaturedPage.moveCursorArrowToEffectNumberFive();
        addOnsFeaturedPage.moveCursorArrowToEffectNumberSix();
        addOnsFeaturedPage.moveCursorArrowToEffectNumberSeven();
        addOnsFeaturedPage.moveCursorArrowToUpToTwelveEffect();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actualResult = driver.findElement(By.cssSelector("[class=\"mb-5\"]")).getText();
        Assert.assertEquals(actualResult, "Banner");
    }

    @Description("Verify The Faq Questions")
    @Test(priority = 2)
    public void verifyTheFaqQuestions() {
        addOnsFeaturedPage.moveCursorArrowToAddOnsFeaturedDropDownList();
        addOnsFeaturedPage.clickOnWidgetsOptionFromAddOnsFeaturedDropDownList();

        addOnsFeaturedPage.clickOnFirstQuestionFromFaqCategory();
        addOnsFeaturedPage.clickOnSecondQuestionFromFaqCategory();
        addOnsFeaturedPage.clickOnThirdQuestionFromFaqCategory();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement actualPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mz-faq-panel-214664-2 > div > p > span")));

        String actualResult = actualPage.getText();
        Assert.assertEquals(actualResult, "“Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.”");
    }

    @Description("Verify 'Contact Us' Information")
    @Test(priority = 3)
    public void verifyContactUsInfo() {
        addOnsFeaturedPage.moveCursorArrowToAddOnsFeaturedDropDownList();
        addOnsFeaturedPage.clickOnWidgetsOptionFromAddOnsFeaturedDropDownList();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.cssSelector("[id=\"entry_217561\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actualResult1 = driver.findElement(By.cssSelector("#entry_214735 > h5")).getText();
        String actualResult2 = driver.findElement(By.cssSelector("#entry_214735 > ul > li:nth-child(1)")).getText();
        String actualResult3 = driver.findElement(By.cssSelector("#entry_214735 > ul > li:nth-child(2)")).getText();
        String actualResult4 = driver.findElement(By.cssSelector("#entry_214735 > ul > li:nth-child(3)")).getText();

        Assert.assertEquals(actualResult1, "Contact us");
        Assert.assertEquals(actualResult2, "Address 1");
        Assert.assertEquals(actualResult3, "suryac@lambdatest.com");
        Assert.assertEquals(actualResult4, "Call us: 123456789");
    }

    @Description("Change The 'Currency' Of The Products On The Site In 'EUR'.")
    @Test(priority = 4)
    public void changeTheCurrencyOfTheProductsInEUR() {
        addOnsFeaturedPage.moveCursorArrowToAddOnsFeaturedDropDownList();
        addOnsFeaturedPage.clickOnWidgetsOptionFromAddOnsFeaturedDropDownList();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.cssSelector("[id=\"entry_217561\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        addOnsFeaturedPage.clickOnCurrencyOfTheSiteDropDownList();
        addOnsFeaturedPage.clickOnEuroCurrencyOfTheSiteFromDropDownList();
        addOnsFeaturedPage.clickOnLambdaTestPlayGroundSymbol();
        addOnsFeaturedPage.typeInSearchForProductsFieldFromHomePage("a");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown > ul > li:nth-child(1) > div.caption.pl-3 > div")));
        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown > ul > li:nth-child(2) > div.caption.pl-3 > div")));
        WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown > ul > li:nth-child(3) > div.caption.pl-3 > div")));
        WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown > ul > li:nth-child(4) > div.caption.pl-3 > div")));
        WebElement element5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown > ul > li:nth-child(5) > div.caption.pl-3 > div")));

        String actualResult1 = element1.getText();
        String actualResult2 = element2.getText();
        String actualResult3 = element3.getText();
        String actualResult4 = element4.getText();
        String actualResult5 = element5.getText();
        Assert.assertEquals(actualResult1, "265.19€ 219.68€");
        Assert.assertEquals(actualResult2, "105.14€ 86.31€");
        Assert.assertEquals(actualResult3, "189.87€ 156.92€");
        Assert.assertEquals(actualResult4, "95.72€ 78.46€");
        Assert.assertEquals(actualResult5, "133.38€ 109.84€");
    }

    @Description("Change The 'Currency' Of The Products On The Site In 'GBP'.")
    @Test(priority = 5)
    public void changeTheCurrencyOfTheProductsInGBP() {
        addOnsFeaturedPage.moveCursorArrowToAddOnsFeaturedDropDownList();
        addOnsFeaturedPage.clickOnWidgetsOptionFromAddOnsFeaturedDropDownList();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.cssSelector("[id=\"entry_217561\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        addOnsFeaturedPage.clickOnCurrencyOfTheSiteDropDownList();
        addOnsFeaturedPage.clickOnGBPCurrencyOfTheSiteFromDropDownList();
        addOnsFeaturedPage.clickOnLambdaTestPlayGroundSymbol();
        addOnsFeaturedPage.typeInSearchForProductsFieldFromHomePage("a");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown > ul > li:nth-child(1) > div.caption.pl-3 > div")));
        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown > ul > li:nth-child(2) > div.caption.pl-3 > div")));
        WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown > ul > li:nth-child(3) > div.caption.pl-3 > div")));
        WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown > ul > li:nth-child(4) > div.caption.pl-3 > div")));
        WebElement element5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown > ul > li:nth-child(5) > div.caption.pl-3 > div")));

        String actualResult1 = element1.getText();
        String actualResult2 = element2.getText();
        String actualResult3 = element3.getText();
        String actualResult4 = element4.getText();
        String actualResult5 = element5.getText();
        Assert.assertEquals(actualResult1, "£207.02 £171.49");
        Assert.assertEquals(actualResult2, "£82.08 £67.38");
        Assert.assertEquals(actualResult3, "£148.23 £122.50");
        Assert.assertEquals(actualResult4, "£74.73 £61.25");
        Assert.assertEquals(actualResult5, "£104.13 £85.75");
    }

    @Description("Change The 'Currency' Of The Products On The Site In 'USD'.")
    @Test(priority = 6)
    public void changeTheCurrencyOfTheProductsInUSD() {
        addOnsFeaturedPage.moveCursorArrowToAddOnsFeaturedDropDownList();
        addOnsFeaturedPage.clickOnWidgetsOptionFromAddOnsFeaturedDropDownList();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.cssSelector("[id=\"entry_217561\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        addOnsFeaturedPage.clickOnCurrencyOfTheSiteDropDownList();
        addOnsFeaturedPage.clickOnUSDCurrencyOfTheSiteFromDropDownList();
        addOnsFeaturedPage.clickOnLambdaTestPlayGroundSymbol();
        addOnsFeaturedPage.typeInSearchForProductsFieldFromHomePage("a");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown > ul > li:nth-child(1) > div.caption.pl-3 > div")));
        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown > ul > li:nth-child(2) > div.caption.pl-3 > div")));
        WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown > ul > li:nth-child(3) > div.caption.pl-3 > div")));
        WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown > ul > li:nth-child(4) > div.caption.pl-3 > div")));
        WebElement element5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.dropdown > ul > li:nth-child(5) > div.caption.pl-3 > div")));

        String actualResult1 = element1.getText();
        String actualResult2 = element2.getText();
        String actualResult3 = element3.getText();
        String actualResult4 = element4.getText();
        String actualResult5 = element5.getText();
        Assert.assertEquals(actualResult1, "$337.99 $279.99");
        Assert.assertEquals(actualResult2, "$134.00 $110.00");
        Assert.assertEquals(actualResult3, "$242.00 $200.00");
        Assert.assertEquals(actualResult4, "$122.00 $100.00");
        Assert.assertEquals(actualResult5, "$170.00 $140.00");
    }
}

