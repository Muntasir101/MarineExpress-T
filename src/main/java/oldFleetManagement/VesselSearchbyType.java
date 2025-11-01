package oldFleetManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VesselSearchbyType {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://takhangithub.github.io/MavenXpress/");
        driver.manage().window().maximize();

        WebElement FleetManagement = driver.findElement(By.cssSelector("div[data-section='fleet'] span"));
        FleetManagement.click();

        WebElement vesselType = driver.findElement(By.cssSelector("#vessel-type-filter"));
        Select selctVesselType = new Select(vesselType);
        selctVesselType.selectByValue("Container Ship");

        WebElement srchclick = driver.findElement(By.cssSelector("#search-vessels-btn"));
        srchclick.click();


    }
}
