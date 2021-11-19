package accionesraton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    //Este metodo primero realiza la acción del click sostenido en el elemento de origen, luego lo mueve a la localización
    //del elemento de destino y por ultimo suelta el elemento, es decir, suelta el click.
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
            Actions actionsProvider = new Actions(driver);
            //Realiza el movimiento de mover el elemento desde el origen hacia el destino
            actionsProvider.dragAndDrop(drag,drop).build().perform();


        }finally {
            //driver.quit();
        }
    }
}
