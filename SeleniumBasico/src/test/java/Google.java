import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Google {
    public static void main(String[] args) {
        String key = "webdriver.gecko.driver";
        String valor = "src/test/resources/drivers/geckodriver.exe";
        WebDriver driver;
        System.setProperty(key,valor);
        driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            driver.get("https://google.com/");
            driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
            WebElement primerResultado = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h3")));
            System.out.println(primerResultado.getAttribute("textContent"));
        }finally {
            driver.quit();
        }
    }
}
