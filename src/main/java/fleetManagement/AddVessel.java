/*
1. Explicit wait
2. Separate Locators
3. Implement data constants
 */

package fleetManagement;
import base.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddVessel {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static String webDriver = "Chrome";
    private static String succesMsg;

    public static void main(String[] args) {

        DriverManager.initDriver(webDriver);
        driver = DriverManager.getDriver();
        wait = DriverManager.getWait();
        DriverManager.navigateURL(VesselData.marineExpress_URL);
        openFleetManagementMenu();
        clickAddVesselButton();
        fillVesselForm();
        submitVesselForm();
        verifyVesselAdded();
        DriverManager.quitDriver();
    }

    public static void openFleetManagementMenu(){
            // Added wait initialization here for using in SearchVessel ????????????????????????????????
        wait = DriverManager.getWait();
        //Why not using driver.findElement method ????????????????????????????

        WebElement FleetManagementMenu = wait.until(ExpectedConditions.elementToBeClickable(AddVesselLocators.Fleet_Management_Menu));
        //WebElement FleetManagementMenu = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(AddVesselLocators.Fleet_Management_Menu)));
        FleetManagementMenu.click();
        System.out.println("Open Fleet Management Menu.");
    }
    public static void clickAddVesselButton(){
       WebElement AddVesselButton = driver.findElement(AddVesselLocators.Add_Vessel_Button);
        AddVesselButton.click();
        System.out.println("Clicked Add Vessel Button.");
    }
    public static void fillVesselForm(){
        // What is wrong in this ???????????????????????????????????????????????????
        //WebElement VesselName = wait.until(ExpectedConditions.visibilityOfElementLocated(driver.findElement(AddVesselLocators.Vessel_Name)));
        WebElement VesselName = wait.until(ExpectedConditions.visibilityOfElementLocated(AddVesselLocators.Vessel_Name));
        VesselName.sendKeys(VesselData.data_Vessel_Name);

        WebElement VesselType = driver.findElement(AddVesselLocators.Vessel_Type);
        Select select = new Select(VesselType);
        select.selectByValue(VesselData.data_Vessel_Type);

        WebElement YearBuild = driver.findElement(AddVesselLocators.Year_Build);
        YearBuild.sendKeys(VesselData.data_Vessel_Year);

        WebElement VesselFlag = driver.findElement(AddVesselLocators.Vessel_Flag);
        VesselFlag.sendKeys(VesselData.data_Vessel_Flag);

        WebElement VesselCurrentLocation = driver.findElement(AddVesselLocators.Vessel_CurrentLocation);
        VesselCurrentLocation.sendKeys(VesselData.data_Current_Location);

        WebElement Capacity = driver.findElement(AddVesselLocators.Vessel_Capacity);
        Capacity.sendKeys(VesselData.data_Vessel_Capacity);
        System.out.println("Inputted Vessel Form data.");
    }
    public static void submitVesselForm(){
        WebElement VesselRegisterButton = driver.findElement(AddVesselLocators.Vessel_register_Button);
        VesselRegisterButton.click();
        System.out.println("Submitted Vessel Register Form.");
    }
    public static void verifyVesselAdded(){
        try{
            // String successMessage = driver.findElement(Vessel_add_success_message).getText();
            WebElement vsladdMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(AddVesselLocators.Vessel_add_success_message));
            succesMsg = vsladdMsg.getText();
            System.out.println(succesMsg+" Test Passed!! Vessel Added Successfully.");
        }
        catch (Exception e){
            System.out.println("Test Failed !!! Vessel did not add.");
        }

    }

}
