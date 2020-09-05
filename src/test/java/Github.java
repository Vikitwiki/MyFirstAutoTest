import org.junit.Assert;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github {
    public static WebDriver driver;

    @Test
    public void CreateRepository () throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
     driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get ("https://github.com/login");
     driver.findElement(By.xpath("*//*[@id=\"login_field\"]")).sendKeys("sandrogailoviktoria@gmail.com");
     driver.findElement(By.xpath("*//*[@id=\"password\"]")).sendKeys("536798CDcd");
     driver.findElement(By.xpath("*//*[@id=\"login\"]/form/div[4]/input[9]")).click();

     driver.findElement(By.xpath("*//*[@id=\"repos-container\"]/h2/a")).click();
     driver.findElement(By.xpath("*//*[@id=\"repository_name\"]")).sendKeys("MyFirstAutoTest2");
     Thread.sleep(5880);

     driver.findElement(By.xpath("//*[contains(text(), 'Create repository')]")).click();

     Thread.sleep(5880);
     WebElement Petya = driver.findElement(By.xpath("//a[contains(text(), 'MyFirstAutoTest2')]"));
        Assert.assertEquals(true, Petya.isDisplayed());

        driver.quit();
    }
}
