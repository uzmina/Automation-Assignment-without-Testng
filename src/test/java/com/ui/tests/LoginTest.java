package com.uiTest.com.uiTest;

import com.utility.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest
{
    @SuppressWarnings("unused")
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        BrowserUtility browserUtility = new BrowserUtility(driver);

        browserUtility.goToWebsite("https://automationpractice.techwithjatin.com/");//launch site
        browserUtility.maximizeWindow();

        By signInLinkLocator = By.xpath("//a[@class=\"login\"]");
        browserUtility.clickOn(signInLinkLocator);

        By emailInputLocator = By.id("email");
        browserUtility.enterData(emailInputLocator,"rovob54952@hotkev.com");

        By passwordInputLocator = By.id("passwd");
        browserUtility.enterData(passwordInputLocator,"test1234");


        By loginBtnLocator = By.id("SubmitLogin");
        browserUtility.clickOn(loginBtnLocator);
    }
}
