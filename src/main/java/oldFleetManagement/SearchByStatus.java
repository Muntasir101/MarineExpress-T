package oldFleetManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchByStatus {
    public static void main(String []args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://takhangithub.github.io/MavenXpress/");
        driver.manage().window().maximize();

        WebElement fleetMngmnet = driver.findElement(By.cssSelector("div[data-section='fleet'] span"));
        fleetMngmnet.click();


        WebElement srchbyStatus = driver.findElement(By.cssSelector("#vessel-status-filter"));
        Select srchStatus = new Select(srchbyStatus);
        srchStatus.selectByValue("Maintenance");

        WebElement srchbutton = driver.findElement(By.cssSelector("#search-vessels-btn"));
        srchbutton.click();

    }

}
