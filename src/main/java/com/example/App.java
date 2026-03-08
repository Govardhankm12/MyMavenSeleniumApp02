package com.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class App {
    public static void main(String[] args) throws InterruptedException  {

        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
         Thread.sleep(3000);
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        Thread.sleep(3000);
        driver.findElement(By.id("submit")).click();
        driver.quit();
        }
}
