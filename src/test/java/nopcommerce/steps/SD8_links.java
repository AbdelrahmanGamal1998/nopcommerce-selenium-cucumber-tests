package nopcommerce.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nopcommerce.pages.P8_links;
import org.testng.Assert;

import java.util.ArrayList;

public class SD8_links {

    P8_links followUs = new P8_links();
    ArrayList<String> tabs = null;

    @When("choose facebook")
    public void choosefb() throws InterruptedException {
        Thread.sleep(2000);
        followUs.pressFB().click();
        Thread.sleep(2000);
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("user go to our website fb")
    public void goToFB() throws InterruptedException {
        System.out.println("Number of tabs opened: " + tabs.size());
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce","Navigated to facebook");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
    }

    @When("user choose twitter")
    public void pressTwitter() throws InterruptedException {
        Thread.sleep(2000);
        followUs.pressTwiiter().click();
        Thread.sleep(2000);
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("user go to twitter account")
    public void goToTwitter() throws InterruptedException {
        System.out.println("Number of tabs opened: " + tabs.size());
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce","Navigated to twitter");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
    }

    @When("press on rss")
    public void pressRSS() throws InterruptedException {
        Thread.sleep(2000);
        followUs.pressRSS().click();
        Thread.sleep(2000);
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("user go to RSS Page")
    public void goToRssPage() throws InterruptedException {
        System.out.println("Number of tabs opened: " + tabs.size());
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open","Navigated to rss");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
    }

    @When("user go to YT")
    public void pressYouTube() throws InterruptedException {
        Thread.sleep(2000);
        followUs.youtube().click();
        Thread.sleep(2000);
        tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("user go to youtube page")
    public void goToYoutubePage() throws InterruptedException {
        System.out.println("Number of tabs opened: " + tabs.size());
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce","Navigated to youtube");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
        Thread.sleep(2000);
    }

}
