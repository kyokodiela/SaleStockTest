package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@class='login']/div")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.id("email")).sendKeys("kyokodiela@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("qwerty");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.close();
    }
}
