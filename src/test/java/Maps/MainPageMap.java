package Maps;

import org.openqa.selenium.By;

public class MainPageMap {
    //CommonSection
    public By saveBtn = By.xpath("//*[@data-testid='SaveIcon']");

    //NavSection
    public By drawerBtn = By.xpath("//button[@aria-label='open drawer']");
    public By downloadBtn = By.xpath("//*[@id='root']/div/div/div[1]/header/div/div[3]/button");

    //Top Page Section
    public By editNameBtn = By.xpath("//*[@alt='Remy Sharp']/../../button");
    public By editProfileBtn = By.xpath("//*[@alt='Remy Sharp']/../..//div//button");
    public By titleTxtBx = By.id("input");
    public By selectCountryTxtBx = By.id("auto-select");
    public By closeCountryIcon = By.xpath("//button[@aria-label='Clear']//*[@data-testid='CloseIcon']");
    public By profileEditTxtBx = By.id("description");

    //Experience Section
    public By addExperienceBtn = By.xpath("//h2[text()='EXPERIENCE']/following-sibling::div/button");
    public By companyTxtBx = By.id("experienceName");
    public By projectTxtBx = By.id("Project");
    public By roleTxtBx = By.id("Job Role");
    public By locationTxtBx = By.id("Location");
    public By descriptionBtn = By.id("standard-multiline-static");
    public By technologiesBtn = By.id("technologies");

    //Skills Section
    public By addSkillsBtn = By.xpath("//h2[text()='SKILLS']/following-sibling::div/button");

    //Education Section
    public By editEducationBtn = By.xpath("//h2[text()='EDUCATION']/following-sibling::div/button");
    public By degreeTxtBx = By.id("degree");
    public By studyTxtBx = By.id("fieldOfStudy");
    public By institutionTxtBx = By.id("institutionName");

    //Certifications Section
    public By certificationsAddBtn = By.xpath("//h2[text()='CERTIFICATIONS/TRAININGS']/following-sibling::div/button");
    public By nameTxtBx = By.id("name");
    public By institutionBx = By.xpath("institution");
    public By linkBx = By.id("link");
    public By saveCertBtn = By.xpath("//div[3]/div[3]/div/div/div[5]/button[2]");
    public By cancelCertBtn = By.xpath("//div[3]/div[3]/div/div/div[5]/button[1]");

    //Languages Section
    public By languagesAddBtn = By.xpath("//h2[text()='LANGUAGES']/following-sibling::div/button");
    public By languageTxtBx = By.xpath("//*[@id='name']");
    public By saveLangBtn = By.xpath("//div[3]/div[3]/div/div/div[3]/button[2]");
    public By cancelLangBtn = By.xpath("//div[3]/div[3]/div/div/div[3]/button[1]");

    //Interest Section
    public By interestAddBtn = By.xpath("//h2[text()='INTERESTS']/following-sibling::div/button");

    //Availability To Travel Section
    public By travelEditBtn = By.xpath("//h2[text()='AVAILABILITY TO TRAVEL']/following-sibling::div/button");
}
