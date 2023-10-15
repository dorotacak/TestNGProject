package com.course.tests.Day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLChanged {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.cydeo.com/forgot_password");
        driver.manage().window().maximize();
        WebElement emailBox= driver.findElement(By.name("email"));
        emailBox.sendKeys("abs@hotmail.com");
        WebElement retrieveButton= driver.findElement(By.id("form_submit"));
        retrieveButton.click();

    }
}
