package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class ilya {



    @Test()
    public void test() throws Exception {
/*

        LoggingPreferences logPrefs = new LoggingPreferences();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver(capabilities);
        driver.get("http://devtools.glitch.me/network/getstarted.html");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        LogEntries les = driver.manage().logs().get(LogType.PERFORMANCE);
        for (LogEntry le : les) {
            System.out.println(le.getMessage());

        }
*/


/*

        ChromeOptions options = new ChromeOptions();
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable( LogType.PERFORMANCE, Level.ALL );
        options.setCapability( "goog:loggingPrefs", logPrefs );
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://devtools.glitch.me/network/getstarted.html");

        List<LogEntry> entries = driver.manage().logs().get(LogType.PERFORMANCE).getAll();
        System.out.println(entries.size() + " " + LogType.PERFORMANCE + " log entries found");
        for (LogEntry entry : entries) {
            System.out.println(entry.getMessage());
        }
*/



        //logPrefs.enable(LogType.PERFORMANCE, Level.INFO);

        //caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
//
//
//        ChromeOptions options = new ChromeOptions();
//        LoggingPreferences logPrefs = new LoggingPreferences();
//        logPrefs.enable( LogType.PERFORMANCE, Level.ALL );
//        options.setCapability( "goog:loggingPrefs", logPrefs );
//        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
//        WebDriver driver = new ChromeDriver(options);
//        //driver.get("https://samsound.3dsignals.io/samson/dashboard");
//        driver.get("http://devtools.glitch.me/network/getstarted.html");
//
//        Thread.sleep(1000);
////        List<LogEntry> entries = driver.manage().logs().get(LogType.PERFORMANCE).getAll();
////
////
////        for (LogEntry entry : entries) {
////            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
////        }
//
//        String scriptToExecute = "var performance = window.performance || window.mozPerformance || window.msPerformance || window.webkitPerformance || {}; var network = performance.getEntries() || {}; return network;";
//        String netData = ((JavascriptExecutor)driver).executeScript(scriptToExecute).toString();
//        System.out.println(netData);
//


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        // if you like to specify another profile

        options.addArguments("start-maximized");
        //DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        //capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://devtools.glitch.me/network/getstarted.html");
        String scriptToExecute = "var performance = window.performance || window.mozPerformance || window.msPerformance || window.webkitPerformance || {}; var network = performance.getEntries() || {}; return network;";
        String netData = ((JavascriptExecutor)driver).executeScript(scriptToExecute).toString();
        System.out.println(netData);
    }
}
