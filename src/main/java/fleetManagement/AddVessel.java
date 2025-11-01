/*
1. Explicit wait
2. Separate Locators
3. Implement data constants
 */

package fleetManagement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import base.DriverManager;

public class AddVessel {

    public static void main(String[] args) {

        String webDriver = "Chrome";
        DriverManager.initDriver(webDriver);
        DriverManager.navigateURL(VesselData.marineExpress_URL);
        openFleetManagementMenu();
        clickAddVesselButton();
        fillVesselForm();
        submitVesselForm();
        verifyVesselAdded();
        DriverManager.quitDriver();
    }

    public static void openFleetManagementMenu(){

        WebElement FleetManagementMenu = DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(AddVesselLocators.Fleet_Management_Menu));
        FleetManagementMenu.click();
        System.out.println("Open Fleet Management Menu.");
    }
    public static void clickAddVesselButton(){
       WebElement AddVesselButton = DriverManager.getDriver().findElement(AddVesselLocators.Add_Vessel_Button);
        AddVesselButton.click();
        System.out.println("Clicked Add Vessel Button.");
    }
    public static void fillVesselForm(){
        WebElement VesselName = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(AddVesselLocators.Vessel_Name));
        VesselName.sendKeys(VesselData.data_Vessel_Name);

        WebElement VesselType = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(AddVesselLocators.Vessel_Type));
        Select select = new Select(VesselType);
        select.selectByValue(VesselData.data_Vessel_Type);

        WebElement YearBuild = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(AddVesselLocators.Year_Build));
        YearBuild.sendKeys(VesselData.data_Vessel_Year);

        WebElement VesselFlag = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(AddVesselLocators.Vessel_Flag));
        VesselFlag.sendKeys(VesselData.data_Vessel_Flag);

        WebElement VesselCurrentLocation = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(AddVesselLocators.Vessel_CurrentLocation));
        VesselCurrentLocation.sendKeys(VesselData.data_Current_Location);

        WebElement Capacity = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(AddVesselLocators.Vessel_Capacity));
        Capacity.sendKeys(VesselData.data_Vessel_Capacity);
        System.out.println("Inputted Vessel Form data.");
    }
    public static void submitVesselForm(){
        WebElement VesselRegisterButton = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(AddVesselLocators.Vessel_register_Button));
        VesselRegisterButton.click();
        System.out.println("Submitted Vessel Register Form.");
    }
    public static void verifyVesselAdded(){
        try{
            // String successMessage = driver.findElement(Vessel_add_success_message).getText();
            WebElement vsladdMsg = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(AddVesselLocators.Vessel_add_success_message));
            String succesMsg = vsladdMsg.getText();
            System.out.println(succesMsg+" Test Passed!! Vessel Added Successfully.");
        }
        catch (Exception e){
            System.out.println("Test Failed !!! Vessel did not add.");
        }

    }

}
