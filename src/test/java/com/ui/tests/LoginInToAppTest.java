package com.ui.tests;

import static com.ui.constants.Browser.*;
import com.ui.pages.HomePage;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginInToAppTest
{
    HomePage homePage;
    @BeforeMethod(description = "Load the Homepage before running any tests")
    public void setUP(){
        homePage = new HomePage(FIREFOX);
    }

    @Test(description = "validate user is able to login successfully" )
    public void loginTest(){
        //<String username = homePage.goToLoginPage().loginWith("rovob54952@hotkev.com", "test1234").getUserName()>
        //assertEquals(username,"Uz an")
        //can be modified to single line of code
        assertEquals(homePage.goToLoginPage().loginWith("rovob54952@hotkev.com", "test1234").getUserName(),"Uz an");
    }
}
