package accionesraton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset {
    //El metodo moveByOffset mueve el mouse de suposición actual, hasta un ubicación suministrada
    //Importante: si las cordenada estan por fuera del rango de la pantalla, entonces el mouse o puntero  terminaria por fuera del navegador
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Hacer uso de javaSript para usar acciones
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        try {
            //Navegar a la url
            driver.navigate().to("http://www.uitestpractice.com/Students/Actions");
            WebElement number = driver.findElement(By.name("nine"));
            //Realizar scroll de la pagina hasta el elemento solicitado
            javascriptExecutor.executeScript("arguments[0].scrollIntoView();",number);
            int x = number.getRect().getX();
            int y = number.getRect().getY();
            Actions actionsProvider = new Actions(driver);
            //Realizar scroll de la pagina hasta el elemento solicitado
            javascriptExecutor.executeScript("arguments[0].scrollIntoView();",number);
            actionsProvider.moveByOffset(x, y).contextClick().build().perform();
        } finally {
          //  driver.quit();
        }
    }

}
