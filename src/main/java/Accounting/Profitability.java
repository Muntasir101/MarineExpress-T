package Accounting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Profitability {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://takhangithub.github.io/MavenXpress/");
        driver.manage().window().maximize();

        WebElement vslAccounting = driver.findElement(By.cssSelector("div[data-section='accounting'] span"));
        vslAccounting.click();

        WebElement profitability = driver.findElement(By.cssSelector("div[data-tab='profitability']"));
        profitability.click();


    }
}
