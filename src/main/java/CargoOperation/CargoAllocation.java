package CargoOperation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import static CargoOperation.CargoOperationLocators.cargo_Allocation_Tab;
import static CargoOperation.CargoOperationLocators.cargo_Operation_Menu;
import base.DriverManager;


public class CargoAllocation {

    public static void main(String[] args){

        cargo_OperationMenu();
        CargoBooking.cargoBooking();
        cargo_Allocation();
    }

    public static void cargo_OperationMenu(){
        String webDriver = "Chrome";
        DriverManager.initDriver(CargoOperationData.web_Driver);
        DriverManager.navigateURL(CargoOperationData.marineExpress_URL);
        WebElement cargoOperationMenu = DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(cargo_Operation_Menu));
        cargoOperationMenu.click();
    }

    public static void cargo_Allocation(){

        WebElement cargoAllocationTab = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(cargo_Allocation_Tab));
        cargoAllocationTab.click();

        WebElement cargoIDList = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(CargoOperationLocators.cargo_ID_List));
        Select select = new Select(cargoIDList);
        select.selectByIndex(1);

        WebElement selectVessel = DriverManager.getDriver().findElement(CargoOperationLocators.select_Vessel);
        Select select1 = new Select(selectVessel);
        select1.selectByIndex(1);

        WebElement loadingDate = DriverManager.getDriver().findElement(CargoOperationLocators.LoadingDate);
        loadingDate.sendKeys(CargoOperationData.Data_Loading_Date);

        WebElement arrivalDate = DriverManager.getDriver().findElement(CargoOperationLocators.ExpArrival);
        arrivalDate.sendKeys(CargoOperationData.Data_Estimated_Arrival);

        WebElement allocateCargo = DriverManager.getDriver().findElement(CargoOperationLocators.AllocateButton);
        allocateCargo.click();

    }
}
