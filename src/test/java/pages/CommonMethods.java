package pages;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonMethods {

    WebDriver driver;

    public CommonMethods(WebDriver driver)
    {
        this.driver=driver;
    }


    public void click(By locator) throws Exception {

        driver.findElement(locator).click();
        Thread.sleep(200);
    }
}
