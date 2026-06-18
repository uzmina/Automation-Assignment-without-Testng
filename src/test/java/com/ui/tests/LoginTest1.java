package com.ui.tests;

import com.ui.pages.HomePage;
import com.ui.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest
{
    @SuppressWarnings("unused")
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.goToLoginPage();
        loginPage.loginWith("rovob54952@hotkev.com", "test1234");



    }
}
