package nopcommerce.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nopcommerce.pages.P9_futurelist;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SD9_futurelist {

    P9_futurelist wishList = new P9_futurelist();
    SoftAssert softAssert = new SoftAssert();

    @When("user like product")
    public void heartShape() throws InterruptedException {
        wishList.like().click();
        Thread.sleep(3000);
    }

    @Then("product added")
    public void add() {
        softAssert.assertEquals(wishList.add().getText(), "The product has been added to your wishlist",
                "Product added to your wishlist");
        System.out.println("Color: " + wishList.add().getCssValue("background-color"));
        softAssert.assertEquals(wishList.add().getCssValue("background-color"), "rgba(75, 176, 122, 1)",
                "Background color is green");
        softAssert.assertAll();
    }

    @When("product added message")
    public void exitMessage() throws InterruptedException {
        wishList.exitMessageBox().click();
        Thread.sleep(2000);
    }

    @And("user clicks on wishlist tab")
    public void selectWhishList() throws InterruptedException {
        wishList.wishListarea().click();
        Thread.sleep(2000);
    }

    @Then("user checks wishlist")
    public void amount() {
        int quantity = Integer.parseInt(wishList.wishlistamount().getAttribute("value"));
        System.out.println("Quantity: " + quantity);
        Assert.assertTrue(quantity > 0,"Item added to wishlist");
    }

}
