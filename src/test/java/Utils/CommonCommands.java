package Utils;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
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


    public List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }


    public void clickElementFromList(By locator, int index) {
        List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        elements.get(index).click();
    }


    public void selectOptionByText(By locator, String visibleText) {
        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(visibleText);
    }


    public void selectOptionByValue(By locator, String value) {
        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue(value);
    }


    public String getTextFromElement(By locator) {

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element.getText();
    }


    public boolean isElementPresent(By locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean waitForElementToDisappear(By by) {
        try {

            return wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        } catch (Exception e) {
            return false;
        }
    }


    public void waitForElementToBeVisible(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
    }


    public void waitForElementToBeClickable(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        actions.moveToElement(element).perform();
    }


    public void scrollToElementAndClick(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        actions.moveToElement(element).click().perform();
    }


    public boolean isElementVisible(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }

    }


    public void clickAndHoldActions(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        actions.clickAndHold(element).perform();
    }


    public void doubleClickActions(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        actions.doubleClick(element).perform();
    }


    public void dragAndDropActions(By sourceLocator, By targetLocator) {
        WebElement sourceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(sourceLocator));
        WebElement targetElement = wait.until(ExpectedConditions.visibilityOfElementLocated(targetLocator));
        actions.dragAndDrop(sourceElement, targetElement).perform();
    }


    public void hoverOverElementActions(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        actions.moveToElement(element).perform();
    }


    public void dragAndDropByOffsetActions(By locator, int xOffset, int yOffset) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        actions.dragAndDropBy(element, xOffset, yOffset).perform();
    }


    public void rightClickActions(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        actions.contextClick(element).perform();
    }


    public void sendKeysToElementActions(By locator, CharSequence... keys) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        actions.sendKeys(element, keys).perform();
    }

    public void clickAtPositionActions(By locator, int xOffset, int yOffset) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        actions.moveToElement(element, xOffset, yOffset).click().perform();
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
    public void selectRandomDate(String calendarButtonLocator, String calendarDaysLocator, int daysRange) {
        WebElement calendarButton = driver.findElement(By.xpath(calendarButtonLocator));
        calendarButton.click();
        LocalDate today = LocalDate.now();
        Random random = new Random();
        LocalDate randomDate = today.plusDays(random.nextInt(daysRange) + 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d");
        List<WebElement> availableDays = driver.findElements(By.xpath(calendarDaysLocator));
        for (WebElement day : availableDays) {
            if (day.getText().equals(randomDate.format(formatter))) {
                day.click();
                break;
            }
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
    public int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
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
    public String generateRandomDate() {
        Random rand = new Random();
        int day = rand.nextInt(30) + 1;
        int month = rand.nextInt(12) + 1;
        int year = rand.nextInt(26) + 2000;

        return "";
    }
    public String generateDateWithGreaterYear(String previousDate) {
        Random rand = new Random();
        String[] dateParts = previousDate.split("/");
        int previousYear = Integer.parseInt(dateParts[2]);
        int day = rand.nextInt(30) + 1;
        int month = rand.nextInt(12) + 1;
        int year = rand.nextInt(2025 - previousYear) + previousYear + 1;
        String formattedDay = String.format("%02d", day);
        String formattedMonth = String.format("%02d", month);
        return formattedDay + "/" + formattedMonth + "/" + year;
    }
    public void pressEnter() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
    }
    public void pressArrowUpAndEnter() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_UP)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
    }
}
