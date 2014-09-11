package Orangehrm_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageClass extends BasePageClass {


        public  HomePageClass(WebDriver driver){
            super(driver);// this is the constructor for method used in baseclass as (this.driver) bcoz we r using extends
        }

        //code below is for----> in home page going to admin then qualifications and then to skills
        public void gotoSkillsPage(){

            driver.findElement(By.id("menu_admin_viewAdminModule")).click();
            driver.findElement(By.id("menu_admin_Qualifications")).click();
            driver.findElement(By.id("menu_admin_viewSkills")).click();


        }



    }


