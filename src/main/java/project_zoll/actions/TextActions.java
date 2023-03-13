package project_zoll.actions;

import org.openqa.selenium.*;
import org.testng.Assert;
import project_zoll.infra.file_properties.LanguageElements;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import static org.openqa.selenium.remote.DriverCommand.SCREENSHOT;

public class TextActions {


    static WebDriver driver;


//This function will print the Translated text from Google Translate and will verify language detection works(true/false)

    public TextActions() {
        GetText(driver);
    }


    public static String GetText(WebDriver driver) {
        Logger logger = Logger.getLogger(TextActions.class.getName());
        WaitForElement wait = new WaitForElement(driver, 5);

        try {
            //Getting the translated text to view on console.
            wait.waitForElement(By.xpath(LanguageElements.PRINT_TEXT));
            WebElement textToPrint = driver.findElement(By.xpath(LanguageElements.PRINT_TEXT));
            String translatedText = textToPrint.getText();


            //Add a log message to track the text to print
            logger.info("Translated text: " + translatedText);
            System.out.println("Translated text: " + translatedText);

            //Detect if the tested language is being detected automatically by Google Translate
            //  detectLanguage(SupportedLanguage.HEBREW);

        } catch (Exception e) {

            e.printStackTrace();
            Assert.fail("no such element: Unable to locate element:"+e.getMessage());

        }
    return "";
    }
}