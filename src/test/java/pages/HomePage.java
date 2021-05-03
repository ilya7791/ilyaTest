package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends CommonMethods {

    By homePageInfo = By.xpath("//div[@class ='page-header']");


    public HomePage(WebDriver driver) {
        super(driver);
    }


    public String getHomePageInfo() throws Exception {

        return getText(homePageInfo);

    }

}
