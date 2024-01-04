package TestCases;

import Pages.BasePage;
import Pages.RegisterAccountPage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterAccountTests extends BasePage {
    private RegisterAccountPage registerAccountPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        registerAccountPage = new RegisterAccountPage(driver);
    }

    //================================================================================================================
    @Description("Complete The Fields To Register An Account With Valid Information.")
    @Test(priority = 1)
    public void completeTheFieldsToRegisterAnAccountWithValidInfo() {
        registerAccountPage.moveCursorArrowToMyAccountButton();
        registerAccountPage.clickOnMyAccountLoginButton();
        registerAccountPage.clickOnNewCustomerButton();

        registerAccountPage.enterInTheFirstNameTextField("Popescu");
        registerAccountPage.enterInTheLastNameTextField("Aurel");
        registerAccountPage.enterInEmailTextField();
        registerAccountPage.enterInTelephoneTextField("492929292");
        registerAccountPage.enterInPasswordTextField("1234");
        registerAccountPage.enterInPasswordConfirmTextField("1234");
        registerAccountPage.clickOnYesRadioButton();
        registerAccountPage.clickOnPrivacyPolicyBootStrapModal();
        registerAccountPage.exitThePrivacyPolicyBootstrap();
        registerAccountPage.clickOnAgreeCheckBox();
        registerAccountPage.clickOnContinueRegistrationButton();
        registerAccountPage.clickOnContinueConfirmedRegistrationButtonTwo();

        String actualResult =driver.findElement(By.cssSelector("#content > div:nth-child(1) > h2")).getText();
        Assert.assertEquals(actualResult, "My Account");
    }

    @Description("Complete The Fields With Valid Information But Do Not Check The 'Privacy Policy' And See The Warning.")
    @Test(priority = 2)
    public void completeFieldsAndDoNotCheckPrivacyPolicy() {
        registerAccountPage.moveCursorArrowToMyAccountButton();
        registerAccountPage.clickOnMyAccountLoginButton();
        registerAccountPage.clickOnNewCustomerButton();
        registerAccountPage.enterInTheFirstNameTextField("Popescu");
        registerAccountPage.enterInTheLastNameTextField("Aurel");
        registerAccountPage.enterInEmailTextField();
        registerAccountPage.enterInTelephoneTextField("492929292");
        registerAccountPage.enterInPasswordTextField("12345");
        registerAccountPage.enterInPasswordConfirmTextField("12345");
        registerAccountPage.clickOnYesRadioButton();
        registerAccountPage.clickOnPrivacyPolicyBootStrapModal();
        registerAccountPage.exitThePrivacyPolicyBootstrap();
        registerAccountPage.clickOnContinueRegistrationButton();

        String actualResult = driver.findElement(By.cssSelector("#account-register > div.alert.alert-danger.alert-dismissible")).getText();
        Assert.assertEquals(actualResult, "Warning: You must agree to the Privacy Policy!");
    }

    @Description("Do Not Complete The Fields And Click On 'Continue' Button To Verify The Fields Warnings")
    @Test(priority = 3)
    public void doNotCompleteFieldsAndClickContinueButton() {
        registerAccountPage.moveCursorArrowToMyAccountButton();
        registerAccountPage.clickOnMyAccountLoginButton();
        registerAccountPage.clickOnNewCustomerButton();

        registerAccountPage.clickOnContinueRegistrationButton();

        String actualResult1 = driver.findElement(By.cssSelector("#account > div:nth-child(3) > div > div")).getText();
        String actualResult2 = driver.findElement(By.cssSelector("#account > div:nth-child(4) > div > div")).getText();
        String actualResult3 = driver.findElement(By.cssSelector("#account > div:nth-child(5) > div > div")).getText();
        String actualResult4 = driver.findElement(By.cssSelector("#account > div:nth-child(6) > div > div")).getText();
        String actualResult5 = driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(2) > div:nth-child(2) > div > div")).getText();

        Assert.assertEquals(actualResult1, "First Name must be between 1 and 32 characters!");
        Assert.assertEquals(actualResult2, "Last Name must be between 1 and 32 characters!");
        Assert.assertEquals(actualResult3, "E-Mail Address does not appear to be valid!");
        Assert.assertEquals(actualResult4, "Telephone must be between 3 and 32 characters!");
        Assert.assertEquals(actualResult5, "Password must be between 4 and 20 characters!");
    }
}