package automationjunit.esperas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static automationjunit.utilidades.Constantes.URL_PRUEBA_PRACTICE;

public class TestWait {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    //Espera implicitas
    @Test
    public void esperaImplicita() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(URL_PRUEBA_PRACTICE);
        long esperarSegundos = 10;
        int esperarSegundos2 = 10;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(esperarSegundos));
        driver.manage().timeouts().implicitlyWait(esperarSegundos2, TimeUnit.SECONDS);

        Thread.sleep(esperarSegundos);
        driver.findElement(By.linkText("Shop")).click();
    }

    //Esperas explicitas recomendadas
    @Test
    public void esperaExplicita(){
        driver.manage().window().maximize();
        driver.get(URL_PRUEBA_PRACTICE);
        WebDriverWait espera = new WebDriverWait(driver,Duration.ofSeconds(30));
        espera.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Shop")));
        driver.findElement(By.linkText("Shop")).click();
    }

    //Esperas fluidas recomendas pero más complejas de implementar
    @Test
    public void esperaFluida(){
        driver.manage().window().maximize();
        driver.get(URL_PRUEBA_PRACTICE);
        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .ignoring(Exception.class);
        WebElement linkShop = (WebElement) wait.until((Function<WebDriver,WebElement>) driver -> driver.findElement(By.linkText("Shop")));
        linkShop.click();
    }



    @After
    public void close(){
        driver.quit();
    }
}
