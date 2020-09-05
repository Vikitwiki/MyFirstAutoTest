import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_music {
    public static WebDriver driver;
    @Test
    public void CreateRepository () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get ("https://music.i.ua");
        driver.findElement(By.xpath("//*[@id=\"header_overall\"]/div[1]/ul[3]/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/fieldset/p[1]/input")).sendKeys("testirovanie144@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/fieldset/p[2]/input")).sendKeys("testirovanie1991");
        driver.findElement(By.xpath("//*[@id=\"FloatLogin\"]/div/div/form/input[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"styleOptions\"]/li[11]/label/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/div/div[1]/div[2]/div/div[2]/div[3]/span/form/input[7]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[2]/div/div[5]/table/tbody/tr[2]/td[1]/a/span/i")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[6]/div[2]/div/div[5]/table/tbody/tr[2]/td[1]/a/span/i")).click();
 }
}
