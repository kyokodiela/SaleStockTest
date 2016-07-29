package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Checkout {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("search_query_top")).sendKeys("Blouse");
        driver.findElement(By.xpath("//div[@class='button lnk_view btn btn-default']/div")).click();
        driver.findElement(By.id("add_to_cart")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[@class='btn btn-default button button-medium']/div")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[@class='button btn btn-default standard-checkout button-medium']/div")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[@class='button btn btn-default button-medium']/div")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.id("uniform-cgv")).click();
        driver.findElement(By.xpath("//div[@class='button btn btn-default standard-checkout button-medium']/div")).click();
        driver.findElement(By.xpath("//div[@class='bankwire']/div")).click();
        driver.findElement(By.xpath("//div[@class='button btn btn-default button-medium']/div")).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.close();
    }
}
