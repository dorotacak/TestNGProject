package com.course.tests.Day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupsAndAlerts {
    @Test
    public void Test1() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button)[2]")).click();
        Thread.sleep(3000);
        alert.dismiss();
        driver.findElement(By.xpath("(//button)[3]")).click();
        alert.sendKeys("Dorota");
        alert.accept();



    }
}
