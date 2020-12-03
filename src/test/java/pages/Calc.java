package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Calc extends CommonMethods {

    By btn0 = By.id("Btn0");
    By btn1 = By.id("Btn1");
    By btn2 = By.id("Btn2");
    By btn3 = By.id("Btn3");
    By BtnCalc = By.id("BtnCalc");
    By openBracketBtn = By.id("BtnParanL");
    By closeBracketBtn = By.id("BtnParanR");
    By sinusBtn = By.id("BtnSin");
    By btnPlus = By.id("BtnPlus");
    By btnMinus= By.id("BtnMinus");
    By BtnMult= By.id("BtnMult");
    By agreeBtn= By.xpath("//*[text()='AGREE']");
    By result= By.id("input");

    private final String siteURL="https://web2.0calc.com/";

    public Calc(WebDriver driver){
        super(driver);
    }

    public void navigateToSite() throws Exception {

        driver.get(siteURL);
        Thread.sleep(2000);
    }

    public void clickAgreeBtn() throws Exception {

        click(agreeBtn);
        Thread.sleep(500);
    }
    public void clickBtn2() throws Exception {

        click(btn2);
    }

    public void clickBtn3() throws Exception {

        click(btn3);
    }

    public void clickBtn1() throws Exception {

        click(btn1);
    }

    public void clickBtn0() throws Exception {

        click(btn0);
    }

    public void clickOpenBracketBtn() throws Exception {

        click(openBracketBtn);
    }

    public void clickCloseBracketBtn() throws Exception {

        click(closeBracketBtn);
    }

    public void clickSinusBtn() throws Exception {

        click(sinusBtn);
    }

    public void clickBtnCalc() throws Exception {

        click(BtnCalc);
        Thread.sleep(1000);
    }

    public void clickBtnPlus() throws Exception {

        click(btnPlus);
    }

    public void clickBtnMinus() throws Exception {

        click(btnMinus);
    }

    public void clickBtnMult() throws Exception {

        click(BtnMult);
    }



    public String getResult() throws Exception {

        String attrVal = driver.findElement(result).getAttribute("value");
        return attrVal;
    }

    public String getFirstFormulaResult() throws Exception {

        clickBtn2();
        clickBtnPlus();
        clickBtn3();
        clickBtnCalc();
        String result=getResult();
        return result;
    }

    public String getSecondFormulaResult() throws Exception {

        clickBtn1();
        clickBtn0();
        clickBtnMinus();
        clickBtn2();
        clickBtnCalc();
        String result=getResult();
        return result;
    }

    public String getThirdFormulaResult() throws Exception {

        clickOpenBracketBtn();
        clickBtn1();
        clickBtn0();
        clickBtnMinus();
        clickBtn2();
        clickCloseBracketBtn();
        clickBtnMult();
        clickBtn2();
        clickBtnCalc();
        String result=getResult();
        return result;
    }

    public String getForthFormulaResult() throws Exception {

        clickSinusBtn();
        clickBtn3();
        clickBtn0();
        clickCloseBracketBtn();
        clickBtnCalc();
        String result=getResult();
        return result;
    }
}