package org.example.RahulShettyCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicDropdownOptions {
    public void departureFieldAction(WebDriver webDriver) {
        By departureCityOption = By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT");
        By departureCitySelect = By.xpath("//a[normalize-space()='Bengaluru (BLR)']");

        webDriver.findElement(departureCityOption).click();
        webDriver.findElement(departureCitySelect).click();
    }

    public void arrivalFieldAction(WebDriver webDriver) {
        By arrivalCityOption = By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT");
        By arrivalCitySelect = By.xpath("(//a[@value=\"PAT\"])[2]");
        WebElement arrivalCity = webDriver.findElement(By.xpath("(//a[@value=\"PAT\"])[2]"));
        //Click is not required as option get opened automatically when Departure City is selected
        //new WebDriverWait(webDriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(arrivalCityOption)).click();
        //webDriver.findElement(arrivalCityOption).click();
        Actions builders = new Actions(webDriver);
        builders.moveToElement(arrivalCity).perform();
        //Above 2 line of code helped to identify elements and hover to them when selenium by default was unable to find.
        new WebDriverWait(webDriver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(arrivalCitySelect)).click();
        //webDriver.findElement(arrivalCitySelect).click();

        webDriver.findElement(By.xpath("//span[contains(text(),'Check-In')]")).click();
        ////*[@id="buttons"]/div/div/ul/li[5]/a
    }
}
