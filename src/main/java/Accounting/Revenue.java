package Accounting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revenue {



    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://takhangithub.github.io/MavenXpress/");
        driver.manage().window().maximize();

        WebElement vslAccounting = driver.findElement(By.cssSelector("div[data-section='accounting'] span"));
        vslAccounting.click();

        WebElement Revenue = driver.findElement(By.cssSelector("div[data-tab='revenue']"));
        Revenue.click();

        WebElement ttlRevnue = driver.findElement(By.cssSelector("#total-revenue"));
        String totalRev = ttlRevnue.getText();
        System.out.println(totalRev);



        }


    }

