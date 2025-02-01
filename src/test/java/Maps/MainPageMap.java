package Maps;

import org.openqa.selenium.By;

public class MainPageMap {
    //Top Page Section
    public By EditNameBtn = By.xpath("//*[@id='root']/div/div/div[2]/div[1]/div/button");
    public By EditProfileBtn = By.xpath("//*[@id='root']/div/div/div[2]/div[1]/div/div[2]/div[3]/div[1]/div/button");
    public By DownloadBtn = By.xpath("//*[@id='root']/div/div/div[1]/header/div/div[3]/button");

    //Experience Section
    public By AddExperienceBtn = By.xpath("//*[@id='root']/div/div/div[2]/div[2]/div[1]/div/div[1]/div/button");
    public By CompanyTxtBx = By.id("experienceName");
    public By ProjectTxtBx = By.id("Project");
    public By RoleTxtBx = By.id("Job Role");
    public By LocationTxtBx = By.id("Location");
    public By DescriptionBtn = By.id("standard-multiline-static");
    public By TechnologiesBtn = By.id("technologies");

    //Skills Section
    public By AddSkillsBtn = By.xpath("//*[@id='root']/div/div/div[2]/div[2]/div[2]/div/div[1]/div/button");

    //Education Section
    public By EditEducationBtn = By.xpath("//*[@id='root']/div/div/div[2]/div[3]/div[1]/div/div[1]/div/button");
    public By SaveBtn = By.xpath("//*[@id='root']/div/div/div[2]/div[3]/div[1]/form/div/div[1]/div/button[1]");
    public By DegreeTxtBx = By.id("degree");
    public By StudyTxtBx = By.id("fieldOfStudy");
    public By InstitutionTxtBx = By.id("institutionName");

    //Certifications Section
    public By CertificationsAddBtn = By.xpath("//*[@id='root']/div/div/div[2]/div[3]/div[2]/div/div[1]/div/button");
    public By NameTxtBx = By.id("name");
    public By InstitutionBx = By.xpath("institution");
    public By LinkBx = By.id("link");
    public By SaveCertBtn = By.xpath("//div[3]/div[3]/div/div/div[5]/button[2]");
    public By CancelCertBtn = By.xpath("//div[3]/div[3]/div/div/div[5]/button[1]");

    //Languages Section
    public By LanguagesAddBtn = By.xpath("//*[@id='root']/div/div/div[2]/div[4]/div[1]/div/div[1]/div/button")
    public By LanguageTxtBx = By.xpath("//*[@id='name']");
    public By SaveLangBtn = By.xpath("//div[3]/div[3]/div/div/div[3]/button[2]");
    public By CancelLangBtn = By.xpath("//div[3]/div[3]/div/div/div[3]/button[1]");

    //Interest Section
    public By InterestAddBtn = By.xpath("//*[@id='root']/div/div/div[2]/div[4]/div[2]/div/div[1]/div/button");

    //Availability To Travel Section
    public By TravelEditBtn = By.xpath("//*[@id='root']/div/div/div[2]/div[4]/div[3]/div/div[1]/div/button");
}
