package project_zoll.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import project_zoll.actions.ClickOnElement;
import project_zoll.infra.drivers.ChromeDriverManager;

public class ClickOnElementTest {


    WebDriver driver;

    String FileRead;


    ChromeOptions options = new ChromeOptions();


    @BeforeTest
    public void setUpDriver() {

        options.addArguments("--remote-allow-origins=*");


        System.setProperty(ChromeDriverManager.ChromeWebDriver, ChromeDriverManager.ChromePath);

        driver = new ChromeDriver(options);

    }
        @Test

        public void clickOnLanguage () throws InterruptedException {

          ClickOnElement.clickOn(driver);



        }

     @AfterSuite

    public void tearDown() throws InterruptedException {

        
        driver.quit();
     }
    }

