package com.course.tests.Day2_basicLocators;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyConfirmationMessage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement emailBox= driver.findElement(By.name("email"));
        emailBox.sendKeys("test@cyberschool.com");
        String actualEmail=emailBox.getAttribute("value");
        System.out.println(actualEmail);
        WebElement retrievepassword= driver.findElement(By.id("form_submit"));
        retrievepassword.click();

        WebElement actualMessage=driver.findElement(By.name("confirmation_message"));
        String expectedMessage="Your e-mail's been sent!";
        if (actualMessage.getText().equals(expectedMessage)){
            System.out.println("test passed");
        } else{
            System.out.println("not passed");
        }


    }
}
