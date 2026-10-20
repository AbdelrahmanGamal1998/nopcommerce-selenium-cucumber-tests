package nopcommerce.pages;

import nopcommerce.steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class P5_price {


    public Select priceType(){
        return new Select(Hooks.driver.findElement(By.id("customerCurrency")));
    }

    public List<WebElement> showPrice(){
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }

}
