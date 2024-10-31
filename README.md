## ▶️YouTube Links for Project:

•[Java Code View Project](https://youtu.be/sjaOoUjgtrQ);<br>
•[Java Tests Running And Results](https://youtu.be/I1rXYuoQg3k);

## 🧪 Project Overview

The project uses the **Page Object Model (POM)** design pattern for structured and maintainable code. The **Selenium WebDriver** framework powers our automation, with **Maven** as the build and test tool and **Java** as the programming language. 🚀

## 🔧 Core Configuration

 In the **BasePage** class, configurations are set to initialize a **Google Chrome Browser** instance from the [e-Commerce](https://ecommerce-playground.lambdatest.io/index.php?route=common/home) site for each test case. After each test completes, the browser instance is closed automatically. For an optimal view, tests are executed in **Full Screen** mode.

### ⚙️ Java "BasePage" code example:
```java

 public static WebDriver driver;
    private String BASE_URL = "https://ecommerce-playground.lambdatest.io/index.php?route=common/home";

    public BasePage() {
    }

    public class BasePage {

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

    }
```

## 📂 Project Structure

The project is organized into two main packages:

1. **Pages** 📄: This package includes `BasePage`, which is responsible for setting up prerequisites and browser configurations. <br>
   Additionally, it holds classes like `RegisterAccountPage`, `AddAddressPage`, `BlogArticlePage`, `EditYourAccountPage`, `AddOnsFeaturedPage`, and `HomePage`. Each class provides locators like **XPATH** and **CSS** for elements required in test automation.

### 📑 EditYourAccountPage code example:
```java
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

}
```
2. **TestCases** 🧩: Contains classes named `RegisterAccountTests`, `AddAddressTests`, `BlogArticleTests`, `EditYourAccountTests`, `AddOnsFeaturedTests`, and `HomeTests`, each containing test cases for elements found in the **Pages** package.

 ### ✅ EditYourAccountTests code example:
```java

    @Description("Verify If The Warnings Appear If You Delete Your All Information Account")
    @Test(priority = 5)
    public void deleteAccountInfoAndClickContinueButtonToSeeTheWarnings() {
        editYourAccountPage.moveCursorArrowToMyAccountButton();
        editYourAccountPage.clickOnMyAccountLoginButton();

        editYourAccountPage.typeInEmailAddressRegisterCustomerField("keith.volkman@yahoo.com"); //Change The E-mail If The Test Fails With The Changed One
        editYourAccountPage.typeInPasswordRegisterCustomerField("1234"); //Change The Password If The Test Fails With The Changed One
        editYourAccountPage.clickOnLoginReturningCustomerButton();
        editYourAccountPage.clickOnEditYourAccountInfo();

        editYourAccountPage.deleteAllCharactersFromTheFirstNameFieldFromMyAccountInfo();
        editYourAccountPage.deleteAllCharactersFromTheLastNameFieldFromMyAccountInfo();
        editYourAccountPage.deleteAllCharactersFromTheEmailFieldFromMyAccountInfo();
        editYourAccountPage.deleteAllCharactersFromTheTelephoneFieldFromMyAccountInfo();

        editYourAccountPage.clickEditContinueButtonFromMyAccountInfo();

        String actualResult1 = driver.findElement(By.cssSelector("#content > form > fieldset > div:nth-child(2) > div > div")).getText();
        String actualResult2 = driver.findElement(By.cssSelector("#content > form > fieldset > div:nth-child(3) > div > div")).getText();
        String actualResult3 = driver.findElement(By.cssSelector("#content > form > fieldset > div:nth-child(4) > div > div")).getText();
        String actualResult4 = driver.findElement(By.cssSelector("#content > form > fieldset > div:nth-child(5) > div > div")).getText();

        Assert.assertEquals(actualResult1, "First Name must be between 1 and 32 characters!");
        Assert.assertEquals(actualResult2, "Last Name must be between 1 and 32 characters!");
        Assert.assertEquals(actualResult3, "E-Mail Address does not appear to be valid!");
        Assert.assertEquals(actualResult4, "Telephone must be between 3 and 32 characters!");
```
   
## 🧰 Project Dependencies

The **pom.xml** file includes essential dependencies for the project:

- `Chrome Driver`, `Selenium`, `Maven`, `TestNG`, `GitHub`, `Allure`, and `Faker`.  
- **Java Faker** 📋: A library used for generating mock data such as phone numbers, addresses, emails, and more, ensuring realistic test scenarios even without real data. This is particularly useful when placeholders are needed.

### ♨️ Java Faker code example:

```java
    @FindBy(css = "[placeholder=\"E-Mail\"]")
    private WebElement emailTextField;

    private final Faker faker = new Faker();
    public void enterInEmailTextField() {
        String randomEmail = faker.internet().emailAddress();
        emailTextField.sendKeys(randomEmail);}
```

## 🏗️ Running Tests

To run the tests in Java, use the `test` command by clicking the **m** button (top right, under Lifecycle). If the `test` command fails, try running `clean`, `validate`, `compile`, and `test` in sequence for a smooth workflow. 

## 📊 Generating Reports with Allure

After tests are executed, generate a report using **allure:report** and **allure:serve** commands found under **Plugins** > **allure**. 🗂️

- `allure:report` generates a detailed report based on the executed tests.
- `allure:serve` displays the generated report in a user-friendly format. 

<h1 align="center">Enjoy! ✨
