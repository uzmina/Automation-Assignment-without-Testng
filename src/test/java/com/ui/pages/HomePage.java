package com.ui.pages;

import com.ui.constants.Browser;
//import com.ui.constants.Env removed since we are not reading from properties file
import com.ui.utility.BrowserUtility;
import com.ui.utility.JsonUtility;
//import com.ui.utility.PropertiesUtil removed since we are not reading from properties file
import org.openqa.selenium.By;

import static com.ui.constants.Env.*;


public final class HomePage extends BrowserUtility {
   private static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[@class=\"login\"]");

    public HomePage(Browser browserName) {
        super(browserName);
        // this is hard coded <goToWebsite("https://automationpractice.techwithjatin.com")>removing this to call url from properties
        //goToWebsite(PropertiesUtil.readProperties(Env.QA, "URL"))
        goToWebsite(JsonUtility.jsonReadFile(QA));
        maximizeWindow();
    }

    public LoginPage goToLoginPage(){
        clickOn(SIGN_IN_LINK_LOCATOR);
        return new LoginPage(getDriver());
   }

}
