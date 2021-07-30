package nhs.utility;

import nhs.webPages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Util extends BasePage {
public static void click(WebElement element){
    element.click();
}
public static void sendKeys(WebElement element, String text){
    element.sendKeys(text);
}
public static void waitTime(long seconds){
    driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
}
public static boolean isDisplayed(WebElement element){
    return element.isDisplayed();
}
public static  boolean contains(WebElement element, String text){
    return element.getText().contains(text);
}
public static String isEqual(WebElement element){
    return element.getText();
}
public static void elementToBeSelected(WebDriver driver, WebElement element, long seconds){
    WebDriverWait wait = new WebDriverWait(driver,seconds);
    wait.until(ExpectedConditions.elementToBeSelected(element));
}
}
