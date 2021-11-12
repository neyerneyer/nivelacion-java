import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("micorreo@choucair.com");
        driver.findElement(By.id("pass")).sendKeys("mipaswordchoucair");
        driver.findElement(By.name("login")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText());
        driver.quit();
    }
}
