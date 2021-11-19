package accionesraton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    //Mover el raton al elemento y realizar un doble click al elemento solicitado
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            //abrir URL
            driver.get("http://demo.guru99.com/test/simple_context_menu.html");
            //Almacenar elemento web en una variable de tipo webElement
            WebElement button = driver.findElement(By.tagName("button"));
            //Instanciar las acciones de selenium
            Actions actionsProvider = new Actions(driver);
            //Realizar la acción de doble click
            actionsProvider.doubleClick(button).build().perform();
        } finally {
            //Cerrar el driver
            driver.quit();
        }
    }
}