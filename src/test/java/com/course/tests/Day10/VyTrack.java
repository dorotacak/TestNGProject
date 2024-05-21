package com.course.tests.Day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class VyTrack {
    @Test
    public void PossitiveTest() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa1.vytrack.com/user/login");// ??????????????????????????
        driver.manage().window().maximize();

        driver.findElement(By.id("prependedInput")).sendKeys("user1");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        WebElement fleetIcon = driver.findElement(By.xpath("//*[contains(@class,'title-level-1')]"));
        Actions actions = new Actions(driver);
        Thread.sleep(6000);
        actions.moveToElement(fleetIcon).pause(200).doubleClick(fleetIcon).build().perform();
        Thread.sleep(8000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//poczekaj 10sek i potem kliknij


        WebElement odometer = driver.findElement(By.xpath("//span[contains(text(),'Vehicle Odometer')]"));
        wait.until(ExpectedConditions.elementToBeClickable(odometer)).click();
        Thread.sleep(5000);
        String actualTitle = (driver.findElement(By.xpath("//h1[contains(text(),'Vehicles Odometers')]")).getText());//to znalazlam
        //na www i chce teraz chce porównać z tym co powinnam mieć- czyli powinnam wejść do Vehicles Odometers
        String expectedTitle = "Vehicles Odometers";
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Test
    public void NegativeTest() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa1.vytrack.com/user/login");//?????????????????????????????
        driver.manage().window().maximize();

        driver.findElement(By.id("prependedInput")).sendKeys("storemanager51");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        WebElement fleetIcon = driver.findElement(By.xpath("(//*[contains(@class,'title-level-1')])[3]"));
        Actions actions = new Actions(driver);
        Thread.sleep(6000);
        actions.moveToElement(fleetIcon).pause(200).doubleClick(fleetIcon).build().perform();
        Thread.sleep(8000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//poczekaj 10sek i potem kliknij


        WebElement odometer = driver.findElement(By.xpath("//span[contains(text(),'Vehicle Odometer')]"));
        wait.until(ExpectedConditions.elementToBeClickable(odometer)).click();
        Thread.sleep(5000);
        String actualmessage = (driver.findElement(By.xpath("//div[contains(text(),'You do not have permission')]")).getText());//to znalazlam
        //na www i chce teraz chce porównać z tym co powinnam mieć- czyli powinnam wejść do Vehicles Odometers
        String expectedmessage = "You do not have permission to perform this action.";
        Assert.assertEquals(actualmessage, expectedmessage);

    }

    @Test
    public void PositiveTest() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.azulcrm.com/auth/?backurl=%2Fstream%2F");//?????????????????????????
        driver.manage().window().maximize();

        driver.findElement(By.name("USER_LOGIN")).sendKeys("hr11@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.className("login-btn")).click();
        String actualTitle = driver.findElement(By.xpath("(//*[.='Activity Stream'])[2]")).getText();
        String expectedTitle = "Activity Stream";
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Test
    public void NegativeTest2() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.azulcrm.com/auth/?backurl=%2Fstream%2F");//????????????????????
        driver.manage().window().maximize();

        driver.findElement(By.name("USER_LOGIN")).sendKeys("hr11@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("abcd");
        driver.findElement(By.className("login-btn")).click();
        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = driver.findElement(By.className("errortext")).getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);


    }

    @Test
    public void NegativeTest3() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.azulcrm.com/auth/?backurl=%2Fstream%2F");//?????????????
        driver.manage().window().maximize();

        driver.findElement(By.name("USER_LOGIN")).sendKeys("hr11@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys(" ");
        driver.findElement(By.className("login-btn")).click();
        String expectedErrorMessage1 = "Please fill out this field";
        String actualErrorMessage1 = driver.findElement(By.className("errortext")).getText();
        Assert.assertEquals(actualErrorMessage1, expectedErrorMessage1);

    }

    @Test
    public void NegativeTest4() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa.azulcrm.com/auth/?backurl=%2Fstream%2F");//?????????
        driver.manage().window().maximize();

        driver.findElement(By.name("USER_LOGIN")).sendKeys(" ");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser123");
        driver.findElement(By.className("login-btn")).click();
        String expectedErrorMessage2 = "Please fill out this field";
        String actualErrorMessage2 = driver.findElement(By.className("errortext")).getText();
        Assert.assertEquals(actualErrorMessage2, expectedErrorMessage2);
    }
}










