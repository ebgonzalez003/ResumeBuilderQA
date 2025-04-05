package Pages;
import Maps.MainPageMap;
import Utils.CommonCommands;
import Utils.ProfileData;
import org.openqa.selenium.WebElement;

public class MainPage {
    CommonCommands commands;
    MainPageMap mainPageMap = new MainPageMap();

    public MainPage(CommonCommands commands) {
        this.commands = commands;
    }

    public void modifyProfile(ProfileData pd) {
        commands.clickElement(mainPageMap.editNameBtn);
        commands.sendKeysToElement(mainPageMap.titleTxtBx, pd.title);
        commands.clickElement(mainPageMap.closeCountryIcon);
        commands.sendKeysToElement(mainPageMap.selectCountryTxtBx, pd.country);
        commands.clickElement(mainPageMap.saveBtn);
        commands.clickElement(mainPageMap.editProfileBtn);
        commands.sendKeysToElement(mainPageMap.profileEditTxtBx, pd.profile);
        commands.clickElement(mainPageMap.saveBtn);
    }
    public void validateUserCanEditProfile() {
       commands.clickElement(mainPageMap.editProfileBtn);
       commands.sendKeysToElement(mainPageMap.profileEditTxtBx, commands.generateRandomLorem(20));
       commands.clickElement(mainPageMap.saveProfileBtn);
    }

    public void validateLogout() {
        commands.clickElement(mainPageMap.hamburguerBtn);
        commands.clickElement(mainPageMap.logoutBtn);
    }

    public void validateUserCanUpdateExperience() {
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

    public void validateUserCanAddSkills() {
        commands.clickElement(mainPageMap.addSkillsBtn);
        commands.clickElement(mainPageMap.categoryBxBtn);

    }

    public void validateUserCanAddEducation() {
        commands.clickElement(mainPageMap.editEducationBtn);
        commands.sendKeysToElement(mainPageMap.degreeTxtBx, "Professional");
        commands.sendKeysToElement(mainPageMap.studyTxtBx, "Engineering");
        commands.sendKeysToElement(mainPageMap.institutionTxtBx, "UNID");
    }

    public void validateUserCanAddCertifications() {
        commands.clickElement(mainPageMap.certificationsAddBtn);
        commands.sendKeysToElement(mainPageMap.nameTxtBx, "GCP");
        commands.sendKeysToElement(mainPageMap.institutionBx, "Google");
        commands.sendKeysToElement(mainPageMap.certificationDateBx, String.valueOf(commands.currentDate()));

    }

    public void validateUserCanAddLanguage(){
        commands.clickElement(mainPageMap.languagesAddBtn);
        commands.sendKeysToElement(mainPageMap.languageTxtBx, "SPANISH");
        commands.clickElement(mainPageMap.languageLvlDdw);
        commands.clickElement(mainPageMap.langualeBasicOption );
     //   commands.clickElement(mainPageMap.cancelLangBtn);

    }

    public void validateUserCanAddInterests() {
        commands.clickElement(mainPageMap.interestAddBtn);
        commands.sendKeysToElement(mainPageMap.interestField, commands.generateRandomLorem(2));
        commands.clickElement(mainPageMap.saveInterestBtn);
    }

    public void validateUserCanCancelInterests() {
        commands.clickElement(mainPageMap.interestAddBtn);
        commands.sendKeysToElement(mainPageMap.interestField,commands.generateRandomLorem(2));
        commands.clickElement(mainPageMap.cancelInterestBtn);

    }
    public void userCanAddAvailabilityToTravel(){
        commands.scrollToElementAndClick(mainPageMap.travelEditBtn);
        commands.clickElement(mainPageMap.availabilityChckBx);
        commands.clickElement(mainPageMap.relocateChckBx);
        commands.sendKeysToElement(mainPageMap.passportExpDateBx, String.valueOf(commands.currentDate()));
        commands.sendKeysToElement(mainPageMap.visaExpirationDateBx, String.valueOf(commands.currentDate()));
        commands.sendKeysToElement(mainPageMap.visaTypeBx, "B2");
        commands.clickElement(mainPageMap.travelSaveBtn);
    }
    public void fillAllResume(){

    }
}
