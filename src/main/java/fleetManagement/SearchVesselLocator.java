package fleetManagement;

import org.openqa.selenium.By;

public class SearchVesselLocator {

    //Search Vessel after Added
    static final By addedVessel_Search_Button = By.cssSelector("#search-vessels-btn");
    static final By addedVessel_Search_byName = By.cssSelector("#vessel-search");
    static final By addedVessel_Search_byStatus = By.cssSelector("#vessel-status-filter");
    static final By addedVessel_Search_byType = By.cssSelector("#vessel-type-filter");
}
