package Maintenance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upcoming {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://takhangithub.github.io/MavenXpress/");
        driver.manage().window().maximize();

        WebElement Maintenance = driver.findElement(By.cssSelector("div[data-section='maintenance'] span"));
        Maintenance.click();

        WebElement upcoming = driver.findElement(By.cssSelector("div[data-tab='upcoming']"));
        upcoming.click();



    }
}
