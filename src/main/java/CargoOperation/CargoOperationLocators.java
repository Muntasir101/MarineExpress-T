package CargoOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CargoOperationLocators {

    static final By cargo_Operation_Menu = By.cssSelector("div[data-section='cargo'] span");

    //div[class='nav-item active'] span  -- Active ???????????????????????????????????????????????????

    static final By cargo_Booking_Tab = By.cssSelector("div[data-tab='booking']");
    static final By cargo_Type = By.cssSelector("#cargo-type");
    static final By cargo_Weight = By.cssSelector("#weight");
    static final By cargo_Origin = By.cssSelector("#origin");
    static final By cargo_Destination = By.cssSelector("#destination");
    static final By bookCargo_Button = By.cssSelector("#book-cargo-btn");
    static final By cargo_ID = By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(7) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(1)");

    static final By cargo_Allocation_Tab = By.cssSelector("div[data-tab='allocation']");
    static final By cargo_ID_List = By.cssSelector("#cargo-select");
    static final By select_Vessel = By.cssSelector("#vessel-select");
    static final By LoadingDate = By.cssSelector("#loading-date");
    static final By ExpArrival = By.cssSelector("#estimated-arrival");
    static final By AllocateButton = By.cssSelector("#allocate-cargo-btn");


}
