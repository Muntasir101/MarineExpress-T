package oldFleetManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class old_Advessel {

    // Page Object Locators
    private static final By Fleet_Management_Menu = By.cssSelector("div[data-section='fleet'] span");
    private static final By Add_Vessel_Button = By.cssSelector("#add-vessel-btn");
    private static final By Vessel_Name = By.cssSelector("#vessel-name");
    private static final By Vessel_Type = By.cssSelector("#vessel-type");
    private static final By Year_Build = By.cssSelector("#year-built");
    private static final By Vessel_Capacity = By.cssSelector("#capacity");
    private static final By vessel_Flag = By.cssSelector("#flag");
    private static final By register_Vessel = By.cssSelector("form[id='vessel-form'] button[type='submit']");

    // Vessel data constants
    // This variable are static because this are property of AddVessel class
    // and can be used by other class such as WebElement or
    // method of another class example : selectByValue method of Select class.
    private static final String data_Vessel_Name = "Sea Monster";
    private static final String data_Vessel_Type = "Tanker";
    private static final String data_Vessel_Year = "2020";
    private static final String data_Vessel_Capacity = "50000";
    private static final String data_Vessel_Flag = "USA";


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://takhangithub.github.io/MavenXpress/");
        driver.manage().window().maximize();
       

        // Setup Explicit wait // Need to import ui.ExpectedConditions and ui.WebDriverWait;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement FleetManagementMenu = wait.until(ExpectedConditions.elementToBeClickable(Fleet_Management_Menu));
        FleetManagementMenu.click();

        WebElement AddVesselButton = driver.findElement(Add_Vessel_Button);
        AddVesselButton.click();

        WebElement VesselName = wait.until(ExpectedConditions.visibilityOfElementLocated(Vessel_Name));
        VesselName.sendKeys(data_Vessel_Name);

        WebElement VesselType = driver.findElement(Vessel_Type);
        Select select = new Select(VesselType);
        select.selectByValue(data_Vessel_Type);

        /* -- Older way of code and Convert the numeric value to a String
        String stryrBld = String.valueOf(yrBld);
        WebElement YearBuild = driver.findElement(By.cssSelector("#year-built"));
        YearBuild.sendKeys(stryrBld);  */

        WebElement YearBuild = driver.findElement(Year_Build);
        YearBuild.sendKeys(data_Vessel_Year);

        WebElement Capacity = driver.findElement(Vessel_Capacity);
        Capacity.sendKeys(data_Vessel_Capacity);


        WebElement Flag = driver.findElement(vessel_Flag);
        Flag.sendKeys(data_Vessel_Flag);

        WebElement RegisterVessel = driver.findElement(register_Vessel);
        RegisterVessel.click();


        String aa = "aa";
        String bb = "bb";
        if(aa.equals(bb)){}



    }

}
