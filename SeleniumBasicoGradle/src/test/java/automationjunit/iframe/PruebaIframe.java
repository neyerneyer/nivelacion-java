package automationjunit.iframe;

import automationjunit.utilidades.Utilidades;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static automationjunit.utilidades.Constantes.URL_PRUEBA_IFRAME;
import static automationjunit.utilidades.Constantes.VALOR_USUARIO;

public class PruebaIframe {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }
/*
    @Test
    public void switchToIframe() {
        driver.manage().window().maximize();
        driver.get(URL_PRUEBA_IFRAME);
        driver.switchTo().frame("singleframe");
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys(VALOR_USUARIO);
        driver.switchTo().defaultContent();
        Assert.assertEquals("Automation Demo Site", driver.findElement(By.tagName("h1")).getText());
    }*/
    @Test
    public void ingresarADosIframe(){
        driver.manage().window().maximize();
        driver.get(URL_PRUEBA_IFRAME);
        driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
        WebElement iframe1 = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[2]/iframe"));
      //  if (iframe1.isDisplayed()){
            driver.switchTo().frame(1);
      //  }
        Utilidades.espera(1);
        WebElement iframe2 = driver.findElement(By.tagName("iframe"));
        if (iframe1.isDisplayed()){
            driver.switchTo().frame(iframe2);
        }
        Utilidades.espera(1);
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys(VALOR_USUARIO);

        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        Assert.assertEquals("Automation Demo Site", driver.findElement(By.tagName("h1")).getText());



    }
}
