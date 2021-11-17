import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Calculator {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        driver.navigate().to("https://testsheepnz.github.io/BasicCalculator.html");
        driver.findElement(By.id("number1Field")).sendKeys("5");
        driver.findElement(By.id("number2Field")).sendKeys("10");
        WebElement selectElement = driver.findElement(By.id("selectOperationDropdown"));
        //selectObject.selectByIndex(3); //Selecionar a través de la pocisión  que se maneja como un vector, es decir, desde la pocisión 0 - n
        // selectObject.selectByValue("multiplicacion"); //Selecciona a través del atributo value, siempre y cuando lo tenga
        //selectObject.selectByVisibleText("Multiply");// Selecciona por el valor del texto
        Select selectObject = new Select(selectElement);
        System.out.println("Operaciones de la calculadora: ");
       // for (int i = 0; i <= 4; i++) {
        int i=0;
        while (i <= 4){
            selectObject.selectByIndex(i);
            driver.findElement(By.id("calculateButton")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("loadEquipment"))));
            System.out.println("La respuesta de la " + selectObject.getOptions().get(i).getAttribute("text") + " es: " + driver.findElement(By.id("numberAnswerField")).getAttribute("value"));
            driver.findElement(By.id("clearButton")).click();
            i++;
        }
        driver.quit();
    }
}