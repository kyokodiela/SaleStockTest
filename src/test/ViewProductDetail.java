package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ViewProductDetail {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("search_query_top")).sendKeys("Blouse");
        driver.findElement(By.xpath("//div[@class='button lnk_view btn btn-default']/div")).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.close();
    }
}
