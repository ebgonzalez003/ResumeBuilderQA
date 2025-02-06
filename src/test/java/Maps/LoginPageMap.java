package Maps;
import org.openqa.selenium.By;
public class LoginPageMap {
    public By loginPageUserEmail = By.xpath("//*[@id='email']");
    public By loginPagePassword = By.xpath("//*[@id = 'password']");
    public By loginPageLoginBtn = By.xpath("//button[@type='submit']");
    public By forgotPasswordBtn = By.xpath("//a[@href='/forgot-password']");
    public By createAccountBtn = By.xpath("//a[@href='/sign-up']");

}
