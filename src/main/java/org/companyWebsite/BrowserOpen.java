package org.companyWebsite;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import BrowserSetup.BrowserSetup;

public class BrowserOpen extends BrowserSetup{
	
	public static void main(String[] args) {
		WebDriver webdriver = null;
		String companyURL = "https://www.gamp.gg";
		
		browserOpenAndURLVisit(webdriver, companyURL);
	}
	
	
	public static void browserOpenAndURLVisit(WebDriver webDriver, String companyURL) {
		BrowserOpen browserSetup = new BrowserOpen();
		webDriver = browserSetup.chromeBrowserSetup(webDriver, companyURL);
		System.out.println(webDriver.getTitle());
		
		//TODO: Closing the pop up in the website
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(60)); // 30 seconds timeout
        
        // Wait for pop up to be displayed
        try {
        	
        	WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("radix-:r3:")));
        	Boolean elementIsVisible = modal.isDisplayed();
        	System.out.println("Element is: "+elementIsVisible);
        	wait.until(ExpectedConditions.elementToBeClickable(modal)).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
        
        webDriver.quit();
        
	}

}
