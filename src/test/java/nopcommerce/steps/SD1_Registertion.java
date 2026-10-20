package nopcommerce.steps;

import nopcommerce.pages.P1_Registertion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import org.testng.asserts.SoftAssert;

import java.util.List;



public class SD1_Registertion {
    P1_Registertion reg = new P1_Registertion();
    SoftAssert softAssert = new SoftAssert();

    @Given("user will go to the registration page")
    public void navigates_to_register_page() {
        reg.press_register().click();
    }

    @When("user chooses male from sex selection bar")
    public void sex_selection() {
        reg.sex().click();
    }

    @And("user enters his/her FirstName\"(.*)\"$")
    public void enter_firstname(String firstName) {
        reg.enter_firstname().clear();
        reg.enter_firstname().sendKeys(firstName);
    }

    @And("user enters his/her LastName\"(.*)\"$")
    public void enter_lastname(String lastName) {
        reg.enter_lastname().clear();
        reg.enter_lastname().sendKeys(lastName);
    }

    @And("user enters his/her Date of Birth \"(.*)\" , \"(.*)\" , \"(.*)\"$")
    public void dateofbirth_selection(String day, String month, String year) {
        reg.choose_Day().selectByVisibleText(day);
        reg.choose_Month().selectByVisibleText(month);
        reg.choose_Year().selectByVisibleText(year);
    }

    @And("user enters his/her Email account \"(.*)\"$")
    public void enter_email_account(String email) {
        reg.getEmail().clear();
        reg.getEmail().sendKeys(TestUser.email(email));
    }

    @And("user enters his/her Company Name \"(.*)\"$")
    public void enter_yourcompanyname(String companyName) {
        reg.getCompanyName().clear();
        reg.getCompanyName().sendKeys(companyName);
    }

    @And("user enters his/her Password for his account \"(.*)\"$")
    public void enter_your_password(String password) {
        reg.getPassword().clear();
        reg.getPassword().sendKeys(password);
    }

    @And("user enters Confirm Password \"(.*)\"$")
    public void confirmation_password(String confirmPassword) {
        reg.getConfirmPassword().clear();
        reg.getConfirmPassword().sendKeys(confirmPassword);
    }

    @And("user will click on registertion button at the end of page")
    public void clickRegisterBtn() throws InterruptedException {
        Thread.sleep(3000);
        reg.detect_PressRegisterBtn().click();
    }

    @Then("user is registered on system")
    public void registration_user() throws InterruptedException {
        List<WebElement> webElements = reg.registrationMessage();
        softAssert.assertTrue(webElements.get(0).getText().equalsIgnoreCase("Your registration completed"),
                "Registration Complete");
        System.out.println(webElements.get(0).getCssValue("color"));
        softAssert.assertTrue(webElements.get(0).getCssValue("color").equals(("rgba(76, 177, 124, 1)")),"Color is green");
        softAssert.assertAll();
        Thread.sleep(3000);
        webElements.get(1).click();
    }

}
