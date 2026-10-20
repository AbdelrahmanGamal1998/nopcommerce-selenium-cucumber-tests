package nopcommerce.pages;

import nopcommerce.steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P8_links {

    public WebElement pressFB(){
        return Hooks.driver.findElement(By.linkText("Facebook"));
    }

    public WebElement pressTwiiter(){
        return Hooks.driver.findElement(By.linkText("Twitter"));
    }

    public WebElement pressRSS(){
        return Hooks.driver.findElement(By.linkText("RSS"));
    }

    public WebElement youtube(){
        return Hooks.driver.findElement(By.linkText("YouTube"));
    }

}
