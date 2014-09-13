package Orangehrm_POM;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Test extends BasePageClass {


    @BeforeClass
    public static void setUP(){

        driver = new FirefoxDriver();
        driver.get("http://demo.orangehrmlive.com/symfony/web/index.php/auth/login");


    }

    @AfterClass
    public static void tearDown(){

        driver.quit();
        driver = null;

    }

}
