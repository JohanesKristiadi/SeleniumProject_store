package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.And;

public class addToCart {
    WebDriver driver = Hooks.driver;
    @And("I Click product1")
    public void iClickProduct1() {
    	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        
    }
    @And("I Click product2")
    public void iClickProduct2() {
    	driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
        
    }
    @And("I Click product3")
    public void iClickProduct3() {
    	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
        
    }
    @And("I Click product4")
    public void iClickProduct4() {
    	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
        
    }
   
}
