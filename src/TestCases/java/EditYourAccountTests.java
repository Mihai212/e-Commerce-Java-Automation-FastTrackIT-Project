import Pages.BasePage;
import Pages.EditYourAccountPage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EditYourAccountTests extends BasePage {
    private EditYourAccountPage editYourAccountPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        editYourAccountPage = new EditYourAccountPage(driver);
    }

    @Description("Verify The Forgotten Password Function")
    @Test(priority = 1)
    public void verifyTheForgottenPasswordFunction() {
        editYourAccountPage.moveCursorArrowToMyAccountButton();
        editYourAccountPage.clickOnMyAccountLoginButton();

        editYourAccountPage.typeInEmailAddressRegisterCustomerField("1mihai@test.com");
        editYourAccountPage.typeInPasswordRegisterCustomerField("1234");
        editYourAccountPage.clickOnForgottenPasswordButtonFromReturningCustomer();

        editYourAccountPage.typeInYourEmailAddressFieldFromForgottenPassword("1mihai@test.com");
        editYourAccountPage.clickOnContinueButtonFromForgottenPassword();

        String actualResult = driver.findElement(By.cssSelector("[class=\"alert alert-success alert-dismissible\"]")).getText();
        Assert.assertEquals(actualResult, "An email with a confirmation link has been sent your email address.");
    }

    @Description("Verify The Warning If You Input A Wrong Password In Returning Customer Password Field")
    @Test(priority = 2)
    public void loginWithAWrongPasswordInReturningCustomer() {
        editYourAccountPage.moveCursorArrowToMyAccountButton();
        editYourAccountPage.clickOnMyAccountLoginButton();

        editYourAccountPage.typeInEmailAddressRegisterCustomerField("1mihai@test.com");
        editYourAccountPage.typeInPasswordRegisterCustomerField("1234");

        editYourAccountPage.clickOnLoginReturningCustomerButton();

        String actualResult = driver.findElement(By.cssSelector("[class=\"alert alert-danger alert-dismissible\"]")).getText();
        Assert.assertEquals(actualResult, "Warning: No match for E-Mail Address and/or Password.");
    }

    @Description("Edit Your Account Information With Another Valid Information")
    @Test(priority = 3)
    public void editUserAccountInfoWithAnotherValidInfo() {
        editYourAccountPage.moveCursorArrowToMyAccountButton();
        editYourAccountPage.clickOnMyAccountLoginButton();

        editYourAccountPage.typeInEmailAddressRegisterCustomerField("1mihai@test.com");
        editYourAccountPage.typeInPasswordRegisterCustomerField("12345");
        editYourAccountPage.clickOnLoginReturningCustomerButton();

        editYourAccountPage.clickOnEditYourAccountInfo();

        editYourAccountPage.deleteAllCharactersFromTheFirstNameFieldFromMyAccountInfo();
        editYourAccountPage.enterInFirstNameFieldFromMyAccountInfo("Popescu");

        editYourAccountPage.deleteAllCharactersFromTheLastNameFieldFromMyAccountInfo();
        editYourAccountPage.enterInTheLastNameFieldFromMyAccountInfo("Cristian-Mihai");

        editYourAccountPage.deleteAllCharactersFromTheEmailFieldFromMyAccountInfo();
        editYourAccountPage.enterInEmailFieldFromTheEmailFieldFromMyAccountInfo("mihai10@test.com");

        editYourAccountPage.deleteAllCharactersFromTheTelephoneFieldFromMyAccountInfo();
        editYourAccountPage.enterInTelephoneFieldFromTheEmailFieldFromMyAccountInfo("999972984");

        editYourAccountPage.clickEditContinueButtonFromMyAccountInfo();

        editYourAccountPage.clickOnEditYourAccountInfo();
        editYourAccountPage.deleteAllCharactersFromTheEmailFieldFromMyAccountInfo(); //I Did This Action For Maintaining The Email Pass
        editYourAccountPage.enterInEmailFieldFromTheEmailFieldFromMyAccountInfo("1mihai@test.com"); //I Did This Action For Maintaining The Email Pass

        editYourAccountPage.clickEditContinueButtonFromMyAccountInfo();

        String actualResult = driver.findElement(By.cssSelector("[class=\"alert alert-success alert-dismissible\"]")).getText();
        Assert.assertEquals(actualResult, "Success: Your account has been successfully updated.");

    }

    @Description("Change Your Password With Another Password")
    @Test(priority = 4)
    public void changeUserPasswordWithAnotherPassword() {
        editYourAccountPage.moveCursorArrowToMyAccountButton();
        editYourAccountPage.clickOnMyAccountLoginButton();

        editYourAccountPage.typeInEmailAddressRegisterCustomerField("1mihai@test.com");
        editYourAccountPage.typeInPasswordRegisterCustomerField("12345");
        editYourAccountPage.clickOnLoginReturningCustomerButton();

        editYourAccountPage.clickChangeYourPassword();
        editYourAccountPage.typeInChangePasswordField("1234");
        editYourAccountPage.typeInConfirmPasswordField("1234");
        editYourAccountPage.clickContinueChangePasswordButton();

        editYourAccountPage.clickChangeYourPassword();
        editYourAccountPage.typeInChangePasswordField("12345"); //I Did This Action For Maintaining The First Pass
        editYourAccountPage.typeInConfirmPasswordField("12345");//I Did This Action For Maintaining The First Pass
        editYourAccountPage.clickContinueChangePasswordButton();

        String actualResult = driver.findElement(By.cssSelector("[class=\"alert alert-success alert-dismissible\"]")).getText();
        Assert.assertEquals(actualResult, "Success: Your password has been successfully updated.");

    }

    @Description("Verify If The Warnings Appear If You Delete Your All Information Account")
    @Test(priority = 5)
    public void deleteAccountInfoAndClickContinueButtonToSeeTheWarnings() {
        editYourAccountPage.moveCursorArrowToMyAccountButton();
        editYourAccountPage.clickOnMyAccountLoginButton();

        editYourAccountPage.typeInEmailAddressRegisterCustomerField("1mihai@test.com"); //Change The E-mail If The Test Fails With The Changed One
        editYourAccountPage.typeInPasswordRegisterCustomerField("12345"); //Change The Password If The Test Fails With The Changed One
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
    }
}
