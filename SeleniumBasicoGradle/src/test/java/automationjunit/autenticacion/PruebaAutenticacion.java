package automationjunit.autenticacion;

import automationjunit.utilidades.Utilidades;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static automationjunit.utilidades.Constantes.URL_PRUEBA_PRACTICE;

public class PruebaAutenticacion {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    @Test
    public void autenticacionExitosa(){
        driver.manage().window().maximize();
        driver.get(URL_PRUEBA_PRACTICE);
        driver.findElement(By.id("menu-item-50")).click();
        Utilidades.espera(2);
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("pruebaregistro10@correo.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("Prueba1+.,");
        driver.findElement(By.name("login")).click();
        Assert.assertEquals("Hello pruebaregistro10 (not pruebaregistro10? Sign out)",driver.findElement(By.xpath("(//*[@id='page-36']/div/div[1]/div/p[a])[1]")).getText());
    }
}
