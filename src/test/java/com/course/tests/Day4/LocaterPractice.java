package com.course.tests.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");//registration form!!!!!
        driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Dorota");
        driver.findElement(By.xpath("//input[@placeholder='last name']")).sendKeys("Cakar");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dorotacakar");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dorota.cakar@wp.pl");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("737481313");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("737481313");

    }
}
