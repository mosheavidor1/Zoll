package project_zoll.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import project_zoll.infra.file_properties.LanguageElements;

import java.sql.Driver;

public class ClickOnElement {

    WebDriver driver;


    public static void clickOn(WebDriver driver) throws InterruptedException {
        WaitForElement wait = new WaitForElement(driver, 5);

        driver.get(LanguageElements.GOOGLE_TRANSLATE_URL);
        driver.manage().window().fullscreen();
        try {


          //  wait.waitForElement(By.xpath("//button[@id='i822']"));

            driver.findElement(By.xpath("//button[@id='i8']")).click();


        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail("No such element"+e.getMessage());

        }
    }
}