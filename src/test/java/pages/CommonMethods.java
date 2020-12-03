package pages;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CommonMethods {

    WebDriver driver;

    public CommonMethods() { }


    public CommonMethods(WebDriver driver)
    {
        this.driver=driver;
    }

    public void sendText(By locator, String text) throws Exception {

        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) throws Exception {

        driver.findElement(locator).click();
        Thread.sleep(200);
    }

    public  String getText(By locator) throws Exception {

        String text = driver.findElement(locator).getText();
        return text;
    }


    public  String getTextFromFile(String pathToFile) throws Exception {

        BufferedReader br;
        String sCurrentLine;
        String text = "";

        br = new BufferedReader(new FileReader(pathToFile));
        while ((sCurrentLine = br.readLine()) != null) {
            if (text.equals(""))
                text = sCurrentLine;
            else
                text = text + "\n" + sCurrentLine;
        }
        text = text.replace("\uFEFF", "");
        //System.out.println("text:"+text);
        return text;
    }

    public void writeToFile(String pathToFile, String textToPrint) throws Exception {

        String filePath;
        PrintWriter writer;

        writer = new PrintWriter(pathToFile, "UTF-8");
        writer.println(textToPrint);
        writer.close();
        System.out.println("Text was written successfully to file:");
    }
}
