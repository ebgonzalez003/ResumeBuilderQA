package Utils;

import Data.ConstantsData;
import Pages.LoginPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import java.lang.reflect.Method;
import java.time.Duration;

import static Utils.ScreenshotUtils.takeScreenshot;

public class BaseTest implements ITestListener {
    protected WebDriver driver;
    public CommonCommands commands;
    public ExtentTest test;
    public ExtentReports extent;
    public String methodName;
    public LoginPage loginPage ;

    @BeforeSuite(groups = {"regression","smoke"})
    public void reportSetUp(){
        extent = ExtentReportManager.getInstance();
    }

    @BeforeMethod(groups = {"regression","smoke"})
    public void setUp(Method method){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        test = extent.createTest(method.getName());
        driver.get("http://localhost:3000/");
        commands = new CommonCommands(driver, test);
        loginPage = new LoginPage(commands);
        methodName = method.getName();
        LoggerUtil.info(ConstantsData.LOG_START + methodName);
    }
    @AfterMethod(groups = {"regression", "smoke"})
    public void tearDown(ITestResult result) {

        if (result.getStatus()==ITestResult.FAILURE){
            String screenShotPath = takeScreenshot(driver, result.getName());
            test.fail("Test Failed").addScreenCaptureFromPath(screenShotPath);
        } else if (result.getStatus()==ITestResult.SUCCESS) {
            test.pass("Test Passed");
        }else {
            test.skip("Test Skipped");
        }
        LoggerUtil.info(ConstantsData.LOG_END + methodName);
       // if(driver!=null)driver.quit();
    }

    @AfterSuite(groups = {"regression","smoke"})
    public void tearDownReport(){extent.flush();}


}

