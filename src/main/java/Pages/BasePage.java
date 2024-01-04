package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
    public static WebDriver driver;
    private String BASE_URL = "https://ecommerce-playground.lambdatest.io/index.php?route=common/home";

    public BasePage() {
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

    }
}