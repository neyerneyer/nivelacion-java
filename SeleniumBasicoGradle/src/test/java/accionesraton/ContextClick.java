package accionesraton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            //Navegar a la URL
            driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
            // Guardamos el elemento web (La letra C)
            WebElement number = driver.findElement(By.name("C"));
            //Hacemos uso de las acciones que son interacciones que nos provee selenium
            Actions actionsProvider = new Actions(driver);
            //Realizamos la acción click derecho de nuestro mouse
            actionsProvider.contextClick(number).build().perform();

        }finally {
            driver.quit();
        }
    }
}
