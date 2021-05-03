package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import static pages.CommonLocators.siteURL;

public class LoginTest extends BaseTest {

    LoginPage objLoginPage;
    String CORRECT_USER_NAME = "ilya7791@gmail.com";
    String CORRECT_PASSWORD = "vjm9wuiu";
    String INCORRECT_USER_NAME = "aaaaa";
    String iNCORRECT_PASSWORD = "bbbbb";
    String EXPECTED_ERROR_MSG="E-mail or password was incorrect, please try again";
    String EXPECTED_TYTLE_MSG = "Welcome back! Please sign in";

    @BeforeMethod
    public void setup(){

        objLoginPage = new LoginPage(driver);
        driver.get(siteURL);
    }

    @Test()
    public void check_title_name() throws Exception {

        String ActualTitleName = objLoginPage.GetTitle();
        Assert.assertEquals(EXPECTED_TYTLE_MSG, ActualTitleName, "Error:ExpectedTitleName and " +
                "ActualTitleName are not identical");
    }

    @Test()
    public void login_to_bootsnipp_with_correct_credentials() throws Exception {

        objLoginPage.login(CORRECT_USER_NAME,CORRECT_PASSWORD);
        HomePage objHomePage = new HomePage(driver);
        String ActualTitleName = objHomePage.getHomePageInfo();

        //after successfull login a message "My snippets" should appear
        String ExpectedTitleName = "My snippets";
        Assert.assertTrue(ActualTitleName.contains(ExpectedTitleName), "Error:" +
                "ActualTitleName doesn't contain ExpectedTitleName");

    }

    @Test()
    public void login_to_bootsnipp_with_incorrect_credentials() throws Exception {

        objLoginPage.login(INCORRECT_USER_NAME,iNCORRECT_PASSWORD);

        //after unsuccessfull login a message "E-mail or password was incorrect, please try again" should appear
        String error_msg=objLoginPage.GetTxtErrorMsg();
        Assert.assertTrue(error_msg.contains(EXPECTED_ERROR_MSG), "Error:error message not appears");
    }

    @Test()
    public void login_to_bootsnipp_with_empty_credentials() throws Exception {

        objLoginPage.login("","");

        //after unsuccessfull login a message "E-mail or password was incorrect, please try again" should appear
        String error_msg=objLoginPage.GetTxtErrorMsg();
        Assert.assertTrue(error_msg.contains(EXPECTED_ERROR_MSG), "Error:error message not appears");
    }


}
