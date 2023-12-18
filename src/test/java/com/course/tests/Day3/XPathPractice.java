package com.course.tests.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.cydeo.com/multiple_buttons");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text()='Button 4']")).click();
        String actualText=driver.findElement(By.xpath("//p[text()='Clicked on button four!']")).getText();
        String expectedText="Clicked on button four!";
        if (actualText.equals(expectedText)){
            System.out.println("test passed");
        }else{
            System.out.println("text failed");
        }
        }
    }

