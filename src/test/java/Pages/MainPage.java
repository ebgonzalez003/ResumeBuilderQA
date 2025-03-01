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
            commands.clickElement(mainPageMap.editNameBtn);
            commands.sendKeysToElement(mainPageMap.titleTxtBx, pd.title);
            commands.clickElement(mainPageMap.closeCountryIcon);
            commands.sendKeysToElement(mainPageMap.selectCountryTxtBx, pd.country);
            commands.clickElement(mainPageMap.saveBtn);
            commands.clickElement(mainPageMap.editProfileBtn);
            commands.sendKeysToElement(mainPageMap.profileEditTxtBx, pd.profile);
            commands.clickElement(mainPageMap.saveBtn);
    }

    public void validateLogout(){
        commands.clickElement(mainPageMap.hamburguerBtn);
        commands.clickElement(mainPageMap.logoutBtn);
    }

    public void validateUserCanUpdateExperience(){
        commands.clickElement(mainPageMap.addExperienceBtn);
        commands.sendKeysToElement(mainPageMap.companyTxtBx, "Techmahindra");
        commands.sendKeysToElement(mainPageMap.projectTxtBx, "Google");
        commands.sendKeysToElement(mainPageMap.roleTxtBx, "Test Engineer");
        commands.sendKeysToElement(mainPageMap.locationTxtBx, "Monterrey");
        //commands.selectRandomDate("//div[3]/div[3]/div/div/div[2]/div[3]/div[1]/div/div/div/button","//div[4]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[1]/button", 30);
        commands.sendKeysToElement(mainPageMap.descriptionBtn, commands.generateRandomLorem(30));
        commands.sendKeysToElement(mainPageMap.technologiesBtn, commands.generateRandomTechnologies(5));
        commands.clickElement(mainPageMap.saveExperienceBtn);
    }

    public void validateUserCanAddSkills(){
        commands.clickElement(mainPageMap.addSkillsBtn);
    }

    public void validateUserCanAddEducation(){
        commands.clickElement(mainPageMap.editEducationBtn);
        commands.sendKeysToElement(mainPageMap.degreeTxtBx, "Professional");
        commands.sendKeysToElement(mainPageMap.studyTxtBx, "Engineering");
        commands.sendKeysToElement(mainPageMap.institutionTxtBx, "UNID");
    }

    public void validateUserCanAddCertifications(){
        commands.clickElement(mainPageMap.certificationsAddBtn);
        commands.sendKeysToElement(mainPageMap.nameTxtBx, "GCP");
        commands.sendKeysToElement(mainPageMap.institutionBx, "Google");
        commands.sendKeysToElement(mainPageMap.certificationDateBx, String.valueOf(commands.currentDate()));

    }
}
