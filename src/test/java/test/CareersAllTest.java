package test;

import java.util.List;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CareersAll;
import pages.CareersTlv;
import pages.Chat;


import static pages.CommonLocators.*;

public class CareersAllTest extends BaseTest {

    CareersAll objAll;

    @BeforeMethod
    public void setup() throws Exception {

        objAll = new CareersAll(driver);
        driver.get(siteURL);
    }

    @Test()
    public void check_num_of_actual_positions_in_list_is_as_declared() throws Exception {

        test = extent.createTest("second check_num_of_actual_positions_in_list_is_as_declared");

        int numOfPositionsDisplayed = objAll.getNumOfOpenPositionsDisplayed();
        int actualNumOfPositionsInList = objAll.getNumOfPositionsInList();
        Assert.assertEquals(numOfPositionsDisplayed, actualNumOfPositionsInList);
    }

}
