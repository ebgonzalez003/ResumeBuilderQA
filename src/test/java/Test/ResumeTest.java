package Test;

import Data.ConstantsData;
import Pages.MainPage;
import Utils.BaseTest;
import Utils.LoggerUtil;
import Utils.ProfileData;
import org.testng.annotations.Test;

public class ResumeTest extends BaseTest {
    @Test(groups = {"regression"})
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

    @Test(groups = {"regression"})
    public void updateProfileCorrectly(){
        ProfileData pd = new ProfileData();
        pd.profile= "Lorem";
        pd.title = "Cosa";
        pd.country = "Mexico";
        loginPage.userLogin("ebgonzalez@techmahindra.com", "@Cristo1998");
        mainPage.modifyProfile(pd);


    }

}
