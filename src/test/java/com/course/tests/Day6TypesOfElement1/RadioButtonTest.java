package com.course.tests.Day6TypesOfElement1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {
    @Test
    public void radioButtonTest1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.cydeo.com/radio_buttons");
        WebElement yellowButton=driver.findElement(By.id("yellow"));
        yellowButton.click();
        Assert.assertTrue(yellowButton.isSelected());
        WebElement blueElement=driver.findElement(By.id("blue"));
        Assert.assertFalse(blueElement.isSelected());
        WebElement blackButton=driver.findElement(By.id("black"));
        blackButton.click();
        Assert.assertTrue(blackButton.isSelected());
        Assert.assertFalse(yellowButton.isSelected());
    }

}
