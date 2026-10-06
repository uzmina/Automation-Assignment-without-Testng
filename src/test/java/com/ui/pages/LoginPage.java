package com.ui.pages;

import com.ui.utility.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BrowserUtility {
    private static final By EMAIL_TEXTBOX_LOCATOR = By.id("email");
    private static final By PWD_TEXTBOX_LOCATOR = By.id("passwd");
    private static final By SIGN_IN_BTN = By.id("SubmitLogin");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public MyAccountPage loginWith(String email, String pwd){
        enterData(EMAIL_TEXTBOX_LOCATOR,email);
        enterData(PWD_TEXTBOX_LOCATOR,pwd);
        clickOn(SIGN_IN_BTN);
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());
        return myAccountPage;
    }
}
