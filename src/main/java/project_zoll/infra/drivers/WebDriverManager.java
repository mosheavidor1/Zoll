package project_zoll.infra.drivers;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverManager {

    WebDriver driver;

    public WebDriver setupDriver() {


        return driver;
    }
}

