package oldFleetManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Old_VesselSearch {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://takhangithub.github.io/MavenXpress/");
        driver.manage().window().maximize();

        WebElement FleetManagement = driver.findElement(By.cssSelector("div[data-section='fleet'] span"));
        FleetManagement.click();

        WebElement Search = driver.findElement(By.cssSelector("#vessel-search"));
        Search.sendKeys("Indian Ocean");

        WebElement SearchButton = driver.findElement(By.cssSelector("#search-vessels-btn"));
        SearchButton.click();














    }
}
