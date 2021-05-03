package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonMethods {

    WebDriver driver;

    public CommonMethods(WebDriver driver) {
        this.driver = driver;
    }


    public void click(By locator) throws Exception {

        driver.findElement(locator).click();
    }

    public void sendText(By locator, String text) throws Exception {

        driver.findElement(locator).sendKeys(text);
    }


    public String getText(By locator) throws Exception {

        String text = driver.findElement(locator).getText();
        return text;
    }


}
