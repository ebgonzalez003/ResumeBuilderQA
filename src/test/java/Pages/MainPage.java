package Pages;


import Maps.MainPageMap;
import Utils.CommonCommands;
import Utils.ProfileData;


public class MainPage {
   CommonCommands commands;
    MainPageMap mainPageMap = new MainPageMap();
    public MainPage(CommonCommands commands) {
        this.commands = commands;
    }

    public  void modifyProfile(ProfileData pd){
            //commands.clickElement(mainPageMap.editNameBtn);
            //commands.sendKeysToElement(mainPageMap.titleTxtBx, pd.title);
            //commands.clickElement(mainPageMap.closeCountryIcon);
            //commands.sendKeysToElement(mainPageMap.selectCountryTxtBx, pd.country);
            //commands.clickElement(mainPageMap.saveBtn);
            commands.clickElement(mainPageMap.editProfileBtn);
            commands.sendKeysToElement(mainPageMap.profileEditTxtBx, pd.profile);
            commands.clickElement(mainPageMap.saveBtn);

    }

}
