package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class DriverManager {
    private static WebDriver driver;
    public static WebDriverWait wait;

    // Initialize WebDriver - if logic to set right driver
    public static void initDriver(String BrowserName){
        if (BrowserName.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }
        else if (BrowserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
        else if (BrowserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
        else{
            System.out.println("Invalid Browser Name.Please use Chrome/Firefox/Edge.");
        }

        driver.manage().window().maximize();
        // Setup Explicit wait, Need import ui.ExpectedConditions and ui.WebDriverWait;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    // Why public ?????????????????????????????
    public static void navigateURL(String URL){
        driver.get(URL);
        System.out.println("Navigate to: "+ URL);
    }
    // Get driver instance -  // Why getDriver has brackets???????????
    public static WebDriver getDriver(){
        if(driver == null){
            throw new IllegalStateException("WebDriver not Initialized.Call initDriver() first");
        }
        // It will return driver anyway ??????????????
        return driver;
    }
    // Get wait instance
    public static WebDriverWait getWait(){
        if(wait == null){
            throw new IllegalStateException("WebDriverWait not initialized.Call initDriver() first.");
        }
        return wait;
    }
    // Quit driver
    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
            wait = null;
        }
    }

}

