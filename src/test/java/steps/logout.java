package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import hooks.hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class logout {
    WebDriver driver = hooks.driver;

    @Given("I click sidebar")
    public void iClickSidebar() {
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button")).click();
    }

    @And("I click logout button")
    public void iClickLogoutButton() {
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")).click();
    }
}
