package Test;
import Data.ConstantsData;
import Maps.MainPageMap;
import Utils.BaseTest;
import Utils.LoggerUtil;
import Utils.ProfileData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResumeTest extends BaseTest {
    MainPageMap mainPageMap = new MainPageMap();
    @Test(groups = {"smoke"})
    public void validateLoginCredetianls() {
        try {
            LoggerUtil.debug(ConstantsData.LOG_ACTIONS);
            loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
            Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
            LoggerUtil.info(ConstantsData.LOG_COMPLETED);
            if (test == null) {
                System.out.println(ConstantsData.ERROR_MESSAGE);
            } else {
                System.out.println(ConstantsData.SUCCESS_MESSAGE);
            }
        } catch (Exception e) {
            LoggerUtil.error(ConstantsData.LOG_ERROR);
        }
    }

    @Test(groups = {"smoke"})
    public void updateProfileCorrectly() {
       try{ ProfileData pd = new ProfileData();
            mainPage.modifyProfile(pd);
            pd.profile = commands.generateRandomLorem(10);
            pd.title = commands.generateRandomLorem(1);
            pd.country = ConstantsData.Mexico;
            loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
            Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
            if (test == null) {
               System.out.println(ConstantsData.ERROR_MESSAGE);
           } else {
               System.out.println(ConstantsData.SUCCESS_MESSAGE);
           }
       } catch (Exception e) {
           LoggerUtil.error(ConstantsData.LOG_ERROR);
       }
    }
    @Test(groups = {"smoke"})
    public void validateUserCanEditProfile() {
        try{ loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
            Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
            mainPage.validateUserCanEditProfile();
            Assert.assertTrue(commands.isElementPresent(mainPageMap.informationMsg));
            if (test == null) {
                System.out.println(ConstantsData.ERROR_MESSAGE);
            } else {
                System.out.println(ConstantsData.SUCCESS_MESSAGE);
            }
        } catch (Exception e) {
            LoggerUtil.error(ConstantsData.LOG_ERROR);
        }
    }

    @Test(groups = {"regression"})
    public void validateUserCanLogout() {
        try {loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
        Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
        mainPage.validateLogout();
        Assert.assertEquals(driver.getCurrentUrl(), ConstantsData.URL);
        if (test == null) {
                System.out.println(ConstantsData.ERROR_MESSAGE);
            } else {
                System.out.println(ConstantsData.SUCCESS_MESSAGE);
            }
        } catch (Exception e) {
            LoggerUtil.error(ConstantsData.LOG_ERROR);
        }
    }

    @Test(groups = {"regression"})
    public void validateUserCanCreateAnAccount() {
        try{ loginPage.validateCreateAccount();
            Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
            if (test == null) {
                System.out.println(ConstantsData.ERROR_MESSAGE);
            } else {
                System.out.println(ConstantsData.SUCCESS_MESSAGE);
            }
        } catch (Exception e) {
            LoggerUtil.error(ConstantsData.LOG_ERROR);
        }

    }

    @Test(groups = {"regression"})
    public void validateUserCanResetPwd() {
       try{ loginPage.validateResetPwd();
           Assert.assertEquals(driver.getCurrentUrl(), ConstantsData.UrlHelp);
           if (test == null) {
               System.out.println(ConstantsData.ERROR_MESSAGE);
           } else {
               System.out.println(ConstantsData.SUCCESS_MESSAGE);
           }
       } catch (Exception e) {
           LoggerUtil.error(ConstantsData.LOG_ERROR);
       }
    }

    @Test(groups = {"regression"})
    public void validateUserCanUpdateExperience() {
        try{ loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
            mainPage.validateUserCanUpdateExperience();
            Assert.assertFalse(commands.isElementPresent(mainPageMap.experienceAlertMsg));
            if (test == null) {
                System.out.println(ConstantsData.ERROR_MESSAGE);
            } else {
                System.out.println(ConstantsData.SUCCESS_MESSAGE);
            }
        } catch (Exception e) {
            LoggerUtil.error(ConstantsData.LOG_ERROR);
        }
    }

    @Test(groups = {"regression"})
    public void validateUserCanUpdateSkills() {
        try{ loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
            Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
            mainPage.validateUserCanAddSkills();
            Assert.assertTrue(commands.isElementPresent(mainPageMap.saveSkillAlert));
            if (test == null) {
                System.out.println(ConstantsData.ERROR_MESSAGE);
            } else {
                System.out.println(ConstantsData.SUCCESS_MESSAGE);
            }
        } catch (Exception e) {
            LoggerUtil.error(ConstantsData.LOG_ERROR);
        }
    }

    @Test(groups = {"regression"})
    public void validateUserCanAddEducation() {
        try{ loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
            Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
            mainPage.validateUserCanAddEducation();
            Assert.assertTrue(commands.isElementPresent(mainPageMap.eduSaveMsj));
            if (test == null) {
                System.out.println(ConstantsData.ERROR_MESSAGE);
            } else {
                System.out.println(ConstantsData.SUCCESS_MESSAGE);
            }
        } catch (Exception e) {
            LoggerUtil.error(ConstantsData.LOG_ERROR);
        }
    }

    @Test(groups = {"regression"})
    public void validateUserCanAddCertifications() {
        try{ loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
            Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
            mainPage.validateUserCanAddCertifications();
            if (test == null) {
                System.out.println(ConstantsData.ERROR_MESSAGE);
            } else {
                System.out.println(ConstantsData.SUCCESS_MESSAGE);
            }
        } catch (Exception e) {
            LoggerUtil.error(ConstantsData.LOG_ERROR);
        }
    }
    @Test(groups = {"regression"}) // Added by Andrexo
    public void validateUserCanAddLanguage() {
        try{ loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
            Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
            mainPage.validateUserCanAddLanguage();
            if (test == null) {
                System.out.println(ConstantsData.ERROR_MESSAGE);
            } else {
                System.out.println(ConstantsData.SUCCESS_MESSAGE);
            }
        } catch (Exception e) {
            LoggerUtil.error(ConstantsData.LOG_ERROR);
        }
    }

    @Test(groups = {"regression"})
    public void validateUserCanAddInterests() {
       try{ loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
           Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
            mainPage.validateUserCanAddInterests();
           if (test == null) {
               System.out.println(ConstantsData.ERROR_MESSAGE);
           } else {
               System.out.println(ConstantsData.SUCCESS_MESSAGE);
           }
       } catch (Exception e) {
           LoggerUtil.error(ConstantsData.LOG_ERROR);
       }
    }

    @Test (groups = {"regression"})
    public void validateUserCanCancelInterests() {
        try{ loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
            Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
            mainPage.validateUserCanCancelInterests();
            if (test == null) {
                System.out.println(ConstantsData.ERROR_MESSAGE);
            } else {
                System.out.println(ConstantsData.SUCCESS_MESSAGE);
            }
        } catch (Exception e) {
            LoggerUtil.error(ConstantsData.LOG_ERROR);
        }
    }

    @Test (groups = {"regression"})
    public void validateCanFillAvailabilityToTravel(){
        try { loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
            Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
            mainPage.userCanAddAvailabilityToTravel();
            if (test == null) {
                System.out.println(ConstantsData.ERROR_MESSAGE);
            } else {
                System.out.println(ConstantsData.SUCCESS_MESSAGE);
            }
        } catch (Exception e) {
            LoggerUtil.error(ConstantsData.LOG_ERROR);
        }
    }
    @Test (groups = {"regression"})
    public void validateUserCanFillAllResume(){
        try {
            mainPage.fillAllResume();
            Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
            if (test == null) {
                System.out.println(ConstantsData.ERROR_MESSAGE);
            } else {
                System.out.println(ConstantsData.SUCCESS_MESSAGE);
            }
        } catch (Exception e) {
            LoggerUtil.error(ConstantsData.LOG_ERROR);
        }
    }
    @Test (groups = {"regression"})
    public void validateUserCanDeleteExperience(){
        try { loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
            Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
            mainPage.validateUserCanDeleteExperience();
            Assert.assertFalse(commands.isElementPresent(mainPageMap.experienceAlertMsg));
            if (test == null) {
                System.out.println(ConstantsData.ERROR_MESSAGE);
            } else {
                System.out.println(ConstantsData.SUCCESS_MESSAGE);
            }
        } catch (Exception e) {
            LoggerUtil.error(ConstantsData.LOG_ERROR);
        }
    }
    @Test (groups = {"regression"})
    public void validateUserCanDeleteSkills(){
        try { loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
            Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
            mainPage.validateUserCanDeleteSkills();
            Assert.assertFalse(commands.isElementPresent(mainPageMap.experienceAlertMsg));
            if (test == null) {
                System.out.println(ConstantsData.ERROR_MESSAGE);
            } else {
                System.out.println(ConstantsData.SUCCESS_MESSAGE);
            }
        } catch (Exception e) {
            LoggerUtil.error(ConstantsData.LOG_ERROR);
        }
    }
}

