package nopcommerce.steps;

import nopcommerce.pages.P2_Login_to_website;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SD2_Login_to_website {

    P2_Login_to_website log = new P2_Login_to_website();
    SoftAssert softAssert = new SoftAssert();

    @Given("user go to login form our website")
    public void navigateToLoginPage() {
        log.pressLogin().click();
    }

    @When("user enters right information \"(.*)\" and \"(.*)\"$")
    public void enterValidDate(String email, String password) {
        List<WebElement> webElements = log.typeInsideLoginDate();
        webElements.get(0).sendKeys(TestUser.email(email));
        webElements.get(1).sendKeys(password);
    }

    @And("user press on login button")
    public void loginButtonPressed() {
        log.getLoginButtonPressed().click();
    }

    @Then("user logins successfully completed")
    public void loginUserAssertion() {
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "Login Successfully");
        softAssert.assertTrue(log.getloginMessageText().isDisplayed());
        softAssert.assertAll();
    }

    @When("user enters wrong information \"(.*)\" and \"(.*)\"$")
    public void LoginWithInvalidInfo(String email, String password) {
        List<WebElement> webElements = log.typeInsideLoginDate();
        webElements.get(0).sendKeys(email);
        webElements.get(1).sendKeys(password);
    }

    @Then("user will not login to system failled login")
    public void loginWithInvalidUser() {
        System.out.println(log.getfailLoginMessageText().getText());
        softAssert.assertEquals(log.getfailLoginMessageText().getText(), "Login was unsuccessful. Please correct the errors and try again.\n" +
                        "No customer account found",
                "Login Failed");
        softAssert.assertTrue(log.getfailLoginMessageText().getCssValue("color").equals("rgba(228, 67, 75, 1)"),
                "Color is red");
        softAssert.assertAll();
    }
}
