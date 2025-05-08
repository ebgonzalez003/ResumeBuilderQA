package Utils;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class CommonCommands {
    public WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    public ExtentTest test;

    public CommonCommands(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions = new Actions(driver);
        this.test = test;
    }

    public void clickElement(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
            test.pass("Successfully click on element: " + locator);
        } catch (Exception e) {
            test.fail("Not able to click on element: " + locator);
        }
    }

    public void sendKeysToElement(By locator, String text) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.clear();
            element.sendKeys(text);
            test.pass("Successfully Keys sent correctly:  " + locator);
        } catch (Exception e) {
            test.fail("The keys were not sent correctly:  " + locator);
        }
    }

    public boolean isElementPresent(By locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void waitForElementToBeVisible(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
    }

    public void scrollToElement(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        actions.moveToElement(element).perform();
    }

    public void scrollToElementAndClick(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        actions.moveToElement(element).click().perform();
    }

    public String generateEmail() {
        Random random = new Random();
        int number = random.nextInt(100000);
        return "test.user" + number + "@techmahindra.com";
    }

    public void waitForUrlContains(String expectedUrlPart) {
        wait.until(ExpectedConditions.urlContains((expectedUrlPart)));
    }

    public void switchToTab(int tabIndex) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        if (tabIndex >= 0 && tabIndex < tabs.size()) {
            driver.switchTo().window(tabs.get(tabIndex));
        } else {
            throw new IllegalArgumentException("Index Out Of Bounds");
        }
    }

    public String generateRandomLorem(int wordCount) {
        String[] loremWords = {
                "lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit",
                "sed", "do", "eiusmod", "tempor", "incididunt", "ut", "labore", "et", "dolore",
                "magna", "aliqua", "ut", "enim", "ad", "minim", "veniam", "quis", "nostrud",
                "exercitation", "ullamco", "laboris", "nisi", "ut", "aliquip", "ex", "ea",
                "commodo", "consequat", "duis", "aute", "irure", "dolor", "in", "reprehenderit",
                "in", "voluptate", "velit", "esse", "cillum", "dolore", "eu", "fugiat", "nulla",
                "pariatur", "excepteur", "sint", "occaecat", "cupidatat", "non", "proident",
                "sunt", "in", "culpa", "qui", "officia", "deserunt", "mollit", "anim", "id",
                "est", "laborum"
        };
        Random random = new Random();
        StringBuilder loremText = new StringBuilder();
        for (int i = 0; i < wordCount; i++) {
            if (i > 0) {
                loremText.append(" ");
            }
            loremText.append(loremWords[random.nextInt(loremWords.length)]);
        }
        String result = loremText.toString();
        result = result.substring(0, 1).toUpperCase() + result.substring(1) + ".";
        return result;
    }

    public String generateRandomTechnologies(int wordCount) {
        String[] loremWords = {
                "Selenium", "Java", "Python", "GitHub Actions", "SnagIt", "Asana", "Visual Studio",
                "MacOS", "Windows Os", "Linux", "Eclipse Framework", "Azure DevOps", "AWS", "GCP", "Cypress",
                "SQL", "Jmeter", "Jira", "TestRail", "QASE", "Poetry", "Appium", "RestAssured", "Karate", "JavaScript",
                "Angular", "JBOSS", "Oracle", "JQuery", "Apache", "Rest WS", "C", "C++", "IntelliJ", "Pycharm", "MongoDB", "Jenkins"
        };
        Random random = new Random();
        StringBuilder loremText = new StringBuilder();
        for (int i = 0; i < wordCount; i++) {
            if (i > 0) {
                loremText.append(" ");
            }
            loremText.append(loremWords[random.nextInt(loremWords.length)]);
        }
        String result = loremText.toString();
        result = result.substring(0, 1).toUpperCase() + result.substring(1) + ".";
        return result;
    }

    public String currentDate(){
        LocalDate currentDate = LocalDate.now().plusDays(1);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return currentDate.format(format);
    }

    public void randomSelect(By locator) {
        Random random = new Random();
        int flechas = random.nextInt(12) + 1;

        Actions actions = new Actions(driver);

        for (int i = 0; i < flechas; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).perform();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void randomSelect2(By locator) {
        Random random = new Random();
        int flechas = random.nextInt(1) + 1;

        Actions actions = new Actions(driver);

        for (int i = 0; i < flechas; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).perform();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void selectRandomStar() {
        Random rand = new Random();
        int starToSelect = rand.nextInt(5) + 1;
        String starXPath = String.format("//div[3]/div[3]/div/div/div[2]/div[3]/div[2]/div/span/label[%d]", starToSelect);
        WebElement starElement = driver.findElement(By.xpath(starXPath));
        starElement.click();
    }

    public void pressArrowUpAndEnter() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_UP)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
    }
}
