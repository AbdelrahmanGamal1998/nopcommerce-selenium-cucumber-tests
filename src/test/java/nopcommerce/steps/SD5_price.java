package nopcommerce.steps;

import nopcommerce.pages.P5_price;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SD5_price {

    P5_price curr = new P5_price();
    JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;

    @Given("user select \"(.*)\" from currency type menu$")
    public void selectCurrency(String currency) {
        curr.priceType().selectByVisibleText(currency);
    }

    @Then("currency type is selected and displayed")
    public void displayCurrency() throws InterruptedException {
        List<WebElement> webElements = curr.showPrice();
        System.out.println("Number of Products on homepage: " + webElements.size());
        js.executeScript("arguments[0].scrollIntoView();", webElements.get(0));
        Thread.sleep(2000);
        for (WebElement webElement : webElements) {
            Assert.assertTrue(webElement.getText().contains("€"));
        }
    }

}
