package accionesraton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            //Navegar a la URL
            driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
            WebElement number = driver.findElement(By.name("C"));
            Actions actions = new Actions(driver);
            actions.clickAndHold(number).perform();
            actions.moveToElement(number, -100, -20);
            actions.moveToElement(number).build().perform();
        } finally {
            driver.quit();
        }
    }
}
