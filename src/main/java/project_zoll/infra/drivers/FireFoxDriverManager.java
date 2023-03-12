package project_zoll.infra.drivers;

import org.openqa.selenium.WebDriver;

public class FireFoxDriverManager extends WebDriverManager implements DriverProperties{


    WebDriver driver;
    @Override
    public WebDriver setupDriver() {

        System.setProperty(DriverProperties.FireFoxDriver,DriverProperties.FireFoxPath);

        return driver;
    }

}
