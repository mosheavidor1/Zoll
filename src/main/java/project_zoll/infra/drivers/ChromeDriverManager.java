package project_zoll.infra.drivers;

import org.openqa.selenium.WebDriver;

public class ChromeDriverManager extends WebDriverManager implements  DriverProperties {

    WebDriver driver;

    @Override
    public WebDriver setupDriver() {

        System.setProperty(DriverProperties.ChromeWebDriver, DriverProperties.ChromePath);




        return driver;
    }

}
