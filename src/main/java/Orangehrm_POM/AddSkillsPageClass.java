package Orangehrm_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class AddSkillsPageClass extends BasePageClass {


        public AddSkillsPageClass(WebDriver driver){
            super(driver);// this is the constructor for method used in baseclass as (this.driver) bcoz we r using extends
        }

// here the code is for----> add a skill and its description in skill page

        public void addSkillDataAndSave(String skillName, String skillDesc){

            driver.findElement(By.id("skill_name")).sendKeys(skillName);

            if(skillDesc!=null)
                driver.findElement(By.id("skill_description")).sendKeys(skillDesc);

            driver.findElement(By.id("btnSave")).click();


        }



    }


