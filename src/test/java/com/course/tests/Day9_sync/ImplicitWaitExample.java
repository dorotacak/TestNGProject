package com.course.tests.Day9_sync;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitExample {
    @Test
    public void Test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dynamic_loading/4");
        String actualMessage=driver.findElement(By.xpath("//h4[.='Hello World!']")).getText();//chce ten tekst wiec get text
        //pokazuje obecna informacje na www jako string, bo to jest tekst
        String expectedMessage="Hello World!";//TO JEST NA Www, to ma być na www, tak mam w wytycznych z firmy
        Assert.assertEquals(actualMessage,expectedMessage);//sprawdzam czy obenie to co na www i to co chcemy jest sobie rowne





    }
}