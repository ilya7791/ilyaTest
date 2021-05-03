package test;

import base.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CareersAll;

import static pages.CommonLocators.siteURL;

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

//        String scriptToExecute = "var performance = window.performance || window.mozPerformance || window.msPerformance || window.webkitPerformance || {}; var network = performance.getEntries() || {}; return network;";
//        String netData = ((JavascriptExecutor)driver).executeScript(scriptToExecute).toString();
//        System.out.println(netData);
    }

}
