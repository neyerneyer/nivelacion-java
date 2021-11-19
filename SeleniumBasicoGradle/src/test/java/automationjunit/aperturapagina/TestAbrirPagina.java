package automationjunit.aperturapagina;

import automationjunit.utilidades.Constantes;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAbrirPagina {
    public static WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    @Test
    public void abrirPagina(){
        driver.manage().window().maximize();
        driver.get(Constantes.URL_PRUEBA_PRACTICE);
    }

    @After
    public void close(){
        driver.quit();
    }
}