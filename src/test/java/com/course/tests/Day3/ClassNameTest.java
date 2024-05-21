package com.course.tests.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("nav-link")).click();
        String actualText=driver.findElement(By.className("h2")).getText();

        String expectedText="Available Examples";
        if (actualText.equals(expectedText)){
        System.out.println("test passed");

        }else{
        System.out.println("test failed");


    }
        driver.quit();
}}

