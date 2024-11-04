package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); // Pindahkan ke sini
        driver = new ChromeDriver();
    }

//    @After
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
//    }
}
