package Orangehrm_POM;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


   public class SanityTestSuitePOM extends BasePageClass{



        @Test
        public void userCanAddskills(){// this method represents only one test case

            String skillName= "test"; // this is written here bcoz i m using skillname many times in below code

            LoginPageClass loginpage1 = new LoginPageClass();
            loginpage1.LoginAttempt("Admin","admin");// First takes login credentials from the loginpage in main_java_package

            HomePageClass gotoSkillsPage = new HomePageClass();
            gotoSkillsPage.gotoSkillsPage();// Then going to homepage after login and works as what code given in homepage

            SkillsListPageClass skillListPage = new SkillsListPageClass();
            skillListPage.gotoAddSkills();// Then going to skillspage in home page and  works as what code given in skilllistpage
           // skillListPage.deleteSkill();


            AddSkillsPageClass addSkillPage = new AddSkillsPageClass();
            addSkillPage.addSkillDataAndSave(skillName,null);// Then going to click on addskill in skills and works as what code given in addskillpage

            Assert.assertTrue(SkillsListPageClass.isSkillInTheList(skillName));// Then checking whether the condition asking is true or wrong

            SkillsListPageClass.logOut();// then clicking on logout link
        }

    }


