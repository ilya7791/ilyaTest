package test;

import java.util.List;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CareersAll;
import pages.CareersTlv;

import static org.testng.Assert.assertTrue;
import static pages.CommonLocators.siteURL;

public class CareersTlvTest extends BaseTest {

    CareersAll objAll;
    CareersTlv objTlv;

    @BeforeMethod
    public void setup() throws Exception {

        objAll = new CareersAll(driver);
        objTlv=new CareersTlv(driver);
        driver.get(siteURL);
    }

    @Test()
    public void check_position_search_in_tel_aviv_returns_expected_results() throws Exception {

        test = extent.createTest("check_position_search_in_tel_aviv_returns_expected_results");
        String positionToSearch="Frontend Developer";
        objAll.openTlvPage();
        //driver.findElement(org.openqa.selenium.By.xpath("//input [@placeholder ='Search']")).sendKeys("aaa");
        objTlv.searchData(positionToSearch);
        List<WebElement> positions=objTlv.getNumOfPositionsInList();
        if(positions.size()>0) {
            for (WebElement currentPosition : positions)
                assertTrue(currentPosition.getText().toLowerCase().contains("tel-aviv-yafo"));

            for (WebElement currentPosition : positions)
                assertTrue(currentPosition.getText().toLowerCase().contains(positionToSearch.toLowerCase()));
        }
        else
            assertTrue(false);
    }
}
