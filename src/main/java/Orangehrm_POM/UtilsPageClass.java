package Orangehrm_POM;

import org.openqa.selenium.WebDriver;


public class UtilsPageClass extends BasePageClass {


        // code below for----> to use wait command to load a page when needed
        public static void waitForSomeTime(){

            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();

            }
        }
    }


