package Orangehrm_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SkillsListPageClass extends BasePageClass {

        public SkillsListPageClass(WebDriver driver){
            super(driver);// this is the constructor for method used in baseclass as (this.driver) bcoz we r using extends
        }

        //code below for----> clicking on add button in skill page in the site
        public void gotoAddSkills(){

            driver.findElement(By.id("btnAdd")).click();
        }

        // code below for----> delete the skill from the list of skills.
        // but i did not use this method anywhere so it is shown in ash colour(deleteSkill) below
        public void deleteSkill(){

            driver.findElement(By.xpath("//*{@id=\"recordsListTable\"}/tbody/tr{5}/td{1}input")).click();
            driver.findElement(By.id("btnDel")).click();
            UtilsPageClass.waitForSomeTime();
        }

        // code below for ----> to check whether the linktext(skill) is displayed or not
        public static boolean isSkillInTheList(String skill){
            return driver.findElement(By.linkText(skill)).isDisplayed();
        }

    }


