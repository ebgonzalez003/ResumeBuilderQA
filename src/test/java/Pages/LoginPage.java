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
        commands.sendKeysToElement(lg.LoginPageUserEmail, userEmail);
        commands.sendKeysToElement(lg.LoginPagePassword, password);
        commands.clickElement(lg.LoginPageLoginBtn);
    }
}
