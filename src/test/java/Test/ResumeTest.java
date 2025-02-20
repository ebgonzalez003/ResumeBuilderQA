package Test;
import Data.ConstantsData;
import Utils.BaseTest;
import Utils.LoggerUtil;
import Utils.ProfileData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResumeTest extends BaseTest {
    @Test(groups = {"smoke"})
    public void validateLoginCredetianls() {
        try {
            LoggerUtil.debug(ConstantsData.LOG_ACTIONS);
            loginPage.userLogin("ebgonzalez@techmahindra.com", "@Cristo1998");
            LoggerUtil.info(ConstantsData.LOG_COMPLETED);
            if (test == null) {
                System.out.println(ConstantsData.ERROR_MESSAGE);
            } else {
                System.out.println(ConstantsData.SUCCESS_MESSAGE);
            }
        }catch (Exception e){
            LoggerUtil.error(ConstantsData.LOG_ERROR);
        }
    }

    @Test(groups = {"smoke"})
    public void updateProfileCorrectly(){
        ProfileData pd = new ProfileData();
        pd.profile= "Lorem";
        pd.title = "Cosa";
        pd.country = "Mexico";
        loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
        mainPage.modifyProfile(pd);
    }

    @Test (groups = {"regression"})
    public void validateUserCanLogout(){
        loginPage.userLogin(ConstantsData.VALID_USERNAME, ConstantsData.VALID_PASSWORD);
        mainPage.validateLogout();
        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:3000/");
    }

    @Test (groups = {"regression"})
    public void validateUserCanCreateAnAccount(){
        loginPage.validateCreateAccount();

    }

    @Test (groups = {"regression"})
    public void validateUserCanResetPwd(){
        loginPage.validateResetPwd();
    }

}
