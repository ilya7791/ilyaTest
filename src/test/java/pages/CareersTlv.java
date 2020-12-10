package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static pages.CommonLocators.*;


public class CareersTlv extends CommonMethods {

        public CareersTlv(WebDriver driver){
            super(driver);
        }

        public void searchData(String text) throws Exception {

            sendText(searchBox,text);
        }

    public List<WebElement> getNumOfPositionsInList() throws Exception {

        List<WebElement> positions =  driver.findElements(positionsInList);
        return positions;
    }
}
