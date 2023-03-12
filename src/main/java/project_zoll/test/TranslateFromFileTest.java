package project_zoll.test;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import project_zoll.actions.TranslateFromFile;
import project_zoll.infra.file_properties.LanguageFilePath;
import project_zoll.infra.file_properties.ScanFile;
import project_zoll.infra.drivers.ChromeDriverManager;

public class TranslateFromFileTest {


    WebDriver driver;


    String FileRead;


    ChromeOptions options = new ChromeOptions();


    //Setting the driver (Choosing FireFox or Chrome).
@BeforeTest
    public void setUpDriver() {

    options.addArguments("--remote-allow-origins=*");



    System.setProperty(ChromeDriverManager.ChromeWebDriver, ChromeDriverManager.ChromePath);

    driver = new ChromeDriver(options);

    }


    //In this test I will read from a text file and send the input to google translate via Selenium and print the output
    //of the translated text.

    // And also will print if the language detection works as expected(true /false).

    @Test(priority = 1)


    public void ReadFromFile_Japanese() throws InterruptedException, FileNotFoundException {
        TranslateFromFile translateFromFile = new TranslateFromFile();
        translateFromFile.  Read(driver, FileRead = ScanFile.getScannedFile(LanguageFilePath.JAPANESE));


    }


    @Test(priority = 2)


    public void ReadFromFile_Dutch() throws InterruptedException, FileNotFoundException {
        TranslateFromFile translateFromFile = new TranslateFromFile();
        translateFromFile.Read(driver, FileRead = ScanFile.getScannedFile(LanguageFilePath.HEBREW));


    }


    @Test(priority = 3)


    public void ReadFromFile_Greek() throws InterruptedException, FileNotFoundException {
        TranslateFromFile translateFromFile = new TranslateFromFile();
        translateFromFile.Read(driver, FileRead = ScanFile.getScannedFile(LanguageFilePath.GREEK));


    }


    @Test(priority = 4)


    public void ReadFromFile_French() throws InterruptedException, FileNotFoundException {
        TranslateFromFile translateFromFile = new TranslateFromFile();
        translateFromFile.Read(driver, FileRead = ScanFile.getScannedFile(LanguageFilePath.FRENCH));


    }


    @Test(priority = 5)


    public void ReadFromFile_Hebrew() throws InterruptedException, FileNotFoundException {
        TranslateFromFile translateFromFile = new TranslateFromFile();
        translateFromFile.Read(driver, FileRead = ScanFile.getScannedFile(LanguageFilePath.DUTCH));


    }





    @AfterSuite
    public void tearDown() {


        driver.quit();
    }
}




