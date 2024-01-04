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

public class BlogArticleTests extends BasePage {

    private BlogArticlePage blogArticlePage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        blogArticlePage = new BlogArticlePage(driver);
    }

    @Description("Check A Full Article, His Description & Write A Comment For The Initial Blog Article")
    @Test(priority = 1)
    public void checkAFullArticleAndWriteAComment() {
        blogArticlePage.clickOnSecondFirstArticleFromTheFinalOfHomePage();
        blogArticlePage.clickOnElectronicsCategoryButtonFromArticle();

        blogArticlePage.clickOnReadMoreButtonToEnterInTheArticleAboutAppleFromMarkJecnoWithSevenComments();
        blogArticlePage.clickOnReadMoreButtonFromTheInitialArticleToSeeTheFullText();

        blogArticlePage.typeInYourNameFieldFromWriteACommentSectionOnTheArticle("Pop Matei");
        blogArticlePage.typeInEmailFieldFromWriteACommentSectionOnTheArticle("1mihai@test.com");
        blogArticlePage.typeInYourCommentFieldFromWriteACommentSectionOnTheArticle("This is a big article for electronics like Apple.");
        blogArticlePage.clickOnPostCommentFromWriteACommentSectionOnTheArticle();

        blogArticlePage.deleteAllCharactersFromYourNameField();
        blogArticlePage.deleteAllCharactersFromEmailField();
        blogArticlePage.deleteAllCharactersFromYourCommentlField();
        blogArticlePage.typeInYourNameFieldFromWriteACommentSectionOnTheArticle("Pop Ioan");
        blogArticlePage.typeInEmailFieldFromWriteACommentSectionOnTheArticle("1mihai@test.com");
        blogArticlePage.typeInYourCommentFieldFromWriteACommentSectionOnTheArticle("This is an unknown language for me and I can't understand the article.");

        String actualResult = driver.findElement(By.xpath("//*[@id=\"form-comment\"]/div[1]")).getText();
        Assert.assertEquals(actualResult, "Thank you for your comment. It has been submitted to the webmaster for approval.");
    }

    @Description("Verify If You Can Reply On A Random User Comment On The Initial Article")
    @Test(priority = 2)
    public void replyOnARandomUserCommentOnTheInitialArticle() {
        blogArticlePage.clickOnSecondFirstArticleFromTheFinalOfHomePage();
        blogArticlePage.clickOnElectronicsCategoryButtonFromArticle();

        blogArticlePage.clickOnReadMoreButtonToEnterInTheArticleAboutAppleFromMarkJecnoWithSevenComments();
        blogArticlePage.clickOnReadMoreButtonFromTheInitialArticleToSeeTheFullText();

        blogArticlePage.typeInYourNameFieldFromReplyToTheFirstComment("Pop Luca");
        blogArticlePage.typeInEmailFieldFromReplyToTheFirstComment("1mihai@test.com");
        blogArticlePage.typeInYourCommentFieldFromReplyToTheFirstComment("The first test for verifying this command.");
        blogArticlePage.clickOnPostCommentFromReplyToTheFirstComment();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement warningAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"alert alert-success alert-dismissible\"]")));

        String actualResult = warningAlert.getText();
        Assert.assertEquals(actualResult, "Thank you for your comment. It has been submitted to the webmaster for approval.");
    }

    @Description("Verify Electronics Blogs Pagination")
    @Test(priority = 3)
    public void verifyElectronicsBlogsPagination() {
        blogArticlePage.clickOnSecondFirstArticleFromTheFinalOfHomePage();
        blogArticlePage.clickOnElectronicsCategoryButtonFromArticle();

        blogArticlePage.clickOnNumberTwoPageElectronicsBlogPagination();
        blogArticlePage.clickOnNumberOnePageElectronicsBlogPagination();
        blogArticlePage.clickOnNextPageRightArrow();
        blogArticlePage.clickOnNextPageLeftArrow();
        blogArticlePage.clickOnLastPageRightArrow();
        blogArticlePage.clickOnLastPageLeftArrow();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement actualPage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"col-sm-6 text-right\"]")));

        String actualResult = actualPage.getText();
        Assert.assertEquals(actualResult, "Showing 1 to 15 of 16 (2 Pages)");
    }

    @Description("Verify The 'Latest' Products Pagination From An Article")
    @Test(priority = 4)
    public void verifyTheLatestProductsPaginationFromAnArticle() {
        blogArticlePage.clickOnSecondFirstArticleFromTheFinalOfHomePage();
        blogArticlePage.clickOnElectronicsCategoryButtonFromArticle();

        blogArticlePage.clickOnReadMoreButtonToEnterInTheArticleAboutAppleFromMarkJecnoWithSevenComments();
        blogArticlePage.clickOnNextPageRightArrowForLatestProductsFromABlogArticle();
        blogArticlePage.clickOnNextPageRightArrowForLatestProductsFromABlogArticle();
        blogArticlePage.clickOnNextPageLeftArrowForLatestProductsFromABlogArticle();
        blogArticlePage.clickOnNextPageRightArrowForLatestProductsFromABlogArticle();

        blogArticlePage.clickOnNextPageLeftArrowForLatestProductsFromABlogArticle();
        blogArticlePage.clickOnNextPageLeftArrowForLatestProductsFromABlogArticle();
        blogArticlePage.clickOnNextPageLeftArrowForLatestProductsFromABlogArticle();
        blogArticlePage.clickOnNextPageLeftArrowForLatestProductsFromABlogArticle();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[2]/h4/a")));
        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div/div[5]/div/div[2]/h4/a")));
        WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div/div/div/div/div[9]/div/div[2]/h4/a")));

        String actualResult1 = element1.getText();
        String actualResult2 = element2.getText();
        String actualResult3 = element3.getText();

        Assert.assertEquals(actualResult1, "iMac");
        Assert.assertEquals(actualResult2, "HTC Touch HD");
        Assert.assertEquals(actualResult3, "HP LP3065");
    }

    @Description("Verify The 'Related Products' Pagination From An Article")
    @Test(priority = 5)
    public void verifyTheRelatedProductsPaginationFromAnArticle() {
        blogArticlePage.clickOnSecondFirstArticleFromTheFinalOfHomePage();
        blogArticlePage.clickOnElectronicsCategoryButtonFromArticle();

        blogArticlePage.clickOnReadMoreButtonToEnterInTheArticleAboutAppleFromMarkJecnoWithSevenComments();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.cssSelector("[id=\"entry_217561\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        blogArticlePage.clickOnNextPageRightArrowForRelatedProductsFromABlogArticle();
        blogArticlePage.clickOnNextPageRightArrowForRelatedProductsFromABlogArticle();
        blogArticlePage.clickOnNextPageRightArrowForRelatedProductsFromABlogArticle();

        blogArticlePage.clickOnNextPageLeftArrowForRelatedProductsFromABlogArticle();
        blogArticlePage.clickOnNextPageLeftArrowForRelatedProductsFromABlogArticle();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div[4]/div/div/div[2]/div/div/div/div/div[2]/div/div[2]/h4/a")));
        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div[4]/div/div/div[2]/div/div/div/div/div[3]/div/div[2]/h4/a")));
        WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div[4]/div/div/div[2]/div/div/div/div/div[4]/div/div[2]/h4/a")));
        WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div[4]/div/div/div[2]/div/div/div/div/div[5]/div/div[2]/h4/a")));
        WebElement element5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[5]/div[1]/div[4]/div/div/div[2]/div/div/div/div/div[6]/div/div[2]/h4/a")));

        String actualResult1 = element1.getText();
        String actualResult2 = element2.getText();
        String actualResult3 = element3.getText();
        String actualResult4 = element4.getText();
        String actualResult5 = element5.getText();

        Assert.assertEquals(actualResult1, "Palm Treo Pro");
        Assert.assertEquals(actualResult2, "Canon EOS 5D");
        Assert.assertEquals(actualResult3, "Nikon D300");
        Assert.assertEquals(actualResult4, "iPod Touch");
        Assert.assertEquals(actualResult5, "Samsung SyncMaster 941BW");
    }
}
