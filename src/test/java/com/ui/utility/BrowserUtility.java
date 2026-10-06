package com.ui.utility;

import com.ui.constants.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public abstract class BrowserUtility {
    private final WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public BrowserUtility(WebDriver driver) {
        this.driver = driver;
    }

    public BrowserUtility(Browser browserName) {
        switch (browserName) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case EDGE:
                driver = new EdgeDriver();
                break;
            case SAFARI:
                driver = new SafariDriver();
                break;
            default:
                throw new IllegalArgumentException(
                        "Invalid browser name: " + browserName);
        }
    }

    public void goToWebsite(String url){
        driver.get(url);
    }

    public void maximizeWindow(){
        driver.manage().window().maximize();
    }

    public void clickOn(By locator){
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public void enterData(By locator, String textToEnter){
        WebElement element = driver.findElement(locator);
        element.sendKeys(textToEnter);
    }

    public String getVisibleText(By locator){
        WebElement element = driver.findElement(locator);
       return element.getText();
    }
}
