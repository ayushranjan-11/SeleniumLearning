package BrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetup {

    public WebDriver chromeBrowserSetup(WebDriver webDriver, String url) {
        webDriver = new ChromeDriver();
        webDriver.get(url);
        webDriver.manage().window().maximize();

        return webDriver;
    }

    public WebDriver firefoxBrowserSetup(WebDriver webDriver, String url) {
        webDriver = new FirefoxDriver();
        webDriver.get(url);
        webDriver.manage().window().maximize();
        return webDriver;
    }

    public WebDriver edgeBrowserSetup(WebDriver webDriver, String url) {
        webDriver = new EdgeDriver();
        webDriver.get(url);
        webDriver.manage().window().maximize();
        return webDriver;
    }
}
