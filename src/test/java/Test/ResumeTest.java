package Test;
import Data.ConstantsData;
import Maps.MainPageMap;
import Utils.BaseTest;
import Utils.LoggerUtil;
import Utils.ProfileData;
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
        try { loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
            Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
            mainPage.fillAllResume();
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

