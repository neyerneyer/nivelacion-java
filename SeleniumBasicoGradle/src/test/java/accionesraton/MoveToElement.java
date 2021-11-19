package accionesraton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
    //Este método mueve el raton en medio del elemento dado.
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            //Navegar a la url
            driver.navigate().to("http://www.uitestpractice.com/Students/Actions");
            WebElement element = driver.findElement(By.name("one"));
            Actions actions = new Actions(driver);
            //Realizar la acción de mover al elemento
            actions.moveToElement(element).build().perform();
            actions.contextClick().build().perform();
        }finally {
            //driver.quit();
        }
    }
}
