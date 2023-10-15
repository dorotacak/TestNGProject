package com.course.tests.Day2_basicLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyUrlNotChanged {
    public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.cydeo.com/forgot_password");
        WebElement retrieveButton= driver.findElement(By.id("form_submit"));
        String expectedUrl=driver.getCurrentUrl();

        retrieveButton.click();
        String actualUrl=driver.getCurrentUrl();
        if(expectedUrl.equals(actualUrl)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

    }
}
