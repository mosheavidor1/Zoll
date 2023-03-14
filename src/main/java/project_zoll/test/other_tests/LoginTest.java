package project_zoll.test.other_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import project_zoll.actions.other_tests_actions.SeleniumGeneralPractice;
import project_zoll.infra.drivers.DriverProperties;

public class LoginTest {


    WebDriver driver;

    ChromeOptions options = new ChromeOptions();

    @BeforeClass
    public void setUp() {


        options.addArguments("--remote-allow-origins=*");
        System.setProperty(DriverProperties.ChromeWebDriver,DriverProperties.ChromePath);
         driver = new ChromeDriver(options);


    }

    @Test

    public void loginToWeb(){

SeleniumGeneralPractice seleniumGeneralPractice= new SeleniumGeneralPractice();

seleniumGeneralPractice.Login(driver);

    }



}
