package automationjunit.alertas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static automationjunit.utilidades.Constantes.*;
import static org.junit.Assert.assertEquals;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;


public class PruebasAlertas {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    @Test
    public void alertaConOk() {
        driver.manage().window().maximize();
        driver.get(URL_PRUEBA_ALERTAS);
        driver.findElement(By.cssSelector(BTN_ALERTA_CON_OK)).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(alertIsPresent());
        Alert alert = driver.switchTo().alert();
        assertEquals("I am an alert box!", alert.getText());
        alert.accept();
        assertEquals("Automation Demo Site", driver.findElement(By.tagName("h1")).getText());
    }

    @Test
    public void alertaConCancelaryOK() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(URL_PRUEBA_ALERTAS);
        driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary' and @onclick='confirmbox()']")).click();
        wait.until(alertIsPresent());
        Alert alerta = driver.switchTo().alert();
        assertEquals("Press a Button !", alerta.getText());
        alerta.dismiss();
        assertEquals("You Pressed Cancel", driver.findElement(By.id("demo")).getText());
        driver.findElement(By.xpath("//button[@class='btn btn-primary' and @onclick='confirmbox()']")).click();
        wait.until(alertIsPresent());
        alerta.accept();
        assertEquals("You pressed Ok", driver.findElement(By.id("demo")).getText());
        assertEquals("Automation Demo Site", driver.findElement(By.xpath("//h1")).getText());
    }
    @Test
    public void alertaConTextbox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get(URL_PRUEBA_ALERTAS);
        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info' and @onclick='promptbox()']")).click();
        wait.until(alertIsPresent());
        Alert alerta = driver.switchTo().alert();
        assertEquals("Please enter your name", alerta.getText());
        alerta.sendKeys(VALOR_USUARIO);
        alerta.accept();
        assertEquals("Hello "+VALOR_USUARIO+" How are you today", driver.findElement(By.id("demo1")).getText());
        assertEquals("Automation Demo Site", driver.findElement(By.xpath("//h1")).getText());

    }
    @After
    public void cerrarDriver() {
        driver.quit();
    }
}

