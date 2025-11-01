package fleetManagement;
import base.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SearchVessel {

    private static String vslName = "Indian Ocean";
    private static String vslStatus = "Maintenance";
    private static String vslType = "Tanker";


    public static void main(String [] args){

        String webDriver = "Chrome";
        DriverManager.initDriver(webDriver);
        DriverManager.navigateURL(VesselData.marineExpress_URL);

        AddVessel.openFleetManagementMenu();
        addedVvslSearchbyName(vslName);
        addedVslSearchbyStatus(vslStatus);
        addedVslSearchByTypes(vslType);

    }

    private static void addedVslSearchButton(){
        WebElement searchBtn = DriverManager.getDriver().findElement(SearchVesselLocator.addedVessel_Search_Button);
        searchBtn.click();
    }
    private static void addedVvslSearchbyName (String vslName){

        WebElement searchVslbyName = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SearchVesselLocator.addedVessel_Search_byName));
        searchVslbyName.sendKeys(vslName);
        addedVslSearchButton();

}

    private static void addedVslSearchbyStatus(String status){

        // WebElement srchByStatus = driver.findElement(AddVesselLocators.addedVessel_Search_byStatus);
        WebElement srchByStatus = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SearchVesselLocator.addedVessel_Search_byStatus));
        Select select = new Select(srchByStatus);
        select.selectByValue(status);
        addedVslSearchButton();
    }

    private static void addedVslSearchByTypes(String type){

        WebElement vslSearchbyType = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(SearchVesselLocator.addedVessel_Search_byType));
        Select select = new Select(vslSearchbyType);
        select.selectByValue(type);
        addedVslSearchButton();


    }


}
