package org.companyWebsite;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import BrowserSetup.BrowserSetup;

public class BrowserOpen {
	
	public static void main(String[] args) {
		WebDriver webdriver = null;
		String companyURL = "https://www.gamp.gg";
		
		browserOpenAndURLVisit(webdriver, companyURL);
	}
	
	
	public static void browserOpenAndURLVisit(WebDriver webDriver, String companyURL) {
		BrowserSetup browserSetup = new BrowserSetup();
		webDriver = browserSetup.chromeBrowserSetup(webDriver, companyURL);
		System.out.println(webDriver.getTitle());
		
		//TODO: Closing the pop up in the website
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(20)); // 20 seconds timeout

        try {
            webDriver.get(companyURL);

            // Wait for a JavaScript alert
//            try {
//                Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//                alert.accept(); // Accept the alert
//            } catch (TimeoutException e) {
//                System.out.println("JavaScript alert did not appear.");
//            }

            // Wait for a modal dialog
            try {
                WebElement modal = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.className(" w-full relative"))
                );
                WebElement closeButton = modal.findElement(By.cssSelector("body > div:nth-child(51) > div:nth-child(1) > svg:nth-child(1)"));
                closeButton.click();
            } catch (TimeoutException e) {
                System.out.println("Modal dialog did not appear.");
            }

        } finally {
            webDriver.quit();
        }
	}

}
