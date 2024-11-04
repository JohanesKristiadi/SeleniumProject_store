package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.And;

public class checkout {
    WebDriver driver = Hooks.driver;
    
    @And("I click Shopping cart")
    public void iClickShoppingCart() {
    	driver.findElement(By.id("shopping_cart_container")).click();
        
    }
    @And("I click checkout button")
    public void iClickCheckoutButton() {
    	driver.findElement(By.id("checkout")).click();
    }
    @And("I input firstname {string}")
    public void iInputFirstname(String firstName) {
    	driver.findElement(By.id("first-name")).sendKeys(firstName);
        
    }
    @And("I input lastname {string}")
    public void iInputLastname(String lastName) {
    	driver.findElement(By.id("last-name")).sendKeys(lastName);
        
    }
    @And("I input zipcode {string}")
    public void iInputZipcode(String zipCode) {
    	driver.findElement(By.id("postal-code")).sendKeys(zipCode);
        
    }
    @And("I click continue button")
    public void iClickContinueButton() {
    	driver.findElement(By.id("continue")).click();
        
    }
    @And("I click button finish")
    public void iClickButtonFinish() {
    	driver.findElement(By.id("finish")).click();
        
    }
}
