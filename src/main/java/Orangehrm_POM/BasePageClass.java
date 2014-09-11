package Orangehrm_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePageClass {



        static WebDriver driver;

        public BasePageClass(WebDriver driver){

            this.driver= driver;// to use driver in all classes like, addskillpage, homepage, loginpage etc..
            // by super(driver) which u can c in all classes

        }

        // code below for---> clicking on logout linktext
        public static void logOut(){

            driver.findElement(By.linkText("Welcome Admin")).click();
            UtilsPageClass.waitForSomeTime();
            driver.findElement(By.linkText("Logout")).click();

        }


    }


