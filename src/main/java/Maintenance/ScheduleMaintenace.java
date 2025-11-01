
// Issue: Cannot Find the Vessel Name


package Maintenance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScheduleMaintenace {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://takhangithub.github.io/MavenXpress/");
                driver.manage().window().maximize();

        WebElement Maintenance = driver.findElement(By.cssSelector("div[data-section='maintenance'] span"));
        Maintenance.click();

        WebElement NewMaintenance = driver.findElement(By.cssSelector("#add-maintenance-btn"));
        NewMaintenance.click();

        WebElement selVsl = driver.findElement(By.cssSelector("#maintenance-vessel"));
        Select selectVsl = new Select(selVsl);
        //selectVsl.selectByValue("Mediterranean Voyager (Bulk Carrier)");
        selectVsl.selectByIndex(1);

        WebElement MntnType = driver.findElement(By.cssSelector("#maintenance-type"));
        Select selMntnType = new Select(MntnType);
        selMntnType.selectByValue("Hull Cleaning");

        WebElement MntnDate = driver.findElement(By.cssSelector("#maintenance-date"));
        MntnDate.sendKeys("09/25/2026");

        WebElement Duration = driver.findElement(By.cssSelector("#maintenance-duration"));
        Duration.sendKeys("30");

        WebElement Cost = driver.findElement(By.cssSelector("#maintenance-cost"));
        Cost.sendKeys("7800");

        WebElement mntnCost = driver.findElement(By.cssSelector("#maintenance-description"));
        mntnCost.sendKeys("Vessel Ready for Maintenance");

        WebElement schdlMntButton = driver.findElement(By.cssSelector("form[id='maintenance-form'] button[type='submit']"));
        schdlMntButton.click();








    }




}
