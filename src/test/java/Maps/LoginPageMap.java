package Maps;
import org.openqa.selenium.By;
public class LoginPageMap {

    //Login Section
    public By loginPageUserEmail = By.xpath("//*[@id='email']");
    public By loginPagePassword = By.xpath("//*[@id = 'password']");
    public By loginPageLoginBtn = By.xpath("//button[@type='submit']");
    public By forgotPasswordBtn = By.xpath("//a[@href='/forgot-password']");
    public By createAccountBtn = By.xpath("//a[@href='/sign-up']");

    //Create an Account Section
    public By nameTxtBx = By.id("firstName");
    public By lastNameTxtBx = By.id("lastName");
    public By emailTxtBx = By.id("email");
    public By titleTxtBx = By.id("title");
    public By passwordTxtBx = By.id("password");
    public By createBtn = By.xpath("//*[@id='root']/div/form/div/div[2]/button");
    public By haveAnAccountBtn = By.xpath("//*[@id='root']/div/form/div/div[2]/a/span");
}
