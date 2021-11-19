package accionesraton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Release {
    //Este método suelta el boton izquierdo del ratón.
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            //Abrir la URL
            driver.navigate().to("https://crossbrowsertesting.github.io/drag-and-drop");
            //Guardamos el elemento de origen
            WebElement drag = driver.findElement(By.id("draggable"));
            //Guardamos el elemento de destino
            WebElement drop = driver.findElement(By.id("droppable"));
            Actions actionProvider = new Actions(driver);
            actionProvider.clickAndHold(drag).moveToElement(drop).build().perform();
            //Realizamos la accion release
            actionProvider.release().build().perform();
        }finally {
            //driver.quit();
        }
    }
}
