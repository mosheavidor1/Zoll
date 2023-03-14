package project_zoll.actions.other_tests_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import project_zoll.actions.WaitForElement;

public class SeleniumGeneralPractice {

    WebDriver driver;


    public void click(WebDriver driver) {

        this.driver = driver;

        driver.get("https://google.com");
        driver.manage().window().fullscreen();
        WaitForElement wait = new WaitForElement(driver, 30);
        wait.waitForElement(By.name("q"));
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("This is a test");


    }


    public void switchToFrame(WebDriver driver) {

        driver.get("https://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e"); //switching the frame by ID

        System.out.println("********We are switch to the iframe*******");
        driver.findElement(By.xpath("html/body/a/img")).click();
        //Clicks the iframe

        System.out.println("*********We are done***************");

        driver.switchTo().defaultContent();


    }


    public void Login(WebDriver driver) {
        WaitForElement wait = new WaitForElement(driver, 30);
        driver.get("https://pre-prod-sleep.itamar-online.com/Dashboar");
        driver.manage().window().fullscreen();

            wait.waitForElement(By.cssSelector("input[type='text']"));
            driver.findElement(By.cssSelector("input[type='text']")).sendKeys("AvidorfTest");

            wait.waitForElement(By.xpath("//input[@type='password']"));
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("AvidorfTest123!");


            wait.waitForElement(By.xpath("//button[@type='submit']"));
            driver.findElement(By.xpath("//button[@type='submit']")).click();

//            wait.waitForElement(By.xpath("//span[normalize-space()='AvidorfTest']"));

          wait.waitForElement(By.xpath("//span[@id=\"username\"]"));
         WebElement userName= driver.findElement(By.xpath("//span[@id=\"username\"]"));
         userName.getText();

        System.out.println(userName.getText());

         Assert.assertEquals(userName.getText(),"AvidorfTest");





//   //span[normalize-space()='AvidorfTest']


        }
    }









