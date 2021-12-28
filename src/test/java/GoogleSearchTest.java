import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTest {

    @Test
    public void searchText(){

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        //class driver
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        WebElement inputField = driver.findElement(By.name("q"));
        inputField.sendKeys("Belajar Selenium");
        inputField.submit();

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        String title = driver.getTitle();

        Assert.assertNotNull(title);

        System.out.println("Ini title " + title);

    }

}
