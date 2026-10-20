package nopcommerce.pages;

import nopcommerce.steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class P2_Login_to_website {

    public WebElement pressLogin() {
        return Hooks.driver.findElement(By.linkText("Log in"));
    }

    public List<WebElement> typeInsideLoginDate() {
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(Hooks.driver.findElement(By.name("Email")));
        webElements.add(Hooks.driver.findElement(By.name("Password")));
        return webElements;
    }

    public WebElement getLoginButtonPressed() {
        return Hooks.driver.findElement(By.className("login-button"));
    }

    public WebElement getloginMessageText() {
        return Hooks.driver.findElement(By.linkText("My account"));
    }

    public WebElement getfailLoginMessageText() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
    }


}
