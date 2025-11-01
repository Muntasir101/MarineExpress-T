package fleetManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddVesselLocators {

    // Page Object Locators
    static final By Fleet_Management_Menu = By.cssSelector("div[data-section='fleet'] span");
    static final By Add_Vessel_Button = By.cssSelector("#add-vessel-btn");
    static final By Vessel_Name = By.cssSelector("#vessel-name");
    static final By Vessel_Type = By.cssSelector("#vessel-type");
    static final By Year_Build = By.cssSelector("#year-built");
    static final By Vessel_Capacity = By.cssSelector("#capacity");
    static final By Vessel_Flag = By.cssSelector("#flag");
    static final By Vessel_CurrentLocation = By.cssSelector("#current-location");
    static final By Vessel_register_Button = By.cssSelector("form[id='vessel-form'] button[type='submit']");
    static final By Vessel_add_success_message =  By.cssSelector("#toast-message");

    static final By Vessel_search_byName = By.cssSelector("div[data-section='fleet'] span");




}


