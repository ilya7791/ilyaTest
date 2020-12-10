package pages;

import org.openqa.selenium.By;

public class CommonLocators {

    public static final By positionsInList = By.xpath("//*[text()='All departments']/../../../div[3]/a");
    public static final By searchBox = By.xpath("//input [@placeholder ='Search']");
    public static final String siteURL="https://x.gloat.com/careers/all";
    public static final By numOfOpenPositions = By.xpath("//*[text()='All locations']/../p[1]");
    public static final By chatIcon = By.cssSelector("svg > path");
}
