package com.course.tests.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.cydeo.com/sign_up");
        driver.manage().window().maximize();
        driver.findElement(By.tagName("input")).sendKeys("DorotaTagName");
        driver.findElement(By.name("email")).sendKeys("abc@test.com");
        driver.findElement(By.tagName("button")).click();

    }
}
