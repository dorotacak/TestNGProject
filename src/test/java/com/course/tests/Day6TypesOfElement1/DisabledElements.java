package com.course.tests.Day6TypesOfElement1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElements {
    @Test
    public void Test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.cydeo.com/radio_buttons");
        WebElement greenButton= driver.findElement(By.id("green"));
        Assert.assertFalse(greenButton.isEnabled());

    }
    @Test
    public void Test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        WebElement femaleButton= driver.findElement(By.xpath("//input[@value='Female']"));
        femaleButton.click();
        Assert.assertTrue(femaleButton.isSelected());
        WebElement getCheckedValue= driver.findElement(By.xpath("//*[text()='Get Checked value']"));
        getCheckedValue.click();
        String actualMessage= driver.findElement(By.xpath("//*[@class='radiobutton']")).getText();
        Assert.assertEquals(actualMessage,"Radio button 'Female' is checked");

    }
}
