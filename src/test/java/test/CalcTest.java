package test;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Calc;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CalcTest extends BaseTest {

    Calc objCalc;
    String testedVal;
    String ActualVal;

    @BeforeMethod
    public void setup() throws Exception {

        objCalc = new Calc(driver);
        objCalc.navigateToSite();
        objCalc.clickAgreeBtn();
    }

    @Test()
    public void test_first_formula() throws Exception {

        test = extent.createTest("test first formula");

        testedVal="5";
        ActualVal=objCalc.getFirstFormulaResult();
        System.out.println("ActualVal:"+ActualVal);
        assertTrue(ActualVal.equals(testedVal));
    }

    @Test()
    public void test_second_formula() throws Exception {

        test = extent.createTest("test second formula");
        testedVal="8";
        ActualVal=objCalc.getSecondFormulaResult();
        System.out.println("ActualVal:"+ActualVal);
        assertTrue(ActualVal.equals(testedVal));
    }

    @Test()
    public void test_third_formula() throws Exception {

        test = extent.createTest("test third formula");
        testedVal ="20";
        ActualVal=objCalc.getThirdFormulaResult();
        System.out.println("ActualVal:"+ActualVal);
        assertFalse(ActualVal.equals(testedVal));
    }

    @Test()
    public void test_forth_formula() throws Exception {

        test = extent.createTest("test forth formula");
        testedVal ="0.5";
        ActualVal=objCalc.getForthFormulaResult();
        System.out.println("ActualVal:"+ActualVal);
        assertTrue(ActualVal.equals(testedVal));
    }

}
