package Pages;
import Maps.LoginPageMap;
import Maps.MainPageMap;
import Utils.CommonCommands;
import Utils.ProfileData;
import org.testng.Assert;

public class MainPage {
    CommonCommands commands;
    MainPageMap mainPageMap = new MainPageMap();
    LoginPageMap loginPageMap = new LoginPageMap();

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
        commands.sendKeysToElement(mainPageMap.descriptionBtn, commands.generateRandomLorem(30));
        commands.sendKeysToElement(mainPageMap.technologiesBtn, commands.generateRandomTechnologies(5));
        commands.clickElement(mainPageMap.saveExperienceBtn);
    }

    public void validateUserCanAddSkills() {
        commands.clickElement(mainPageMap.addSkillsBtn);
        commands.clickElement(mainPageMap.categoryBxBtn);
        commands.randomSelect(mainPageMap.categoryBxBtn);
        commands.clickElement(mainPageMap.skillBxBtn);
        commands.randomSelect2(mainPageMap.skillBxBtn);
        commands.selectRandomStar();
        commands.clickElement(mainPageMap.saveSkillsBtn);
    }

    public void validateUserCanAddEducation() {
        commands.clickElement(mainPageMap.editEducationBtn);
        commands.sendKeysToElement(mainPageMap.degreeTxtBx, "Professional");
        commands.sendKeysToElement(mainPageMap.studyTxtBx, "Engineering");
        commands.sendKeysToElement(mainPageMap.institutionTxtBx, "UNID");
        commands.clickElement(mainPageMap.startEduDate);
        commands.clickElement(mainPageMap.startEduDateOpt);
        commands.clickElement(mainPageMap.endEduDate);
        commands.clickElement(mainPageMap.startEduDateOpt);
        commands.sendKeysToElement(mainPageMap.countrySelect, "Mexico");
        commands.clickElement(mainPageMap.saveEduBtn);
    }

    public void validateUserCanAddCertifications() {
        commands.clickElement(mainPageMap.certificationsAddBtn);
        commands.sendKeysToElement(mainPageMap.nameTxtBx, "GCP");
        commands.sendKeysToElement(mainPageMap.institutionBx, "Google");
        commands.sendKeysToElement(mainPageMap.certificationDateBx, String.valueOf(commands.currentDate()));
        commands.sendKeysToElement(mainPageMap.linkBx, "https://www.google.com");
        commands.clickElement(mainPageMap.saveCertBtn);

    }

    public void validateUserCanAddLanguage(){
        commands.clickElement(mainPageMap.languagesAddBtn);
        commands.sendKeysToElement(mainPageMap.languageTxtBx, "SPANISH");
        commands.clickElement(mainPageMap.languageLvlDdw);
        commands.clickElement(mainPageMap.langualeBasicOption );
        commands.clickElement(mainPageMap.saveLangBtn);

    }

    public void validateUserCanAddInterests() {
        commands.clickElement(mainPageMap.interestAddBtn);
        commands.sendKeysToElement(mainPageMap.interestField, commands.generateRandomLorem(5));
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
        commands.clickElement(mainPageMap.relocateChkBx);
        commands.sendKeysToElement(mainPageMap.passportExpDateBx, String.valueOf(commands.currentDate()));
        commands.sendKeysToElement(mainPageMap.visaExpirationDateBx, String.valueOf(commands.currentDate()));
        commands.sendKeysToElement(mainPageMap.visaTypeBx, "B2");
        commands.clickElement(mainPageMap.travelSaveBtn);
    }
    public void fillAllResume() throws InterruptedException {
        commands.clickElement(loginPageMap.createAccountBtn);
        commands.sendKeysToElement(loginPageMap.nameTxtBx, "Emiliano");
        commands.sendKeysToElement(loginPageMap.lastNameTxtBx, "Gonzalez");
        String email = commands.generateEmail();
        commands.sendKeysToElement(loginPageMap.emailTxtBx, email);
        commands.sendKeysToElement(loginPageMap.titleTxtBx, "engineer");
        commands.sendKeysToElement(loginPageMap.passwordTxtBx, "@Gpassword1");
        commands.clickElement(loginPageMap.createBtn);
        Assert.assertTrue(commands.isElementPresent(mainPageMap.techMImg));
        commands.clickElement(mainPageMap.editProfileBtn);
        commands.sendKeysToElement(mainPageMap.profileEditTxtBx, commands.generateRandomLorem(20));
        commands.clickElement(mainPageMap.saveProfileBtn);
        Assert.assertTrue(commands.isElementPresent(mainPageMap.informationMsg));
        commands.clickElement(mainPageMap.addExperienceBtn);
        commands.sendKeysToElement(mainPageMap.companyTxtBx, "Techmahindra");
        commands.sendKeysToElement(mainPageMap.projectTxtBx, "Google");
        commands.sendKeysToElement(mainPageMap.roleTxtBx, "Test Engineer");
        commands.sendKeysToElement(mainPageMap.locationTxtBx, "Monterrey");
        commands.sendKeysToElement(mainPageMap.descriptionBtn, commands.generateRandomLorem(30));
        commands.sendKeysToElement(mainPageMap.technologiesBtn, commands.generateRandomTechnologies(5));
        commands.clickElement(mainPageMap.saveExperienceBtn);
        Assert.assertFalse(commands.isElementPresent(mainPageMap.experienceAlertMsg));
        commands.clickElement(mainPageMap.addSkillsBtn);
        commands.clickElement(mainPageMap.categoryBxBtn);
        commands.randomSelect(mainPageMap.categoryBxBtn);
        commands.clickElement(mainPageMap.skillBxBtn);
        commands.randomSelect2(mainPageMap.skillBxBtn);
        commands.selectRandomStar();
        commands.clickElement(mainPageMap.saveSkillsBtn);
        Assert.assertFalse(commands.isElementPresent(mainPageMap.saveSkillAlert));
        commands.scrollToElement(mainPageMap.languagesAddBtn);
        commands.clickElement(mainPageMap.editEducationBtn);
        commands.sendKeysToElement(mainPageMap.degreeTxtBx, "Professional");
        commands.sendKeysToElement(mainPageMap.studyTxtBx, "Engineering");
        commands.sendKeysToElement(mainPageMap.institutionTxtBx, "UNID");
        commands.clickElement(mainPageMap.startEduDate);
        commands.clickElement(mainPageMap.startEduDateOpt);
        commands.clickElement(mainPageMap.endEduDate);
        commands.clickElement(mainPageMap.startEduDateOpt);
        commands.clickElement(mainPageMap.countrySelect);
        commands.clickElement(mainPageMap.countryDrop);
        commands.pressArrowUpAndEnter();
        commands.clickElement(mainPageMap.saveEduBtn);
        Assert.assertTrue(commands.isElementPresent(mainPageMap.eduSaveMsj));
        commands.clickElement(mainPageMap.certificationsAddBtn);
        commands.sendKeysToElement(mainPageMap.nameTxtBx, "GCP");
        commands.sendKeysToElement(mainPageMap.institutionBx, "Google");
        commands.sendKeysToElement(mainPageMap.certificationDateBx, String.valueOf(commands.currentDate()));
        commands.sendKeysToElement(mainPageMap.linkBx, "https://www.google.com");
        commands.clickElement(mainPageMap.saveCertBtn);
        Assert.assertTrue(commands.isElementPresent(mainPageMap.saveCertBtn));
        commands.scrollToElement(mainPageMap.languagesAddBtn);
        commands.clickElement(mainPageMap.languagesAddBtn);
        commands.sendKeysToElement(mainPageMap.languageTxtBx, "SPANISH");
        commands.clickElement(mainPageMap.languageLvlDdw);
        commands.clickElement(mainPageMap.langualeBasicOption );
        commands.clickElement(mainPageMap.saveLangBtn);
        Assert.assertTrue(commands.isElementPresent(mainPageMap.saveLangMsg));
        commands.clickElement(mainPageMap.interestAddBtn);
        commands.sendKeysToElement(mainPageMap.interestField, commands.generateRandomLorem(5));
        commands.clickElement(mainPageMap.saveInterestBtn);
        Assert.assertTrue(commands.isElementPresent(mainPageMap.saveInterestMsg));
        commands.scrollToElement(mainPageMap.visaTypeOpt);
        commands.clickElement(mainPageMap.travelEditBtn);
        commands.clickElement(mainPageMap.availabilityChckBx);
        commands.clickElement(mainPageMap.relocateChckBx);
        commands.sendKeysToElement(mainPageMap.passportExpDateBx, String.valueOf(commands.currentDate()));
        commands.sendKeysToElement(mainPageMap.visaExpirationDateBx, String.valueOf(commands.currentDate()));
        commands.sendKeysToElement(mainPageMap.visaTypeBx, "B2");
        commands.clickElement(mainPageMap.travelSaveBtn);
        Assert.assertTrue(commands.isElementPresent(mainPageMap.saveTSMsg));
        commands.clickElement(mainPageMap.downloadCvBtn);

    }

    public void validateUserCanDeleteExperience() {
        commands.clickElement(mainPageMap.addExperienceBtn);
        commands.sendKeysToElement(mainPageMap.companyTxtBx, "Techmahindra");
        commands.sendKeysToElement(mainPageMap.projectTxtBx, "Google");
        commands.sendKeysToElement(mainPageMap.roleTxtBx, "Test Engineer");
        commands.sendKeysToElement(mainPageMap.locationTxtBx, "Monterrey");
        commands.sendKeysToElement(mainPageMap.descriptionBtn, commands.generateRandomLorem(30));
        commands.sendKeysToElement(mainPageMap.technologiesBtn, commands.generateRandomTechnologies(5));
        commands.clickElement(mainPageMap.saveExperienceBtn);
        commands.clickElement(mainPageMap.deleteExpBtn);
        commands.waitForElementToBeVisible(mainPageMap.deletePopUp);
        commands.clickElement(mainPageMap.deleteBtnPopUp);
    }
    public void validateUserCanDeleteSkills() {
        commands.clickElement(mainPageMap.addSkillsBtn);
        commands.clickElement(mainPageMap.categoryBxBtn);
        commands.randomSelect(mainPageMap.categoryBxBtn);
        commands.clickElement(mainPageMap.skillBxBtn);
        commands.randomSelect2(mainPageMap.skillBxBtn);
        commands.selectRandomStar();
        commands.clickElement(mainPageMap.saveSkillsBtn);
        commands.clickElement(mainPageMap.deleteSkillBtn);
        commands.clickElement(mainPageMap.deleteSkillBtn);
        commands.clickElement(mainPageMap.deleteConfirm);
    }
}
