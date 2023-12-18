package com.course.tests.Day6TypesOfElement1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo {
    @Test
    public void test1() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/checkboxes");
        WebElement checkBox1= driver.findElement(By.id("box1"));
        WebElement checkBox2= driver.findElement(By.id("box2"));
        Assert.assertTrue(checkBox2.isSelected());
        Assert.assertFalse(checkBox1.isSelected());
        checkBox1.click();
        Assert.assertTrue(checkBox1.isSelected());
        Assert.assertTrue(checkBox2.isSelected());

    }
    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        WebElement defaultValue= driver.findElement(By.xpath("(//*[@type='checkbox'])[2]"));
        Assert.assertTrue(defaultValue.isSelected());
        WebElement firstCheckBox= driver.findElement(By.xpath("(//*[@type='checkbox'])[1]"));
        firstCheckBox.click();
        String actualMessage=driver.findElement(By.id("txtAge")).getText();
        String expectedMessage="Success - Check box is checked";
        Assert.assertEquals(actualMessage,expectedMessage);
        WebElement disabledCheckBox= driver.findElement(By.xpath("(//*[@type='checkbox'])[3]"));
        Assert.assertFalse(disabledCheckBox.isEnabled());
    }
}