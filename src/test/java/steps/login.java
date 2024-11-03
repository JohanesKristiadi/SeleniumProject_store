package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class login {
	
	WebDriver driver;
	
	@Given("i navigate to web")
	public void iNavigateToWeb() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

}
