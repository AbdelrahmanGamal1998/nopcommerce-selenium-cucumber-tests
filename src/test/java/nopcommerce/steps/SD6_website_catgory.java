package nopcommerce.steps;

import nopcommerce.pages.P6_website_catgory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SD6_website_catgory {

    P6_website_catgory categories = new P6_website_catgory();
    Actions actions = new Actions(Hooks.driver);
    String subCategoryName;

    @Given("user choose categories")
    public void chooseCategory() throws InterruptedException {
        actions.moveToElement(categories.chooseCategory()).perform();
        Thread.sleep(3000);
    }

    @When("user choose sub-category")
    public void selectSubCategory(){
        subCategoryName = categories.chooseSub().getText();
        categories.chooseSub().click();
    }

    @Then("user choose to go to Desktop sub-category")
    public void goToSubCategoryPage(){
        System.out.println("Title: " + categories.goToSubCategoryPage().getText());
        System.out.println("subCategoryName : " + subCategoryName);
        Assert.assertEquals(categories.goToSubCategoryPage().getText(),subCategoryName,"Desktop title displayed");
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains(subCategoryName.toLowerCase().trim()),"URL contains desktops");
    }

}
