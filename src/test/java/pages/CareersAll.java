package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static pages.CommonLocators.*;


public class CareersAll extends CommonMethods {

    By telAviv = By.xpath("//*[text()='TEL AVIV']");

    public CareersAll(WebDriver driver){
        super(driver);
    }



    public void openTlvPage() throws Exception {

            click(telAviv);
    }

    public int getNumOfOpenPositionsDisplayed() throws Exception {

        String openPositionsStr=getText(numOfOpenPositions).replace(" open positions","");
        return Integer.parseInt(openPositionsStr);
    }


    public int getNumOfPositionsInList() throws Exception {

        List<WebElement> positions =  driver.findElements(positionsInList);
        return positions.size();
    }
}
