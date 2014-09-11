package Orangehrm_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPageClass extends BasePageClass {

        public LoginPageClass(WebDriver driver){
            super(driver);// this is the constructor for method used in baseclass as (this.driver) bcoz we r using extends
        }

        // code for ----> now we r in login page and entering login credentials
        public void LoginAttempt(String username, String password){
            //

            driver.findElement(By.id("txtUsername")).sendKeys(username);
            driver.findElement(By.id("txtPassword")).sendKeys(password);

            driver.findElement(By.id("btnLogin")).click();
        }


    }




