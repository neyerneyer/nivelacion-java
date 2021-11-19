package accionesraton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {
    //El metodo dragAndDropBy realiza un click sostenido en un elemento de origen, mueve ratón a una ubicación dada
    // y luego suelta el raton
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
            //Obtenemos la coordenada en X del elemento de destino
            int getX = drop.getLocation().getX();
            //Obtenemos la coordenada en Y del elemento de destino
            int getY = drop.getLocation().getY();
            System.out.println("Posición en x: " + getX);
            System.out.println("Posición en Y: " + getY);
            Actions actionsProvider = new Actions(driver);
            //Realizamos la acción de dragAndDropBy hacia la ubicación o coordenada de destino
            actionsProvider.dragAndDropBy(drag,getX,getY).build().perform();

        } finally {
             driver.quit();
        }
    }
}
