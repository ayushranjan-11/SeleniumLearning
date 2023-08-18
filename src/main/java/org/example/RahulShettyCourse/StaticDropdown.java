package org.example.RahulShettyCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class StaticDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        String websiteUrl = "https://rahulshettyacademy.com/dropdownsPractise/";
        browserSetup(webDriver, websiteUrl);
        staticDropdownOperations(webDriver);
    }
    public static void browserSetup(WebDriver webDriver, String websiteUrl) {
        webDriver.get(websiteUrl);
        webDriver.manage().window().maximize();
    }

    public static void staticDropdownOperations(WebDriver webDriver) throws InterruptedException {
        By currencyDropdown = By.cssSelector("#ctl00_mainContent_DropDownListCurrency");

        WebElement currencyDropDownOption = webDriver.findElement(currencyDropdown);
        Select select = new Select(currencyDropDownOption);
        List<WebElement>availableOptions = select.getOptions();

        //Display all available options in the static class
        for (int i = 0; i<availableOptions.size();i++ ) {
            System.out.println(availableOptions.get(i).getText());
        }

        //To select all options from start to end, one by one
        if (!availableOptions.isEmpty()) {
            for (int j =0; j< availableOptions.size(); j++) {
                select.selectByIndex(j);
                Thread.sleep(1000);
            }

        }
    }
}
