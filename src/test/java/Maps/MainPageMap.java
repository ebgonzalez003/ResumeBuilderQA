package Maps;

import org.openqa.selenium.By;

public class MainPageMap {
    // Common Section
    public By saveBtn = By.xpath("//*[@data-testid='SaveIcon']");
    public By techMImg = By.xpath("//*[@id='root']/div/div/div[1]/header/div/div[1]/a/img");

    // Nav Section
    public By drawerBtn = By.xpath("//button[@aria-label='open drawer']");
    public By downloadBtn = By.xpath("//*[@id='root']/div/div/div[1]/header/div/div[3]/button");
    public By hamburguerBtn = By.xpath("//*[@id='root']/div/div/div[1]/header/div/button/svg/path");
    public By logoutBtn = By.xpath("//div[3]/div[3]/ul/li[2]/div/div[2]/span");
    public By profileBtn = By.xpath("//div[3]/div[3]/ul/li[1]/div/div[2]/span");

    // Top Page Section
    public By editNameBtn = By.xpath("//*[@alt='Remy Sharp']/../../button");
    public By editProfileBtn = By.xpath("//*[@id='root']/div/div/div[2]/div[1]/div/div/div[2]/div[1]/div/button");
    public By titleTxtBx = By.id("input");
    public By selectCountryTxtBx = By.id("auto-select");
    public By closeCountryIcon = By.xpath("//button[@aria-label='Clear']//*[@data-testid='CloseIcon']");
    public By profileEditTxtBx = By.id("description");
    public By saveProfileBtn = By.xpath("//*[@id='root']/div/div/div[2]/div[1]/div/div/div[2]/div[1]/div/button[1]");
    public By informationMsg = By.xpath("//div[@class='MuiAlert-message css-1pxa9xg-MuiAlert-message']");

    // Experience Section
    public By addExperienceBtn = By.xpath("//h2[text()='EXPERIENCE']/following-sibling::div/button");
    public By companyTxtBx = By.id("experienceName");
    public By projectTxtBx = By.id("Project");
    public By roleTxtBx = By.id("Job Role");
    public By locationTxtBx = By.id("Location");
    public By descriptionBtn = By.id("standard-multiline-static");
    public By technologiesBtn = By.id("technologies");
    public By saveExperienceBtn = By.xpath("//div[3]/div[3]/div/div/div[3]/button[2]");
    public By experienceAlertMsg = By.xpath("//div[@class = 'MuiAlert-message css-1pxa9xg-MuiAlert-message']g");
    public By deleteExpBtn = By.xpath("//*[@id='root']/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div/div/div[2]/button[2]");
    public By deletePopUp = By.xpath("//*[@id=':rd:']");
    public By deleteBtnPopUp = By.xpath("//div[3]/div[3]/div/div/div/button[2]");

    // Skills Section
    public By addSkillsBtn = By.xpath("//h2[text()='SKILLS']/following-sibling::div/button");
    public By categoryBxBtn = By.xpath("//div[3]/div[3]/div/div/div[2]/div[1]/div[2]/div/div/div/div/button");
    public By skillBxBtn = By.xpath("//div[3]/div[3]/div/div/div[2]/div[2]/div[2]/div/div/div/div/button");
    public By levelStartBtn = By.xpath("//div[3]/div[3]/div/div/div[2]/div[3]/div[2]/div/span/label[5]");

    // Education Section
    public By editEducationBtn = By.xpath("//h2[text()='EDUCATION']/following-sibling::div/button");
    public By degreeTxtBx = By.id("degree");
    public By studyTxtBx = By.id("fieldOfStudy");
    public By institutionTxtBx = By.id("institutionName");

    // Certifications Section
    public By certificationsAddBtn = By.xpath("//h2[text()='CERTIFICATIONS/TRAININGS']/following-sibling::div/button");
    public By nameTxtBx = By.id("name");
    public By institutionBx = By.id("institution");
    public By certificationDateBx = By.id("year");
    public By linkBx = By.id("link");
    public By saveCertBtn = By.xpath("//div[3]/div[3]/div/div/div[5]/button[2]");
    public By cancelCertBtn = By.xpath("//div[3]/div[3]/div/div/div[5]/button[1]");

    // Languages Section
    public By languagesAddBtn = By.xpath("//h2[text()='LANGUAGES']/following-sibling::div/button");
    public By languageTxtBx = By.xpath("//*[@id='name']");
    public By languageLvlDdw = By.xpath("//label[contains (text(), 'Level')]//following-sibling::div");
    public By languageLvlDdwOpts = By.xpath("//ul[@role='listbox']//li[1]");
    public By langualeBasicOption = By.xpath("//li[text()='Basic']");
    public By langualeIntermidateOption = By.xpath("//li[text()='Intermediate']");
    public By langualeAdvancedOption = By.xpath("//li[text()='Advanced']");
    public By langualeNativeOption = By.xpath("//li[text()='Native']");
    public By saveLangBtn = By.xpath("//div[3]/div[3]/div/div/div[3]/button[2]");
    public By cancelLangBtn = By.xpath("//div[3]/div[3]/div/div/div[3]/button[1]");

    // Interest Section
    public By interestAddBtn = By.xpath("//h2[text()='INTERESTS']/following-sibling::div/button");
    public By interestLabel = By.xpath("//h2[contains(text(),'ADD INTEREST')]");
    public By interestField = By.xpath("//label[contains (text(),'Interest')]");
    public By cancelInterestBtn = By.xpath("//h2[contains(text(),'ADD INTEREST')]//following-sibling::div[2]/button[1]");
    public By saveInterestBtn = By.xpath("//h2[contains(text(),'ADD INTEREST')]//following-sibling::div[2]/button[2]");

    // Availability To Travel Section
    public By travelEditBtn = By.xpath("//h2[text()='AVAILABILITY TO TRAVEL']/following-sibling::div/button");
    public By travelSaveBtn = By.xpath("//*[@id='root']/div/div/div[2]/div[4]/div[3]/form/div/div[1]/div/button[1]");
    public By relocateChkBx = By.xpath("//*[@id='root']/div/div/div[2]/div[4]/div[3]/form/div/div[2]/div/div/div[2]/div/label/span");
    public By availabilityChckBx = By.xpath("//*[@id='root']/div/div/div[2]/div[4]/div[3]/form/div/div[2]/div/div/div[1]/div/label/span");
    public By relocateChckBx = By.xpath("//*[@id='root']/div/div/div[2]/div/4]/div[3]/form/div/div[2]/div/div/div[2]/div/label/span/input");
    public By passportExpDateBx = By.id(":r1l:");
    public By visaExpirationDateBx = By.id(":r1n:");
    public By visaTypeBx = By.id(":r1p:");
}