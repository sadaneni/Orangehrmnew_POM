package Orangehrm_POM;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class UtilsPageClass extends BasePageClass {


    // code below for----> to use wait command to load a page when needed
    public static void waitForSomeTime() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}


