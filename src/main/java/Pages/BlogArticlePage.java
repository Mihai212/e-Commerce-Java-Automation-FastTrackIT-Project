package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BlogArticlePage extends BasePage {

    public BlogArticlePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div.swiper-slide.swiper-slide-active > div > div.image > a > img")
    private WebElement firstBlogArticleFromTheFinalOfHomePage;

    public void clickOnSecondFirstArticleFromTheFinalOfHomePage() {
        firstBlogArticleFromTheFinalOfHomePage.click();
    }

    @FindBy(css = "#entry_210914 > div > a:nth-child(2)")
    private WebElement electronicsCategoryButtonFromArticle;

    public void clickOnElectronicsCategoryButtonFromArticle() {
        electronicsCategoryButtonFromArticle.click();
    }

    @FindBy(css = "div > div:nth-child(11) > div > div.caption > a")
    private WebElement readMoreButtonToEnterInTheArticleAboutAppleFromMarkJecnoWithSevenComments;

    public void clickOnReadMoreButtonToEnterInTheArticleAboutAppleFromMarkJecnoWithSevenComments() {
        readMoreButtonToEnterInTheArticleAboutAppleFromMarkJecnoWithSevenComments.click();
    }

    @FindBy(xpath = "//*[@id=\"entry_210907\"]/div/div/a")
    private WebElement readMoreButtonFromTheInitialArticleToSeeTheFullText;

    public void clickOnReadMoreButtonFromTheInitialArticleToSeeTheFullText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement clickOnReadMoreButtonFromTheInitialArticleToSeeTheFullText = wait.until(ExpectedConditions.elementToBeClickable(readMoreButtonFromTheInitialArticleToSeeTheFullText));
        readMoreButtonFromTheInitialArticleToSeeTheFullText.click();
    }

    @FindBy(xpath = "//*[@id=\"entry_210910\"]/div/div/div/div/a")
    private WebElement readMoreButtonFromTheDescriptionOfTheInitialAuthor;

    public void clickOnReadMoreButtonFromTheDescriptionOfTheInitialAuthor() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement clickOnReadMoreButtonFromTheDescriptionOfTheInitialAuthor = wait.until(ExpectedConditions.elementToBeClickable(readMoreButtonFromTheDescriptionOfTheInitialAuthor));
        readMoreButtonFromTheDescriptionOfTheInitialAuthor.click();
    }

    @FindBy(css = "#entry_210910 > div > div > div > div > a")
    private WebElement showLessButtonFromTheDescriptionOfTheInitialAuthor;

    public void clickOnShowLessButtonFromTheDescriptionOfTheInitialAuthor() {
        showLessButtonFromTheDescriptionOfTheInitialAuthor.click();
    }

    @FindBy(css = "[placeholder=\"Your Name\"]")
    private WebElement yourNameFieldFromWriteACommentSectionOnTheArticle;

    public void typeInYourNameFieldFromWriteACommentSectionOnTheArticle(String yourName) {
        yourNameFieldFromWriteACommentSectionOnTheArticle.sendKeys(yourName);
    }

    public void deleteAllCharactersFromYourNameField() {
        yourNameFieldFromWriteACommentSectionOnTheArticle.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        actions.sendKeys(Keys.DELETE);
        actions.perform();
    }

    @FindBy(css = "[placeholder=\"Email\"]")
    private WebElement emailFieldFromWriteACommentSectionOnTheArticle;

    public void typeInEmailFieldFromWriteACommentSectionOnTheArticle(String email) {
        emailFieldFromWriteACommentSectionOnTheArticle.sendKeys(email);
    }

    public void deleteAllCharactersFromEmailField() {
        emailFieldFromWriteACommentSectionOnTheArticle.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        actions.sendKeys(Keys.DELETE);
        actions.perform();
    }

    @FindBy(css = "[placeholder=\"Your comment\"]")
    private WebElement yourCommentFieldFromWriteACommentSectionOnTheArticle;

    public void typeInYourCommentFieldFromWriteACommentSectionOnTheArticle(String yourComment) {
        yourCommentFieldFromWriteACommentSectionOnTheArticle.sendKeys(yourComment);
    }

    public void deleteAllCharactersFromYourCommentlField() {
        yourCommentFieldFromWriteACommentSectionOnTheArticle.click();
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
        actions.sendKeys(Keys.DELETE);
        actions.perform();
    }

    @FindBy(css = "[class=\"btn btn-lg btn-secondary\"]")
    private WebElement postCommentFromWriteACommentSectionOnTheArticle;

    public void clickOnPostCommentFromWriteACommentSectionOnTheArticle() {
        postCommentFromWriteACommentSectionOnTheArticle.click();
    }

    @FindBy(css = "[data-reply_to=\"154\"]")
    private WebElement replyButtonToFirstComment;

    public void clickOnReplyButtonToFirstComment() {
        replyButtonToFirstComment.click();
    }

    @FindBy(css = "[id=\"input-name\"]")
    private WebElement yourNameFieldFromReplyToTheFirstComment;

    public void typeInYourNameFieldFromReplyToTheFirstComment(String yourName) {
        yourNameFieldFromReplyToTheFirstComment.sendKeys(yourName);
    }

    @FindBy(css = "[id=\"input-email\"]")
    private WebElement yourEmailFieldFromReplyToTheFirstComment;

    public void typeInEmailFieldFromReplyToTheFirstComment(String email) {
        yourEmailFieldFromReplyToTheFirstComment.sendKeys(email);
    }

    @FindBy(css = "[id=\"input-comment\"]")
    private WebElement yourCommentFieldFromReplyToTheFirstComment;

    public void typeInYourCommentFieldFromReplyToTheFirstComment(String yourComment) {
        yourCommentFieldFromReplyToTheFirstComment.sendKeys(yourComment);
    }

    @FindBy(css = "[id=\"button-comment\"]")
    private WebElement postCommentFromReplyToTheFirstComment;

    public void clickOnPostCommentFromReplyToTheFirstComment() {
        postCommentFromReplyToTheFirstComment.click();
    }

    @FindBy(css = "#entry_210952 > div > div.col-sm-6.text-left > ul > li:nth-child(2) > a")
    private WebElement numberTwoPageElectronicsBlogPagination;

    public void clickOnNumberTwoPageElectronicsBlogPagination() {
        numberTwoPageElectronicsBlogPagination.click();
    }

    @FindBy(css = "#entry_210952 > div > div.col-sm-6.text-left > ul > li:nth-child(3) > a")
    private WebElement numberOnePageElectronicsBlogPagination;

    public void clickOnNumberOnePageElectronicsBlogPagination() {
        numberOnePageElectronicsBlogPagination.click();
    }

    @FindBy(xpath = "//*[@id=\"entry_210952\"]/div/div[1]/ul/li[3]/a")
    private WebElement nextPageRightArrow;

    public void clickOnNextPageRightArrow() {
        nextPageRightArrow.click();
    }

    @FindBy(xpath = "//*[@id=\"entry_210952\"]/div/div[1]/ul/li[2]/a")
    private WebElement nextPageLeftArrow;

    public void clickOnNextPageLeftArrow() {
        nextPageLeftArrow.click();
    }

    @FindBy(xpath = "//*[@id=\"entry_210952\"]/div/div[1]/ul/li[4]/a")
    private WebElement lastPageRightArrow;

    public void clickOnLastPageRightArrow() {
        lastPageRightArrow.click();
    }

    @FindBy(xpath = "//*[@id=\"entry_210952\"]/div/div[1]/ul/li[1]/a")
    private WebElement lastPageLeftArrow;

    public void clickOnLastPageLeftArrow() {
        lastPageLeftArrow.click();
    }

    @FindBy(xpath = "//*[@id=\"mz-product-listing-85210915\"]/div[1]/div/div/a[2]")
    private WebElement nextPageRightArrowForLatestProductsFromABlogArticle;

    public void clickOnNextPageRightArrowForLatestProductsFromABlogArticle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement clickOnNextPageRightArrowForLatestProductsFromABlogArticle = wait.until(ExpectedConditions.elementToBeClickable(nextPageRightArrowForLatestProductsFromABlogArticle));
        nextPageRightArrowForLatestProductsFromABlogArticle.click();
    }

    @FindBy(xpath = "//*[@id=\"mz-product-listing-85210915\"]/div[1]/div/div/a[1]")
    private WebElement nextPageLeftArrowForLatestProductsFromABlogArticle;

    public void clickOnNextPageLeftArrowForLatestProductsFromABlogArticle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement clickOnNextPageLeftArrowForLatestProductsFromABlogArticle = wait.until(ExpectedConditions.elementToBeClickable(nextPageLeftArrowForLatestProductsFromABlogArticle));
        nextPageLeftArrowForLatestProductsFromABlogArticle.click();
    }

    @FindBy(xpath = "//*[@id=\"mz-product-listing-68210919\"]/div[1]/div/div/a[2]")
    private WebElement nextPageRightArrowForRelatedProductsFromABlogArticle;

    public void clickOnNextPageRightArrowForRelatedProductsFromABlogArticle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement clickOnNextPageRightArrowForRelatedProductsFromABlogArticle = wait.until(ExpectedConditions.elementToBeClickable(nextPageRightArrowForRelatedProductsFromABlogArticle));
        nextPageRightArrowForRelatedProductsFromABlogArticle.click();
    }

    @FindBy(xpath = "//*[@id=\"mz-product-listing-68210919\"]/div[1]/div/div/a[1]")
    private WebElement nextPageLeftArrowForRelatedProductsFromABlogArticle;

    public void clickOnNextPageLeftArrowForRelatedProductsFromABlogArticle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement clickOnNextPageLeftArrowForRelatedProductsFromABlogArticle = wait.until(ExpectedConditions.elementToBeClickable(nextPageLeftArrowForRelatedProductsFromABlogArticle));
        nextPageLeftArrowForRelatedProductsFromABlogArticle.click();
    }
}