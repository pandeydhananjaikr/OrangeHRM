package com.orangeHRM.WaitFactory;
import com.orangeHRM.DriverUtility.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public  class WebDriverWaitManager {

    RemoteWebDriver
    WebDriver driver = new ChromeDriver();

    private WebDriverWait wait = new WebDriverWait(BrowserManager.driver, Duration.ofSeconds(20));
    public void clickElement(By locator){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }
    public WebElement elementLocated(By locator){
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }


}
