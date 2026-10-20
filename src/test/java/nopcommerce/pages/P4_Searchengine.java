package nopcommerce.pages;

import nopcommerce.steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P4_Searchengine {


    public WebElement getSearchingBar() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement getSearchButton() {
        return Hooks.driver.findElement(By.className("search-box-button"));
    }

    public List<WebElement> getSearchResults() {
        return Hooks.driver.findElements(By.cssSelector("div[class=\"item-grid\"] div[class=\"item-box\"]"));
    }

}
