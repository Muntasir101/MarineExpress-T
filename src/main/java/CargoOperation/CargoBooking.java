package CargoOperation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import base.DriverManager;



public class CargoBooking {

    public static void main(String[] args){
        cargo_OperationMenu();
        cargoBooking();
    }

    public static void cargo_OperationMenu(){

        String webDriver = "Chrome";
        DriverManager.initDriver(webDriver);
        DriverManager.navigateURL(CargoOperationData.marineExpress_URL);
        WebElement cargoOperationMenu = DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(CargoOperationLocators.cargo_Operation_Menu));
        cargoOperationMenu.click();
    }

    public static void cargoBooking(){

        WebElement cargoBookingMenu = DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(CargoOperationLocators.cargo_Booking_Tab));
        cargoBookingMenu.click();

        WebElement cargoType = DriverManager.getWait().until(ExpectedConditions.visibilityOfElementLocated(CargoOperationLocators.cargo_Type));
        //WebElement cargoType = driver.findElement(CargoOperationLocators.cargo_Type);
        Select select = new Select(cargoType);
        select.selectByValue(CargoOperationData.Data_cargo_Type);

        WebElement cargoWeight = DriverManager.getDriver().findElement(CargoOperationLocators.cargo_Weight);
        cargoWeight.sendKeys(CargoOperationData.Data_Cargo_Weight);

        WebElement cargoOrigin = DriverManager.getDriver().findElement(CargoOperationLocators.cargo_Origin);
        cargoOrigin.sendKeys(CargoOperationData.Data_Cargo_Origin);

        WebElement cargoDestination = DriverManager.getDriver().findElement(CargoOperationLocators.cargo_Destination);
        cargoDestination.sendKeys(CargoOperationData.Data_Cargo_Destination);

        WebElement bookCargoButton = DriverManager.getDriver().findElement(CargoOperationLocators.bookCargo_Button);
        bookCargoButton.click();

        WebElement cargo_ID = DriverManager.getDriver().findElement(CargoOperationLocators.cargo_ID);
        CargoOperationData.Data_Cargo_ID = cargo_ID.getText();
        System.out.println(CargoOperationData.Data_Cargo_ID);
    }

}
