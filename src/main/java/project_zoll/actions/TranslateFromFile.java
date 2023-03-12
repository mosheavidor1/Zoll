package project_zoll.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_zoll.infra.file_properties.LanguageElements;
import project_zoll.infra.file_properties.TranslateProperites;

public class TranslateFromFile {

    WebDriver driver;

    String FileRead;


    // Typing the text to be translated.
    public void Read(WebDriver driver, String FileRead) throws InterruptedException {
        this.driver = driver;
        this.FileRead = FileRead;

        WaitForElement wait = new WaitForElement(driver, 30);

        driver.get(TranslateProperites.GOOGLE_TRANSLATE_URL);
        driver.manage().window().fullscreen();
        driver.findElement(By.cssSelector(LanguageElements.SOURCE_LANGUAGE)).sendKeys(FileRead);

        //This function will print the Translated text from Google Translate and will verify language detection works(true/false)
        TextActions.GetText(driver);




    }


}



