package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class login {
	WebDriver driver = Hooks.driver;

    @Given("I open website {string}")
    public void iOpenWebsite(String url) {
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @And("I input username {string}")
    public void iInputUsername(String userName) {
        driver.findElement(By.id("user-name")).sendKeys(userName);
    }

    @And("I input password {string}")
    public void iInputPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("I click button login")
    public void iClickButtonLogin() {
        driver.findElement(By.id("login-button")).click();
    }
}
