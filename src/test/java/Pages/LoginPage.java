package Pages;

import Maps.LoginPageMap;
import Utils.CommonCommands;

public class LoginPage {
    CommonCommands commands;
    LoginPageMap lg = new LoginPageMap();
    public LoginPage(CommonCommands commands) {
        this.commands = commands;
    }

    public void userLogin(String userEmail, String password){
        commands.sendKeysToElement(lg.loginPageUserEmail, userEmail);
        commands.sendKeysToElement(lg.loginPagePassword, password);
        commands.clickElement(lg.loginPageLoginBtn);
    }
}
