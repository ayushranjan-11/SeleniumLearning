package org.example.RahulShettyCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicDropdownOptions {
    public void departureFieldAction(WebDriver webDriver) {
        By departureCityOption = By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT");
        By departureCitySelect = By.xpath("//a[normalize-space()='Bengaluru (BLR)']");

        webDriver.findElement(departureCityOption).click();
        webDriver.findElement(departureCitySelect).click();
    }

    public void arrivalFieldAction(WebDriver webDriver) {
        By arrivalCityOption = By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT");
        By arrivalCitySelect = By.xpath("//a[normalize-space()='Patna (PAT)']");
    }
}
