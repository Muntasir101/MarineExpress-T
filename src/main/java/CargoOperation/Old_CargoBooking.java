package CargoOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Old_CargoBooking {

    public static String cargoidVal;

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://takhangithub.github.io/MavenXpress/");
        driver.manage().window().maximize();

        WebElement CargoOpration = driver.findElement(By.cssSelector("div[data-section='cargo'] span"));
        CargoOpration.click();

        //Booking Tab Operation
        WebElement cargoBooking = driver.findElement(By.cssSelector("div[data-tab='booking']"));
        cargoBooking.click();

        WebElement cargoType = driver.findElement(By.cssSelector("#cargo-type"));
        Select selctCarTyp = new Select(cargoType);
        selctCarTyp.selectByValue("Bulk");

        WebElement Weight = driver.findElement(By.cssSelector("#weight"));
        Weight.sendKeys("5200");

        WebElement Origin = driver.findElement(By.cssSelector("#origin"));
        Origin.sendKeys("USA");

        WebElement Destination = driver.findElement(By.cssSelector("#destination"));
        Destination.sendKeys("Chittagong");

        WebElement bookCargBtn = driver.findElement(By.cssSelector("#book-cargo-btn"));
        bookCargBtn.click();

        // Store value of cargo id from the last row of cargo table
        WebElement cargoID = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(7) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(5) > td:nth-child(1)"));
        cargoidVal = cargoID.getText();
        System.out.println("Cargo ID is :"+cargoidVal);


        //Allocation PAGE
        /// ///////////////////////////

        WebElement Allocation = driver.findElement(By.cssSelector("div[data-tab='allocation']"));
        Allocation.click();


        // Print the cargo id value from drop down list
        WebElement cargoId = driver.findElement(By.cssSelector("#cargo-select"));
        String cargobookID = cargoId.getText();
        System.out.println(cargobookID);


        // Select the value of cargoidVal from dropdown list
        WebElement SelectCargoList = driver.findElement(By.cssSelector("#cargo-select"));
        Select selectCargo = new Select(SelectCargoList);
        selectCargo.selectByValue(cargoidVal);


        WebElement selctVsl = driver.findElement(By.cssSelector(" #vessel-select"));
        Select selCargVsl = new Select(selctVsl);
        selCargVsl.selectByValue("VS-003");


        try {
            // Pauses the code execution for 5000 milliseconds (5 seconds)
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // Handle the interruption exception if the thread is interrupted
            Thread.currentThread().interrupt();
        }

        WebElement LoadingDate = driver.findElement(By.cssSelector("#loading-date"));
        LoadingDate.sendKeys("05/12/2025");

        WebElement ExpArrival = driver.findElement(By.cssSelector("#estimated-arrival"));
        ExpArrival.sendKeys("06/16/2025");

        WebElement AllocateButton = driver.findElement(By.cssSelector("#allocate-cargo-btn"));
        AllocateButton.click();


        // LOAD UNLOAD PAGE
        /// /////////////////////

        WebElement loadUnloadPg = driver.findElement(By.cssSelector("div[data-tab='load-unload']"));
        loadUnloadPg.click();

        WebElement operationType = driver.findElement(By.cssSelector("#operation-type"));
        Select selOpType = new Select(operationType);
        selOpType.selectByValue("Unloading");

        WebElement SelectCargo = driver.findElement(By.cssSelector("#cargo-operation"));
        Select selCargType = new Select(SelectCargo);
        selCargType.selectByValue(cargoidVal);

        try {
            // Pauses the code execution for 5000 milliseconds (5 seconds)
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // Handle the interruption exception if the thread is interrupted
            Thread.currentThread().interrupt();
        }


        WebElement OprationDate = driver.findElement(By.cssSelector("#operation-date"));
        OprationDate.sendKeys("05/16/2025");

        WebElement operationStatus = driver.findElement(By.cssSelector(" #operation-status"));
        Select OpStatus = new Select(operationStatus);
        OpStatus.selectByValue("Scheduled");

        WebElement saveOpButton = driver.findElement(By.cssSelector(" #save-operation-btn"));
        saveOpButton.click();


    }
}
