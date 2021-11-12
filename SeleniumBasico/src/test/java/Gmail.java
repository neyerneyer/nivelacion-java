import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Gmail {
    //Realizar la automatización la la pagina de gmail, ingresar un correo invalido y dar click al botón siguiente y
    //mostrar en consola el mensaje No pudimos encontrar tu Cuenta de Google
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get("https://www.gmail.com/mail/help/intl/es/about.html?iframe");
            driver.findElement(By.id("gmail-sign-in")).click();
            driver.findElement(By.id("identifierId")).sendKeys("funezneyer9517");
            driver.findElement(By.xpath("//span[contains(text(),'Siguiente')]")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'No se ha podido encontrar tu cuenta de Google')])[2]")));
            System.out.println(driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div")).getText());

        }finally {
            driver.quit();
        }

    }

}
