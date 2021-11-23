package automationjunit.ventanas;

import automationjunit.utilidades.Constantes;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebaVentanas {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    @Test
    public void pruebaVentana() {
        driver.manage().window().maximize();
        driver.get(Constantes.URL_PRUEBA_VENTANAS);
        String ventanaInicial = driver.getWindowHandle();
        System.out.println("ID ventana: " + ventanaInicial);
        System.out.println("Titulo ventana: " + driver.getTitle());
        driver.findElement(By.xpath("//a/button[@class='btn btn-info']")).click();
        for(String manipuladorVentna : driver.getWindowHandles()){
            if(!ventanaInicial.contentEquals(manipuladorVentna)){
                System.out.println("ID ventana: " + manipuladorVentna);
                driver.switchTo().window(manipuladorVentna);
                break;
            }
        }
        System.out.println("Titulo Ventana 2: " + driver.getTitle());
        driver.close();
        driver.switchTo().window(ventanaInicial);
        System.out.println("Titulo Ventana 1: " + driver.getTitle());
        Assert.assertEquals("Automation Demo Site",driver.findElement(By.tagName("h1")).getText());

    }
    @After
    public void close(){
        driver.quit();
    }
}
