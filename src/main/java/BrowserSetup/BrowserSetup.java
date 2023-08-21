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

    public void firefoxBrowserSetup(WebDriver webDriver, String url) {
        webDriver = new FirefoxDriver();
        webDriver.get(url);
    }

    public void edgeBrowserSetup(WebDriver webDriver, String url) {
        webDriver = new EdgeDriver();
        webDriver.get(url);
    }
}
