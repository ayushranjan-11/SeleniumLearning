package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeSearch {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        browserSetupAndURL(driver);
        searchFieldSearchAndInput(driver);
    }

    public static void browserSetupAndURL(WebDriver driver) {
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();
    }

    public static void searchFieldSearchAndInput(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        //Search Field locate and input in the field
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("RD Automation Learning");

        Thread.sleep(1000);
        //Locate search button and click
        driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
    }
}
