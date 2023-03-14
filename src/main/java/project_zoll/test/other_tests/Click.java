package project_zoll.test.other_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import project_zoll.actions.TranslateFromFile;
import project_zoll.actions.other_tests_actions.SeleniumGeneralPractice;
import project_zoll.infra.drivers.DriverProperties;

public class Click {

    WebDriver driver;

    ChromeOptions options = new ChromeOptions();

    @BeforeClass
    public void setUp() {


        options.addArguments("--remote-allow-origins=*");
        System.setProperty(DriverProperties.FireFoxDriver,DriverProperties.FireFoxPath);
       // driver = new ChromeDriver(options);
        driver=new FirefoxDriver();

    }

@Test(priority =1)

public void searchInGoogle() {

        SeleniumGeneralPractice seleniumGeneralPractice = new SeleniumGeneralPractice();
        seleniumGeneralPractice.click(driver);

    }

@Test(priority =2)

public void switchTo() {

        try {


    SeleniumGeneralPractice seleniumGeneralPractice = new SeleniumGeneralPractice();
    seleniumGeneralPractice.switchToFrame(driver);




}catch (Exception e){
            e.getMessage();

        }
        finally {
            driver.quit();
        }
        }
}
