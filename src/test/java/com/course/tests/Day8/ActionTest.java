package com.course.tests.Day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionTest {
    @Test
    public void Test1() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/hovers");
        WebElement Image1 = driver.findElement(By.tagName("img"));
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.moveToElement(Image1).perform();
        WebElement link = driver.findElement(By.linkText("View profile"));
        Assert.assertTrue(link.isDisplayed());
    }

    @Test
    public void Test2() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/hovers");
        WebElement Image2 = driver.findElement(By.xpath("(//img)[2]"));
        Actions actions1 = new Actions(driver);
        Thread.sleep(3000);
        actions1.moveToElement(Image2).perform();
        WebElement text2 = driver.findElement(By.xpath("//*[text()='name: user2']"));
        Assert.assertEquals(text2.getText(), "name: user2");

    }
    @Test
    public void Test3() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        Thread.sleep(11000);
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement target= driver.findElement(By.id("droptarget"));
        Actions actions2=new Actions(driver);
        actions2.dragAndDrop(source,target).perform();


    }
}
