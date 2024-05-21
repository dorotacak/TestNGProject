package com.course.tests.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextAndPartialLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger")).click();
        driver.navigate().back();
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("Example 4")).click();



    }
}
