package Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

public class CommonCommandsExtraHelp {
    public WebDriver driver;
    WebDriverWait wait;
    Actions actions;

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
    public boolean waitForElementToDisappear(By by) {
        try {

            return wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        } catch (Exception e) {
            return false;
        }
    }

    public void waitForElementToBeClickable(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
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

    public int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
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

    public List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }

}
