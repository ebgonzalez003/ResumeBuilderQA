package Pages;
import Data.ConstantsData;
import Maps.LoginPageMap;
import Utils.CommonCommands;

public class LoginPage {
    CommonCommands commands;
    LoginPageMap lg = new LoginPageMap();
    LoginPageMap loginPageMap = new LoginPageMap();
    public LoginPage(CommonCommands commands) {
        this.commands = commands;
    }

    public void userLogin(String userEmail, String password){
        commands.sendKeysToElement(lg.loginPageUserEmail, userEmail);
        commands.sendKeysToElement(lg.loginPagePassword, password);
        commands.clickElement(lg.loginPageLoginBtn);
    }
    public void validateCreateAccount(){
        commands.clickElement(loginPageMap.createAccountBtn);
        commands.sendKeysToElement(loginPageMap.nameTxtBx, "Emiliano");
        commands.sendKeysToElement(loginPageMap.lastNameTxtBx, "Gonzalez");
        String email = commands.generateEmail();
        commands.sendKeysToElement(loginPageMap.emailTxtBx, email);
        commands.sendKeysToElement(loginPageMap.titleTxtBx, "engineer");
        commands.sendKeysToElement(loginPageMap.passwordTxtBx, "@Gpassword1");
        commands.clickElement(loginPageMap.createBtn);
    }

    public void validateResetPwd(){
        commands.clickElement(loginPageMap.forgotPasswordBtn);
        commands.clickElement(loginPageMap.createTicketBtn);
        commands.waitForUrlContains("http://localhost:3000/forgot-password");
        commands.switchToTab(1);
        commands.sendKeysToElement(loginPageMap.emailTicketTxtBx, commands.generateEmail());
        commands.clickElement(loginPageMap.nextTicketBtn);
        commands.sendKeysToElement(loginPageMap.pwdTicketTxtBx, ConstantsData.VALID_PASSWORD);
        commands.clickElement(loginPageMap.registryBtn);
        commands.waitForElementToBeVisible(loginPageMap.helpTxt);
    }
}
