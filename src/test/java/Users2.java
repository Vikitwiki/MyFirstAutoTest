import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Users2 {
    public static WebDriver driver;

    @Test
    public void CreateRepository() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://users.bugred.ru");
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("sandrogailoviktoria@gmail.com");
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("536798CDCD");
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input")).click();
    }
}



