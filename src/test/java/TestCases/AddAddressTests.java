package TestCases;

import Pages.AddAddressPage;
import Pages.BasePage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddAddressTests extends BasePage {
    private AddAddressPage addAddressPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        addAddressPage = new AddAddressPage(driver);
    }

    @Description("Create Three New Address From Modify Your Address Book Entries")
    @Test(priority = 1)
    public void createMultipleAddresses() {
        addAddressPage.moveCursorArrowToMyAccountButton();
        addAddressPage.clickOnMyAccountLoginButton();

        addAddressPage.typeInEmailAddressRegisterCustomerField("amira.nicolas@hotmail.com"); //Change The E-mail If The Test Fails
        addAddressPage.typeInPasswordRegisterCustomerField("1234"); //Change Password If Test Fails
        addAddressPage.clickOnLoginRegisterCustomerButton();
        addAddressPage.clickOnModifyYourAddressBookEntries();
        addAddressPage.clickOnNewAddressBookEntriesButton();

        addAddressPage.typeInFirstNameFromAddAddressBookEntriesField("Dragos");
        addAddressPage.typeInLastNameFromAddAddressBookEntriesField("Pop");
        addAddressPage.typeInCompanyFromAddAddressBookEntriesField("FictivCompany3");
        addAddressPage.typeInFirstAddressFromAddAddressBookEntriesField("Str. Fictiv3");
        addAddressPage.typeInSecondAddressFromAddAddressBookEntriesField("Ap. 53, Bl. 33");
        addAddressPage.typeInCityFromAddAddressBookEntriesField("FictivCityUp1");
        addAddressPage.typeInPostCodeFromAddAddressBookEntriesField("776565");
        addAddressPage.selectCountryFromAddAddressBookEntriesField();
        addAddressPage.clickOnBoliviaOptionFromCountryDropDown();
        addAddressPage.selectCountryFromAddAddressBookEntriesField();
        addAddressPage.selectCountryFromAddAddressBookEntriesField();
        addAddressPage.selectRegionFromAddAddressBookEntriesField();
        addAddressPage.clickOnPotosiOptionFromRegionDropDown();
        addAddressPage.clickOnContinueButtonFromAddAddress();

        addAddressPage.clickOnNewAddressBookEntriesButton();
        addAddressPage.typeInFirstNameFromAddAddressBookEntriesField("Anastasia");
        addAddressPage.typeInLastNameFromAddAddressBookEntriesField("Pop");
        addAddressPage.typeInCompanyFromAddAddressBookEntriesField("FictivCompany4");
        addAddressPage.typeInFirstAddressFromAddAddressBookEntriesField("Str. Fictiv4");
        addAddressPage.typeInSecondAddressFromAddAddressBookEntriesField("Ap. 98, Bl. 22");
        addAddressPage.typeInCityFromAddAddressBookEntriesField("FictivCityUp4");
        addAddressPage.typeInPostCodeFromAddAddressBookEntriesField("114887");
        addAddressPage.selectCountryFromAddAddressBookEntriesField();
        addAddressPage.clickOnZimbabweOptionFromCountryDropDown();
        addAddressPage.selectCountryFromAddAddressBookEntriesField();
        addAddressPage.selectCountryFromAddAddressBookEntriesField();
        addAddressPage.selectRegionFromAddAddressBookEntriesField();
        addAddressPage.clickOnHarareOptionFromRegionDropDown();
        addAddressPage.clickOnContinueButtonFromAddAddress();

        addAddressPage.clickOnNewAddressBookEntriesButton();
        addAddressPage.typeInFirstNameFromAddAddressBookEntriesField("Grace");
        addAddressPage.typeInLastNameFromAddAddressBookEntriesField("Pop");
        addAddressPage.typeInCompanyFromAddAddressBookEntriesField("FictivCompany5");
        addAddressPage.typeInFirstAddressFromAddAddressBookEntriesField("Str. Fictiv5");
        addAddressPage.typeInSecondAddressFromAddAddressBookEntriesField("Ap. 88, Bl. 31");
        addAddressPage.typeInCityFromAddAddressBookEntriesField("FictivCityUp5");
        addAddressPage.typeInPostCodeFromAddAddressBookEntriesField("293887");
        addAddressPage.selectCountryFromAddAddressBookEntriesField();
        addAddressPage.clickOnIcelandOptionFromCountryDropDown();
        addAddressPage.selectCountryFromAddAddressBookEntriesField();
        addAddressPage.selectCountryFromAddAddressBookEntriesField();
        addAddressPage.selectRegionFromAddAddressBookEntriesField();
        addAddressPage.clickOnAusturlandOptionFromRegionDropDown();
        addAddressPage.clickOnContinueButtonFromAddAddress();

        String actualResult = driver.findElement(By.cssSelector("[class=\"alert alert-success alert-dismissible\"]")).getText();
        Assert.assertEquals(actualResult, "Your address has been successfully added");
    }
    @Description("Delete Two Addresses Created And Keep Just The Default Addresses One And Non Default One")
    @Test(priority = 2)
    public void deleteTwoCreatedAddresses() {
        addAddressPage.moveCursorArrowToMyAccountButton();
        addAddressPage.clickOnMyAccountLoginButton();

        addAddressPage.typeInEmailAddressRegisterCustomerField("amira.nicolas@hotmail.com"); //Change The E-mail If The Test Fails
        addAddressPage.typeInPasswordRegisterCustomerField("1234"); //Change Password If Test Fails
        addAddressPage.clickOnLoginRegisterCustomerButton();
        addAddressPage.clickOnModifyYourAddressBookEntries();

        addAddressPage.clickOnDeleteButtonGracePopNonDefaultAddress();
        addAddressPage.clickOnDeleteButtonAnastasiaPopNonDefaultAddress();

        String actualResult = driver.findElement(By.cssSelector("[class=\"alert alert-success alert-dismissible\"]")).getText();
        Assert.assertEquals(actualResult, "Your address has been successfully deleted");
    }

    @Description("Create A New Address From Modify Your Address Book Entries And Edit It")
    @Test(priority = 3)
    public void createANewAddressFromModifyYourAddressBookEntries() {
        addAddressPage.moveCursorArrowToMyAccountButton();
        addAddressPage.clickOnMyAccountLoginButton();

        addAddressPage.typeInEmailAddressRegisterCustomerField("amira.nicolas@hotmail.com"); //Change The E-mail If The Test Fails
        addAddressPage.typeInPasswordRegisterCustomerField("1234"); //Change Password If Test Fails
        addAddressPage.clickOnLoginRegisterCustomerButton();

        addAddressPage.clickOnModifyYourAddressBookEntries();

        addAddressPage.ClickOnEditDragosPopAddressButton();

        addAddressPage.deleteAllCharactersFromTheCompanyField();
        addAddressPage.typeInCompanyFromAddAddressBookEntriesField("FictivCompany112");

        addAddressPage.deleteAllCharactersFromTheFirstAddressField();
        addAddressPage.typeInFirstAddressFromAddAddressBookEntriesField("Str. Fictiv112");

        addAddressPage.deleteAllCharactersFromTheSecondAddressField();
        addAddressPage.typeInSecondAddressFromAddAddressBookEntriesField("Ap. 74, Bl. 151");

        addAddressPage.deleteAllCharactersFromTheCityField();
        addAddressPage.typeInCityFromAddAddressBookEntriesField("FictivCityUp111");

        addAddressPage.deleteAllCharactersFromThePostCodeField();
        addAddressPage.typeInPostCodeFromAddAddressBookEntriesField("911131");

        addAddressPage.clickOnContinueButtonFromAddAddress();

        String actualResult = driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText();
        Assert.assertEquals(actualResult, "Your address has been successfully updated");
    }
    @Description("Delete The Non Default And The Default Address And See The Warning")
    @Test(priority = 4)
    public void deleteTheNonDefaultAndTheDefaultAddressAndSeeTheWarning() {
        addAddressPage.moveCursorArrowToMyAccountButton();
        addAddressPage.clickOnMyAccountLoginButton();

        addAddressPage.typeInEmailAddressRegisterCustomerField("amira.nicolas@hotmail.com"); //Change The E-mail If The Test Fails
        addAddressPage.typeInPasswordRegisterCustomerField("1234"); //Change Password If Test Fails
        addAddressPage.clickOnLoginRegisterCustomerButton();
        addAddressPage.clickOnModifyYourAddressBookEntries();

        addAddressPage.clickOnDeleteButtonDragosPopNonDefaultAddress();
        addAddressPage.clickOnDeleteButtonPopescuIonelDefaultAddress();

        String actualResult = driver.findElement(By.cssSelector("[class=\"alert alert-warning\"]")).getText();
        Assert.assertEquals(actualResult, "Warning: You can not delete your default address!");
    }
}