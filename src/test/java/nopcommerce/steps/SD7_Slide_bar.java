package nopcommerce.steps;

import nopcommerce.pages.P7_Slide_bar;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SD7_Slide_bar {

    P7_Slide_bar sliders = new P7_Slide_bar();

    @Given("user choose slider")
    public void pressFSqure() throws InterruptedException {
        sliders.pressFSquree().click();
        Thread.sleep(1000);
    }

    @Given("user choose iphone slider")
    public void pressSSequre() throws InterruptedException {
        sliders.pressSSquree().click();
        Thread.sleep(1000);
    }

    @When("user press in to slider")
    public void pressSlider(){
        sliders.slider().click();
    }

    @Then("user go to nokia age")
    public void goToNokia(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020","Nokia web page");
    }

    @Then("user go to iphone page")
    public void goToIphone(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-8","Iphone web page");
    }

}
