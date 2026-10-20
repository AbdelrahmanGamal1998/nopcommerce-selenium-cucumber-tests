package nopcommerce.pages;

import nopcommerce.steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P7_Slide_bar {

    public WebElement pressFSquree(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]"));
    }

    public WebElement pressSSquree(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]"));
    }

    public WebElement slider(){
        return Hooks.driver.findElement(By.id("nivo-slider"));
    }

}
