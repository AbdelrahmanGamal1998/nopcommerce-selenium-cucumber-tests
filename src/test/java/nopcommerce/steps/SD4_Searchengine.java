package nopcommerce.steps;

import nopcommerce.pages.P4_Searchengine;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SD4_Searchengine {
    P4_Searchengine search = new P4_Searchengine();
    JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
    SoftAssert softAssert = new SoftAssert();

    @Given("user search by name \"(.*)\"$")
    public void searchProductId(String productName) {
        search.getSearchingBar().sendKeys(productName);
    }

    @Given("user search by id\"(.*)\"$")
    public void searchSerial(String serialNumber) {
        search.getSearchingBar().sendKeys(serialNumber);
    }

    @When("user press on search")
    public void pressSearch() {
        search.getSearchButton().click();
    }

    @Then("user checks results")
    public void goToResults() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> webElements = search.getSearchResults();
        int numberOfFoundItems = search.getSearchResults().size();
        System.out.println("Number Of Items Found: " + numberOfFoundItems);

        // To Scroll to element until it's viewed in page
        js.executeScript("arguments[0].scrollIntoView();", webElements.get(0));

        Thread.sleep(2000);

        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("search"));
        softAssert.assertTrue(numberOfFoundItems > 0, "Items have been found");
        softAssert.assertAll();


    }
}
