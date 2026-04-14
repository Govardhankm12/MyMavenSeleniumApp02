package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {
    public static void main(String[] args) throws InterruptedException {

        // 🔥 IMPORTANT: set driver path
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://practicetestautomation.com/practice-test-login/");
        Thread.sleep(3000);

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        Thread.sleep(2000);

        driver.findElement(By.id("submit")).click();

        System.out.println("✅ Test Executed Successfully");

        driver.quit();
    }
}
