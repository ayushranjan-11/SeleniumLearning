package org.example.ScenarioBasedAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownOption {
    public static void main(String[] args) {
        WebDriver WebDriver = new ChromeDriver();

        WebDriver.get("https://www.google.co.in");
        System.out.println(WebDriver.getCurrentUrl());
        System.out.println(WebDriver.getTitle());
        System.out.println("Testing vs code setup");
    }
}
