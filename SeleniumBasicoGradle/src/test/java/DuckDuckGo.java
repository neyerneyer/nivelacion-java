import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuckDuckGo {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://duckduckgo.com/");
        WebElement searchTextBox = driver.findElement(By.id("search_form_input_homepage"));

        String tipoValor = searchTextBox.getAttribute("type");
        System.out.println("Valor de tipo atributo: " + tipoValor);

        String autoCompletarValor = searchTextBox.getAttribute("autocomplete");
        System.out.println("Valor del atributo de auto completado: " + autoCompletarValor);

        String placeholder = searchTextBox.getAttribute("placeholder");
        System.out.println("Valor del atributo de placeholder: " + placeholder);

        String noExiste = searchTextBox.getAttribute("nonExistingAttribute");
        System.out.println("Valor no existente: " + noExiste);
    }
}

