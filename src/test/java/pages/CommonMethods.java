package pages;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {

    WebDriver driver;

    public CommonMethods(WebDriver driver)
    {
        this.driver=driver;
    }


    public void click(By locator) throws Exception {

        driver.findElement(locator).click();
    }

    public void sendText(By locator,String text) throws Exception {

        driver.findElement(locator).sendKeys(text);
    }
    public void pressEnter(By locator) throws Exception {

        driver.findElement(locator).sendKeys(Keys.ENTER);
    }

    public String getText(By locator) throws Exception {

        String text=driver.findElement(locator).getText();
        return text;
    }

    public void switchToIframe(By locator) throws Exception {

        driver.switchTo().defaultContent();
        WebElement iFrameElement = driver.findElement(locator);
        driver.switchTo().frame(iFrameElement);
    }


}
