package org.example.RahulShettyCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RahulShettyCourse {

    public static void main(String[] args) throws InterruptedException {
        String websiteUrl = "https://rahulshettyacademy.com/dropdownsPractise/";
        WebDriver driver = new ChromeDriver();
        browserOpening(driver, websiteUrl);
        initiatingDropdown(driver);
        pickingPassengers(driver);
        dynamicDropdown(driver);
        datePick(driver);

//        Thread.sleep(2000);
//        driver.quit();
    }

    public static void browserOpening(WebDriver driver, String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public static void initiatingDropdown(WebDriver driver) {
        WebElement dropdownElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select selectClass = new Select(dropdownElement);
        //selectClass.selectByIndex(2);
        List<WebElement> optionsInDropDown = selectClass.getOptions();
        System.out.println(optionsInDropDown.size());
        for (int i = 0; i < optionsInDropDown.size(); i++) {
            selectClass.selectByIndex(i);
            System.out.println("Selected option is: " + selectClass.getFirstSelectedOption().getText());
        }

    }

    public static void pickingPassengers(WebDriver driver) {

        //Clicking Passengers Dropdown
        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));

        //Increasing number of adult count
        int x =0;

        do {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable
                    (By.xpath("//span[@id='hrefIncAdt']")));
            element.click();
            x++;
        } while (x <= 4);

//        while(x <= 4) {
//            WebElement element = wait.until(ExpectedConditions.elementToBeClickable
//                    (By.xpath("//span[@id='hrefIncAdt']")));
//            element.click();
//            x++;
//        }

        //Pressing done button after selection
        driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();

        //Get number of Passengers selected
        System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
//        WebElement element1 = driver.findElement(By.id("divpaxinfo"));
//        System.out.println(element1.getText());


        /*So as shown in above code we can directly get the text with driver.finElement and also with WebElement object
        I think if we have to identify any element and immediate use(print) the element then we can go with driver.findElement
                if we have to pass it to some other variable or method or use it then WebElement class object is required
        */
    }

    public static void dynamicDropdown(WebDriver driver) { //Dropdown for city selection
        //Initiating 1st Dropdown i.e FROM
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

            //Selecting option from the dropdown
            driver.findElement(By.xpath("//a[normalize-space()='Bengaluru (BLR)']")).click();

        //Initiating 2nd Dropdown i.e TO
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();

            //Selecting option from the dropdown
            driver.findElement(By.xpath("//a[normalize-space()='Bengaluru (BLR)']")).click();

        /*Dynamic dropdowns are those which are conditional or which don't have select as class in HTML*/
    }

    public static void datePick(WebDriver driver) {

        //Clicking calendar option
       // driver.findElement(departDate).click();
        //Though above step is not required as option opens automatically when flow is straight to select
        // people and location
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
        String preselectedDateInDepartDate = driver.findElement(By.id("view_fulldate_id_1")).getText();
        System.out.println("Previously selected date in calendar is: "+preselectedDateInDepartDate);

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']"))).click();
    }
}
