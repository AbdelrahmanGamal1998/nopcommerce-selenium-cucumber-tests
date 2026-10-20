package nopcommerce.pages;

import nopcommerce.steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class P1_Registertion {

    Select select;

    public WebElement press_register() {
        return Hooks.driver.findElement(By.linkText("Register"));
    }


    public WebElement sex() {
        return Hooks.driver.findElement(By.id("gender-male"));
    }

    public WebElement enter_firstname() {
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement enter_lastname() {
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public Select choose_Day() {
        select = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        return select;
    }

    public Select choose_Month() {
        select = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        return select;
    }

    public Select choose_Year() {
        select = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        return select;
    }

    public WebElement getEmail() {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement getCompanyName() {
        return Hooks.driver.findElement(By.id("Company"));
    }

    public WebElement getPassword() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement getConfirmPassword() {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement detect_PressRegisterBtn() {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public List<WebElement> registrationMessage() {
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(Hooks.driver.findElement(By.className("result")));
        webElements.add(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")));
        return webElements;
    }


}
