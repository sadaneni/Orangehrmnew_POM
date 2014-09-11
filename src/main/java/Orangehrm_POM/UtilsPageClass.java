package Orangehrm_POM;

import org.openqa.selenium.WebDriver;


public class UtilsPageClass extends BasePageClass {

        public UtilsPageClass(WebDriver driver) {
            super(driver);// this is the constructor for method used in baseclass as (this.driver) bcoz we r using extends
        }

        // code below for----> to use wait command to load a page when needed
        public static void waitForSomeTime(){

            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();

            }
        }
    }


