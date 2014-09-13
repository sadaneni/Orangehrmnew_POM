package Orangehrm_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePageClass {


    protected static WebDriver driver;

        // code below for---> clicking on logout linktext
        public static void logOut(){

            driver.findElement(By.linkText("Welcome Admin")).click();
            UtilsPageClass.waitForSomeTime();
            driver.findElement(By.linkText("Logout")).click();

        }


    }


