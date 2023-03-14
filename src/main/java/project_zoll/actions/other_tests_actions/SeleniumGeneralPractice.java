package project_zoll.actions.other_tests_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_zoll.actions.WaitForElement;

public class SeleniumGeneralPractice {

WebDriver driver;


    public void click(WebDriver driver){

        this.driver=driver;

        driver.get("https://google.com");
        driver.manage().window().fullscreen();
        WaitForElement wait= new WaitForElement(driver,30);
        wait.waitForElement(By.name("q"));
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("This is a test");


    }



    public void switchToFrame(WebDriver driver){

        driver.get("https://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e"); //switching the frame by ID

        System.out.println("********We are switch to the iframe*******");
        driver.findElement(By.xpath("html/body/a/img")).click();
        //Clicks the iframe

        System.out.println("*********We are done***************");

        driver.switchTo().defaultContent();

    }
}







