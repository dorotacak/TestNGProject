package com.course.tests.Day9_sync;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitExample {
    @Test
    public void Test1() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement userName=driver.findElement(By.id("username"));
       wait.until(ExpectedConditions.visibilityOf(userName));
       userName.sendKeys("Dorota");//komenda wpisz tekst

    }
    @Test
    public void Test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/dynamic_controls");
        driver.findElement(By.xpath("(//button)[2]")).click();//komenda chce wejsc w ta strone wiec click
        WebElement inputBox= driver.findElement(By.xpath("(//input)[2]"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));//najpierw tworze object
        wait.until(ExpectedConditions.elementToBeClickable(inputBox));//potem czekam az bedzie clickable
        inputBox.sendKeys("Cakar");



    }
}
